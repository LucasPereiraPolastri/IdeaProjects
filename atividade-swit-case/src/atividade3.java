import java.util.Scanner;

public class atividade3 {
    public static void main(String[] arg){

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite nome da fruta: ");
       String fruta = sc.nextLine();

       System.out.println("Digite preço unitario");
       double preco = sc.nextDouble();

        double laranja = 60;
        double limao = 80;
        double morango = 20;

        if (fruta.equals("laranja")){
          double resultado = laranja * preco;
            System.out.println("Preço da caixa: " + resultado);
        }
        if (fruta.equals("limao")){
            double resultado = limao * preco;
            System.out.println("Preço da caixa: " + resultado);
        }
        if (fruta.equals("morango")){
            double resultado = morango * preco;
            System.out.println("Preço da caixa: " + resultado);
        }

    }
}
