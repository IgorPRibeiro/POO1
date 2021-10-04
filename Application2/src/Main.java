import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");

        int idade = input.nextInt();

        if(idade <= 14){
            System.out.printf("zzzz");
        } else {
            if(idade <= 20){
                System.out.println("Geraçao: Z");
            }else if(idade <= 34){
                System.out.println("Geracao: Y");
            }else if(idade <= 50){
                System.out.println("Geracao: X");
            }else if(idade <= 65){
                System.out.println("Geracao: BABY BOOMER");
            }else {
                System.out.println("Geracao: SILENCIOSA");
            }
        }


    }

}
