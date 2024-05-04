import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("Seja-bem vindo ao contador DIO e Santander!");
        System.out.println("Aperte ENTER para entrar no programar: ");
        String enter = scan.nextLine();

        System.out.println("Por favor, digite um número: ");
        int numeroA = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor, digite um  outro número: ");
        int numeroB = Integer.parseInt(scan.nextLine());

        try {
            contador.contar(numeroA, numeroB);
        } catch (NumerosInvalidosException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    void contar(int numeroA, int numeroB) throws NumerosInvalidosException {
        if (numeroA >= numeroB) {
            throw new NumerosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }

        int contador = numeroB - numeroA;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    static class NumerosInvalidosException extends Exception {
        public NumerosInvalidosException(String message) {
            super(message);
        }
    }
}
