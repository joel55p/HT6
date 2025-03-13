// Clase que representa un Pokémon
class Pokemon {
    private String name; /*solo las caracteristicas necesarias */
    private String type1;
    private String type2;
    private String ability;

    public Pokemon(String name, String type1, String type2, String ability) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.ability = ability;
    }

    public String getName() { /*servira para poder como tal mandar a llamar datos especificos */
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getAbility() {
        return ability;
    }
}