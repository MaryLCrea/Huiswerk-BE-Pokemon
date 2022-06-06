public class FirePokemon extends Pokemon {
private String flamethrower = "flamethrower";

public void flamethrower() {
    System.out.println(flamethrower);
}


public FirePokemon(String name, int level) {
    super(name, level);
    super.setType("FirePokemon");
}
}