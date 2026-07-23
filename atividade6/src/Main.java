import java.util.Scanner;
public class Main {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas folhas sera impressa");
        int folhas = sc.nextInt();

        double valor = 0.08;

        double resultado = (double) 2 * folhas * valor;

        System.out.println("voce ira pagar:" + resultado);

        sc.close();

    }

}

