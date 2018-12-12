package security.block_chain.jtherium.basic;

import java.security.MessageDigest;

import static java.lang.System.out;

/**
 * Created by mdb on 11/23/18.
 */
public class StringUtil {
    //Applies Sha256 to a string an returns the result
    public static String applySha256(String input){

        /*
            1. Receive input of some string.
            2. Apply a sha256 digest to it.... and produce
               a collection of bytes
            3.

         */

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256") ;
            //Applies sha256 to our input
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            // this is for the hash as a hex value
            StringBuffer hexString = new StringBuffer();
            for(int i =0 ; i< hash.length ; i++){
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);

                out.println(hexString);
            }

            return hexString.toString();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
