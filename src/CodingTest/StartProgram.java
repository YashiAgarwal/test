package CodingTest;

import java.util.*;

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
        System.out.println("enter the number of blocked cell you want to input");
        int blocked = sc.nextInt();

        while (blocked>0) {
            System.out.println("enter blocked cell");
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            if (x >= 6 || y >= 6)
                System.out.println("blocked cell overflow");
            else {
                sp.singleton.blocked[x][y] = "blocked";
                blocked--;
            }
        }


        System.out.println("enter colour for each player");
        for (int i = 1; i <= 2; i++) {
            sp.singleton.colours[i] = sc.nextLine();
        }

        sp.enterCoordinates();
        sp.runGame(sp.singleton.blocked,sp.singleton.inputList);

    }

        public void enterCoordinates() {
            System.out.println("enter the number of input column you want to enter");
            Scanner sc = new Scanner(System.in);
            c=sc.nextInt();
            while (c>0)
                for (int i = 1; i < 3; i++) {
                    System.out.println("enter column for " + singleton.colours[i]);
                    int column = sc.nextInt();
                    if (column >= 6)
                        System.out.println("column overflow");
                    else {
                        if(singleton.inputList.containsKey(singleton.colours[i])){
                            singleton.inputList.get(singleton.colours[i]).add(column);
                        }else {
                            List<Integer> list = new ArrayList<>();
                            list.add(column);
                            singleton.inputList.put(singleton.colours[i], list);
                        }
                        c--;
                    }

                }
        }

        public void runGame(String[][] blocked, Map<String, List<Integer>> inputList){

        }





}
