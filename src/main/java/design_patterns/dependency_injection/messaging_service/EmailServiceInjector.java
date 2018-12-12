package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
