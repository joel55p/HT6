import static org.junit.jupiter.api.Assertions.*; /*implementaciones para poder hacer jUnits */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

public class ConfiPokemonTest {

    private Confi_Pokemon confiPokemon;

    @BeforeEach
    void setUp() throws IOException {
        confiPokemon = new Confi_Pokemon(1); /*se Usa hashmap para la prueba */
        confiPokemon.addPokemonToCollection("Pikachu"); /*tipo electrico */
        confiPokemon.addPokemonToCollection("Charmander"); /*tipo fuego */
        confiPokemon.addPokemonToCollection("Squirtle"); /*tipo agua  */
        
    }

    @Test
    void testGetUserCollectionByType() {
        List<Pokemon> collection = confiPokemon.getUserCollectionByType(); /*da la coleccion en orden */
        

        /*aque el orden seria de agua, fuego y luego electrico */
        assertEquals("Squirtle", collection.get(0).getName(), "El primer Pokemon debería ser Squirtle (Agua).");
        assertEquals("Charmander", collection.get(1).getName(), "El segundo Pokemon debería ser Charmander (Fuego).");
        assertEquals("Pikachu", collection.get(2).getName(), "El tercer Pokemon debería ser el Pikachu (Electrico).");
    }

    @Test
    void testAddPokemonToCollection() {
        assertTrue(confiPokemon.addPokemonToCollection("Kleavor"), "Pikachu debería agregarse correctamente."); /*comprueba si se agrego */
        assertFalse(confiPokemon.addPokemonToCollection("Kleavor"), "Pikachu ya existe ypor eso no deberia como tal agregarse nuevamente."); /*pruba para que no se agruege algo que ya esta en la colecion  */
        
    }
}
