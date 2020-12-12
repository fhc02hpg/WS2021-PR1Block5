package live.code;

import java.util.HashMap;

public class DemoHashMap {

  public static void main(String[] args) {

    HashMap<String,Integer> name2Age = new HashMap<>();
    name2Age.put("John",42);
    name2Age.put("Jane",36);
    System.out.println(name2Age);

    name2Age.put("John",43);
    name2Age.put("Jane",37);
    System.out.println(name2Age);

    if(name2Age.containsKey("Max")) {
      System.out.println(name2Age.get("Max"));
    } else {
      System.out.println("no Max found!");
    }

    Integer lastknownAge = name2Age.remove("Jane");
    System.out.println("Jane was "+lastknownAge+" before leaving");
    System.out.println(name2Age);

  }

}
