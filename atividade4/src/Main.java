import java.util.Scanner;
import java.time.Year;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano que voce nasceu");
        int data_nascimento = sc.nextInt();

        int ano_atual = Year.now().getValue();

        int resultado = ano_atual - data_nascimento;

        System.out.println("Sua idade é: " + resultado);


        sc.close();
    }

}

