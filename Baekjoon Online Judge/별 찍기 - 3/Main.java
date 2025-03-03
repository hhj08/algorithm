import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for(int i=N; i>0; i--) {
            sb.append("*".repeat(i)).append("\n");
        }

        System.out.print(sb);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2440
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */