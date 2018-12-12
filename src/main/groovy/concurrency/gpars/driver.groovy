package concurrency.gpars
import static groovyx.gpars.GParsPool.withPool
/**
 * Created by mdb on 4/24/18.
 */
class driver {
    public static void main(String[] args){
        println("running in driverG")

        def numbers = [1,2,3,4,5,6,7,8]
        def squares = [9,10,11,12,13,14,15,16]

        withPool(10){
            assert squares == numbers.collectParallel { it * it }
        }

    }
}
