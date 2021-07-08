# Actividad2
Calificaciones y promedio
public class Actividad2 {
    public static void main(String[] args)\
            {
                List<Alumno> cjsp = new Arraylist<alumno>();
                scanner entradaTeclado = new scanner(System.in);
                String respuesta;
                int i = 1;
                do {
                    String calificacion = "Suspendido";
                    System.out.println("Registro de Alumnos \n");
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1 - Registrar un alumno ");
                    System.out.println("2 - Consultar un alumno ");
                    System.out.println("3 - Modificar notas ");
                    System.out.println("4 - Ver calse completa");
                    System.out.println("5 - Salir ");
                   respuesta = entradaTeclado.nextline();
                   switch(respuesta){
                       case"1";
                       System.out.println("Nombre de alumno");
                       String nombre = entradaTeclado.next();
                       System.out.println("calificacion 1 alumno");
                       String calificacion 1 = entradaTeclado.next();
                       System.out.println("Califiacion 2 alumno");
                        String calificacion 2 = entradaTeclado.next();
                       System.out.println("Califiacion 3 alumno");
                       String calificacion 3 = entradaTeclado.next();
                       System.out.println("Califiacion 4 alumno");
                       String calificacion 4 = entradaTeclado.next();
                       System.out.println("Califiacion 5 alumno");
                       String calificacion 5 = entradaTeclado.next();
                   }
                   
                
            }
