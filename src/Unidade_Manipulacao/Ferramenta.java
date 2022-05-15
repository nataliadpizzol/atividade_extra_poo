package Unidade_Manipulacao;

public class Ferramenta extends Unidade_Manipulacao {
    public Ferramenta(int id){
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipo= ferramenta";
    }
}
