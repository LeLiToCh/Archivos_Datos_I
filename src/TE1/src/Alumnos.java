package TE1.src;
/**
* La clase Alumnos es la que almacena todos los atributos que van a ser extraidos en la clase Escritor, 
* datos que seran separados segun sus caracteristicas posteriormente en la clase AlumnosA o AlumnosB
* @author Emmanuel Chavarria
*/
public class Alumnos { 
    String NotadePromedioExamenes ;
    String NotadePromedioQuices;
    String NotadePromedioTareas;
    String Carnet;
    String NombreyApellido;
    String Correo;
    String NumeroTelefono;
    String NotaenProyecto_1; // esta y el resto de las otras variables son los atributos de la clase
    String NotaenProyecto_2;
    String NotaenProyecto_3;
    String apodo;
    private final String Tipo; //aca se aprecia la encapsulacion de una variable donde ocultamos lo que esta por detras 
                              //del metodo en si haciendolo mas facil de acceder y esta se encapsula porque esto nunca cambiara
    
    
    Alumnos(String Carnet, String NombreyApellido, String Correo, String NumeroTelefono, String apodo, String Tipo, String NotadePromedioExamenes , String NotadePromedioQuices, String NotadePromedioTareas, String NotaenProyecto_1, String NotaenProyecto_2, String NotaenProyecto_3){
        this.Carnet = Carnet;
        this.NombreyApellido = NombreyApellido;
        this.Correo = Correo;
        this.NumeroTelefono = NumeroTelefono;
        this.apodo = apodo;
        this.Tipo = Tipo;
        this.NotadePromedioExamenes = NotadePromedioExamenes ;
        this.NotadePromedioQuices = NotadePromedioQuices;
        this.NotadePromedioTareas = NotadePromedioTareas;
        this.NotaenProyecto_1 = NotaenProyecto_1;
        this.NotaenProyecto_2 = NotaenProyecto_2;
        this.NotaenProyecto_3 =NotaenProyecto_3;
    }
    
    /** 
     * Este metodo consigue y retorna el tipo de alumno que es el estudiante, basado en el grupo que esta 
     * siendo de suma importancia para realizar los calculos posteriores
     * @return String tipo de alumno en cuestion
     */
    public String getTipo(){
        return Tipo;
    }
    
    
    /** 
     * Separa la info del estudiante con base a el tipo de informacion que es, ya sea academica o de informacion personal. En este caso es info personal.
     * @param NumeroTelefono; numero de telefono personal del alumno
     * @param Carnet; numero de carnet asignado al alumno
     * @param NombreyApellido; nombre y apellidos del alumno en cuestion
     * @param Correo; correo estudiantil del alumno
     * @param apodo; alias que posee el alumno 
     */
    void Info_importante_del_estudiante(String NumeroTelefono,String Carnet, String NombreyApellido, String Correo, String apodo){ 
        System.out.println("Info de la Identidad: " + Carnet + ", "+ NombreyApellido + ", " + Correo + ", " + NumeroTelefono + ", " + apodo);
    }
    
    /** 
     * Separa la info del estudiante con base a el tipo de informacion que es, ya sea academica o de informacion personal. En este caso es info academica.
     * @param NotaenProyecto_1; nota obtenida en el proyecto 1 del alumno
     * @param NotaenProyecto_2; nota obtenida en el proyecto 2 del alumno
     * @param NotaenProyecto_3; nota obtenida en el proyecto 3 del alumno
     * @param NotadePromedioExamenes; nota obtenida en examenes del alumno
     * @param NotadePromedioQuices; nota obtenida en quices del alumno
     * @param NotadePromedioTareas; nota obtenida en tareas del alumno
     */
    void  Info_importante_del_estudiante(String NotaenProyecto_1, String NotaenProyecto_2, String NotaenProyecto_3, String NotadePromedioExamenes , String NotadePromedioQuices, String NotadePromedioTareas ){
        System.out.println("Resumen de Promedios y Notas: " + NotadePromedioExamenes  + ", " + NotadePromedioTareas + ", " + NotadePromedioQuices + ", " + NotaenProyecto_1 + ", " + NotaenProyecto_2 + ", " + NotaenProyecto_3);
    } // aqui se aprecia y ejemplifica perfectamente el concepto de sobre carga, ya que una funcion o metodo con el mismo nombre hace dos cosas diferentes 
      //osea tienen una diferente funcionalidad
}


