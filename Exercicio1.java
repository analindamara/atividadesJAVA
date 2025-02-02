package ExerciciosIF_ELSE;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.printf ("insira um numero: ");
        Scanner sc= new Scanner (System.in);
        int numero= sc.nextInt();
        if (numero>=0)
            System.out.println("o numero é positivo");
        else
            System.out.println("o numero é negativo");
    }
}
