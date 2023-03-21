import java.util.LinkedList;

public class ADN {
    Fosfato fosfato;
    Desoxirribosa desoxirribosa;
    BaseNitrogenada baseNitrogenada;

    public ADN(Fosfato fosfato, Desoxirribosa desoxirribosa, BaseNitrogenada baseNitrogenada){
        this.fosfato = fosfato;
        this.desoxirribosa = desoxirribosa;
        this.baseNitrogenada = baseNitrogenada;
    }

    public Fosfato getFosfato(){
        return this.fosfato;
    }

    public Desoxirribosa getDesoxirribosa(){
        return this.desoxirribosa;
    }

    public BaseNitrogenada getBaseNitrogenada(){
        return this.baseNitrogenada;
    }

    public static Persona masParecido(LinkedList<Persona> personas, ADN muestra){
        Persona masParecido = null;
        int mayorParecido = 0;
        int parecido = 0;

        //recorre la lista de personas
        for (Persona persona : personas) {
            String adenina = persona.getADN().getBaseNitrogenada().getPurinica().getAdenina();
            String guanina = persona.getADN().getBaseNitrogenada().getPurinica().getGuanina();
            String citosina = persona.getADN().getBaseNitrogenada().getPirimidica().getCitosina();
            String timina = persona.getADN().getBaseNitrogenada().getPirimidica().getTimina();
            String desoxirribosa = persona.getADN().getDesoxirribosa().getDesoxirribosa();
            String fosfato = persona.getADN().getFosfato().getFosfato();

            if (adenina.equals(muestra.getBaseNitrogenada().getPurinica().getAdenina())) {
                parecido++;
            }
            if (guanina.equals(muestra.getBaseNitrogenada().getPurinica().getGuanina())) {
                parecido++;
            }
            if (citosina.equals(muestra.getBaseNitrogenada().getPirimidica().getCitosina())) {
                parecido++;
            }
            if (timina.equals(muestra.getBaseNitrogenada().getPirimidica().getTimina())) {
                parecido++;
            }
            if (desoxirribosa.equals(muestra.getDesoxirribosa().getDesoxirribosa())) {
                parecido++;
            }
            if (fosfato.equals(muestra.getFosfato().getFosfato())) {
                parecido++;
            }
            if(parecido > mayorParecido){
                mayorParecido = parecido;
                masParecido = persona;
            }
            if(parecido == 6){//si coinside en las 6 es porque la muestra es la misma entonces automáticamente es el más parecido
               break;
            }
            parecido = 0;
        }
        return masParecido;
    }

    public static Persona menosParecido(LinkedList<Persona> personas, ADN muestra){
        Persona menosParecido = null;
        int menorParecido = 0;
        int parecido = 0;

        //recorre la lista de personas
        for (Persona persona : personas) {
            String adenina = persona.getADN().getBaseNitrogenada().getPurinica().getAdenina();
            String guanina = persona.getADN().getBaseNitrogenada().getPurinica().getGuanina();
            String citosina = persona.getADN().getBaseNitrogenada().getPirimidica().getCitosina();
            String timina = persona.getADN().getBaseNitrogenada().getPirimidica().getTimina();
            String desoxirribosa = persona.getADN().getDesoxirribosa().getDesoxirribosa();
            String fosfato = persona.getADN().getFosfato().getFosfato();

            if (!adenina.equals(muestra.getBaseNitrogenada().getPurinica().getAdenina())) {
                parecido++;
            }
            if (!guanina.equals(muestra.getBaseNitrogenada().getPurinica().getGuanina())) {
                parecido++;
            }
            if (!citosina.equals(muestra.getBaseNitrogenada().getPirimidica().getCitosina())) {
                parecido++;
            }
            if (!timina.equals(muestra.getBaseNitrogenada().getPirimidica().getTimina())) {
                parecido++;
            }
            if (!desoxirribosa.equals(muestra.getDesoxirribosa().getDesoxirribosa())) {
                parecido++;
            }
            if (!fosfato.equals(muestra.getFosfato().getFosfato())) {
                parecido++;
            }
            if(parecido > menorParecido){
                menorParecido = parecido;
                menosParecido = persona;
            }
            if(parecido == 6){//si coinside en las 6 es porque la muestra es totalmente distinta entonces automáticamente es el menos parecido
                break;
            }
            parecido = 0;
        }
        return menosParecido;
    }

    public static boolean verificaADNIgual(LinkedList<Persona> personas, ADN adn){
        boolean igual = false;
        for (Persona persona : personas) {
            if(persona.getADN().toString().equals(adn.toString())){
                igual = true;
                break;
            }
        }
        return igual;
    }

    public String toString(){
        return this.fosfato.getFosfato() + this.desoxirribosa.getDesoxirribosa() + this.baseNitrogenada.toString();
    }
}
