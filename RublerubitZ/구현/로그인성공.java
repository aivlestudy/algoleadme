class Solution {
    public String solution(String[] id_pw, String[][] db) {

        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (int i = 0; i < db.length; i++) {

            if (db[i][0].equals(inputId)) {

                if (db[i][1].equals(inputPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}

//함수 solution(id_pw, db):
//입력아이디 ← id_pw[0]
//입력비번   ← id_pw[1]
//
//db의 각 회원에 대해 반복:
//만약 회원[0] == 입력아이디 이면:
//만약 회원[1] == 입력비번 이면:
//        "login" 반환
//아니면:
//        "wrong pw" 반환
//
//    "fail" 반환    // 반복문을 다 돌았는데 일치하는 아이디가 없음