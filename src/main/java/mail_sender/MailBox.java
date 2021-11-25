package mail_sender;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;
    private MailInfo mi;

    public void addMailInfo(MailInfo mi_){
        infos.add(mi_);
    }

    public void sendAll(){
        for (MailInfo mi_ : infos){
            MailSender.sendMail(mi_);
        }
    }

}
