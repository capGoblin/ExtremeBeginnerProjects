import java.util.Scanner;

public class Console {
  private static Scanner scanner = new Scanner(System.in);
  public static double validateData(String prompt) {
    return scanner.nextDouble();
  }
  public static double validateData(String prompt, int min, int max) {
  double value;
  while (true) {
    System.out.print(prompt);
    value = scanner.nextDouble();
    if (value >= min && value <= max) {
      break;
    } else {
      System.out.println("Enter a value between " + min + " and " + max);
    }
  }
  return value;
}
}