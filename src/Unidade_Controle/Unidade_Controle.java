package Unidade_Controle;

public abstract class Unidade_Controle {
    private int id;

    public Unidade_Controle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id= " + id + ',';
    }
}
