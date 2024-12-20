package email;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailService {

    // Credenciais de e-mail (coloque suas informações aqui)
    private static final String EMAIL = "marialucena.red@gmail.com";
    private static final String SENHA = "kcbyvyjhdqztdumo";

    public EmailService(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	// Método para enviar e-mail
    public void enviarEmail(String destinatario, String assunto, String mensagem) throws MessagingException {
        // Configurações do servidor SMTP
        String host = "smtp.gmail.com";
        String porta = "587";

        // Propriedades do servidor SMTP
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", porta);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Autenticação
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, SENHA);
            }
        });

        try {
            // Criação da mensagem
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL)); // Remetente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario)); // Destinatário
            message.setSubject(assunto); // Assunto do e-mail
            message.setText(mensagem); // Corpo da mensagem

            // Envio do e-mail
            Transport.send(message);
            System.out.println("E-mail enviado com sucesso para " + destinatario);
        } catch (MessagingException e) {
            System.err.println("Erro ao enviar o e-mail: " + e.getMessage());
            throw e; // Repropaga a exceção
        }
    }
}