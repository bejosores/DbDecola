package controleFuncionarios;

public class testeBonificacao {
    public static void main(String[] args) {


        Gerente gerente = new Gerente();
        Designer designer = new Designer();
        EditorVideo editorVideo = new EditorVideo();

        gerente.setSalario(14000);
        designer.setSalario(2500);
        editorVideo.setSalario(7400);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(designer);
        controle.registra(editorVideo);

        System.out.println(controle.getSoma());
    }
}
