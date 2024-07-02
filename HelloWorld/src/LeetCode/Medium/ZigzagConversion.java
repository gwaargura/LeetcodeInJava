package LeetCode.Medium;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int diagonal = numRows-2;
        int length = s.length();
        int numCols = 0;
        String container = "";
        while(true){
            length = length - numRows;
            numCols++;
            for(int i = numCols; i >= numCols - numRows; i--){

            }
            if(length <= 0){
                break;
            }
            length = length - diagonal;
            numCols += diagonal;
            if(length <= 0){
                break;
            }
        }
        String[][] out = new String[numRows][numCols];
        length = s.length();
        System.out.println("Rows: " + numRows + " Cols: " + numCols);
        System.out.println("Diagonal: " + diagonal);

        String padding = "";
        for(int i = 0; i < diagonal; i++){
            padding += " ";
        }
        String printer = "";
        for(int i = 0; i < numRows; i++){
            printer += s.charAt(i) + padding + s.charAt(i + numRows + diagonal+1);
        }

        return printer;
    }

    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();
        String s = z.convert("PAYPALISHIRING", 3);
        System.out.println(s);
//        s = z.convert("PAYPALISHIRING", 4);
//        s = z.convert("PAYPALISHIRING", 5);


    }
}
