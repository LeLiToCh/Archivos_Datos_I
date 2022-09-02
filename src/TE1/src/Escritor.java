package TE1.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
* La clase Escritor es la que extrae todos los parametros que van a ser utilizados en las otras clases, mismos que seran necesarios para realizar los calculos requeridos
* el bucle try lee el archivo el cual es la direccion del csv y lo almacena para su posterior uso en otras clases.
* @author Emmanuel Chavarria
*/
public class Escritor {
    String file = "C:/Users/eemma/OneDrive/Escritorio/JAVA/TE/database TC1.csv";
    BufferedReader reader = null;
    String line = "";

    
    /** 
     * Aqui se almacena la info en una lista (por medio del lector de archivos), posterior a su almacenamiento el metodo que lee que cierra y se reotrna el "array" con la informacion
     * @return ArrayList<String>
     */
    ArrayList<String> Archivo(){ 
        try {
            reader = new BufferedReader(new FileReader(file));
            ArrayList<String> filainicial = new ArrayList<>();
            while((line = reader.readLine()) != null) {

                String[] filacsv = line.split(",");
                for(String index : filacsv) {
                   filainicial.add(index);
                }
            }
            return filainicial;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}


