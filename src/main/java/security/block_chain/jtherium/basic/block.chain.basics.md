In this tutorial.....
=============================
*   Create your first(very) basica 'blockchain'
*   Implemennt a simple proof of work(mining) system.
*   Marvel at the possibilities




Making the blockchain
=============================
A blockchain is just a chain/list of blocks.
Each block in the blockchain will have its
own digital signature, contain digital signatrure 
of the previous block, and have some data(possibley transactions for example)


Hash = Digital Signature



Each block doesn't just contain the hash of the 
block before its own has is in part,
calculated form the previous hash.  If the 
previou block's data is changed then the previous 
block's hash will change(since it is calculated
in part b the data).


If the previous block's data is changed then the previous block's
hash will change(since it is calculated in part, by the data)
in turn affecting all the hashes of the blocks thre after.
Calcluating and comparing the hashes allow us to see if
a blockchian is invalid...


So what does this mean ?
===========================================
....Chhanging any data in this list, will
change the signature and thus break the chain....

Block chain provides for an electronic/digital 
paper trail.....


Let's design and implement our block object..
===========================================

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
        }
    }


We need a cryptographic mechanic....
===============================================
There are many cryptographic algorithms you can
choose from, however SHA256 fits just
fine for this example.  We can import

   

    java.securityMessageDigest ;
    
    
to get access to the SHA256 algorithm.
We need to use SHA256 later down  the line so
lets create a handy helper method in 
a new StringUtil 'utility' class:





What we should take away from this so far...
===============================================
Don't worry too much if you don't understand the 
conents of this heleper method, all 
we need to know is that it takes a string
and applies SHA256 algorithm to it,
and returns the generated signature as a string.


We have a Block class ....what do we do with it ?
===================================================
We need a method in the Block class, to 
calculate the hash.  We must calculate the hash from
all parts of the block we don't want to be tampered with
So for our blaock we will include the :

        previousHash
        data
        timeStamp
        
        

//Code for our new Block class...


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
        }
    
        public String calculateHash() {
            String calculatedHash = StringUtil.applySha256(prevHash + Long.toString(timeStamp).toString() + data));
            return calculatedHash  ; 
        } 
    
    
    }
