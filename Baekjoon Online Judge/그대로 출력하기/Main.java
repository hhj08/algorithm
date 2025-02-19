import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if(input ==null)
                break;

            sb.append(input).append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length()-1));
    }
}

/*
입출력
https://www.acmicpc.net/problem/11718
입력 받은 대로 출력하는 프로그램을 작성하시오.
 */