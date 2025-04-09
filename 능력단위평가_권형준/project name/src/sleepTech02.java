import java.util.Scanner;

public class sleepTech02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      if (num < min) {
        min = num;
      }
    }
    System.out.println("최솟값 :" + min);

    sc.close();
  }
}
