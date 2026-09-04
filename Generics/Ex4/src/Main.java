//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Codigo<String, Integer> codigo = new Codigo<>("Almo",5);

        ValorM valorM = new ValorM(50.00);

        ProdutosG2<Codigo <String, Integer>, ValorM> produtosG2 = new ProdutosG2<>(codigo, "Carrinho", valorM);


        System.out.println(produtosG2);

        }
    }
