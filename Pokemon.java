// Clase que representa un Pokémon
class Pokemon {
    private String name; /*Las 10 caracteristicas de los pokemones  */
    private int podex;
    private String type1;
    private String type2;
    private String clasificacion;
    private float altura;
    private float peso;
    private String ability;
    private int generacion;
    private boolean estatus_legendario;

 
    


    /*Constructor */
    public Pokemon(String name, int podex, String type1, String type2,String clasificacion, float altura, float peso,String ability, int generacion, boolean estatus_legendario) {
        this.name = name;
        this.podex=podex;
        this.type1 = type1;
        this.type2 = type2;
        this.clasificacion=clasificacion;
        this.altura=altura;
        this.peso=peso;
        this.ability = ability;
        this.generacion=generacion;
        this.estatus_legendario=estatus_legendario;
    }

    /*getters y setter */
    /*serviran para poder como tal mandar a llamar datos especificos */
    public String getName() { 
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

    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
   
   
       public float getPeso() {
           return this.peso;
       }
       public void setPeso(float peso) {
           this.peso = peso;
       }
   
   
       public void setAbility(String ability) {
           this.ability = ability;
       }
   
   
       public int getGeneracion() {
           return this.generacion;
       }
       public void setGeneracion(int generacion) {
           this.generacion = generacion;
       }
   
   
       public boolean getEstatus_legendario() {
           return this.estatus_legendario;
       }
       public void setEstatus_legendario(boolean estatus_legendario) {
           this.estatus_legendario = estatus_legendario;
       }

    public int getPodex() {
        return this.podex;
    }
    public void setPodex(int podex) {
        this.podex = podex;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /*metodo Tostring, es importante metodo porque es la estructura de como se mostrara en el output en la terminal lo que el user pide  */

    @Override
    public String toString() {
        return "Nombre: " + name +" , Pokedex: " + podex +" , Tipo 1: " + type1 +" , Tipo 2: " + type2 +" , Clasificación: " + clasificacion +" , Altura: " + altura + "m" +" , Peso: " + peso + "kg" +" , Habilidad: " + ability +" , Generación: " + generacion +" , Legendario: " + (estatus_legendario ? "Sí" : "No\n");  
    }

   
}