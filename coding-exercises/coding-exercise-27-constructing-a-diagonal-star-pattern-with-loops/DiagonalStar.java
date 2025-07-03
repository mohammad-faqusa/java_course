public class DiagonalStar {
    // write code here

    public static void printSquareStar(int number) {
        if(number < 5 ){
            System.out.print("Invalid Value");
            return;
        }

        for(int i = 1 ; i <= number ; i++){
            if(i == 1 || i == number){
                for(int j = 1 ; j <= number ; j++)
                    System.out.print("*");
            
            } else {
                for(int j = 1 ; j <= number ; j++){
                    if(i == j || i == number - j + 1 || j == number - i + 1 || i == 1 || i == number || j == 1 || j == number) System.out.print("*");
                    else System.out.print(" ");
                    // i = 2 
                    // j = 4 
                }
            }
            
            if(i < number)
                System.out.println("");

        }
    }
}