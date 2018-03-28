package CodingTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yashi Agarwal on 28-03-2018.
 */
public class Singleton {
    String[][] board = new String[6][6];
    String colours[] = new String[3];
    int chances[];
    String blocked[][] = new String[6][6];
    Map<String,Integer> inputList = new HashMap<>();
    private Singleton() {

    }

    private static Singleton singleton;

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();


        }

        return singleton;
    }
}
