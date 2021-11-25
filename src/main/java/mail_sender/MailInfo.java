package mail_sender;

import java.util.HashMap;

public class MailInfo {
    private Client client;
    MailCode mailCode;

    MailInfo(Client client_, MailCode mailCode_){
        client = client_;
        mailCode = mailCode_;
    }

    public String generateMailContent() {
        String mailContent = mailCode.generateText();

        HashMap<String, String> templates = new HashMap<String, String>();

        templates.put("__name__", client.getName());
        templates.put("__age__", Integer.toString(client.getAge()));
        templates.put("__sex__", client.getSex());

        for ( String property: templates.keySet() ) {
            mailContent = mailContent.replace( property, templates.get(property) );
        }
        return mailContent;
    }
}
