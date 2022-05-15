package Unidade_Movimentacao;

public class Roda extends Unidade_Movimentacao {

    public Roda(int id){
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo= roda";
    }
}
