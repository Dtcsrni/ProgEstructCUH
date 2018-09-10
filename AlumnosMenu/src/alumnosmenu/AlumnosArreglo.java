/*
 * Menu de alumnos
 * Por Erick Vega
 * armony.systems
 */
package alumnosmenu;

import java.util.Scanner;

public class AlumnosArreglo {

    public static void main(String[] args) {
        String[] alumno=new String[9]; //array de strings de alumnos
        Scanner scan=new Scanner(System.in); //Objeto Scanner
        int opcion,nalumnos; 
              
        System.out.println("Bienvenido");//Saludamos
        
       
      do{
         System.out.println("Ingrese la accion a realizar\n 1.-Agregar Alumno\n 2.- Buscar alumno \n 3.- Modificar Alumno \n 4.- Mostrar alumnos\n 5.- Borrar Alumnos\n 0.-Salir"); 
                opcion = scan.nextInt();//Preguntamos la opcion
                switch(opcion){
                    case 1:


                        for(int i=0;i<alumno.length;i++){
                        System.out.println("Ingrese nombre de alumno "+(i+1));
                        alumno[i]=scan.next();
                                                    }
                        System.out.println("Alumnos agregados.");
                        break;
                    case 2:
                        System.out.println("Ingrese nombre a buscar: ");
                        String busqueda= scan.next();
                        int encuentro=-1;
                        for(int i=0; i<alumno.length; i++){
                            if(busqueda.equals(alumno[i]))
                                encuentro++;
                                                            }
                        if(encuentro>=0){
                            System.out.println("Se ha encontrado "+(encuentro+1)+" coincidencias");
                                         }
                        if(encuentro<0){
                            System.out.println("No se han encontrado coincidencias");
                                        }
                        break;
                    case 3:
                        Scanner mod = new Scanner(System.in);
                        System.out.println("Introduce el nombre a modificar");
                        String modif= mod.next();
                        int posicion2 = -1;
                        for(int i=0;i<alumno.length;i++){
                        if(modif.equals(alumno[i]))
                        posicion2=i;
                        }
                        if(posicion2>=0){
                        System.out.println("Ingrese el nuevo nombre para el alumno");
                        alumno[posicion2]=mod.next();
                        System.out.println("El nuevo nombre es "+alumno[posicion2]);                
                                        }
                        break;
                    case 4:
                        System.out.println("Alumnos:");
                        for(int i=0; i<alumno.length; i++){
                        System.out.println(alumno[i]+"\n");
                                                }
                        break;
                    case 5:
                        Scanner borr = new Scanner(System.in);
                        System.out.println("Introduce el nombre a borrar");
                        String borrar= borr.next();
                        int posicion1 = -1;
                        for(int i=0;i<9;i++){
                            if(borrar.equals(alumno[i])){
                                alumno[i]="";
                                posicion1=i;
                                                        }
                                            }
                        if(posicion1>=0){
                            System.err.println("El alumno ha sido eliminado con exito");
                            
                            }
                        else
                            System.err.println("No existe tal alumno");
                        break;
                               
                case 0:
                        System.err.println("Saliendo");
                        break;
                default:
                    System.err.println("Esa opcion no existe");
                                }
    }while(opcion!=0);
      
      
      
    } 
      
}
