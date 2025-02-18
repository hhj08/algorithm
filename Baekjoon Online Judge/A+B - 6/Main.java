import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String[] nums = br.readLine().split(",");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a+b);
            t--;
        }
    }
}

/*
입출력
https://www.acmicpc.net/problem/10953
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */