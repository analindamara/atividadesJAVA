package ExerciciosIF_ELSE;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16)
            System.out.println("Pode votar");
        else
            System.out.println("Não pode votar");
    }
}
