package design_patterns.dependency_injection.messaging_service;

/**
 * Created by mdb on 5/14/18.
 */
public class DriverMessaging {
    public static void main(String args[]){
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "7779311";
        MessageServiceInjector injector = null ;
        Consumer app = null ;


        //send email

        injector = new EmailServiceInjector() ;
        app = injector.getConsumer();
        app.processMessages(msg, email);


        //semd S<S

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg,email);

    }

}
