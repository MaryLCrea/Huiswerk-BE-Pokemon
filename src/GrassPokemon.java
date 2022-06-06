public class GrassPokemon extends Pokemon {
    private String grassthrower = "grassthrower";

    public void grassthrower() {
        System.out.println(grassthrower);
    }
    public GrassPokemon(String name, int level) {
        super(name, level);
        super.setType("GrassPokemon");
    }
}
