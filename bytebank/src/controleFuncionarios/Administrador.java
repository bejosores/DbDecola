package controleFuncionarios;

public class Administrador extends Funcionario implements Autenticavel {

     private int senha = 2222;
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
