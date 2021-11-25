package mail_sender;

public class MailSender {

    public static void sendMail(MailInfo mi_) {
        System.out.println( mi_.generateMailContent() );
    }
}
