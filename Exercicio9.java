package ExerciciosIF_ELSE;

import java.util.Scanner;

//Verifique se um número está dentro do intervalo de 10 a 50.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("insira um numero: ");
        int n1= sc.nextInt();
        {
            if (n1 > 10 && n1<50)
                System.out.println("esse numero está no intervalo entre 10 e 50 ");
            else
                System.out.println("esse numero não pertence ao intervalo");
        }


        sc.close();






    }













}
