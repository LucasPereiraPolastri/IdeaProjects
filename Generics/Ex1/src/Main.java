//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Par<String, Double> aluno = new Par<>("Lucas", 8.2);

        System.out.println(aluno.getObj1());
        System.out.println(aluno.getObj2());
        System.out.println("-------------------");

        Par<Integer, String> funcionario = new Par<>(89062244, "Jóse");

        System.out.println(funcionario.getObj1());
        System.out.println(funcionario.getObj2());
        System.out.println("-------------------");

        Par<Float, Float>  coordenadas = new Par<>(10.2f, 15.5f);

        System.out.println(coordenadas.getObj1());
        System.out.println(coordenadas.getObj2());

    }
}