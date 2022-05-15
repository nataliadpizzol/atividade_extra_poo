package Unidade_Movimentacao;

import Unidade_Controle.Unidade_Controle;
import Unidade_Manipulacao.Unidade_Manipulacao;

import java.util.ArrayList;

public class Deposito_UMOV {
    ArrayList<Unidade_Movimentacao> deposito_mov = new ArrayList<>();

    public Deposito_UMOV(){
        this.add_umov();
    }

    public Unidade_Movimentacao getpeca(int id) {
        for (int i=0; i <deposito_mov.size(); i++) {
            if (deposito_mov.get(i).getId() == id) {
                Unidade_Movimentacao aux = deposito_mov.remove(i);
                return aux;
            }
        }
        return null;
    }
    private void add_umov() {
        int id_temp = 1;
        // Add Esteira
        for (int i = 0; i < 4; i++) {
            Unidade_Movimentacao unidade_movimentacao = new Esteira(id_temp);
            deposito_mov.add(unidade_movimentacao);
            id_temp++;
        }
        // Add pernas
        for (int i = 0; i < 4; i++) {
            Unidade_Movimentacao unidade_movimentacao = new Pernas(id_temp);
            deposito_mov.add(unidade_movimentacao);
            id_temp++;
        }
        // Add Roda
        for (int i = 0; i < 4; i++) {
            Unidade_Movimentacao unidade_movimentacao = new Roda(id_temp);
            deposito_mov.add(unidade_movimentacao);
            id_temp++;
        }
    }

    public void lista_umov() {
        for(Unidade_Movimentacao umov : deposito_mov) {
            System.out.println("U_MOV: " + umov);
        }
    }
}
