package Unidade_Controle;

public class Controle_Sem_Fio extends Unidade_Controle {
    public Controle_Sem_Fio(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                " tipo de unidade= sem fio";
    }
}
