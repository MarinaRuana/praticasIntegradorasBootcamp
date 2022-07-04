package praticaIntegradoraInterfaces.exerc1Banco;
import praticaIntegradoraInterfaces.exerc1Banco.models.*;


public class Banco {

    public static void main(String[] args) {
        Basico b = new Basico();
        b.consultaSaldo();
        b.saque();
        b.transferencia();
        b.transacaoNaoOk();

        Cobrador c = new Cobrador();
        c.consultaSaldo();
        c.saque();

        Executivo e = new Executivo();
        e.deposito();
        e.transferencia();

    }
}
