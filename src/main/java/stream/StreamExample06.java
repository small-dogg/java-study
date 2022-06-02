package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class Student2 {
    String name;
    boolean isMale; //성별
    int hak; //학년
    int ban;
    int score;

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    //groupingBy()에서 사용
    enum Level {HIGH, MID, LOW} //성적을 상, 중, 하 세 단계로 분류
}

public class StreamExample06 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("나자바", true, 1, 1, 300),
                new Student2("김지미", false, 1, 1, 250),
                new Student2("김자바", true, 1, 1, 200),
                new Student2("이지미", false, 1, 2, 150),
                new Student2("남자바", true, 1, 2, 100),
                new Student2("안지미", false, 1, 2, 50),
                new Student2("황지미", false, 1, 3, 100),
                new Student2("강지미", false, 1, 3, 150),
                new Student2("이자바", true, 1, 3, 200),
                new Student2("나자바", true, 2, 1, 300),
                new Student2("김지미", false, 2, 1, 250),
                new Student2("김자바", true, 2, 1, 200),
                new Student2("이지미", false, 2, 2, 150),
                new Student2("남자바", true, 2, 2, 100),
                new Student2("안지미", false, 2, 3, 50),
                new Student2("황지미", false, 3, 3, 100),
                new Student2("강지미", false, 3, 3, 150),
                new Student2("이자바", true, 3, 3, 200)
        };

        System.out.println("1. 단순분할(성별로 분할)");
        Map<Boolean, List<Student2>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(s -> s.isMale)); // true, 남자리스트 || false, 여자리스트

        List<Student2> maleStudent = stuBySex.get(true);
        List<Student2> femaleStudent = stuBySex.get(false);

        maleStudent.stream().forEach(System.out::println);
        femaleStudent.stream().forEach(System.out::println);

        System.out.println("2. 단순분할 + 통계(성별 학생수)");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(s -> s.isMale, counting()));
        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        System.out.println("3. 단순분할 + 통계(성별 1등)");
        Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(s -> s.isMale, maxBy(Comparator.comparingInt(Student2::getScore))));
        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        Map<Boolean, Student2> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student2::isMale,
                        collectingAndThen(
                                maxBy(Comparator.comparingInt(Student2::getScore)), Optional::get)
                ));
        System.out.println("남학생 1등 : " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

        System.out.println("4. 다중분할(성별 불합격자, 100점 이하)");
        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student2::isMale,
                        partitioningBy(s -> s.getScore() <= 100))
                );

        List<Student2> failedMaleStudent = failedStuBySex.get(true).get(true);
        List<Student2> failedFemaleStudent = failedStuBySex.get(false).get(true);
        for (Student2 student2 : failedMaleStudent) {
            System.out.println(student2);
        }
        failedFemaleStudent.stream().forEach(System.out::println);


        ////////////////////groupingBy////////////////////////////////////////////
        System.out.println();
        System.out.println("-----------------groupingBy-----------------------");
        System.out.println();

        System.out.println("1. 단순그룹화(반별로 그룹화");
        Map<Integer, List<Student2>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getBan));
        for (List<Student2> value : stuByBan.values()) {
            System.out.println(value.get(0).ban + " 반 학생들::::::::::::::");
            for (Student2 student2 : value) {
                System.out.println(student2);
            }
        }

        System.out.println("2. 단순그룹화(성적별로 그룹화");
        Map<Student2.Level, List<Student2>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student2.Level.HIGH;
                    else if (s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }));

        TreeSet<Student2.Level> keySet = new TreeSet<>(stuByLevel.keySet());
        for (Student2.Level level : keySet) {
            System.out.println("[" + level + "]");
            for (Student2 student : stuByLevel.get(level)) {
                System.out.println("student = " + student);
            }
        }

        System.out.println("3. 단순그룹화 + 통계(통계별 학생수)");
        Map<Student2.Level, Long> stuCountByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student2.Level.HIGH;
                    else if (s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }, counting()));

        for (Student2.Level level : stuCountByLevel.keySet()) {
            System.out.println("[" + level + "] " + stuCountByLevel.get(level) + " 명");
        }

        System.out.println("4. 다중그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student2>>> stuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getHak, groupingBy(Student2::getBan)));


        System.out.println("5. 다중 그룹화 + 통계(학년별, 반별 1등)");
        Map<Integer, Map<Integer, Student2>> topStuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getHak,
                        groupingBy(Student2::getBan,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(Student2::getScore)),
                                        Optional::get
                                )
                        )
                ));

        Map<String, Set<Student2.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getHak() + "-" + s.getBan(),
                        mapping(s -> {
                            if (s.getScore() >= 200) return Student2.Level.HIGH;
                            else if (s.getScore() >= 100) return Student2.Level.MID;
                            else return Student2.Level.LOW;
                        }, toSet())));
    }
}
