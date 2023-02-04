package controleFuncionarios;

public abstract interface Autenticavel {
            int senha = 2222;


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
