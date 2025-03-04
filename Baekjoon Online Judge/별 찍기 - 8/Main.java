import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int line = 2*N-1;

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=line; i++) {
            int start = N < i ? N*2-i : i;
            int empty = 2 * (N-start);

            sb.append("*".repeat(start)).append(" ".repeat(empty)).append("*".repeat(start)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2445
규칙을 유추한 뒤에 별을 찍어 보세요.
 */