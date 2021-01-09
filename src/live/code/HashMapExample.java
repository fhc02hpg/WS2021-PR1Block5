package live.code;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {

  public static void main(String[] args) {

    HashMap<String, String> dictDeEn = new HashMap<>();

    System.out.println(dictDeEn);

    dictDeEn.put("Baum","tree");
    dictDeEn.put("Geschenk","present");
    dictDeEn.put("Rakete","rocket");

    System.out.println(dictDeEn);

    dictDeEn.put("Geschenk","gift");

    //key: Geschenk, value: present, gift, ...

    System.out.println(dictDeEn);

    String word1De = "Rakete";
    System.out.println(word1De + " ist "+ dictDeEn.get(word1De) + " auf Englisch");

    String word2De = "Weihnachten";
    if(dictDeEn.containsKey(word2De)) {
      System.out.println(word2De + " ist "+ dictDeEn.get(word2De) + " auf Englisch");
    } else {
      System.out.println("Eintrag leider nicht gefunden für "+word2De);
    }

    String valueEN = dictDeEn.remove("Rakete");
    System.out.println("last known value for Rakete: " + valueEN);

    System.out.println(dictDeEn);


    HashMap<String, ArrayList<String>> dictDeEnNew = new HashMap<>();

    ArrayList<String> kekseTranslations = new ArrayList<>();
    kekseTranslations.add("cookies");
    dictDeEnNew.put("Kekse",kekseTranslations);

    System.out.println(dictDeEnNew);

    dictDeEnNew.put("Geschenk",new ArrayList<>());

    System.out.println(dictDeEnNew);
    ArrayList<String> geschenkTranslations = dictDeEnNew.get("Geschenk");
    geschenkTranslations.add("present");
    System.out.println(dictDeEnNew);

    dictDeEnNew.get("Geschenk").add("gift");
    System.out.println(dictDeEnNew);









  }


}
