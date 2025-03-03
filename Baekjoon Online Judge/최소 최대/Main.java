import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputNums = br.readLine().split(" ");

        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<N; i++) {
            nums.add(Integer.parseInt(inputNums[i]));
        }

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println(min + " " + max);
    }
}

/*
[입출력]
https://www.acmicpc.net/problem/10818
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

ArrayList 주요 함수 알아두기.
 */