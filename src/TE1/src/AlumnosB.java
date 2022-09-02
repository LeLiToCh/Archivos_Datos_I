package TE1.src;
/**
* La clase AlumnosB es la que almacena todos los atributos que provienen de la clase Alumnos, 
* solo que ahora siendo solo alumnos de tipo B.
* @author Emmanuel Chavarria
*/

public class AlumnosB extends Alumnos{   // aqui se puede apreciar la aplicacion de una clase y a su vez la herencia de una clase hija una padre en este caso Alumnos es la clase padre con el "extends"
    AlumnosB(String Carnet, String NombreyApellido, String Correo, String NumeroTelefono, String apodo, String Tipo, String NotadePromedioExamenes , String NotadePromedioQuices, String NotadePromedioTareas, String NotaenProyecto_1, String NotaenProyecto_2, String NotaenProyecto_3) {
        super(Carnet, NombreyApellido, Correo,  NumeroTelefono, apodo,Tipo, NotadePromedioExamenes ,NotadePromedioQuices, NotadePromedioTareas, NotaenProyecto_1, NotaenProyecto_2, NotaenProyecto_3);
    } //aqui se creo segun la sugerencia de me IDE
    
    /** 
     * Aqui este metodo lo que hace es invocar el constructor de la clase superior (en este caso Alumnos) y retorna los valores obtenidos por el metodo "get"
     * @return String; info de alumnos en este caso que tipo es.
     */
    @Override   // aqui se puede apreciar la aplicacion de sobreescritura ya que heredamos un metodo pero 
               //lo adaptamos a nuestras necesidades, a esto en especifico se le llama override y segun definicion 
              //la utilizacion de herencia y overriding se aplica el concepto de polimorfismo. Entonces aqui tambien aplicamos el polimorfismo
    public String getTipo() {
        return super.getTipo();
    }
}