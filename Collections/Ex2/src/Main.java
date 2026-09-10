import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> precos = new ArrayList<>();

        precos.add(39.15);
        precos.add(15.99);
        precos.add(10.99);
        precos.add(1.99);
        precos.add(8.00);
        precos.add(9.99);

        for( double valor : precos){
            System.out.println("- " + valor);
        }
        System.out.println(" Quantidade de Preços: " + precos.size());

        precos.set(3, 25.80);
        precos.remove(1);

        double total = 0;
        for(double preco : precos){
            total += preco;
        }
        System.out.printf("Total: %.2f " , total);
        System.out.println();

        double maior = Collections.max(precos);
        System.out.println(" O maior valor é: " + maior);

        double minimo = Collections.min(precos);
        System.out.println(" O menor valor é: " + minimo);





    }
}