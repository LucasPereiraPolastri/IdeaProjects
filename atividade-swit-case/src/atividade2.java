import java.util.Scanner;
public class atividade2 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("Infantil A");
        }
        if (idade >=8 && idade <= 10 ){
            System.out.println("Infantil B");
        }
        if (idade >= 11 && idade <= 13){
            System.out.println("Juvenil A");
        }
        if (idade >= 14 && idade <= 17){
            System.out.println("Juvenil B");
        }
        if (idade >= 18){
            System.out.println("Adulto");
        }

    }
}
