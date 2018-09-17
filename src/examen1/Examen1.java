/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] ascendente=new int[3];   
    int norep=0;
    int temp;
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<3;i++){
        norep=0;
        while(norep==0){
        System.out.println("Bienvenido \n Ingrese el numero "+i+":");
        temp=scan.nextInt();
        if(temp==ascendente[0]||temp==ascendente[1]||temp==ascendente[2]){
            System.out.println("El numero ingresado esta repetido, ingreselo nuevamente por favor");
        }
        else{
            ascendente[i]=temp;
            norep=1;
        }
        }
    }
        Arrays.sort(ascendente);
        System.out.println("El orden descendente de los numeros es:");
        for(int i=2; i>=0;i--){
            System.out.println(ascendente[i]+"\n");
        }
    
}
}