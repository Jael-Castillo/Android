package jaelcchz.outlook.com.practicas;

public class Casa {

    private String calle;
    private char seccion;
    private short numero;
    private int precio;
    private long fechaConstruccion;
    private float impuesto;
    private double metroCubicos;
    private boolean hipotecada;

    public Casa(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                float impuesto, double metroCubicos, boolean hipotecada) {

        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.impuesto = impuesto;
        this.metroCubicos = metroCubicos;
        this.hipotecada = hipotecada;
    }

    /*IMPRIME OBJETO EN CONSOLA*/
    @Override
    public String   toString() {
        return "Casa{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", impuesto=" + impuesto +
                ", metroCubicos=" + metroCubicos +
                ", hipotecada=" + hipotecada +
                '}';
    }
}
