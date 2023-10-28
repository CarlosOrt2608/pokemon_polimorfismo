import Pokemon.Pokemon;
import Pokemon.charizard;
import Pokemon.lapras;

public class BatallaPokemon {
    public static void main(String args[]){
        Pokemon charizard = new charizard("bulbasur", 1);
        Pokemon lapras = new lapras("Squirtle", 1);

        charizard.atacar(3, lapras, charizard);
        System.out.println("\n");
        lapras.atacar(3, charizard, lapras);
    }
}