import java.util.Scanner;

/**
 * Created by geowc_000 on 2015-07-30.
 */
public class Main {
    static void ePrint(String s){
        System.out.println(s);
    }
    public static void main(String[] args){

        int[][] availableSpot = new int[3][3];//{{1,2,3},{1,2,3}};
        availableSpot[0][0] = 1;
        availableSpot[0][1] = 2;
        availableSpot[0][2] = 3;
        availableSpot[1][0] = 4;
        availableSpot[1][1] = 5;
        availableSpot[1][2] = 6;
        availableSpot[2][0] = 7;
        availableSpot[2][1] = 8;
        availableSpot[2][2] = 9;
        String newline = System.getProperty("line.separator");
        ePrint("Welcome to Tic Tac Toe!" + newline + "to exit at anytime, type 'exit'.");
        Scanner scan = new Scanner(System.in);
        ePrint("Here is the map of the board");
        byte i = 0
        while(i > ){
            System.out.print(availableSpot[0][i]);
        }
        /*for(byte i = 0; i<3; i++) {
            System.out.println(availableSpot[1][i]);
        }
        for(byte i = 0; i<3; i++) {
            System.out.println(availableSpot[2][i]);
        }*/
        while(true){
            String input1 = scan.nextLine();
            if (input1.equals("exit")) {
                System.exit(0);
            } else {
                ePrint("You are X." + newline + "Pick your position:");
            }
        }
    }
}
