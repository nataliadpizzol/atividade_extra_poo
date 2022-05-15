package Unidade_Movimentacao;

public class Esteira extends Unidade_Movimentacao {
    public Esteira(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo= esteira";
    }
}
