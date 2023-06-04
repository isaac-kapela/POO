  public class Carro extends Veiculo {

      public Carro() {
      }

      public Carro(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
          super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas, estaComFarolLigado);
      }



      @Override
      public void utilizarHabilidadeEspecial() {
          System.out.println("Carro fechou o adversario de trás");
      }
  }
