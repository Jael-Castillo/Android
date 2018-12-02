package jaelcchz.outlook.com.practicapoo;

//Una CLASE es la definición de un tipo de OBJETO
//OBJETO es la INSTANCIA de una clase

public class Casa {
    private String calle;
    private char seccion;
    private short numero;
    private int precio;
    private long fechaConstruccion;
    private float impuesto;
    private double metrosCubicos;
    private boolean hipoteca;

    //CONSTRUCTOR
    //Caracteristicas: Lleva el mismo nombre de la CLASE y puede recibir los PARAMETROS de inicialización
    //Creación: Dar Click en la parte final de la clase Generate ---> Constructor
    // Escogemos todos los ATRIBUTOS que queremos inicializar

    //Inicializamos OBJETO CASA con dos variables
    public Casa(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                float impuesto, double metrosCubicos, boolean hipoteca) {

        //para diferenciar cual viene del METODO o de la CLASE,
        // se utiliza la palabra recerbada THIS.nombre de la propiedad.
        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.impuesto = impuesto;
        this.metrosCubicos = metrosCubicos;
        this.hipoteca = hipoteca;
    }
    //Inicializamos OBJETO CASA con cuatro variables
    public Casa(String calle, short numero, int precio, boolean hipoteca) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.hipoteca = hipoteca;
    }

    //Inicializamos OBJETO CASA con ninguna variable
    public Casa() {
    }

    //MÉTODO toString
    //Imprime el objeto POO
    //Generate ---> toString y seleccionamos las variables a imprimir.
    @Override
    public String toString() {
        return "Casa{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", impuesto=" + impuesto +
                ", metrosCubicos=" + metrosCubicos +
                ", hipoteca=" + hipoteca +
                '}';
    }
}
