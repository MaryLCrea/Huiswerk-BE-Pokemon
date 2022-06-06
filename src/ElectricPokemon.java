public class ElectricPokemon extends Pokemon {

    private String electrothrower = "electrothrower";

    public void electrothrower() {
        System.out.println(electrothrower);
    }

    public ElectricPokemon(String name, int level) {
        super(name, level);
        super.setType("ElectricPokemon");
    }
}
