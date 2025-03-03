import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=N; i>0; i--) {
            sb.append(" ".repeat(N-i)).append("*".repeat(i)).append("\n");
        }

        System.out.print(sb);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2441
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */