package controleDecontas;

public class Conta {
    protected double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numeroConta){
        total++;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
   }
//
//    public int getAgencia() {
//        return agencia;
//    }
//
//    public void setAgencia(int agencia) {
//        if(agencia <= 0){
//            System.out.println("Numero de agencia inválido");
//        return;
//        }
//        this.agencia = agencia;
//    }
//
//    public int getNumeroConta() {
//        return numeroConta;
//    }
//
//    public void setNumeroConta(int numeroConta) {
//        if(numeroConta <= 0){
//            System.out.println("Numero de conta inválido");
//            return;
//        }
//        this.numeroConta = numeroConta;
//    }
//
//    public Cliente getTitular() {
//        return titular;
//    }
//
//    public void setTitular(Cliente titular) {
//        this.titular = titular;
//    }
//    public static int getTotal(){
//        return Conta.total;
//    }
//
//    public void deposita(Double valor) {
//        this.saldo = saldo + valor;
//    }
//
//    public boolean saca(Double valor) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean transfere(double valor, Conta contaDestino) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor;
//            contaDestino.deposita(valor);
//            return true;
//        }
//        return false;
//    }
}