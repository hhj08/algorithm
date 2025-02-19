import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int caseNum = 1;

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println("Case #" + caseNum + ": " + a + " + " + b + " = " + (a + b) );

            caseNum++;
        }

    }
}

/*
입출력
https://www.acmicpc.net/problem/11022
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */