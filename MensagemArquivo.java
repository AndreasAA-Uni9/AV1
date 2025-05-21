package mensagem;

public class MensagemArquivo extends Mensagem {
    private String arquivo;
    private String formato;

    public MensagemArquivo(String conteudo, String arquivo, String formato) {
        super(conteudo);
        this.arquivo = arquivo;
        this.formato = formato;
    }

    @Override
    public void exibir() {
        System.out.println("MensagemArquivo: " + conteudo + " (Enviada em " + dataEnvio + ")");
        System.out.println("Arquivo: " + arquivo + ", Formato: " + formato);
    }
}
