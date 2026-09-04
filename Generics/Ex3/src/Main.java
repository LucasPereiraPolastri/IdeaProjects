//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Codigo <String, Integer> codigo = new Codigo<>("Pro", 1);
        System.out.println(codigo.getSetor() + "\n" + codigo.getNumero());
        System.out.println("----------------");

        ProdutosG produtosG = new ProdutosG<>(codigo.getSetor() + codigo.getNumero(), "Almo", 3500);
        System.out.println(produtosG);
        System.out.println("-----------------------");




    }
}