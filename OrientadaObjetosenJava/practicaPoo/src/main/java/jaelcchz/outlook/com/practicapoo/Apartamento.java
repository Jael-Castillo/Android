package jaelcchz.outlook.com.practicapoo;
//-------HERENCIA------
//Es la extención de las mismas. Una clase que Clase que HEREDA de otra adquiere sus:
//MÉTODOS(propiedades) y a la vez va poder AÑADIR NUEVOS y no reescribir tod el código.

public class Apartamento extends Casa {

    //Número interno, añadimos una PROPIEDAD
    private short numeroInterno;

    //Creamos CONSTRUCTOR de la CLASE Apartamento.
    //Pero hay que escoger el contructor de la CLASE CASA, así que
    //seleccionamos el que tiene todas las propiedades de la CLASE Casa.
    //Finalmente seleccionamos la/las propiedades que queremos inicializar de la CLASE Apartemento.
    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                       float impuesto, double metrosCubicos, boolean hipoteca, short numeroInterno) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, metrosCubicos, hipoteca);
        this.numeroInterno = numeroInterno;
    }
}
