 abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public Veiculo (){
    }

     public Veiculo(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
         this.id = id;
         this.velocidadeAtual = velocidadeAtual;
         this.velocidadeMaxima = velocidadeMaxima;
         this.precisaoEmCurvas = precisaoEmCurvas;
         this.estaComFarolLigado = estaComFarolLigado;
     }



     public void acelerar(){

     }
     public void desacelerar(){
     }
     public void ligarFarol(){

     }
     public void utilizarHabilidadeEspecial(){

     }
 }

