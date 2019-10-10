import java.util.List;
import java.util.function.Predicate;

public class PickDifferentNames {

    //자바8의 힘, 50page
    //https://www.baeldung.com/java-predicate-chain

    public void getCount(List<String> list) {

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");

        final long countFriendsStartN =
                list.stream().filter(startsWithN).count();
    }

    public void getCount02(List<String> list) {

        final long countFriendsStartN =
                list.stream().filter(checkIfStartsWith("N")).count();
    }

    public static Predicate<String> checkIfStartsWith(final String letter){
        return name -> name.startsWith(letter);
    }
}
