public class WaterPokemon extends Pokemon {

    private String waterthrower = "waterthrower";

    public void waterthrower() {
        System.out.println(waterthrower);
    }
    public WaterPokemon(String name, int level) {
        super(name, level);
        super.setType("WaterPokemon");
    }
}

