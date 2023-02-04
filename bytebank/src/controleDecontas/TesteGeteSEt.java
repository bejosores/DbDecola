package controleDecontas;

public class TesteGeteSEt {
    public static void main(String[] args) {
        Conta conta = new Conta(515, 1234);
        conta.setNumeroConta(123);
        System.out.println(conta.getNumeroConta());


        Cliente bernardo = new Cliente();
        bernardo.setNome("Bernardo Soares");
        conta.setTitular(bernardo);
        System.out.println(conta.getTitular().getNome());
    }
}
