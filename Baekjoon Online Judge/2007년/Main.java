import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] days = br.readLine().split(" ");
        int month = Integer.parseInt(days[0]);
        int day = Integer.parseInt(days[1]);

        LocalDate date = LocalDate.of(2007, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        String result = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();

        System.out.print(result);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/1924
오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

자바 8 이후에는 날짜를 표현하기 위해 ava.time.LocalDateTime, java.time.LocalDate 클래스가 주로 사용 됨.
이를 활용하여 날짜를 표현한 후 요일을 구할 수 있다.
 */