package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 60%
*
* Description:
* Multiply 2 string of non-negative numbers,
* without using builtin libraries, classes.
*
*
*
* */
public class StringMultiply {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        // Multiply each digit and add results to the result array
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int p : result) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        StringMultiply sm = new StringMultiply();
        System.out.println(sm.multiply("2", "3"));
    }

}
