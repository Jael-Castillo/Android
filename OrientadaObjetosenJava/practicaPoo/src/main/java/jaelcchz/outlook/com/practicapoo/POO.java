package jaelcchz.outlook.com.practicapoo;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//1° TEMA CONSTRUCTORES

public class POO {
    public static void main(String[] args){
        //miCasa es una INSTANCIA de la CLASE CASA || new es el constructor
        Casa miCasa = new Casa("independencia",'d', (short) 34,20000,
                1104537600000L,3.5f,320.423434234,false);
        System.out.println(miCasa);

        //Crear Objetos sin tener todos los valores disponibles
        Casa maryCasa = new Casa("Reforma", (short)543, 3500000, true);
        Casa claudiaCasa = new Casa ("Roma",(short)12,120000,false);

        System.out.println(maryCasa);

        //2°TEMA-------------CREACIÓN DE LISTAS =====> ARRAYS
        Main.nuevoTema("LIST");
        java.util.List<Casa> casaList = new ArrayList<>();
        //-----AGREGAR-----
        casaList.add(miCasa);
        casaList.add(maryCasa);
        casaList.add(claudiaCasa);

        //4°ELIMINAR Y ACTUALIZAR elementos de List
        //Se remueve por indice (aun que también hay por Objeto), idicamos la posición 1
        //------ELIMINAR------
        casaList.remove(1);//Se elimina la CASA de mary
        //------ACTUALIZAR------
        casaList.set(1,miCasa); //Como solo quedan las posiciones 1 y 0, vamos agregar miCasa
        // una a la posición 1, así se mostrará dos veces


        //Por cada CASA en el listado de CASAS (casaList) vamos a imprimir cada objeto
        for(Casa currentCasa : casaList){
            System.out.println(currentCasa);
        }

        //3°TEMA------------DICCIONARIOS---------
        //Alternativa de Listados, son los DICCIONARIOS
        //Caracteristicas: Arreglo conformado por una sere de claves y Valores
        //Varia su eficiencia. Pero son más eficientes a la hora de conseguir un OBJETOS gracias
        //a su CLAVE (en este caso los nombres karina, mary, claudia).

        Main.nuevoTema("DICCIONARIOS");
        // De esta forma creo mi diccionario en java
        Map<String, Casa> casaMap = new HashMap<>();
        // De esta forma asocio a un NOMBRE con su CASA en el diccionario
        casaMap.put("karina", miCasa);
        casaMap.put("mary",maryCasa);
        casaMap.put("claudia",claudiaCasa);

        //3°GET para conseguir el OBJETO que queramos
        //System.out.println(casaMap.get("karina"));
        //System.out.println(casaMap.get("mary"));
        //System.out.println(casaMap.get("claudia"));

        //5° Impriir la LONGITUD
        System.out.println(casaMap.size());
        //-----Eliminar----
        casaMap.remove("karina");
        System.out.println(casaMap.size());
        //------ACTUALIZAR------
        //Se actualiza una posición dentro del diccionario, se coloca la casa de claudia en el
        // nombrede mary
        casaMap.put("mary", claudiaCasa);
        System.out.println(casaMap.get("mary"));

        //6° ------HERENCIA-------
        Main.nuevoTema("HERECIA");
        //Nuevo OBJETO (apartamentoPlaya) de la CLASE Apartamento
        Apartamento apartamentoPlaya = new Apartamento("Malecon", 'B',(short)101, 26000,
                1009843200000L, 6.3f, 108.452323,true, (short)5);
        System.out.println(apartamentoPlaya);

        Main.nuevoTema("PRUEBA");
        //String mensaje = "Hola Mundo";
        //System.out.println(mensaje.length());

        String mensaje = "Hola Mundo";
        int indice = mensaje.indexOf("M");

        System.out.println(indice);
    }
}