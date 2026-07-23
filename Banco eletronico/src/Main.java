/*
        "Escreva uma classe Java chamada CaixaEletronico que atenda aos seguintes requisitos:

        Estoque Inicial: O caixa deve iniciar com uma quantidade fixa de cada nota. Por exemplo:

        5 notas de R$ 100

        10 notas de R$ 50

        10 notas de R$ 20

        20 notas de R$ 10

        Menu de Opções: O programa deve rodar em um loop mostrando o seguinte menu:

        1. Verificar Saldo/Estoque (Exibe a quantidade disponível de cada nota e o valor total no caixa)

    2. Realizar Saque (Solicita o valor do saque e tenta realizá-lo)

        3. Sair

        Regras para o Saque:

         O valor solicitado deve ser múltiplo de 10 (já que a menor nota é de R$ 10).

         O sistema deve calcular a menor quantidade de notas possível para aquele valor.

        Validação Crítica: Se o caixa não tiver notas suficientes de um determinado valor para completar a transação, ele não deve realizar o saque de forma parcial.
        A transação deve ser recusada por falta de cédulas adequadas, mantendo o estoque intacto.

        Se o saque for bem-sucedido, a quantidade de notas correspondente deve ser subtraída do estoque do caixa."

 */


public class CaixaEletronico{
    int nota100 = 100;
    int nota50 = 50;
    int nota20 = 20;
    int nota10 = 10;
    int qtd100 = 5;
    int qtd50 = 10;
    int qtd20 = 10;
    int qtd10 = 20;
}
public void mostrarEstoque(){
    System.out.println("Notas de R$100" + qtd100);
    System.out.println("Notas de R$50" + qtd50);
    System.out.println("Notas de R$20" + qtd20);
    System.out.println("Notas de R$10" + qtd10);

    int caixatototal = (nota100 * qtd100) + (nota50 * qtd50) + (nota20 * qtd20) + (nota10 * qtd10);
    System.out.println("Valor total no caixa: R$" + caixatotal);
}

public void Saque(int valor){

    if (valor <= 0) {
        System.out.println("Valor invalido");
        return;
    }
    if (valor % 10 != 0) {
        System.out.println(" Valor invalido! O saque dever ser multiplo de 10 ");
        return;
    }
    int restante = valor;
    int usar100 = Math.min(restante / 100, nota100);
    restante -= usar100 * 100;

    int usar50 = Math.min(restante / 50, nota50);
    restante -= usar50 * 50;

    int usar20 = Math.min(restante / 20, nota20);
    restante -= usar20 * 20;

    int usar10 = Math.min(restante / 10, nota10);
    restante -= usar10 * 10;

    if (restante != 0){
        System.out.println(" Saque recusado! Nao ha notas sufucientes para realizar ");

    }

}
public void main(String[] args){



}
