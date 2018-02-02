import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

/**
 * Created by mdb on 12/20/17.
 */
public class SL4J {
    static Logger logger = LoggerFactory.getLogger(SL4J.class);
    public static void main(String args[])throws IOException{
        logger.info("hello world");
        Integer count = 0 ;
        while(count != 20){
            logger.info(count.toString());
            count ++ ;
        }
    }
}
