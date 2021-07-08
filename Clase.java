public class Clase {
    public static void main(String[] args)\

            {
                List<Alumno> cjsp = new ArrayList<alumno>();
                scanner entradaTeclado = new Scanner(System.in);
                string respuesta;
                int i = 1;
                
                Do {
                    String calificacion = "Suspendido";
                    System.out.println("Registro de Alumnos \n");
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1 - Registrar un alumno ");
                    System.out.println("2 - Consultar un alumno ");
                    System.out.println("3 - Modificar notas ");
                    System.out.println("4 - Ver calse completa");
                    System.out.println("5 - Salir ");
                   respuesta = entradaTeclado.nextline();
                   }
                if(cjsp.size() < id){
                       System.out.println("Hay " + cjsp.size() + "Calificacion 3");
                    } else{
                        System.out.println(cjsp.get(id - 1));
                        System.out.println("Introduce califiacion 4");
                        Double nuevaNota = entradaTeclado.nextDouble();
                        if (nuevaNota >= 12){
                            calificacion = "Aprobado";
                        }
                        cjsp.get(id - 1).setNota(nuevaNota);
                        cjsp.get(id - 1).setCalificacion(calificacion);
                        System.out.println(cjsp.get(id - 1));
                        }
                        respueta = "0";
                        break;
                        case "4";
                            System.out.println("Alumnos en la clase: \n" + cjsp);
                            respuesta = "0";
                            break;
                        case "5";
                        System.out.println("Adios");
                        respuesta = "1";
                        break;
                        default:
                            System.out.println("Opcion invalida. Debes elegir 1,2,3,4,5,6");
                            respuesta = "0";
                           }
                          while(respuesta == "0"){
    
            
            
            
            }
}

