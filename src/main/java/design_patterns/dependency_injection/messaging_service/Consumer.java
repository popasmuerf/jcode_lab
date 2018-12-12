package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public interface Consumer {
    void processMessages(String msg, String rec);
}
