package org.threeunsyncthreads;

public class PrintingString {
  public void printString(String str, Integer timesToRepeat) {
    while (timesToRepeat > 0) {
      System.out.println(str + ", count: " + timesToRepeat);
      timesToRepeat--;
    }
  }
}
