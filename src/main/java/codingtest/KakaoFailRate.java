package codingtest;

import java.util.*;

public class KakaoFailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        //스테이지별 실패 수
        Map<Integer,Integer> stageMap = new HashMap<>();
        for(int i=0;i<stages.length;i++){
            if (stages[i] == N + 1) {
                continue;
            }
            stageMap.put(stages[i], (stageMap.getOrDefault(stages[i], 0) + 1));
        }

        //스테이지별 실패 확률
        int amount = 0;
        Map<Integer,Double> resultMap = new HashMap<>();
        for (int i=1;i<N+1;i++) {
            double failRate = (double)stageMap.getOrDefault(i,0)/(stages.length-amount);
            amount+=stageMap.getOrDefault(i,0);
            resultMap.put(i,failRate);
        }

        //확률 기준 정렬
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(resultMap.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if(o1.getValue()==0) return 1;
            if(o2.getValue()==0) return -1;
            if(o1.getValue()==o2.getValue()){
                return -1;
            }
            return o1.getValue()>o2.getValue()?-1:1;
        });

        //정렬 결과 스테이지
        for (int i = 0; i < N; i++) {
            answer[i]=list.get(i).getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        new KakaoFailRate().solution(8,new int[]{1,2,3,4,5,6,7});
    }
}
