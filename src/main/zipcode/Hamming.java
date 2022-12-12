package zipcode;

import org.junit.Assert;

public class Hamming {
    String s;
    String s1;

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }


    public int getHammingDistance() {
        String[] sArr = s.split("");
        String[] s1Arr = s1.split("");

        int counter = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (!sArr[i].equals(s1Arr[i]))
                counter++;
        }
        return counter;
    }
}
