/*
Entrada / Saída dos dados: Lidos do usuário.
-> Saída de dados - MENSAGEM: System.out.println
-> Saída de dados - MENSAGEM + VALOR: System.out.println

-> Entrada de dados: Scanner
-> Objeto (input): Scanner input = new Scanner(System.in);
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        // LER: STRING
        System.out.print("Entre com seu nome: ");
        String nome = input.next();

        // LER: INT
        System.out.print("Entre com sua idade (em anos): ");
        int idade = input.nextInt();

        // LER: FLOAT
        System.out.print("Entre com sua massa (em quilogramas): ");
        double massa = input.nextDouble();

        System.out.print("Entre com sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Meus dados:");

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade + " anos.");

        System.out.printf("Massa: %.3f quilogramas.\n", massa);

        System.out.printf("Altura: %.2f.\n", altura);

        System.out.printf("IMC: %.1f\n", massa / (altura * altura));


    }
}
