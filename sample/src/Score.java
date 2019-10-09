import java.util.List;

public class Score {

    /*
        AS-IS
        너무 자세하게 코딩되어 있는 로우 레벨 프로그래밍 방식
        지저분한 변수 사용
    */
    public static int getCeilAndSum(List<Double> scores){

        int totalScore = 0;

        for(Double score : scores){
            if((int)Math.ceil(score) >= 70){
                totalScore = totalScore + (int)Math.ceil(score);
            }
        }
        return totalScore;
    }

    /*
        TO-BE
        개선
    */
    public static int getCeilAndSumByStream(List<Double> scores){

        return scores.stream()
                .filter(score -> (int)Math.ceil(score) >= 70)
                .mapToInt(score -> (int)Math.ceil(score))
                .sum();
    }

}
