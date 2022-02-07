public class E74_Searcha2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(searchMatrix(matrix, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int target_row_num = 0;
        for(int i = 1 ; i < rows ; i++){
            if(matrix[i][0] == target)
                return true;
            if(matrix[i][0] > target){
                target_row_num = i - 1;
                break;
            }
            if(i == rows - 1)
                target_row_num = rows - 1;
        }

        int target_row[] = matrix[target_row_num];

        int left = 0, right = target_row.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target_row[mid] == target)
                return true;
            else if(target_row[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }
}
