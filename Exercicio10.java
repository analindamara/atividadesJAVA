package ExerciciosIF_ELSE;

import java.util.Scanner;
//Receba um número e exiba se está entre 100 e 200 ou fora desse
//intervalo.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("insira um numero: ");
        int n1= sc.nextInt();
        {
            if (n1>=100 && n1<=200)
                System.out.println("esse numero pertence ao intervalo de 100 e 200");
            else
                System.out.println("esse numero não está entre 100 e 200");


        }










    }
}
