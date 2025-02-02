package ExerciciosIF_ELSE;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Verifique se um número é positivo ou negativo.

        System.out.printf ("insira um numero : ");
        int n1 = sc.nextInt();

            if (n1 % 2 == 0)
                System.out.printf ("esse numero é par");
        else
            System.out.println(" esse numero é impar");


    }
}