package live.code;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.println(numbers.size());

    numbers.add(42);
    numbers.add(23);
    numbers.add(-1);
    numbers.add(100);
    numbers.add(7);

    System.out.println(numbers.size()); // numbers.length

    System.out.println(numbers.get(0)); // numbers[0]
    System.out.println(numbers.get(4)); // numbers[4]

    numbers.remove(1);
    System.out.println(numbers.get(1));
    System.out.println(numbers.size());

    System.out.println("contains 100? "+numbers.contains(100));
    System.out.println("contains 550? "+numbers.contains(550));

    for (Integer i : numbers) {
      System.out.println(i);
    }

    Iterator<Integer> li = numbers.iterator();

    while(li.hasNext()) {
      Integer n = li.next();
      if(n == -1) {
        li.remove();
      } else {
        System.out.println(n + "^2 = " + n*n);
      }
    }

    System.out.println(numbers.size());




  }

}
