package alvaro;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (check(numero)) {
            System.out.println(numero + " pertence a sequencia");
        } else {
            System.out.println(numero + " nao pertence a sequencia");
        }
    }

    public static boolean check(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;

        while (atual <= numero) {
            if (atual == numero) {
                return true;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return false;
    }
}
