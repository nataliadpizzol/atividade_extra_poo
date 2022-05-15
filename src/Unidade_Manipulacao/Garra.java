package Unidade_Manipulacao;

public class Garra extends Unidade_Manipulacao {
    public Garra(int id){
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo= garra";
    }
}
