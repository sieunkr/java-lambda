import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Double> scores = Arrays.asList(85.5d, 90.4d, 69.4d, 57.9d);

        System.out.println(Score.getCeilAndSum(scores));
        System.out.println(Score.getCeilAndSumByStream(scores));

        final List<String> names = Arrays.asList("eddy", "jung", "lion");

        //ForEach.printList(names);
        //ForEach.printListByForEach(names);
        //ForEach.printListByLambda(names);
        ForEach.printListByLambdaMethodRef(names);

        Example01 example01 = new Example01();
        example01.anotherExample();

        example01.anotherExample02("test");

    }
}