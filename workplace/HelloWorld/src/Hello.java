public class Hello {

    public static void main(String [] args) {

        int topScore = 99;
        int secondTopScore = 88;
        if(topScore > secondTopScore && topScore < 100 ) {
            System.out.println("Greater than the second top score!");
        }

        if((topScore > 90 ) || (secondTopScore <= 90 )) {
            System.out.println("either of the top conditions is true");
        }

        int newValue = 50;

        if(newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar = true){
            System.out.println("this is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";

        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true ;
        System.out.println(isDomestic); // false

        int ageOfClient = 20;

        String ageText = ageOfClient >= 18 ? "Over eighteen" : "Still a kid";

        System.out.println(ageText); // Over eighteen

    }
}
