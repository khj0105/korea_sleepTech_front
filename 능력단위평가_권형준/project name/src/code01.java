//# 문제 1: 두 수의 합
//! 1. 문제 설명
// : 두 정수 A와 B가 주어질 때, 두 수의 합을 출력하는 프로그램을 작성하시오.

//! 2. 입력
// : 첫 번째 줄에 정수 A와 B가 공백으로 구분되어 주어진다.

//! 3. 출력
// : 두 정수의 합을 출력한다.

//? cf) 제한 사항
// 1 <= A, B <= 10,000

import java.util.Scanner;

public class code01 {
  // main: main 메서드 작성
  // sout: System.out.println(); 출력문 작성
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println(A + B);

    sc.close();
  }
}