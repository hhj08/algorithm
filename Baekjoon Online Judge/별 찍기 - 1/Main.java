import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for(int i=1; i<=N; i++) {
            sb.append("*".repeat(i)).append("\n");
        }

        System.out.print(sb.toString());
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2438
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */