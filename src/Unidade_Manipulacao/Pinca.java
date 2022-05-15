package Unidade_Manipulacao;

import Unidade_Manipulacao.Unidade_Manipulacao;

public class Pinca extends Unidade_Manipulacao {

    public Pinca(int id){
        super(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo= pinça";
    }
}
