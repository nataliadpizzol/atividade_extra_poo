
import Robo.Deposito_Robo;
import Robo.Robo;
import Unidade_Controle.Deposito_UC;
import Unidade_Manipulacao.Deposito_UMANIP;
import Unidade_Movimentacao.Deposito_UMOV;

public class Main {
    public static Deposito_UC deposito_uc = new Deposito_UC();
    public static Deposito_UMANIP deposito_umanip = new Deposito_UMANIP();
    public static Deposito_UMOV deposito_umov = new Deposito_UMOV();
    public static Deposito_Robo deposito_robo = new Deposito_Robo();

    public static void main(String [] args) {

        Robo robo1 = new Robo(1,
                deposito_uc.getpeca(1),
                deposito_umov.getpeca(1),
                deposito_umanip.getpeca(1));

        Robo robo2 = new Robo(2,
                deposito_uc.getpeca(2),
                deposito_umov.getpeca(2),
                deposito_umanip.getpeca(2));

        deposito_robo.add_robo(robo1);
        deposito_robo.add_robo(robo2);

        System.out.println("Depósito de Robôs:");
        deposito_robo.lista_Robos();

        System.out.println("\nDepósito de Unidades de Controle:");
        deposito_uc.lista_ucs();

        System.out.println("\nDepósito de Unidades de Manipulação:");
        deposito_umanip.lista_umanips();

        System.out.println("\nDepósito de Unidades de Movimentação:");
        deposito_umov.lista_umov();
    }




}

