package Unidade_Manipulacao;

public abstract class Unidade_Manipulacao {
    private int id;


    public Unidade_Manipulacao(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id= " + id;
    }
}
