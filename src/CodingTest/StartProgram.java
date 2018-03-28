package CodingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javafx.application.Platform.exit;

/**
 * Created by Yashi Agarwal on 28-03-2018.
 */
public class StartProgram {
    int players=2;
    int c = 0;
    Singleton singleton = Singleton.getInstance();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StartProgram sp = new StartProgram();

        while (sp.c <= 25 || true) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x >= 6 || y >= 6)
                System.out.println("blocked cell overflow");
            else {
                sp.singleton.blocked[x][y] = "blocked";
                sp.c++;
            }
        }


        System.out.println("enter colour for each player");
        for (int i = 1; i <= 2; i++) {
            sp.singleton.colours[1] = sc.nextLine();
            System.out.println("colour for player " + 1 + " is " + sp.singleton.colours[i]);
        }

        sp.enterCoordinates();
        sp.runGame(sp.singleton.blocked,sp.singleton.inputList);

    }

        public void enterCoordinates() {
            c = 0;
            Scanner sc = new Scanner(System.in);
            while (c <= 25)
                for (int i = 1; i < 3; i++) {
                    System.out.println("enter column for " + singleton.colours[i]);
                    int column = sc.nextInt();
                    if (column >= 6)
                        System.out.println("column overflow");
                    else {
                        singleton.inputList.put(singleton.colours[i], column);
                        c++;
                    }

                }
        }

        public void runGame(String[][] blocked, Map<String, Integer> inputList){

        }





}
