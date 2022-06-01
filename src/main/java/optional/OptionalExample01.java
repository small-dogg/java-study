package optional;

import java.util.Optional;

public class OptionalExample01 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println("arr = " + arr.length);

        Optional<String> opt = Optional.empty();
        System.out.println("opt = " + opt);

        String str = "";


        try {
            str = opt.get(); // 예외 발생
        } catch (Exception e) {
            str="";
        }
        System.out.println("str = " + str);

        //if를 안쓰고도 처리할 수 있어..
//        str = opt.orElse("EMPTY"); //Optional에 저장된 값이 null이면 "EMPTY"반환
        str = opt.orElseGet(String::new); //orElseGet을 사용하면 람다를 작성할 수 있지
        System.out.println("str = " + str);
    }
}
