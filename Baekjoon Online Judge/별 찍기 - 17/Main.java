import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int endLine = N+(N-1);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++) {
            if(i == 1) {
                sb.append(" ".repeat(N-i))
                        .append("* ").append("\n");
            } else if(i == N) {
                sb.append("*".repeat(endLine))
                        .append("\n");
            } else {
                sb.append(" ".repeat(N-i))
                        .append("*")
                        .append(" ".repeat(2 * (i - 2) + 1))
                        .append("*")
                        .append("\n");
            }
        }
        System.out.println(sb);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/10992
규칙을 유추한 뒤에 별을 찍어 보세요.
 */