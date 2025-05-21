package canal;

import mensagem.Mensagem;

public class WhatsApp extends CanalComunicacao {
    public WhatsApp(String identificador) {
        super(identificador);
    }

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("Enviando no WhatsApp para " + identificador + ":");
        mensagem.exibir();
    }
}

