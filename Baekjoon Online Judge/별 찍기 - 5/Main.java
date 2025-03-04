import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int endLien = 2*N-1;

        StringBuffer sb = new StringBuffer();

        for(int i=1; i<=endLien; i++) {
            if(i%2 == 1) {
                N--;
                sb.append(" ".repeat(N)).append("*".repeat(i)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2442
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
별은 가운데를 기준으로 대칭이어야 한다.
 */