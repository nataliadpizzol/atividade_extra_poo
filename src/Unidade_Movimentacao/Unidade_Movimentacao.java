package Unidade_Movimentacao;

public abstract class Unidade_Movimentacao {
    private int id;

    public Unidade_Movimentacao(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
