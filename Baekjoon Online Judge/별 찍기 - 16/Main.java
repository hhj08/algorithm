import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++) {
            sb.append(" ".repeat(N-i))
                    .append("* ".repeat(i))
                    .append("\n");
        }
        System.out.println(sb);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/10991
규칙을 유추한 뒤에 별을 찍어 보세요.
 */