package live.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import live.code.ue.emp.Person;

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

    Person p1 = new Person("John","Doe");
    Person p2 = new Person("Jane","Doe");
    Person p3 = new Person("John","Doe");
    Person p4 = new Person("Hans-Peter","Grahsl");
    Person p5 = new Person("Stephan","Kochauf");

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));

    HashSet<Person> persons = new HashSet<>();
    System.out.println(persons.size());
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);
    persons.add(p5);
    System.out.println(persons.size());
    System.out.println(persons);

  }

}
