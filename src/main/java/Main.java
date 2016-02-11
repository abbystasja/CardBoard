import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Stasja on 06.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        String[] boards = new String[]{"board1", "board2", "board3"};

        String[][] lanes = new String[][]{
                {"lane11", "lane12", "lane13"},
                {"lane21", "lane22", "lane23"},
                {"lane31", "lane32", "lane33"},
        };

        String[][][] cards = new String[][][]{
                {
                        {"card111", "card112", "card113"},
                        {"card121", "card122", "card123"},
                        {"card131", "card132", "card133"},
                },
                {
                        {"card211", "card212", "card213"},
                        {"card221", "card222", "card223"},
                        {"card231", "card232", "card233"},
                },
                {
                        {"card311", "card312", "card313"},
                        {"card321", "card322", "card323"},
                        {"card331", "card332", "card333"},
                }
        };

        System.out.println("Here is list of all your boards");

        for(String board : boards){
            System.out.println(board);
        }

        System.out.println("Enter number of board you want to display lanes");

        Scanner scanner = new Scanner(System.in);

        int boardNumber = scanner.nextInt() - 1;

        for(String lane : lanes[boardNumber]){
            System.out.println(lane);
        }
        System.out.println("Enter number of lane you want to display cards");

        int laneNumber = scanner.nextInt() - 1;

        for(String card : cards[boardNumber][laneNumber]){
            System.out.println(card);
        }

    }
}
