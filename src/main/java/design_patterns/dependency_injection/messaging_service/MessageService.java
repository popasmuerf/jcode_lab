package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public interface MessageService {
    void sendMessage(String msg, String rec);
}
