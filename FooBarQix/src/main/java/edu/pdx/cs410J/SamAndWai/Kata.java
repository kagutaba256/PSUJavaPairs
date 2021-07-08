package edu.pdx.cs410J.SamAndWai;

import static edu.pdx.cs410J.SamAndWai.FooBarQix.compute;

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
      System.out.println(String.valueOf(i) + "\t => " + compute(String.valueOf(i)));
    }
    System.exit(0);
  }

}