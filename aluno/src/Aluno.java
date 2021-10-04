import java.util.Scanner;

public class Aluno {
    String Nome;
    int Matricula;
    double Bimestre1;
    double Bimestre2;

    void setNome (String nome) {
        this.Nome = nome;
    }

    void setMatricula (int matricula) {
        this.Matricula = matricula;
    }

    void setBimestre1(double bimestre1) {
        this.Bimestre1 = bimestre1;
    }

    void  setBimestre2 (double bimestre2) {
        this.Bimestre2 = bimestre2;
    }

    double calcularMedia() {
        double media = (Bimestre1 + Bimestre2) / 2;
        return media;
    }

    String status() {
        double media = this.calcularMedia();
        if(media >= 7.0) {
            return "APROVADO";
        } if( media >= 3){
            return  "PROVA FINAL";
        }else {
            return "REPROVADO";
        }
    }

    void attPontoExtra (double ptExtra) {
        if(this.Bimestre1 + ptExtra > 10) {
            this.Bimestre1 = 10;
        } else {
            this.Bimestre1 = this.Bimestre1 + ptExtra;
        }

        if(this.Bimestre2 + ptExtra > 10){
            this.Bimestre2 = 10;
        } else {
            this.Bimestre2 = this.Bimestre2 + ptExtra;
        }
    }

}

class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("DADOS DO ALUNO 1: ");

        System.out.print("NOME: ");
        aluno.setNome(input.nextLine());

        System.out.print("MATRICULA: ");
        aluno.setMatricula(input.nextInt());

        System.out.print("BIMESTRE 1: ");
        aluno.setBimestre1(input.nextDouble());

        System.out.print("BIMESTRE 2: ");
        aluno.setBimestre2(input.nextDouble());

        System.out.print("Entre com uma Ponto Extra: ");
        double pontoExtra = input.nextDouble();

        //Show aluno data
        System.out.println("DADOS DO ALUNO 1: ");
        System.out.println("Nome: " + aluno.Nome);
        System.out.printf("Matrícula: %d\n", aluno.Matricula);
        System.out.printf("Nota Bimestre 1: %.1f\n", aluno.Bimestre1);
        System.out.printf("Nota Bimestre 2: %.1f\n", aluno.Bimestre2);

        // Ponto Extra
        aluno.attPontoExtra(pontoExtra);

        System.out.printf("Media Semestral: %.1f\n", aluno.calcularMedia());
        System.out.println("STATUS: " + aluno.status());
        input.close();


    }

}