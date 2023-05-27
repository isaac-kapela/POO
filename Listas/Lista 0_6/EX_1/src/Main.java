public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,50,60,70,true);
        carro.acelerar();
        carro.desacelerar();
        carro.ligarFarol();
        carro.utilizarHabilidadeEspecial();


        System.out.println("\n");

        Moto moto = new Moto(2,70,60,50,false);
        moto.acelerar();
        moto.desacelerar();
        moto.ligarFarol();
        moto.utilizarHabilidadeEspecial();

    }
}