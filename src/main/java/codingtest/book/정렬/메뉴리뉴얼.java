package codingtest.book.정렬;

import java.util.*;
import java.util.stream.Collectors;

public class 메뉴리뉴얼 {

    public static void main(String[] args) {
        new 메뉴리뉴얼().solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
    }

    public String[] solution(String[] orders, int[] course) {
        Map<Integer, List<Course>> courses = new HashMap<>();
        for (int i : course) {
            courses.put(i, new ArrayList<>());
        }

        List<Set<String>> orderList = new ArrayList<>();

    }

    private static class Course {
        private final String course;
        private final int occurrences;

        public Course(String course, int occurrences) {
            this.course = course;
            this.occurrences = occurrences;
        }
    }

    //상태 : 하나의 메뉴가 코스에 포함되는지 여부 nextMenu, 현재까지 구성된 메뉴정보 selectedMenus
    //종료조건 : 더이상 조합할 메뉴가 없거나, 조합된 메뉴가 2회이상 등장하지 않았을 때.

    //    orderList : 메뉴 조합을 쉽게 검색하기 위한 수단, courses : 구한 코스를 저장
    private void getCourses(char nextMenu, Set<String> selectedMenus, List<Set<String>> orderList, Map<Integer, List<Course>> courses) {

        //주문 목록 중 현재까지 조합한 메뉴인 selectedMenus를 포함하는 주문 목록을 검사하여 현재까지 구한 메뉴 조합의 등장 횟수를 구함
        int occurrences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenus))
                .count();

        //등장 횟수가 2회 미만인 조합인 경우 메뉴에 추가하지 않기 때문에 더이상 조합하지 않음
        if (occurrences < 2) return;

        //현재까지 구한 메뉴 조합에 포함된 메뉴 개수를
        int size = selectedMenus.size();

        //
        if (courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);

            Course course = new Course(selectedMenus.stream()
                    .sorted()
                    .collect(Collectors.joining(""))
                    , occurrences);

            Course original = courseList.get(0);

            if (original.occurrences < occurrences) {
                courseList.clear();
                courseList.add(course);
            } else if (original.occurrences == occurrences) {
                courseList.add(course);
            }

            if (size >= 10) return;

            for (char menuChar = nextMenu; menuChar <= 'Z'; menuChar++) {
                String menu = String.valueOf(menuChar);
                selectedMenus.add(menu);
                getCourses((char) (menuChar + 1), selectedMenus, orderList, courses);
`            }
        }


    }
}
