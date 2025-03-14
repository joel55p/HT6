import java.util.*; /*Para poder importar el  MAP */
class MapFactory {
    public static Map<String, Pokemon> getMap(int choice) { /*es importante mencionar que la clave sea String y el valor sera un pokemon */
        switch (choice) { /*decidir como quiere que se guarden los pokemones */
            case 1: return new HashMap<>(); /*Como tal ya existen y no es necesario como tal hacerles clase */
            case 2: return new TreeMap<>();/*se usa MapFactory para seleccionar implementacion en tiempo real */
            case 3: return new LinkedHashMap<>(); /*cada una de las 3 posibles implementaciones comparten el contrato Map */
            default: throw new IllegalArgumentException("Opción inválida");
        }
    }
}
/*Importante mencionar que se cambio la clase ya que antes estaba Map<String, String[]> lo cual hacia al programa sensible ya que los valores que retornaba dependian fijamente de la posicion del array de String */