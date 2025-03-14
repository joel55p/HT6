
/*Universida del valle de Guatemala(UVG), 14 de Marzo del 2025
 * Joel Josue Nerio Alonzo, 24253
 * Algoritmos y Estructura de Datos
 * catedratico:  Douglas Barrios
 */

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PokeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Confi_Pokemon manager;

        try {
            System.out.println("Seleccione el tipo de estructura de datos para la Pokédex:");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            manager = new Confi_Pokemon(choice);
            System.out.println("Pokédex cargada correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar la Pokédex: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar un Pokémon a la colección");
            System.out.println("2. Mostrar datos de un Pokemon en general");
            System.out.println("3. Mostrar nombre de pokemon de colección, ordenados por tipo1");
            System.out.println("4. Mostrar nombre y tipo1 de todos los pokemones existentes, ordenados por tipo1");
            System.out.println("5. Mostrar nombre de pokemon según habilidad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del Pokémon a agregar: ");
                    String name = scanner.nextLine();
                    if (manager.addPokemonToCollection(name)) {
                        System.out.println("Pokémon agregado exitosamente.");
                    } else {
                        System.out.println("El Pokémon ya está en la colección o no existe.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Pokémon para ver detalles: ");
                    name = scanner.nextLine();
                    System.out.println(manager.getPokemonData(name));
                    break;
                case 3:
                    System.out.println("Pokémon en la colección ordenados por tipo1:");
                    System.out.println(manager.getUserCollectionByType());
                    break;
                case 4:
                    System.out.println("Todos los Pokémon existentes ordenados por tipo1:");
                    System.out.println(manager.getAllPokemonByType());
                    break;
                case 5:
                    System.out.print("Ingrese la habilidad a buscar: ");
                    String ability = scanner.nextLine();
                    System.out.println(manager.getPokemonByAbility(ability));
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
