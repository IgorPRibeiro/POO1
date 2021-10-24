public class App {
  public static void main(String[] args) throws Exception {
    Oraculo testeOraculo = new Oraculo();
    Guerreiro testeGuerreiro = new Guerreiro();

    String pedidovidaExtra = testeGuerreiro.vidaExtra();

    System.out.println(testeOraculo.decidirVidaExtra(pedidovidaExtra));
  }
}
