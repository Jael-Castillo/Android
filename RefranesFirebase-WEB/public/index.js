					// Initialize Firebase
			  var config = {
			    apiKey: "AIzaSyA4qmznzJbkjh5TrcJ40NrhDrFYFqXQ3y0",
			    authDomain: "karinacc-a36ec.firebaseapp.com",
			    databaseURL: "https://karinacc-a36ec.firebaseio.com",
			    projectId: "karinacc-a36ec",
			    storageBucket: "karinacc-a36ec.appspot.com",
			    messagingSenderId: "71636466070"
			  };
			  firebase.initializeApp(config);

			  var database = firebase.database();

			var conexion = firebase.database().ref('Refran');

			conexion.on('value', nodos => {
				const contenedor = document.querySelector('#tbody-tabla-refranes')
				contenedor.textContent = ''

				nodos.forEach(nodo => {
					const { id, texto } = nodo.val()

					// Se crean elementos
					const fila = document.createElement('tr')
					const celdaTexto = document.createElement('td')
					const celdaAcciones = document.createElement('td')
					const btnVer = document.createElement('a')
					const btnEditar = document.createElement('a')
					const btnEliminar = document.createElement('a')
					const iconEditar = document.createElement('a')
					const iconEliminar = document.createElement('a')

					// Se agrega ID
					fila.id = id
					fila.dataset.texto = texto

					// Se agregan clases
					//btnVer.classList = 'btn btn-sm btn-primary'
					btnEditar.classList = 'btn btn-sm btn-warning'
					btnEliminar.classList = 'btn btn-sm btn-danger'
					iconEditar.classList = 'far fa-edit'
					iconEliminar.classList = 'far fa-trash-alt'

					// Se agrega contenido
					//btnVer.textContent = 'Ver'
					btnEditar.textContent= 'Editar'
					btnEliminar.textContent = 'Eliminar'
					celdaTexto.textContent = texto

					// Se agrega accion
					//btnVer.dataset.accion = 'ver'
					btnEditar.dataset.accion = 'editar'
					btnEliminar.dataset.accion = 'eliminar'

					// Se agrega al DOM
					btnEditar.appendChild(iconEditar)
					btnEliminar.appendChild(iconEliminar)
					//celdaAcciones.appendChild(btnVer)
					celdaAcciones.appendChild(btnEditar)
					celdaAcciones.appendChild(btnEliminar)
					fila.appendChild(celdaTexto)
					fila.appendChild(celdaAcciones)
					contenedor.appendChild(fila)
				})
			});

			document.addEventListener('click', e => {
				const el = e.target
				const tr = el.closest('tr')

				if (! tr) return

				const id = tr.id
				const texto = tr.dataset.texto

				switch(el.dataset.accion) {
					/*case 'ver':
						
						break;*/
					case 'editar':
						const nuevoTexto = prompt('Nuevo Texto: ', texto)

						if (! nuevoTexto.trim()) return

						  firebase.database().ref('Refran/' + id).set({
						    id: id,
						    texto: nuevoTexto,
						  }, err => {
						    if (err) {
						      alert('No se pudo editar')
						    } else {
						      // Data saved successfully!
						    }
						  })
						break;
					case 'eliminar':
						if (confirm('¿Seguro que desea eliminar: ' + texto))
							firebase.database().ref('Refran/' + id).remove()
						break;
				}
			})
			const btnAgregar = document.querySelector('#btnAgregar')

						btnAgregar.addEventListener('click', _ => {
							const nuevoTexto = prompt('Nuevo Refrán: ')

							if (! nuevoTexto.trim()) return
							
							const ref = firebase.database().ref('Refran').push()
							  ref.set({
							  	id: ref.key,
							    texto: nuevoTexto
							  }, err => {
							    if (err) {
							      alert('No se pudo crear')
							    } else {
							      // Data saved successfully!
							    }
							  })
						})