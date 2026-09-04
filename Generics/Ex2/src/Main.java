import ProdutosG.ProdutosG;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Codigo codigo = new Codigo("Pro", 1);

        System.out.println(codigo.getSetor());
        System.out.println(codigo.getNumero());
        System.out.println("------------------");

        ProdutosG<Codigo> produtoG = new ProdutosG(codigo, "Celular",1300);

        System.out.println(produtoG);
        System.out.println("----------------------");






    }

}