public class Problem3
{
  public static void main(String[] args)
  {
    double val = 49.4912;
    System.out.println("Number: " + val);

    int number1 = (int)(val*10)%10;
    int number2 = (int)(val*10*10)%10;
    int number3 = (int)(val*10*10*10)%10;
    System.out.println("Answer: " + number1 + " " + number2 + " " + number3);
  }
}
