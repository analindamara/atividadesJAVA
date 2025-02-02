package ExerciciosIF_ELSE;

import java.util.Scanner;
// Receba três números e mostre o maior deles.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("insira o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.printf("insira o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.printf(" insira o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("o primeiro numero  é o maior");
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("o segundo numero é o maior");
        }
        if (n3 > n2 && n3 > n3) {
            System.out.println("o terceiro numero é o maior");
        }


    }
}