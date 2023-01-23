import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {

        Random rand = new Random ();
        int compNum = rand.nextInt (99) + 1;
        int userNum = 43;

        while (compNum != userNum){

            System.out.println ("Fail to guess the number!");
            if (compNum > userNum){
                System.out.println ("the number is more than ");
            } else {

            }
    //        System.out.println (¨¨);

            if(compNum == 100) {
                compNum = 1;
            } else {
                compNum++;
            }



        }
    }
}
