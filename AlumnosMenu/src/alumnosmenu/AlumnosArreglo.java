/*
 * Menu de alumnos
 * Por Erick Vega
 * armony.systems
 */
package alumnosmenu;

/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class AlumnosArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alumno=new String[9]; //array de strings de alumnos
        Scanner scan=new Scanner(System.in); //Objeto Scanner
        int opcion,nalumnos; 
              
        System.out.println("Bienvenido");//Saludamos
        
       
      do{
         System.out.println("Ingrese la accion a realizar\n 1.-Agregar Alumno\n 2.- Buscar alumno \n 3.- Borrar Alumno"); 
                opcion = scan.nextInt();//Preguntamos la opcion
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese Alumnos?");  
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
                        
                }
        
        System.out.println("Ingrese nombre a buscar: ");
        String busqueda= scan.next();
        int encuentro=-1;
        for(int i=0; i<9; i++){
            
            if(busqueda.equals(alumno[i]))
            encuentro++;
                }
       
       if(encuentro>=0){
           System.out.println("Se ha encontrado "+(encuentro+1)+" coincidencias");
       }
       if(encuentro<0){
           System.out.println("No se han encontrado coincidencias");
       }
      Scanner borr = new Scanner(System.in);
      System.out.println("Introduce el nombre a borrar");
      String borrar= borr.next();
      int posicion1 = -1;
      for(int i=0;i<9;i++){
          if(borrar.equals(alumno[i])){
              alumno[i]="0";
              posicion1=i;
          }
      }
      if(posicion1>=0){
          System.err.println("El alumno ha sido eliminado con exito");
          for(int i=0; i<9; i++){
              System.out.append(alumno[i]+"\n");
          }
      } 
   Scanner mod = new Scanner(System.in);
      System.out.println("Introduce el nombre a modificar");
      String modif= mod.next();
      int posicion2 = -1;
      for(int i=0;i<9;i++){
          if(modif.equals(alumno[i])){
              System.out.println("Alumno encontrado");
              
              posicion2=i;
          }
      }
      if(posicion2>=0){
          System.out.println("Ingrese el nuevo nombre para el alumno");
          alumno[posicion2]=mod.next();
          System.out.println("El nuevo nombre es "+alumno[posicion2]);
          for(int i=0; i<9; i++){
              System.out.append(alumno[i]+"\n");
          }
      }     
    }while(opcion!=0);
      
      
      
      
      
  }
}