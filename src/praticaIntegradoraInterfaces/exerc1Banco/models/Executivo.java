package praticaIntegradoraInterfaces.exerc1Banco.models;

import praticaIntegradoraInterfaces.exerc1Banco.utils.*;

public class Executivo implements Deposito, Transferencia{

    @Override
    public void deposito() {
        System.out.println("Deposito concluido");
    }

    @Override
    public void transferencia() {
        System.out.println("Transferencia concluida");
    }

    @Override
    public void transacaoOK() {
        System.out.println("Transação de não foi realizada");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação de realizada com sucesso");
    }

}
