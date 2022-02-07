public class E566_ReshapetheMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4}};
        int r = 2, c = 2;
        int res[][] = matrixReshape(mat, r, c);
//        System.out.println(res.length + " " + res[0].length);
        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int originCol = mat[0].length;
        int originRow = mat.length;

        if((r * c) != (originCol * originRow)){
            return mat;
        }

        int res[][] = new int[r][c];
        int countRow = 0;
        int countCol = 0;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                res[i][j] = mat[countRow][countCol++];
                if(countCol == originCol){
                    countCol = 0;
                    countRow++;
                }
                if(countRow == originRow){
                    return res;
                }
            }

        }
        return res;
    }
}
