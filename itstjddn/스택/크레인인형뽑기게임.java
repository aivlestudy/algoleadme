import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        // list나 ArrayList로 접근 하려 하였으나 Stack이 더 접근하기 쉬울거라고 생각듦.
        Stack<Integer> st = new Stack<>(); 
        
        // 인형을 뽑을 크레인 위치를 차례대로 뽑기
        for(int i = 0; i < moves.length; i++){
            int col = moves[i] - 1;
            
            // 해당 열을 위에서부터 내려가며 첫 번째 인형 찾기
            for(int row = 0; row < board.length; row++){
                
                if(board[row][col] != 0){
                    int doll = board[row][col];
                    board[row][col] = 0;
                    
                    // 스택이 비어있지않고, 바구니 맨 위 인형과 같으면 꺼내고 +2
                    if(!st.empty() && st.peek() == doll){
                        st.pop();
                        count += 2;
                    }else{
                        st.push(doll);
                    }
                    break;
                    }
                }      
            }
        return count;        
    }
}