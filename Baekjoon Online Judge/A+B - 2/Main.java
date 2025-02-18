import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a + b);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2558
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */