import java.util.LinkedList;

public class Main {
    private static LinkedList<Persona> personas;
    public static void main(String[] args){

        personas = new LinkedList<Persona>();

        //agregar personas
        agregaADNyPersonas();

        System.out.println("\n----- Personas en el sistema -----");

        imprimirPersonas();

        System.out.println("----- Muetra a comparar -----");

        //muestra de adn similar a la persona 1 y diferente a la persona 3, con la persona 2 solo comparte X
        BaseNitrogenada baseNitrogenada4 = new BaseNitrogenada(new BasePurinica("A", "B"), new BasePirimidica("C", "D"));
        Desoxirribosa desoxirribosa4 = new Desoxirribosa("E");
        Fosfato fosfato4 = new Fosfato("X");
        ADN muestra = new ADN(fosfato4, desoxirribosa4, baseNitrogenada4);

        System.out.println(muestra.toString());

        System.out.println("----- Persona mas parecida -----");

        System.out.println(ADN.masParecido(personas, muestra).toString());

        System.out.println("----- Persona menos parecida -----");
        System.out.println(ADN.menosParecido(personas, muestra).toString());
    }

    private static void imprimirPersonas(){
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
    private static void agregaADNyPersonas(){
        System.out.println("\n----- Agregando personas al sistema -----");
        //persona 1
        agregarPersona("Ernesto Venegas", 20, "209430975", "Hombre", "A", "B", "C", "D", "E", "F");

        //persona 2
        agregarPersona("Luis Miranda", 20, "209430976", "Hombre", "G", "H", "I", "J", "K", "X");

        //persona 3
        agregarPersona("Bryam López", 20, "209430976", "Hombre", "G", "H", "I", "J", "K", "X");

        //persona 4
        agregarPersona("Maria Hernandez", 20, "209430977", "Mujer", "M", "N", "0", "P", "Q", "W");
    }

    private static void agregarPersona(String nombre, int edad, String cedula, String genero, String adenina,
                                       String guanina, String citosina, String timina, String desoxirribosa, String fosfato){
        BaseNitrogenada baseNitrogenada = new BaseNitrogenada(new BasePurinica(adenina, guanina), new BasePirimidica(citosina, timina));
        Desoxirribosa desoxirribosaA = new Desoxirribosa(desoxirribosa);
        Fosfato fosfatoA = new Fosfato(fosfato);
        ADN adn = new ADN(fosfatoA, desoxirribosaA, baseNitrogenada);
        boolean igual = ADN.verificaADNIgual(personas, adn);
        if(igual){
            System.out.println("El ADN que quiere ingresar ya existe en la base de datos, persona: "+ nombre +" No agregada\n");
            return;
        }
        Persona persona = new Persona(nombre, edad, cedula, genero, adn);
        personas.add(persona);
    }
}