import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int start = 0;
        int end = 10;
        for(int i=0; i<input.length()/10+1; i++) {
            if(end > input.length())
                end = input.length();

            System.out.println(input.substring(start, end));
            start += 10;
            end += 10;
        }
    }
}

/*
입출력
https://www.acmicpc.net/problem/11721
알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */