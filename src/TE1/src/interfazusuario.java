package TE1.src;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Objects;
/**
* La clase interfaz de usuario genera una interfaz para hacer visible todos los valores de la base de datos de un archivo CSV
* ademas genera el calculo de 3 incisos extras que luego de pasar por un condicional, determina si son de un estudiante de tipo A o B
* y con base a esto incluye o los espacios de Nota final, promedio en proyectos o promedio total
* @author Emmanuel Chavarria
*/
public class interfazusuario extends Application { 
    /**
    * crea una lista donde posteriormente se guardara info de la instancia creada de la clase escritor que guardo la info
    */
    
    AlumnosA estudiantesA; // aqui se aplica el uso de instacia ya que fue creada de las clases AlumnosA y B
    AlumnosB estudiantesB;

    
    /** 
     * Aqui se genera la interfaz principal, misma que involucra todos los labels, 
     * dimensiones de pantallas entre otras, siendo una de las clases mas importantes de este proyecto
     * @param stage; es el escenario o espacio principal
     */
    public void start(Stage stage) { 
        VBox principal = new VBox();
        TilePane root = new TilePane();
        Scene scene = new Scene(principal, 900, 700);
        root.setOrientation(Orientation.VERTICAL);
        principal.getChildren().add(root);
        principal.setFillWidth(false);
        root.setPrefColumns(15);
        root.setPrefRows(15);
        root.setHgap(15);
        root.setVgap(15);
        stage.setTitle("Resumen de Notas");
        /**
        *Crea una lista donde posteriormente se guardara info de la instancia creada de la clase escritor que guardo la info y a su vez crea la instancia de la clase escritor
        */ 

        ArrayList<String> fila;
        Escritor escritor = new Escritor();
        fila = escritor.Archivo();
        
        
        /**
        * Aqui se recuperan los diferentes parametros que estaban guardados en la subdivision
        */ 
        for (int i = 12;i < fila.size();i = i + 12) {
            estudiantesA = new AlumnosA(fila.get(i), fila.get(i + 1), fila.get(i + 2), fila.get(i + 3),fila.get(i + 4),fila.get(i + 5), fila.get(i + 6), fila.get(i + 7), fila.get(i + 8),fila.get(i + 9), fila.get(i + 10),fila.get(i + 11));
            estudiantesA.Info_importante_del_estudiante(fila.get(i), fila.get(i + 1), fila.get(i + 2), fila.get(i + 3), fila.get(i + 4));
            estudiantesA.Info_importante_del_estudiante(fila.get(i + 6), fila.get(i + 7), fila.get(i + 8),fila.get(i + 9), fila.get(i + 10), fila.get(i + 11));
            estudiantesB = new AlumnosB(fila.get(i), fila.get(i + 1),fila.get(i + 2), fila.get(i + 3), fila.get(i + 4), fila.get(i + 5), fila.get(i + 6), fila.get(i + 7),fila.get(i + 8), fila.get(i + 9), fila.get(i + 10), fila.get(i + 11));
            estudiantesB.Info_importante_del_estudiante(fila.get(i),fila.get(i + 1), fila.get(i + 2), fila.get(i + 3), fila.get(i + 4));
            estudiantesB.Info_importante_del_estudiante(fila.get(i + 6),fila.get(i + 7), fila.get(i + 8),fila.get(i + 9), fila.get(i + 10), fila.get(i + 11));
        }
        

        /**
        * Aqui se generan los bucles principales para la escritura de la informacion y realizacion de calculos y labels extra, dependiendo de la info de los alumnos del grupo
        */
        for (int i = 0; i < fila.size(); i++) {  // Aqui se aprecia la utilizacion de un metodo, que es una accion o funcion en este caso escribe los labels con la info annadida
           
            
            
            if (i == 12) {
                Label Labelpromediosenproyectos = new Label("Promedio de notas en proyectos");
                Label Labelpromediosentareas= new Label("Nota Promedio (Examenes,Quices,Tareas)");
                Label Labelnotafinal = new Label("Nota Final");
                root.getChildren().addAll( Labelpromediosenproyectos, Labelpromediosentareas, Labelnotafinal);
            }
            Label label2 = new Label(fila.get(i));
            root.getChildren().addAll(label2);
           
            
            if (i % 12 == 11 && i != 11) {
                Label vacio = new Label("Empty"); 
                
                
                
                if (Objects.equals(estudiantesB.getTipo(), "B")) { // en este condicional "if" se puede apreciar la aplicacion del concepto de abtraccion ya que tomamos 
                                                                    //solo algunos de los atributos de la clase Alumnos, en este caso las notas ya que no nos interesa casi 
                                                                   //nada el el carnet por ejemplo, asi que aplicando la abstraccion podemos hacer estae tipo de cosas, 
                                                                  //ya que para interes de la clase de interfaz y los requerimientos de esta solo nos interesan las notas
                    int NotaProyecto_1 = Integer.parseInt(estudiantesB.NotaenProyecto_1);
                    int NotaProyecto_2 = Integer.parseInt(estudiantesB.NotaenProyecto_2);
                    int NotaProyecto_3 = Integer.parseInt(estudiantesB.NotaenProyecto_3);
                    int NotaPromedioenProyectos = ((NotaProyecto_1 + NotaProyecto_2 + NotaProyecto_3) / 3);
                    int NotaPromedioExamenes = Integer.parseInt(estudiantesB.NotadePromedioExamenes);
                    int NotaPromedioQuices = Integer.parseInt(estudiantesB.NotadePromedioQuices);
                    int NotaPromedioTareas = Integer.parseInt(estudiantesB.NotadePromedioTareas);
                    int Prueba = Integer.parseInt(estudiantesB.NotadePromedioExamenes);
                    System.out.println(Prueba);
                    int NotaFinal = ((NotaPromedioExamenes + NotaPromedioQuices + NotaPromedioTareas + NotaPromedioenProyectos) / 4);
                    Label PromedioenProyectos = new Label(String.valueOf(NotaPromedioenProyectos));
                    
                    Label NotaFinalEstudianteB = new Label(String.valueOf(NotaFinal));
                  
                    root.getChildren().addAll(PromedioenProyectos, vacio, NotaFinalEstudianteB);
                    
                }
                  
                
                if (Objects.equals(estudiantesB.getTipo(), "A")) {
                    int NotaProyecto_1 = Integer.parseInt(estudiantesA.NotaenProyecto_1);
                    int NotaProyecto_2 = Integer.parseInt(estudiantesA.NotaenProyecto_2);
                    int NotaProyecto_3 = Integer.parseInt(estudiantesA.NotaenProyecto_3);
                    int NotaPromedioenProyectos = ((NotaProyecto_1 +  NotaProyecto_2 +  NotaProyecto_3) / 3);
                    int NotaPromedioExamenes = Integer.parseInt(estudiantesA.NotadePromedioExamenes );
                    int NotaPromedioQuices = Integer.parseInt(estudiantesA.NotadePromedioQuices);
                    int NotaPromedioTareas = Integer.parseInt(estudiantesA.NotadePromedioTareas);
                    int NotaPromedioTotal = ((NotaPromedioExamenes + NotaPromedioQuices + NotaPromedioTareas) / 3);
                    int NotaFinal = ((NotaPromedioExamenes + NotaPromedioQuices + NotaPromedioTareas + NotaPromedioenProyectos) / 4);
                    Label total = new Label(String.valueOf(NotaPromedioTotal));
                    Label NotaFinalEstudianteA = new Label(String.valueOf(NotaFinal));
                  
                    root.getChildren().addAll(vacio,total, NotaFinalEstudianteA);  // buscar como hacer un add en una posicion especifica
                    }
                
                }
            stage.setScene(scene);
            stage.show();
            
        }
    }
    
    /** 
    * funcion main que corre el programa en cuestion, hace la carga de argumentos, ademas (con el launch) corre todos los atributos y metodos de la clase application que se heredo, con el fin del uso de java fx
    * @param String[]args; argumentos que recibe el metodo main
    */
    public static void main (String[]args){
        launch(args);
    }

}
 