
import edu.dxc.pokemon.Attacks;
import edu.dxc.pokemon.Pokemons;

public class ApplicationStart {
    public static void main(String[] args) {

        System.out.println("This should work");


        Attacks test = Attacks.getInstance();

        Pokemons pokemonlist = Pokemons.getInstance();

        System.out.println(pokemonlist.giveRandomPokemon().getName());


    }


}
