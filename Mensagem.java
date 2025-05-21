package mensagem;

import java.time.LocalDateTime;

public abstract class Mensagem {
    protected String conteudo;
    protected LocalDateTime dataEnvio;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
        this.dataEnvio = LocalDateTime.now();
    }

    // Método para exibir a mensagem
    public abstract void exibir();
}
