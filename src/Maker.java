import euclid.*;
/**
 * Created by EKomarov on 15.11.2016.
 */
public class Maker {
    public static void main(String[] args) {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        long timeStart = 0;
        long timeEnd = 0;
        long m = 1769, n = 551;

        /*
        timeStart = System.currentTimeMillis();
        System.out.println(euclid.findGreatestDivisorOne(m,n));
        timeEnd =System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);
        */

        long out[] = euclid.findGreatestDivisorCommon(m, n);
        System.out.println(out[0] + "*" + m + (out[1] > 0 ? "+":"")  + out[1] + "*" + n + "=" + out[2]);
        System.out.println(out[0]*m+out[1]*n);

    }

}
