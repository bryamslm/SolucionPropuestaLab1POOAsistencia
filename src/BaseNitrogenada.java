public class BaseNitrogenada {
    BasePurinica purinica;
    BasePirimidica pirimidica;

    public BaseNitrogenada(BasePurinica purinica, BasePirimidica pirimidica){
        this.purinica = purinica;
        this.pirimidica = pirimidica;
    }

    public BasePurinica getPurinica(){
        return this.purinica;
    }

    public BasePirimidica getPirimidica(){
        return this.pirimidica;
    }

    public String toString(){
        return this.purinica.getAdenina() + this.purinica.getGuanina() + this.pirimidica.getCitosina() + this.pirimidica.getTimina();
    }
}
