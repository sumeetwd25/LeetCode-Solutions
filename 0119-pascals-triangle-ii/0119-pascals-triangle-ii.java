import java.math.BigInteger;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            BigInteger nCr = factorial(rowIndex).divide(factorial(i).multiply(factorial(rowIndex - i)));
            list.add(nCr.intValue());
        }
        return list;
    }

    public BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}





