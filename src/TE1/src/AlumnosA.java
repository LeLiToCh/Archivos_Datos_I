package TE1.src;
/**
* La clase AlumnosA es la que almacena todos los atributos que provienen de la clase Alumnos, 
* solo que ahora siendo solo alumnos de tipo A.
* @author Emmanuel Chavarria
*/

public class AlumnosA extends Alumnos {
    AlumnosA(String Carnet, String NombreyApellido, String Correo, String NumeroTelefono, String apodo, String Tipo, String NotadePromedioExamenes , String NotadePromedioQuices, String NotadePromedioTareas, String NotaenProyecto_1, String NotaenProyecto_2, String NotaenProyecto_3) {
        super(Carnet, NombreyApellido, Correo,  NumeroTelefono, apodo,Tipo, NotadePromedioExamenes ,NotadePromedioQuices, NotadePromedioTareas, NotaenProyecto_1, NotaenProyecto_2, NotaenProyecto_3);

    }

    
    /** 
     * Aqui este metodo lo que hace es invocar el constructor de la clase superior (en este caso Alumnos) y retorna los valores obtenidos por el metodo "get"
     * @return String; info de alumnos en este caso que tipo es.
     */
    
    public String getTipo() {
        return super.getTipo();
    }
}
