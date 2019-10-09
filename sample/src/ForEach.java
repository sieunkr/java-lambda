import java.util.List;
import java.util.function.Consumer;

public class ForEach {



    public static void printList(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void printListByForEach(List<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

    //익명 클래스
    public static void printListByAnonymous(List<String> list){
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    //람다 표현식
    public static void printListByLambda(List<String> list){
        list.forEach(s -> System.out.println(s));
    }

    //람다 표현식 & 메서드 참조
    public static void printListByLambdaMethodRef(List<String> list){
        list.forEach(System.out::println);
    }

}
