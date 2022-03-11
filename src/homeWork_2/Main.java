package homeWork_2;

import java.util.*;

public class Main {
    public static  void main(String[] args) {
        /**City деген класс тузунуз. (code, name, ...)
         Эгерде code так сан болсо TreeSetke салыныз.
         Аларды чонунан кичинесине караган тартипте чыгарыныз.
         * */
        Random random = new Random();
        Set<City> set = new HashSet<>();
        set.add(new City(random.nextInt(10), "'Osh'"));
        set.add(new City(random.nextInt(20), "'Singapore'"));
        set.add(new City(random.nextInt(30), "'Dubai'"));
        set.add(new City(random.nextInt(40), "'Sank-Petersburg'"));
        set.add(new City(random.nextInt(50), "'Thailand'"));
        set.add(new City(random.nextInt(60), "'Riad'"));
        set.add(new City(random.nextInt(70), "'Seoul'"));
        set.add(new City(random.nextInt(80), "'Bishkek'"));

        Set<City> treeSet = new TreeSet<>(set);
        Set<City> treeSetTak = new TreeSet<>();
        System.out.println("Рандом жардамында шаарларга код бердим" +
                " эгерде шаарлардын кодду так сан болсо анда аларды чонунан кичинесине караган тартипте коробуз!");
        for (City city : treeSet) {
            if (city.getCode() % 2 != 0) {
                treeSetTak.add(city);
                System.out.println(city);
            }
        }
    }

}
