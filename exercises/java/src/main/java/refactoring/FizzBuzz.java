package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {
    private final int five = new int[]{0, 0, 0, 0, 0}.length;
    private int countsUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = five;

    String doFizzBuzzUpToOneHundred() {
        String resultString = "";
        int oneHundred = Byte.MAX_VALUE - 27;
        for (; countsUpToOneHundred < oneHundred; countsUpToOneHundred++) resultString += addFizzOrBuzz(countsUpToOneHundred) + " ";
        return resultString.substring(0, resultString.length() - 1);
    }

    private String addFizzOrBuzz(int number) {
        countsUpToThree++;
        countsDownFromFive--;
        int three = 0b11;
        String fizzOrBuzz = countsUpToThree == three || countsDownFromFive == 0 ? "" : String.valueOf(number + 1);
        if (countsUpToThree == three) fizzOrBuzz += fizz();
        if (countsDownFromFive == 0) fizzOrBuzz += buzz();
        return fizzOrBuzz;
    }

    private String buzz() {
        countsDownFromFive = five;
        try {
            byte[] buzzAsBytes = Hex.decodeHex("42757a7a");
            String buzz = new String(buzzAsBytes, StandardCharsets.UTF_8);
            return buzz;
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String fizz() {
        countsUpToThree = 0;
        try {
            byte[] fizzAsBytes = Hex.decodeHex("46697a7a");
            String fizz = new String(fizzAsBytes, StandardCharsets.UTF_8);
            return fizz;
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
