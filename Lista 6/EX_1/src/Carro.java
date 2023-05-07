  public class Carro extends Veiculo {

      public Carro() {
      }

      public Carro(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
          super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas, estaComFarolLigado);
      }

      @Override
      public void acelerar() {
          super.acelerar();
      }

      @Override
      public void desacelerar() {
          super.desacelerar();
      }

      @Override
      public void ligarFarol() {
          super.ligarFarol();
      }

      @Override
      public void utilizarHabilidadeEspecial() {
          super.utilizarHabilidadeEspecial();
      }
  }
