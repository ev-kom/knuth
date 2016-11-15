package euclid;

/**
 * Created by EKomarov on 15.11.2016.
 */
public class EuclideanAlgorithm {

    public long findGreatestDivisorOne(long m, long n) {
        if (n > m) m = m + n - (n = m);
        while (m != 0 || n != 0) {
            m = m % n;
            if (m == 0) return n;
            n = n % m;
            if (n == 0) return m;
        }
        return 0;
    }

    public long findGreatestDivisorTwo(long m, long n){
        if (n > m) m = m + n - (n = m);
        while (m != 0){
            long r = m % n;
            if (r == 0) return n;
            m = n;
            n = r;
        }
        return 0;
    }
}
