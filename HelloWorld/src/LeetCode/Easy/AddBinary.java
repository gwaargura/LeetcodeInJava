package LeetCode.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int a1 = BinaryToInt(a);
        int b1 = BinaryToInt(b);

        return IntToBinary(a1 + b1);
    }

    public int BinaryToInt(String binary) {

        int decimal = 0;

        for(int i = binary.length()-1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                decimal += (int)Math.pow(2, binary.length()-1 - i);
            }
        }

        return decimal;
    }

    public String IntToBinary(int num) {
        if(num == 0) {
            return "0";
        }
        String binary = "";
        while(num != 0) {
            binary = num%2 + binary;
            num = num/2;
        }
        return binary;
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.BinaryToInt("11"));
        System.out.println(addBinary.IntToBinary(11));
    }

}
