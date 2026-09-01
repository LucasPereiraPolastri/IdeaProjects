package atividade2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Eu sei dividir ");

        boolean sucesso = false;
        while (!sucesso ) {
            try {
                System.out.println(" Informe primeiro valor ");
                int x = teclado.nextInt();
                System.out.println(" Informe o segundo valor ");
                int y = teclado.nextInt();
                double r = (x / y);
                System.out.println(" Resultado é: " + r);
                sucesso = true;
            }catch (ArithmeticException e ){
                System.out.println(" Divisao por zero nao é permitido ");
            }catch (InputMismatchException e ){
                System.out.println(" Digite somente numeros ");
            }

        }


    }





}
