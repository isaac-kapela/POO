 public class Moto extends Veiculo{
    public Moto() {
    }

    public Moto(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
        super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas, estaComFarolLigado);
    }


    @Override
    public void utilizarHabilidadeEspecial() {
        System.out.println("Moto ultrapassou o adversario á frente");
    }
}
