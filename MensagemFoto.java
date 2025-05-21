package mensagem;

public class MensagemFoto extends Mensagem {
    private String arquivo;
    private String formato;

    public MensagemFoto(String conteudo, String arquivo, String formato) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public void exibir() {
        System.out.println("MensagemFoto: " + conteudo + " (Enviada em " + dataEnvio + ")");
        System.out.println("Arquivo: " + arquivo + ", Formato: " + formato);
    }
}
