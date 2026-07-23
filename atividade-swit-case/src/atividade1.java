import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor1 = sc.nextInt();

        if (valor1 % 2 == 0) {
            System.out.println("este numero é par: " + valor1);
        } else {
            System.out.println("este numero é impar: " + valor1);
        }
    }
}