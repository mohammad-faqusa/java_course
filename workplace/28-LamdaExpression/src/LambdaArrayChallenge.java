import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaArrayChallenge {

    public static void main(String[] args) {

        String[] names = {"Mohammad" , "Ahmad" , "Bob", "Anna"};

        Arrays.setAll(names, i -> names[i].toUpperCase() +","+ reverseName(names[i].toUpperCase()));

        System.out.println(Arrays.toString(names));

        ArrayList<String> namesList = new ArrayList<>(List.of(names));

        namesList.removeIf(n -> {
            String[] parts = n.split(",");
            System.out.println(parts[0]);
            System.out.println(parts[1]);
            return parts[0].equals(parts[1]);
        });

        namesList.forEach(System.out::println);
    }

    public static String reverseName(String name) {
        StringBuilder result = new StringBuilder("");
        for (int i = name.length() - 1 ; i >= 0  ; i--) {
            result.append(name.charAt(i));
        }
        return result.toString();
    }
}
