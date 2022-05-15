package Robo;

import Unidade_Controle.Unidade_Controle;
import Unidade_Manipulacao.Unidade_Manipulacao;
import Unidade_Movimentacao.Unidade_Movimentacao;

public class Robo {
    private int id;
    private Unidade_Controle unidade_controle;
    private  Unidade_Movimentacao unidade_movimentacao;
    private Unidade_Manipulacao unidade_manipulacao;

    public Robo(int id, Unidade_Controle uc, Unidade_Movimentacao umov, Unidade_Manipulacao umanip) {
        this.id = id;
        unidade_controle = uc;
        unidade_movimentacao = umov;
        unidade_manipulacao = umanip;
    }

    @Override
    public String toString() {
        return "Robo {" +
                "\n - id=" + id +
                ";\n - Unidade de controle: " + unidade_controle +
                ";\n - Unidade de movimentação: " + unidade_movimentacao +
                ";\n - unidade de manipulação: " + unidade_manipulacao + "." +
                "\n}";
    }
}
