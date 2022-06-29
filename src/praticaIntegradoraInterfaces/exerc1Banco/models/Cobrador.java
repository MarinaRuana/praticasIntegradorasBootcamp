package praticaIntegradoraInterfaces.exerc1Banco.models;

import praticaIntegradoraInterfaces.exerc1Banco.utils.*;

public class Cobrador implements ConsultaSaldo, Saque{
    @Override
    public void consultaSaldo() {
        System.out.println("Exibindo saldo");
    }

    @Override
    public void saque() {
        System.out.println("Saque realizado");
    }

    @Override
    public void transacaoOK() {
        System.out.println("Transação de realizada");

    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação de realizada com sucesso");
    }
}
