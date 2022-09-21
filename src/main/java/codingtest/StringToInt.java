package codingtest;

public class StringToInt {
    public int solution(String s) {
        String[] arr = s.split("");

        int plusMinus = 0;
        if(arr[0]=="-"){
            return Integer.parseInt(s.substring(1)) * -1;
        }else if(arr[0]=="+"){
            return Integer.parseInt(s.substring(1));
        }else{
            return Integer.parseInt(s);
        }
    }
}
