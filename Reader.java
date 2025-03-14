import java.io.*; /*para las excepciones  */
import java.util.*; /*para JCF */


public class Reader { /*servira para poder separar y obtener los datos para el MAP del csv */
    public static Map<String, Pokemon> Cargar_Data(String filename, Map<String, Pokemon> pokedex) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename)); /*va a ir leyendo */
        String line;
        reader.readLine(); /* no va a leer el encabezado */

        while ((line = reader.readLine()) != null) { /*mientras si haya algo  */
            /*ChatGpt (2025) */
            String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); /*se usa para dividir en comas pero es un formato que ignora las que estan dentro de comillas */
            
            if (data.length < 10) { /*lo que hace es que verifica las 10 columna que hay por fila  */
                System.err.println("Error: Datos incompletos en la fila -> " + Arrays.toString(data));
                continue; /*salta esta fila */
            }

            //*lo que hace esto es que limpia espacio extra por fila */
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].trim();
            }

            /*Ahora si es para ordenar los valores de manera correcta  en el arrayString*/
            String name = data[0];
            int podex = Integer.parseInt(data[1]);
            String type1 = data[2];
            String type2 = data[3];
            String clasificacion = data[4];
            float altura = Float.parseFloat(data[5]);
            float peso = Float.parseFloat(data[6]);
            String ability = data[7].replace("\"", ""); /* Eliminar comillas de la habilidad ya que me estaba dando error*/ 
            int generacion = Integer.parseInt(data[8]);
            boolean estatus_legendario = data[9].equalsIgnoreCase("Yes"); /*convierte a yes o no en bool */

           /*se crea el pokemon y se agrega al podex, osea Mapa*/
            Pokemon pokemon = new Pokemon(name, podex, type1, type2, clasificacion, altura, peso, ability, generacion, estatus_legendario);
            pokedex.put(name, pokemon);
        }
        reader.close();
        return pokedex;
    }
}
