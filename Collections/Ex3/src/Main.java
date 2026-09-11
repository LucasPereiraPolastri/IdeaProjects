import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList <String> listaCompra = new ArrayList<>();

        listaCompra.add("Arroz");
        listaCompra.add("Leite");
        listaCompra.add("Café");
        listaCompra.add("Margarina");
        listaCompra.add("Feijão");
        listaCompra.add("Carne");
        listaCompra.add("Legumes");
        listaCompra.add("Açucar");

        for (String produto : listaCompra){
            System.out.println("- " + produto);
        }
        if (listaCompra.contains("Arroz")){
            System.out.println(" Tem Arroz ");
        }else{
            System.out.println(" Não tem Arroz ");
        }

        int posicaoLeite = listaCompra.indexOf("Leite");
        System.out.println(" A posição do leite é: " + posicaoLeite);

        listaCompra.set(5, "Costela");
        listaCompra.remove(3);

        System.out.println("Quantidade restante é: " + listaCompra.size());

        for (String percorrer : listaCompra){
            System.out.println(" - " + percorrer);
        }
        if (listaCompra.contains("Café")){
            System.out.println(" Tem Café ");
            listaCompra.remove("Café");
            System.out.println(" Café removido ");
        }




    }
}