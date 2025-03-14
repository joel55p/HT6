import java.io.*; /*para las exceptions */
import java.util.*; /* para importar contrato Map */

public class Confi_Pokemon {
    private Map<String, Pokemon> pokedex;  /*el hash Map */
    private Guardar_Coleccion userCollection; /*instancia necesaria para tener la coleccion de pokemones del user */

    public Confi_Pokemon(int choice) throws IOException { /*constructor */
        this.pokedex = MapFactory.getMap(choice); /*pueden ser 3 posibles implementaciones  */
        this.pokedex = Reader.Cargar_Data("informacion.csv", this.pokedex); /*para que lea bien el archivo */
        this.userCollection = new Guardar_Coleccion(pokedex); 
    }

    /*----- Operacion 2 ------- */
    public Pokemon getPokemonData(String name) {
        return pokedex.get(name);  /*retorna los datos de Pokemon especifico por nombre */
    }

    /*------- Operacion 4 --------- */
    public List<Pokemon> getAllPokemonByType() { /*da el orden de todos los pokemones en el csv */
        List<Pokemon> list = new ArrayList<>(pokedex.values());
        /*aqui se define el orden ascendente  */
        List<String> typeOrder = Arrays.asList("Water", "Steel", "Rock", "Psychic", "Poison","Normal", "Ice", "Ground", "Grass", "Ghost","Flying", "Fire", "Fighting", "Fairy", "Electric", "Dragon", "Dark", "Bug" );
    
        /*se ordena segun la lista predefinida */
    
        list.sort(Comparator.comparing(p -> typeOrder.indexOf(p.getType1()))); //Chatgpt(2025)
    
        return list;
    }

    /*---------------Operacion 5-------------- */
    public List<String> getPokemonByAbility(String ability) {
        List<String> result = new ArrayList<>();
        for (Pokemon pokemon : pokedex.values()) { /*va en busca de los valores no la llave */
            if (pokemon.getAbility().equals(ability)) { /*cuando lo encuentra  */
                result.add(pokemon.getName()); /*agrega a al arrayList */
            }
        }
        return result;
    }

    public boolean addPokemonToCollection(String name) { /*Para usar en el Main y no tener que instanciar un usercollection */
        return userCollection.addPokemonToCollection(name);
    }

    public List<Pokemon> getUserCollectionByType() {/*Para usar en el Main y no tener que instanciar un usercollection */
        return userCollection.getUserCollectionByType();
    }
}