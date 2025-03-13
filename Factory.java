import java.util.*;   /*se usa para el el contrato MAP y sus posbiles implelmentacion  */
public class Factory {
    public static Map<String, String[]> getMap(int choice) { /*key nombres y String[] va  a ser el valor, eso es lo que se va retornar un MAP */
        switch (choice) {
            case 1: return new HashMap<>();  /*posibles implementaciones */
            case 2: return new TreeMap<>();
            case 3: return new LinkedHashMap<>();
            default: throw new IllegalArgumentException("Opción inválida"); /*si escribe algo que nada que ver */
        }
    }
} /*importante mencionar que el int choice es para ver que implementacion especifica de MAP se va a usar. */