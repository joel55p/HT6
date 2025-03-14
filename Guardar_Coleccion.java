import java.util.*; /*para importar el uso de Map y list */

public class Guardar_Coleccion { /*clase qeu va a servir para guardar una coleccion de Pokemones qeu el user eliga */
    private List<Pokemon> userCollection; /*Lista de pokemones de coleccion del user */
    private Map<String, Pokemon> pokedex;

    public Guardar_Coleccion(Map<String, Pokemon> pokedex) { /*Constructor */
        this.userCollection = new ArrayList<>(); /*esta es la eleccion que se hizo de JCF */
        this.pokedex = pokedex;
    }

    /*-------- Operacion 1 -------- */
    public boolean addPokemonToCollection(String name) {
        if (!pokedex.containsKey(name)) { /*si es que no existe el nombre del pokemon en el csv */
            throw new IllegalArgumentException("Error: El Pokémon no existe en los datos.");
        }
        for (Pokemon p : userCollection) {
            if (p.getName().equals(name)) { /*si ya encontro el pokemon en la coleccion  */
                return false; // Indica que ya existe en la colección
            }
        }
        userCollection.add(pokedex.get(name)); /*se agrega al array */
        return true;
    }

    /*------ Operacion 3------- */
    public List<Pokemon> getUserCollectionByType() {
        List<Pokemon> collection = new ArrayList<>(userCollection);
    
        // Definir el orden deseado
        List<String> typeOrder = Arrays.asList("Water", "Steel", "Rock", "Psychic", "Poison","Normal", "Ice", "Ground", "Grass", "Ghost","Flying", "Fire", "Fighting", "Fairy", "Electric", "Dragon", "Dark", "Bug" );
    
        // Ordenar según la lista predefinida
        collection.sort(Comparator.comparing(p -> typeOrder.indexOf(p.getType1())));
    
        return collection;
    }
    
    
}