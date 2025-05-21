package canal;

import mensagem.Mensagem;

public class Telegram extends CanalComunicacao {
    public Telegram(String identificador) {
        super(identificador);
    }

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("Enviando no Telegram para " + identificador + ":");
        mensagem.exibir();
    }
}
