package CodingTest;

import java.util.Map;

/**
 * Created by Yashi Agarwal on 28-03-2018.
 */
public class FillBoard {
    public void fill(String[][] blocked,Map<String, Integer> inputList,Singleton singleton){
        for (int i = 1; i <=inputList.size(); i++) {
            String colour = singleton.colours[i];
            Integer column = inputList.get(i);
            for (int j = 5;j>0 ; j--) {
                if(!singleton.board[j][column].equalsIgnoreCase("blocked") && singleton.board[j][column].equalsIgnoreCase(null)){
                    singleton.board[j][column]=colour;
                }

            }
        }
    }
}
