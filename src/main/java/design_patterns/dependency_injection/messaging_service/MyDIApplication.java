package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public class MyDIApplication  implements  Consumer{
    private  MessageService service;
    public MyDIApplication(MessageService svc){
        this.service = svc ;
    }
    @Override
    public void processMessages(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}
