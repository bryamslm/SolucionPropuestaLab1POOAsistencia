public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private String genero;
    private ADN adn;

    public Persona(String nombre, int edad, String cedula, String genero, ADN adn){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
        this.adn = adn;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getCedula(){
        return this.cedula;
    }

    public String getGenero(){
        return this.genero;
    }

    public ADN getADN(){
        return this.adn;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nCedula: " + this.cedula + "\nGenero: " + this.genero + "\nADN: " + this.adn.toString() + "\n";
    }
}
