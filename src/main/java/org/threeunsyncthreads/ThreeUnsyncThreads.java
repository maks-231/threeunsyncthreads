package org.threeunsyncthreads;

public class ThreeUnsyncThreads {
  public static void main(String[] args) {

    PrintingStringThread thread1 = new PrintingStringThread(10, "Hello world from thread 1!", new PrintingString());
    PrintingStringThread thread2 = new PrintingStringThread(8, "Hello world from thread 2!", new PrintingString());
    PrintingStringThread thread3 = new PrintingStringThread(5, "Hello world from thread 2!", new PrintingString());

    thread2.start();
    thread1.start();
    thread3.start();

    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}