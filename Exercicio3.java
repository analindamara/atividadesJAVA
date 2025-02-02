package ExerciciosIF_ELSE;

import java.util.Scanner;

// Receba dois números e exiba o maior deles.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("insira o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.printf("insira o segundo numero: ");
        int n2 = sc.nextInt();

        if (n1>=n2)
            System.out.println("o primeiro numero é o maior");
        else
            System.out.println("o segundo numero é o maior");
    }
}
