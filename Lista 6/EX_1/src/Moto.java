 public class Moto extends Veiculo{
    public Moto() {
    }

    public Moto(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
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
