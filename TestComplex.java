import java.util.Scanner;

public class TestComplex{

  public static void main(String[] args) {
    Complex num1 = new Complex();
    num1.modul();
    num1.argument();
    num1.summa(1,2);
    num1.differ(1,2);

    Complex num2 = new Complex(3, 5);
    num2.modul();
    num2.argument();
    num2.summa(1,2);
    num2.differ(1,2);
  }
}
