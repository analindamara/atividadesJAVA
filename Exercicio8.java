package ExerciciosIF_ELSE;

import java.util.Scanner;

public class Exercicio8 {
    //Receba um caractere e verifique se é uma vogal.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf(" insira um caractere: ");
        char caractere = sc.next().charAt(0);

        {
            if (caractere =='a'|| caractere == 'A' || caractere == 'e' || caractere == 'E' || caractere == 'i' || caractere == 'I' || caractere == 'O' || caractere == 'o' || caractere == 'u' || caractere=='U')
                System.out.println("É uma vogal :" +caractere);
            else
                System.out.println("Não é uma vogal");

        }

        sc.close();
    }
}
