import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int line = 2*N-1;
        int star = line+2;
        int empty = 0;

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=line; i++) {
            if(N < i) {
                star += 2;
                empty--;
            } else {
                star -= 2;
                empty++;
            }
            sb.append(" ".repeat(empty-1))
                    .append("*".repeat(star))
                    .append("\n");
        }
        System.out.print(sb);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/2446
규칙을 유추한 뒤에 별을 찍어 보세요.
 */