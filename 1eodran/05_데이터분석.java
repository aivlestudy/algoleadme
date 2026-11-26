import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        List<String> cols = List.of("code", "date", "maximum", "remain");
        int extn = cols.indexOf(ext);
        int sortn = cols.indexOf(sort_by);

        //data[code, date, maximum, remain]
        //data에서 ext값이 val_ext미만인 배열값들만 남김
        List<int[]> list = new ArrayList<>();
        for(int i=0; i< data.length; i++){
            if(data[i][extn] < val_ext){
                list.add(data[i]);
            }
        }
        //sort_by 기준으로 data를 오름차순으로 정렬
        list.sort((x,y) -> Integer.compare(x[sortn], y[sortn]));

        answer = list.toArray(new int[0][]);
        return answer;
    }
}
