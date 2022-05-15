package Unidade_Manipulacao;



import Unidade_Controle.Unidade_Controle;

import java.util.ArrayList;

public class Deposito_UMANIP {
    ArrayList<Unidade_Manipulacao> deposito_umanip = new ArrayList<>();


    public Deposito_UMANIP() {
        this.add_umanip();
    }

    public Unidade_Manipulacao getpeca(int id) {
        for (int i=0; i <deposito_umanip.size(); i++) {
            if (deposito_umanip.get(i).getId() == id) {
                Unidade_Manipulacao aux = deposito_umanip.remove(i);
                return aux;
            }
        }
        return null;
    }


    private void add_umanip() {
        int id_temp = 1;
        // Add Garra
        for (int i=0; i < 4; i++) {
            Unidade_Manipulacao unidade_manipulacao = new Garra(id_temp);
            deposito_umanip.add(unidade_manipulacao);
            id_temp++;
        }
        // Add Pinca
        for (int i=0; i < 4; i++) {
            Unidade_Manipulacao unidade_manipulacao = new Pinca(id_temp);
            deposito_umanip.add(unidade_manipulacao);
            id_temp++;
        }
        // Add ferramenta
        for (int i=0; i < 4; i++) {
            Unidade_Manipulacao unidade_manipulacao = new Ferramenta(id_temp);
            deposito_umanip.add(unidade_manipulacao);
            id_temp++;
        }
    }
    public void lista_umanips() {
        for(Unidade_Manipulacao umanip : deposito_umanip) {
            System.out.println("U_MANIP: " +umanip);
        }
    }
}
