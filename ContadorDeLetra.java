package alvaro;

import java.util.Scanner;

public class ContadorDeLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();

        int contador = 0;
        boolean existe = false;

        for (char c : palavra.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
                existe = true;
            }
        }

        if (existe) {
            System.out.println("A letra 'a' existe na palavra: " + palavra);
            System.out.println("A letra 'a' apareceu " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' nao existe na palavra: " + palavra);
        }
    }
}
