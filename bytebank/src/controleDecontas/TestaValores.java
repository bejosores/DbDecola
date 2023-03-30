package controleDecontas;

public class TestaValores {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new Conta(515, 1234);
        Conta conta2 = new Conta(515, 1244);
        Conta conta3 = new Conta(515, 1254);
        conta3.deposita(5000.00);
        conta3.transfere(7000, conta2);

//        conta.setAgencia(-200);
//        System.out.println(conta.getAgencia());

//        conta.setNumeroConta(-1);
//        System.out.println(conta.getNumeroConta());

        System.out.println(conta2.getSaldo());
    }
}
