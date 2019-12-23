
package javaapplication5;

import java.util.Scanner;

public class Multiplication {
   




    public static void main(String []args){
       Scanner in =new Scanner(System.in);
       System.out.print("Enter a number from: ");
       int numFrom=in.nextInt();
        System.out.print("Enter a number to: ");
       int numTo=in.nextInt();
        for (int i = 0; i <10; i++) {
            for (int j = 1; j <10 ; j++) {
         System.out.print(i +"X"+ j+" = " +i * j+"\      ");
                   
            }
            System.out.println("");
   
            
        }
    }
}



    
}
