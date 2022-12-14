package Video1;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class SortingExamples
    {
        public static void main(String[] args)
        {
            Person donDraper = new Person("Don Draper", 89);
            Person peggyOlson = new Person("Peggy Olson", 65);
            Person bertCooper = new Person("Bert Cooper", 100);

            List<Person> madMen = new ArrayList<Person>();
            madMen.add(donDraper);
            madMen.add(peggyOlson);
            madMen.add(bertCooper);

            Collections.sort(madMen, new AgeCompartor());

            System.out.println(madMen);

            Collections.sort(madMen, new Reverser<>(new AgeCompartor()));

            System.out.println(madMen);
        }

    }


