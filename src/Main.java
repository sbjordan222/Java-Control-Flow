import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int checkTooBig(int max, int value){
        if(value > max) {
            return value - max;
        }else{
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        String myString = input.next();
        //AsciiChars.printNumbers(myString);
        //AsciiChars.printLowerCase(myString);
        //AsciiChars.printUpperCase(myString);

        System.out.println("What's your name?");
        String name = input.next();
        System.out.printf("Hello, %s!\n Would you like to continue to the interactive section of this program? [yes | no]\n ", name);
        String yesOrNo = input.next();
        if (yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Please return later to complete the survey.");
            System.exit(0);

        } else if (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")) {
            boolean keepGoing = true;

            while (keepGoing) {
                System.out.println("Wonderful! I am going to ask you a series of questions to generate your lucky numbers!");
                System.out.println("What is the name of your favorite pet?");
                String petName = input.next();
                System.out.printf("How old is %s?\n", petName);
                int petAge = input.nextInt();
                // Will calculate your lucky number
                System.out.println("What is your lucky number?");
                int luckyNumber = input.nextInt();
                // Will return your fave sport person, etc.
                System.out.println("Do you have a favorite sport person? If so what is their jersey number? If not enter 0.");
                int jerseyInt = input.nextInt();
                // Last two digits
                System.out.println("Now what are the last two digits in the year of your car?");
                int carYear = input.nextInt();
                // Fave actor/actress
                System.out.println("What is the first name of your favorite actor or actress?");
                String actName = input.next();

                System.out.println("Let's calculate your lucky Numbers.");
                Random randomNum = new Random();
                int randNum1 = randomNum.nextInt(70) + 1;
                int randNum2 = randomNum.nextInt(55) + 1;
                int randNum3 = randomNum.nextInt(25) + 1;

                int maxNum = 70;
                int maxMagicBall = 55;
                int magicBall;
                if(jerseyInt == 0){
                    magicBall = checkTooBig(maxMagicBall, luckyNumber);
                }else{
                    magicBall = checkTooBig(maxMagicBall, jerseyInt);
                }
                int num1 = carYear + randNum1;
                int num2 = checkTooBig(maxNum, petName.charAt(3));
                int num3 = checkTooBig(maxNum, actName.charAt(1));
                int checkInt = randNum2 + randNum3;
                int num4 = checkTooBig(maxNum, checkInt);
                int num5  = 42;
                System.out.printf("Your lucky numbers are %d %d %d %d %d. Magic Ball: %d \n", num1, num2, num3, num4, num5, magicBall);

                System.out.println("Would you like to play again?[ yes | no]");
                String goAgain = input.next();
                if (goAgain.equalsIgnoreCase("no") || goAgain.equalsIgnoreCase("n")) keepGoing = false;

            }
        }
    }

}
