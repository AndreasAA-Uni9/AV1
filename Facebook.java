package canal;

import mensagem.Mensagem;

public class Facebook extends CanalComunicacao {
    public Facebook(String identificador) {
        super(identificador);
    }

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("Enviando no Facebook para " + identificador + ":");
        mensagem.exibir();
    }
}
