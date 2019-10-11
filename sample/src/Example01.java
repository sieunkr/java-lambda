import java.util.function.Function;

public class Example01 {
    private String firstName = "Eddy";

    public void anotherExample(){
        Function<String, String> addSurname = new Function<String, String>() {

            @Override
            public String apply(String s) {
                //this.firstName 컴파일 에러
                return Example01.this.firstName + " " + s;
            }
        };

        System.out.println(addSurname.apply("Kim"));
    }

    public void anotherExample02(String firstName){
        Function<String, String> addSurname = s -> this.firstName + " " + s;

        System.out.println(addSurname.apply("Kim"));
    }



}
