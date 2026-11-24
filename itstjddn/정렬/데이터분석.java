import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {       
        // ext의 위치찾기
        int e = 0;
        switch(ext){
            case "code": e=0;
                break;
            case "date": e=1;
                break;
            case "maximum": e=2;
                break;
            case "remain": e=3;
                break;
        }
        // sort_by의 위치 찾기
        int s = 0;
        switch(sort_by){
            case "code": s=0;
                break;
            case "date": s=1;
                break;
            case "maximum": s=2;
                break;
            case "remain": s=3;
                break;  
        }
        
        // val_ext보다 작은값 list에 넣기 
        ArrayList<int []> list = new ArrayList<>();
        for(int i = 0; i < data.length; i++){
            if(data[i][e] < val_ext){
                list.add(data[i]);
            }
        }
        
        // arraylist -> list 로 넣기
        int[][] answer = new int[list.size()][];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        // list 버블정렬 sort 기준으로 정렬    (도움받음)
        for(int i = 0; i < answer.length - 1; i++){
            for(int j = 0; j < answer.length - 1 - i; j++){
                if(answer[j][s] > answer[j+1][s]){
                    int[] tmp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tmp;
                }
            }
        }
        
        
        
        return answer;
    }
}