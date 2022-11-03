import static javax.swing.JOptionPane.*;
import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        String input;
        String str = "";
        int playerNum;
        int compNum = rnd.nextInt(0,100);
        int count = 1;
        do {
            input = showInputDialog("Угадай число:");
            playerNum = Integer.parseInt (input);
            if (playerNum > compNum) {
                str = ("Число больше того, что загадал компьютер");
            } else if (playerNum < compNum) {
                str = ("Число меньше того, что загадал компьютер");
            } else {
                str = ("Вы победили, для этого вам понадобилось " + count + " ходов");
            }
        showMessageDialog(null, str);
        count++;
        } while (playerNum != compNum);
    }
}