package Robo;

import Unidade_Controle.Unidade_Controle;
import Unidade_Movimentacao.Unidade_Movimentacao;

import java.util.ArrayList;

public class Deposito_Robo {
    ArrayList<Robo> deposito_robo = new ArrayList<>();

    public void add_robo(Robo robo) {
        deposito_robo.add(robo);
    }

    public void lista_Robos() {
        for(Robo robo : deposito_robo) {
            System.out.println(robo);
        }
    }
}
