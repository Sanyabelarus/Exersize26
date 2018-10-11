package com.exercize.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      intList.add(random.nextInt(9) + 1);
    }
    List<Integer> badMarks = new ArrayList<Integer>();
    for (Integer i : intList) {
      if (i.intValue() <= 3) {
        badMarks.add(i);
      }
    }
    intList.removeAll(badMarks);
  }
}
