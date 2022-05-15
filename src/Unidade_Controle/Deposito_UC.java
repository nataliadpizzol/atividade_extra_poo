package Unidade_Controle;
import java.util.ArrayList;

public class Deposito_UC {
    ArrayList<Unidade_Controle> deposito_uc = new ArrayList<>();

    public Deposito_UC() {
        this.add_uc();
    }

    public Unidade_Controle getpeca(int id) {
        for (int i=0; i <deposito_uc.size(); i++) {
            if (deposito_uc.get(i).getId() == id) {
                Unidade_Controle aux = deposito_uc.remove(i);
                return aux;
            }
        }
        return null;
    }

    private void add_uc() {
        int id_temp = 1;
        // Add Sem Fio
        for (int i=0; i < 4; i++) {
            Unidade_Controle unidade_controle = new Controle_Sem_Fio(id_temp);
            deposito_uc.add(unidade_controle);
            id_temp++;
        }
        // Add Com Fio
        for (int i=0; i < 4; i++) {
            Unidade_Controle unidade_controle = new Controle_Com_Fio(id_temp);
            deposito_uc.add(unidade_controle);
            id_temp++;
        }
    }

    public void lista_ucs() {
        for(Unidade_Controle uc : deposito_uc) {
            System.out.println("UC: " + uc);
        }
    }
}
