/*
String[] id_pw = {"input id", "input pw"};

String[][] db = {
    {"stored id1", "stored pw1"}
    {"stored id2", "stored pw2"}
};
*/

class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {        //id search
                if (id_pw[1].equals(db[i][1])) {    //pw search
                    return "login";
                }
                else{
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}