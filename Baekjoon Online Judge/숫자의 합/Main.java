import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");

        int result = 0;
        for(int i=0; i<N; i++) {
            result += Integer.parseInt(nums[i]);
        }
        System.out.print(result);
    }
}

/*
입출력
https://www.acmicpc.net/problem/11720
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */