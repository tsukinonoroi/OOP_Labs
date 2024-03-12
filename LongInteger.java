import java.math.BigInteger;

public class LongInteger {
    private BigInteger value;

    public LongInteger(String number) {
        value = new BigInteger(number);
    }

    // +
    public LongInteger add(LongInteger other) {
        return new LongInteger(value.add(other.value).toString());
    }

    // *
    public LongInteger multiply(LongInteger other) {
        return new LongInteger(value.multiply(other.value).toString());
    }

    public boolean lessThan(LongInteger other) {
        return value.compareTo(other.value) < 0;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public LongInteger factorial() {
        BigInteger result = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(value) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }

        return new LongInteger(result.toString());
    }

    public int countOnesInDigit(int digitIndex) {
        String stringValue = value.toString();
        if (digitIndex >= 0 && digitIndex < stringValue.length()) {
            char digitChar = stringValue.charAt(digitIndex);
            return digitChar == '1' ? 1 : 0;
        }
        return -1;
    }

    public int length() {
        return value.toString().length();
    }
}
