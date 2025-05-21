package mensagem;

public class MensagemVideo extends Mensagem {
    private String arquivo;
    private String formato;
    private int duracao;

    public MensagemVideo(String conteudo, String arquivo, String formato, int duracao) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
        this.duracao = duracao;
    }

    @Override
    public void exibir() {
        System.out.println("MensagemVideo: " + conteudo + " (Enviada em " + dataEnvio + ")");
        System.out.println("Arquivo: " + arquivo + ", Formato: " + formato + ", Duração: " + duracao + " segundos");
    }
}
