import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerChallenge {

    public static void main(String[] args) {

        Consumer<String> consumerLambda  = s -> {
            String[] parts = s.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        consumerLambda.accept("Hello My name is Mohammad Faqusa");

        Consumer<String> consumerLambdaInterface = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for(String part : parts) {
                    System.out.println(part);
                }
            }
        };

        consumerLambdaInterface.accept("hello my name is mohammad faqusa ");

        // for each

        Consumer<String> consumerLambdaInterface2 = s -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };

        consumerLambdaInterface2.accept("Hello my name is mohammad faqusa");

        // concise
        Consumer<String> consumerLambdaInterface3 = s -> {
            Arrays.asList(s.split(" ")).forEach(s2 ->  System.out.println(s2));
        };
        consumerLambdaInterface3.accept("Hello this is mohammad faqusa");


        Function<String, String> lambdaFunction = (s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if(i%2==1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaFunction.apply("123456789"));

        System.out.println(everySecondCharacter(lambdaFunction, "123456789"));

        Supplier<String> supplierLambda= () -> "I love java";
        System.out.println(supplierLambda.get());
    }

    public static String everySecondCharacter(Function<String,String> lambdaFunction , String source ) {
        return  lambdaFunction.apply(source);
    }
}
