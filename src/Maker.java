import euclid.*;
/**
 * Created by EKomarov on 15.11.2016.
 */
public class Maker {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();

        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        System.out.println(euclid.findGreatestDivisor(2166,6099));

        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);
    }
}
