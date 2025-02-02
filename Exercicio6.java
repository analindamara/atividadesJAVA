package ExerciciosIF_ELSE;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o ano: ");
        Double ano = sc.nextDouble();
        {if (ano % 4 ==0)
            System.out.println("ele é um ano bisexto");
            else
            System.out.println("ele não é um ano bissexto");

        }
        sc.close();
    }
}
