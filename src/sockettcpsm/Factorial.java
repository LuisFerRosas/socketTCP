package sockettcpsm;

import java.util.Scanner; 

public class Factorial{
    private int numero;
    public Factorial(int numero){
        this.numero=numero;
    }
    public int calcular(){
        int factorial=1;
        for (int i=1; i<=this.numero; i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main (String[] args){
        int numero;
        Scanner console=new Scanner(System.in);
        System.out.println("Introducir el numero a calcular el factorial: ");
        numero=console.nextInt();        
        try{
            Factorial f = new Factorial(numero);
            System.out.println("El factorial es: " + f.calcular());
        }
        catch(Exception e){
            System.out.println("Ha ocurrido el siguiente error: "+e.getMessage());
        }
        console.close();
    }
}