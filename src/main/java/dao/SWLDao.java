package dao;

/**
 * Created by mdb on 12/12/17.
 */
public class SWLDao {
    String name ;
    String appKey ;
    String secretKey ;
    void setName(String name){
        this.name = name ;
    }
    String getName(){
        return name ;
    }
    void setAppKey(String appKey){
        this.appKey = appKey ;
    }
    String getAppKey(){
        return appKey ;
    }
    void setSecretKey(String secretKey){
        this.secretKey = secretKey ;
    }
    String getSecretKey(){
        return secretKey ;
    }
}
