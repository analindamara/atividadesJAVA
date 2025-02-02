package ExerciciosIF_ELSE;

import java.util.Scanner;

// Verifique se um número é múltiplo de 5.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("insira um numero");
        int n1= sc.nextInt();
        {if
            (n1%5==0)
            System.out.println("ele é multiplo de " );
            else
            System.out.println("ele não é ");

        }


        sc.close();
    }
}
