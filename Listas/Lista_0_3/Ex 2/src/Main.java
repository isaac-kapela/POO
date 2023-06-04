public class Main {
    public static void main(String[] args){
        Musica musica01 = new Musica();
        musica01.nome = "best";
        musica01.duracaoEmSegundos = 111 ;
        musica01.popularidade = 56000;
        musica01.genero = "R&B";

        Musica musica02 = new Musica();
        musica02.nome = "superpowers";
        musica02.duracaoEmSegundos = 400 ;
        musica02.popularidade = 870000;
        musica02.genero = "R&B";

        Musica musica03 = new Musica();
        musica03.nome = "japanese denim";
        musica03.duracaoEmSegundos = 231 ;
        musica03.popularidade = 41000;
        musica03.genero = "R&B";

        Musica musica04 = new Musica();
        musica04.nome = "Get you";
        musica04.duracaoEmSegundos = 290 ;
        musica04.popularidade = 307000;
        musica04.genero = "R&B";

        Album album = new Album();
        album.nome = "Freudian";
        album.nomeDoArtista = "Daniel caesar";
        album.musicas.add(musica01);
        album.musicas.add(musica02);
        album.musicas.add(musica03);
        album.musicas.add(musica04);

        Musica musicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("A música com maior popularidade é: " + musicaMaiorPopularidade.nome);
        System.out.println("A música com menor duração é: " + musicaMenorDuracao.nome);

    }
}