import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fator = 0;
        int multiplicação=0;
        System.out.println("Digite o Valor do Fator: ");
        fator = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            multiplicação=fator*i;
            System.out.println(+fator+" X "+ i +" = "+multiplicação);
            System.out.println();
        }
    }
}
