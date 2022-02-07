import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E36_ValidSudoku {

    public  boolean isValidSudoku(char [][] board) {
        boolean isValid = true;
        List<Node> list = new ArrayList<>();
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                    int box;
                    if(i < 3){
                        if(j<3)
                            box = 1;
                        else if(j<6)
                            box = 2;
                        else
                            box = 3;
                    }
                    else if (i < 6){
                        if(j<3)
                            box = 4;
                        else if(j<6)
                            box = 5;
                        else
                            box = 6;
                    }
                    else{
                        if(j<3)
                            box = 7;
                        else if(j<6)
                            box = 8;
                        else
                            box = 9;
                    }
                    Node newNode = new Node(board[i][j], i , j, box);
                    list.add(newNode);
                }
            }
        }

        for(int i = 0 ; i < list.size() ; i++){
            Node curNode = list.get(i);
            for(int j = i + 1; j < list.size() ; j++){
                Node cmpNode = list.get(j);
                if(curNode.val == cmpNode.val){
                    // detect same row or same col
                    if(curNode.row == cmpNode.row || curNode.col == cmpNode.col || curNode.box == cmpNode.box)
                        return false;
                }
            }
        }

        return isValid;
    }

    private class Node{
        char val;
        int row;
        int col;
        int box; // 1~9
        public Node(char val, int row, int col, int box){
            this.val = val;
            this.row = row;
            this.col = col;
            this.box = box;
        }
    }
}
