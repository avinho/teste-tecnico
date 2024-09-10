package alvaro;

public class IteracaoSoma {
    public static void main(String[] args) {
        int soma = 0;
        int indice = 12;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
            System.out.println(soma);
        }
        System.out.println("O valor final de soma é: " + soma);
    }
}
