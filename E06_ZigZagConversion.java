public class E06_ZigZagConversion {
    public static void main(String[] args) {
       System.out.println(convert("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers."
               ,3));

    }


    public static String convert(String s, int numRows) {
        int strLen = s.length();
        if(numRows == 1 || numRows == strLen) return s;


        int numCols = numRows * (strLen / (numRows * 2 - 2)) + numRows;
        String[][] arr = new String[numRows][numCols];
        int changePoint = numRows - 2;
        int count = 0;
        String[] strings = s.split("");
        int countChangePoint = 1;

        for(int i = 0; i < numCols; i++){
            countChangePoint = (countChangePoint <= changePoint) ? countChangePoint : 1;
            for(int j = 0 ; j < numRows && count + 1 <= strLen ; j++, count++){

                if(i == 0 || i  % (numRows - 1) == 0)
                    arr[j][i] = strings[count];
                else{
                    arr[numRows - countChangePoint - 1][i] = strings[count++];
                    countChangePoint++;
                    break;
                }
            }

        }

        for(int i = 0; i < numRows ; i++){
            for(int j = 0 ; j < numCols ; j++){
                if(arr[i][j] != null){
                    System.out.print(arr[i][j]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows ; i++){
            for(int j = 0 ; j < numCols ; j++){
                if(arr[i][j] != null){
                    res.append(arr[i][j]);
                }
            }
        }

       return res.toString();
    }
}
