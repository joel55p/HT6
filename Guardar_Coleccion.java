import java.util.*; /*Para el MAP  y la elecci[on de JCF*/
/*clase para poder como tal tener la coleccion propia del user de pokemones. */
public class Guardar_Coleccion {
    private List<String> userCollection;
    private Map<String, Pokemon> pokedex;

    public Guardar_Coleccion(Map<String, Pokemon> pokedex) {
        this.userCollection = new ArrayList<>(); /*se va  usar un array */
        this.pokedex = pokedex;
    }


    /*------- OPERACION 1 ------- */
    public String Agregar_a_coleccion(String name) {
        if (!pokedex.containsKey(name)) { /*ya esta hecha la logica por el JCF */
            return"Error: El Pokémon no existe en los datos."; /*si es que no hay nombre que leer */
    
        }
        if (!userCollection.add(name)) {  /*ya esta hecha la logica por el JCF */
            return "El Pokémon ya está en la colección.";
        } else {
            return "Pokémon agregado exitosamente.";
        }
    }

    /*---------OPERACION 3 --------- */
    public List<Pokemon> getUserCollectionByType() {
        List<Pokemon> list = new ArrayList<>();
        for (String name : userCollection) {
            list.add(pokedex.get(name));
        }
        list.sort(Comparator.comparing(Pokemon::getType1)); // Ordenar por Type1, ademas es necesario mencionar que no depende del index sino mas bien del nombre 
        return list;
    }
}