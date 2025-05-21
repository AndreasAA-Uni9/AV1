import canal.*;
import mensagem.*;

public class Main {
    public static void main(String[] args) {
        // Criando os canais de comunicação
        CanalComunicacao canalWa = new WhatsApp("123456789");
        CanalComunicacao canalTelegram = new Telegram("pedro_telegram");
        CanalComunicacao canalFacebook = new Facebook("pedro_facebook");
        CanalComunicacao canalInstagram = new Instagram("pedro_instagram");

        // Criando as mensagens
        Mensagem mensagemTexto = new MensagemTexto("Olá, como você está?");
        Mensagem mensagemVideo = new MensagemVideo("Vídeo do projeto", "video.mp4", "mp4", 120);
        Mensagem mensagemFoto = new MensagemFoto("Foto do projeto", "foto.jpg", "jpg");
        Mensagem mensagemArquivo = new MensagemArquivo("Arquivo de documentos", "documento.pdf", "pdf");

        // Enviando mensagens para os canais
        canalWa.enviar(mensagemTexto);
        canalTelegram.enviar(mensagemVideo);
        canalFacebook.enviar(mensagemFoto);
        canalInstagram.enviar(mensagemArquivo);
    }
}
