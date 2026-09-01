package atividade1;

public class TesteException {

    public static void main(String[] args) {


        System.out.println("inicio da main");
        metodo1();
        System.out.println("fim da main");
    }

    static void metodo1();{


        System.out.println(" inicio do metodo 1");
        metodo2();
        System.out.println(" fim do metodo 1 ");
    }

    static void metodo2() {
        System.out.println(" inicio do metodo 2 ");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
        }
        System.out.println(" fim do metodo 2");


    }
}





