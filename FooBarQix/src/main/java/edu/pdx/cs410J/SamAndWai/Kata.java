package edu.pdx.cs410J.SamAndWai;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++){
      //System.out.print(i);
      System.out.println(compute(String.valueOf(i)));
    }
    System.exit(0);
  }

  public static String compute(String num){
    int x = Integer.parseInt(num);

    String n = "";

    if (x % 3 == 0){
      n += "Foo";
    }

    if (x % 5 == 0){
      n += "Bar";
    }

    if (x % 7 == 0){
      n += "Qix";
    }
    return n;
  }
}