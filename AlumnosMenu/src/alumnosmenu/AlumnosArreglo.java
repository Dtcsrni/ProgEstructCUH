AlumnosArreglo.java

Tipo
Java
Tamaño
2 KB (2.457 bytes)
Espacio usado
2 KB (2.457 bytes)
Ubicación
alumnosarreglo
Propietario
yo
Modificado
6 sept. 2018 por mí
Abierto
19:47 por mí
Creación
5 sept. 2018
Añadir descripción
Los lectores pueden descargar
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String[] alumno=new String[9]; 
        Scanner scan=new Scanner(System.in);
        System.out.println("Bienvenido");
        for(int i=0;i<9;i++){
            System.out.println("Ingrese nombre de alumno "+(i+1));
            alumno[i]=scan.next();
        }
        System.out.println("Alumnos agregados.");
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
    }
    
}