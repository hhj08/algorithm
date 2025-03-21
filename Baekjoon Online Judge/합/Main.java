import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=1; i<=n; i++) {
            result += i;
        }

        System.out.print(result);

    }
}

/*
[입출력]
https://www.acmicpc.net/problem/8393
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/