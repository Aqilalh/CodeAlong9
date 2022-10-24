package Video1;

    import java.util.Comparator;

    public class AgeCompartor implements Comparator<Person>
    {
        @Override
        public int compare(Person left, Person right)
        {
            return Integer.compare(left.getAge(), right.getAge());
        }
    }


