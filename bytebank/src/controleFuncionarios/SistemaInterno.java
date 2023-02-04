package controleFuncionarios;

public class SistemaInterno implements Autenticavel {

    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("pode entrar no sistema");
        } else {
            System.out.println("nao pode entrar no sistema");
        }
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}