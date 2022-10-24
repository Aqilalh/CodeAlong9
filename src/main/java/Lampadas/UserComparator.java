package Lampadas;


    import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {

        public static void main(String[] args) {

            Users sarah = new Users("Sarah", 28);
            Users james = new Users("James", 35);
            Users mary = new Users("Mary", 33);
            Users john1 = new Users("John", 24);
            Users john2 = new Users("John", 25);

            List<Users> user = Arrays.asList(sarah, james, mary, john1, john2);

            Comparator<Users> cmpName = Comparator.comparing(users -> users.getName());
            Comparator<Users> cmpAge = Comparator.comparing(users -> users.getAge());
            Comparator<Users> comparator = cmpName.thenComparing(cmpAge);
            Comparator<Users> reversed = comparator.reversed();

            user.sort(reversed);
            user.forEach(u -> System.out.println(u));
        }
    }

