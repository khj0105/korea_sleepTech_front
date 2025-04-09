import java.util.Scanner;

public class sleepTech04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i <= N - 1; i++) {
      for (int j = 0; j <= N - 1 - j; j++) {
        if (arr[j] > arr[j + 1]) {
          int num = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = num;
        }
      }
    }

    for (int num1 : arr) {
      System.out.println(num1 + "");
    }

    sc.close();
  }
}
