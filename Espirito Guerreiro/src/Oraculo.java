public class Oraculo {
  String nome;
  Guerreiro guerreiro;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int setVidas() {
    return (int) Math.floor(Math.random() * (12 - 9 + 1)) + 9;
  }

  public String prologoIntroducao() {
    return "O Oráculo é: " + this.nome + "\n O Guerreiro é: " + this.guerreiro.nome + ", esse possui "
        + this.guerreiro.vidas + " vidas!";
  }

  public int loadLevel1() {
    return (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
  }

  public int loadLevel2(int opcao) {
    return 1;
  }

  public String prologoVencedor() {
    return "Oráculo: " + this.nome + "\nGuerreiro: " + this.guerreiro + ", vencedor!";
  }

  public String prologoPerdedor() {
    return "Oráculo: " + this.nome + "\nGuerreiro: " + this.guerreiro + ", perdedor!";
  }

  public boolean decidirVidaExtra(String misericordia) {
    
    String pedidoMisericordia = misericordia.trim();
    int palavras = 0;

    for (int i = 0; i < pedidoMisericordia.length(); i++) {

      String letra = Character.toString(pedidoMisericordia.charAt(i));
      
      if (letra.equals(" ")) {
        palavras++;
      }
    }

    return palavras > 4 ? true : false;
  }
}
