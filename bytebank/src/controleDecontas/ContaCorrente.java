package controleDecontas;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
@Override
    public void saca(Double valor) throws SaldoInsuficienteException {
    Double valorASacar = valor + 0.2;
    super.saca(valorASacar);
    }
}