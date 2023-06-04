import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons;

    public Pokedex() {
        this.pokemons = new HashMap<>();
    }

    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void adicionarPokemon(Pokemon pokemon){
        String codigoIdentificador = pokemon.getCodigoIdentificador();
        this.pokemons.put(codigoIdentificador, pokemon);
        System.out.println(pokemon.getNome() + " foi registrado no Pokedex!");
    }
}