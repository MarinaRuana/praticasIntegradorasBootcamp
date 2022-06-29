package praticaIntegradoraInterfaces.exerc1Banco.models;
import praticaIntegradoraInterfaces.exerc1Banco.utils.*;


public class Basico implements ConsultaSaldo, Pagamentos, Saque {

    @Override
    public void consultaSaldo() {
        System.out.println("Exibindo saldo");
    }

    @Override
    public void transferencia() {
        System.out.println("Tranferencia realizada com sucesso");
    }

    @Override
    public void saque() {
        System.out.println("Saque autorizado");
    }

    @Override
    public void transacaoOK() {
        System.out.println("Transação de realizada");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação realizada com sucesso");
    }
}