import java.lang.runtime.SwitchBootstraps;
import java.text.BreakIterator;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite a operaçao: ( + - * / )");
        String operador = sc.next();

        System.out.println("Digite segundo valor: ");
        double valor2 = sc.nextDouble();

        switch (operador){
            case "+":
                System.out.println("Resultado: " + (valor1 + valor2));
                break;

            case "-":
                System.out.println("Resultado: " + (valor1 - valor2));
                break;

            case "*":
                System.out.println("Resultado: " + (valor1 * valor2));
                break;

            case "/":
                System.out.println("Resultado: " + (valor1 / valor2));
                break;

            }
        }


    }

