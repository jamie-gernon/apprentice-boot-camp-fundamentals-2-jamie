package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {
    public static final int ONE_HUNDRED = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final int FIVE = new int[]{0, 0, 0, 0, 0}.length;
    public static final String BUZZ;

    static {
        try {
            BUZZ = new String(Hex.decodeHex("42757a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String FIZZ;

    static {
        try {
            FIZZ = new String(Hex.decodeHex("46697a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
    }


    private int countsUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = FIVE;

    String doFizzBuzzUpToOneHundred() {
        String resultString = "";
        for (; countsUpToOneHundred < ONE_HUNDRED; countsUpToOneHundred++) resultString += addFizzOrBuzz(countsUpToOneHundred) + " ";
        return resultString.substring(0, resultString.length() - 1);
    }

    private String addFizzOrBuzz(int number) {
        countsUpToThree++;
        countsDownFromFive--;
        String fizzOrBuzz = countsUpToThree == THREE || countsDownFromFive == 0 ? "" : String.valueOf(number + 1);
        if (countsUpToThree == THREE) fizzOrBuzz += fizz();
        if (countsDownFromFive == 0) fizzOrBuzz += buzz();
        return fizzOrBuzz;
    }

    private String buzz() {
        countsDownFromFive = FIVE;
        return BUZZ;
    }

    private String fizz() {
        countsUpToThree = 0;
        return FIZZ;
    }
}
