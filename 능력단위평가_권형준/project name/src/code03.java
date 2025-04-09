//# 문제 3: 자연수의 약수 구하기
//! 1. 문제 설명
// 자연수 N이 주어지면, N의 모든 약수를 오름차순으로 출력하는 프로그램을 작성하시오.
// EX) 24의 약수 1, 2, 3, 4, 6, 8, 12, 24
// EX) 35의 약수 1, 5, 7, 35

//! 2. 입력
// 첫 번째 줄에 자연수 N이 주어진다.

//! 3. 출력
// N의 약수를 공백으로 구분하여 오름차순으로 출력한다.

//? cf) 제한 사항
// 1 ≤ N ≤ 10,000

import java.util.Scanner;

public class code03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    // cf) 1은 모든 자연수의 약수
    // 1부터 N까지의 수 중에서 N을 나누어 나머지가 0인 수들을 약수
    for (int i = 1; i < N; i++) {
      if (N % i == 0) {
        System.out.print(i + " ");
      }
    }

    sc.close();
  }
}
