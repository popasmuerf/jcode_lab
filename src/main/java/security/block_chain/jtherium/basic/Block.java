package security.block_chain.jtherium.basic;

import java.util.Date;

/**
 * Created by mdb on 11/23/18.
 */
public class Block {
    public String hash ;
    public String prevHash ;
    private String data ;
    private long timeStamp ;

    public Block(String data, String prevHash){
        this.data = data ;
        this.prevHash = prevHash ;
        this.timeStamp = new Date().getTime() ;
        //this.hash = new
    }

    public String calculateHash() {
        String calculatedHash = StringUtil.applySha256(prevHash + Long.toString(timeStamp) + data);
        return calculatedHash  ;

    }


}
