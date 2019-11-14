
package boletin9_1;

import java.util.Scanner;
public class Cantidade {
     private int cont=0;
    private int positivo;
    private int negativo;
    private int ceros;
    private int num;
    Scanner sc = new Scanner(System.in);
      
    
    public int pedirDatos(){
     System.out.print("Teclea numeros positivos, negativos o ceros: ");
     num= sc.nextInt();
     return num;
    }
    
    public void Cantidade(){
    do{
        num=pedirDatos();
        if(num>0)
            positivo++;
        else if(num<0)
            negativo++;
        else
           ceros++;
        cont++;        
    }while(cont < 10);
        System.out.println("\nCantidad de positivo = "+positivo+"\nCantidad de negativos = "+negativo+"\nCantidade de ceros = "+ceros);
    }
    
}

