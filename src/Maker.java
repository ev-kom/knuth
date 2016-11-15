import euclid.*;
/**
 * Created by EKomarov on 15.11.2016.
 */
public class Maker {
    public static void main(String[] args) {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        long timeStart = 0;
        long timeEnd = 0;

        timeStart = System.currentTimeMillis();

        System.out.println(euclid.findGreatestDivisorOne(125,25));

        timeEnd =System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);

    }

}
