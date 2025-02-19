import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int caseNum = 1;
        while (T-- > 0) {
            String[] nums = br.readLine().split(" ");
            System.out.println("Case #" + caseNum + ": " + (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])));
            caseNum ++;
        }
    }
}

/*
입출력
https://www.acmicpc.net/problem/11021
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */