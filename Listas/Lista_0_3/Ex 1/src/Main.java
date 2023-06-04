import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo();
        inimigo1.nome = "coisa ruim";
        inimigo1.ataque = 10;
        inimigo1.defesa = 30;
        inimigo1.pontos = 70;


        Inimigo inimigo2 = new Inimigo();
        inimigo2.nome = "coisa muito ruim";
        inimigo2.ataque = 20;
        inimigo2.defesa = 24;
        inimigo2.pontos = 41;

        Inimigo inimigo3 = new Inimigo();
        inimigo3.nome = "coisa muito muito ruim";
        inimigo3.ataque = 50;
        inimigo3.defesa = 39;
        inimigo3.pontos = 100;

        Heroi heroi1 = new Heroi();
        heroi1.nome =" coisa boa";
        heroi1.ataque = 23;
        heroi1.defesa = 65;
        heroi1.pontos = 26;

        Heroi heroi2 = new Heroi();
        heroi2.nome =" coisa muito boa";
        heroi2.ataque = 43;
        heroi2.defesa = 35;
        heroi2.pontos = 76;

        Heroi heroi3 = new Heroi();
        heroi3.nome =" coisa muito muito boa";
        heroi3.ataque = 53;
        heroi3.defesa = 65;
        heroi3.pontos = 96;

        Mapa mapa = new Mapa();
        mapa.nome =" Mundo das coisas ruins e boas";
        mapa.altura = 8;
        mapa.largura = 18;
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);
        mapa.herois.add(heroi3);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        Heroi heroiMaiorAtaque = mapa.getHeroiMaiorAtaque();


        System.out.println("Inimigo " + inimigoMaiorAtaque.nome + " deu maior ataque de: " +
                "\n" + inimigoMaiorAtaque.ataque);
        System.out.println("Heroi " + heroiMaiorAtaque.nome + " deu maior ataque de: " +
                "\n" + heroiMaiorAtaque.ataque);


    }
}