import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor1 = sc.nextDouble();

        System.out.println("Digite segundo valor");
        double valor2 = sc.nextDouble();

        double soma = valor1 + valor2;
        double resultado = soma * 2;

        System.out.println("O valor da soma: " + soma + "\nDobro dele sera: " +  resultado);

        sc.close();


    }

}


