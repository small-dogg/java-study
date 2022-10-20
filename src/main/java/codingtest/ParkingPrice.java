package codingtest;

import java.util.HashMap;
import java.util.Map;

public class ParkingPrice {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for(String record:records){
            String[] rArr = record.split(" ");
            if(rArr[2].equals("IN")) {
                map.put(rArr[1],)
            }
        }
        int price = fees[1]+((fees[0]-minute)/fees[2])*fees[3]
    }
}
