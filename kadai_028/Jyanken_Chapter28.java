package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {


	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine().toLowerCase();
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return input;
            } else {
                System.out.println("エラー：r、s、p のいずれかを入力してください。");
            }
        }
    }


    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }


    public String playGame(String myHand, String enemyHand) {
        if (myHand.equals(enemyHand)) {
            return "あいこです";
        } else if (
            (myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))
        ) {
            return "自分の勝ちです";
        } else {
            return "自分の負けです";
        }
    }


    public HashMap<String, String> getHandMap() {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
        return handMap;
    }
}
