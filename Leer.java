import java.io.*;   /*para que pueda como tal reconocer a las IOExceptions que se van a hacer con la finalidad de verificar datos */
import java.util.*;  /*para usar el Map, osea para leer el archivo csv y guardar la info en el map  */

public class Leer {
    public static Map<String, String[]> loadPokemonData(String filename, Map<String, String[]> pokedex) throws IOException { /*claramente se establece que clave es string y valor es array de Strings */
        BufferedReader leedor = new BufferedReader(new FileReader(filename)); /*se crea el bufferedReader  para leer el archivo "informacion    " */
        String line;
        leedor.readLine(); // literal para no leer los nombres de las propias columnas esntonces se salta eso ya para leer contenido de los pokemons
        while ((line = leedor.readLine()) != null) { /*mientras se este leyendo algo */
            String[] data = line.split(", "); /*separador de la data en el csv que en este caso va a se por las comas */
            pokedex.put(data[0], data); // La clave es el nombre del pokemon, y como name es justo el valor 0.
        }
        leedor.close();
        return pokedex; /*pokedex es como tal el MAP */
    }
}