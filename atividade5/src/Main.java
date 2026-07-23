import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos voce ira ficar: ");
        int minutos_a_ficar = sc.nextInt();

        double x = 	2.30;

        int minutos = minutos_a_ficar / 60;

        double pagar = (double) minutos * x;

        System.out.println("Valor a ser pago: " + pagar);

        sc.close();


    }

}


