import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializando as variavel
        int fator = 0;
        int multiplicacao=0;
        // Recebendo entrada de dados do usuario
        System.out.print("Digite a tabuada desejada: ");
        fator = sc.nextInt();
        // Criando laço for para (variavel I igual a 1) (variavel I for menor igual a 10) ele incrementa mais um
        for (int i = 1; i <= 10; i++){
        // Base de calculo: multiplicação é igual o fator multiplicado por variavel (I)
            multiplicacao=fator*i;
            System.out.println(+fator+" X "+ i +" = "+multiplicacao);

        }
        sc.close();
    }
}
