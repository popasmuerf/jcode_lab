package security.block_chain.jtherium.basic;
import static java.lang.System.* ;
import static security.block_chain.jtherium.basic.StringUtil.applySha256;

import java.lang.Thread.* ;
/**
 * Created by mdb on 11/23/18.
 */
public class Driver {
    public static void main(String[] args){
        out.println("running in Thread :" + Thread.currentThread().toString() );
        //String sig0 =  applySha256("abcdefg");
        //String sig1 = applySha256(sig0);
    }
}
