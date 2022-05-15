package Unidade_Controle;

public class Controle_Com_Fio extends Unidade_Controle {
    
    public Controle_Com_Fio(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                " tipo de unidade= com fio";
    }
}
