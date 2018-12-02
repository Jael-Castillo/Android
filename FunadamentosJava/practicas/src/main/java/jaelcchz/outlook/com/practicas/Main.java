package jaelcchz.outlook.com.practicas;

public class Main {

    public static void main(String[] args){
        nuevoTema("VARIABLES");
        /*System.out.print("Holi");*/
        final short enteroCorto = 120;
        int enteroNormal = 3023;
        /*long enteroLargo;*/
        float decimalCorto = 24.345f;
        double decimalLargo= 23.24234;/*Calculos matematicos complejos*/
        char carcter ='a';
        boolean esVerdadero = true;

        enteroNormal = 43;
        /*enteroLargo = 2323425323L;*/
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println();
        System.out.println(decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(carcter);
        System.out.println();




/*---------------CONDICIONAL IF -------*/
        nuevoTema("USANDO IF");
        System.out.println("Condcional IF: ");
        long enteroLargo = 5000L;
        /*if (enteroLargo > 500){
            System.out.println("Es mayor");
        }else if (enteroLargo == 500){
            System.out.println("Es igual");
        }else {
            System.out.println("Es menor");
        }*/
        /*---------------OPERADOR TERNARIO-------*/
        /*Utilizado unicamente para saber SI SE CUMPLE ALGO o NO
        System.out.println(enteroLargo > 1000? "Es mayor" : "No es mayor");*/


        /*---------------CICLO FOR -------*/
        /*Util para ejecutar un codigo CIERTO NUMERO DE VECES*/

        for(int i = 0; i< 8; i ++){
            System.out.println("Posicion: " + i); /*Llega hasta 7 y finaliza*/
        }

        /*-------------CILCO FOR EACH-------*/
        nuevoTema("CICLO FOR EACH");
        String[] nombres = new String[]{"Fernando", "Karina", "Fernanda"};
        for (String nombre : nombres){
            System.out.println(nombre);
        }

        /*----------ESTRUCTURA SWITCH-------*/
        nuevoTema("ESTRUTURA SWITCH");
        System.out.println("");
        System.out.println("Switch: ");
        int index = (int)(Math.random() * 5); /*Castear (CAST = Convertir) a tipo entero || Cabiamos de los 3 nombres a 5 aleatorios*/
        String nombreAleatorio = index < 4?  nombres[index] : "Aninimo";
        /*String nombreAleatorio = nombres[index]; ANINIMO*/
        System.out.println("El valor de INDEX: " + index);
        switch (nombreAleatorio){
            case "Fernando":
                System.out.println("Soy yo!");
                break;
            case "Karina":
            case "Fernanda":
                System.out.println("Es " + nombreAleatorio);
                break;
            default:
                System.out.println("NO hay nombre.");
        }
    }
/*------------MÉTODOS Y ¿CÓMO CREARLOS?-----------*/

/*¿Cuando crear un método?*/

    private static void nuevoTema (String title){

        System.out.println("\n ================> " + title + " es");
    }
}
