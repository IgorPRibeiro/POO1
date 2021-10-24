import java.util.Scanner;

public class Guerreiro {
  String nome;
  int vidas;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVidas() {
    return vidas;
  }

  public String vidaExtra() {
    Scanner input = new Scanner(System.in);
    String pedidoVidaExtra = input.nextLine();
    input.close();
    return pedidoVidaExtra;
  }
}
