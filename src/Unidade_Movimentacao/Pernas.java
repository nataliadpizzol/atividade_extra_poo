package Unidade_Movimentacao;

public class Pernas extends Unidade_Movimentacao {

    public Pernas(int id){
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo= pernas";
    }
}
