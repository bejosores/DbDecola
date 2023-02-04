package controleFuncionarios;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);
        Administrador adm = new Administrador();
        Administrador adm2 = new Administrador();
        adm2.setSenha(2222);
        adm.setSenha(5555);
        SistemaInterno si = new SistemaInterno();
        si.autentica(adm);
        si.autentica(g);
        si.autentica(adm2);
        boolean autenticou = g.autentica(2222);
        System.out.println(autenticou);

        System.out.println(g.getBonificacao());


    }
}