import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Double> scores = Arrays.asList(85.5d, 90.4d, 69.4d, 57.9d);

        System.out.println(Score.getCeilAndSum(scores));
        System.out.println(Score.getCeilAndSumByStream(scores));


    }
}