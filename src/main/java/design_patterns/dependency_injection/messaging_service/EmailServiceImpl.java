package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("RECIPIENT : " + rec  );
        System.out.println("Sending This Email Message : " + msg   );
    }
}
