package mensagem;

public class MensagemTexto extends Mensagem {
    public MensagemTexto(String conteudo) {
        super(conteudo);
    }

    @Override
    public void exibir() {
        System.out.println("MensagemTexto: " + conteudo + " (Enviada em " + dataEnvio + ")");
    }
}
