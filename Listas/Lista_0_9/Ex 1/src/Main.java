import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        pokedex.adicionarPokemon(new Pokemon("chari1", "Charizad ", "fogo"));
        pokedex.adicionarPokemon(new Pokemon("2bul", "Bulbassauro", "planta"));
        pokedex.adicionarPokemon(new Pokemon("3zek", "Venassauro", "Planta"));
        pokedex.adicionarPokemon(new Pokemon("4cha", "ivyssauro", "grama/venenoso"));
    }
}