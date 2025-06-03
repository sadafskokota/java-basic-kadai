package kadai_028;

import java.util.HashMap;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {
        Jyanken_Chapter28 janken = new Jyanken_Chapter28();

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        //  自分の手を取得
        String myHand = janken.getMyChoice();

        // 相手の手を乱数で取得
        String enemyHand = janken.getRandom();


        HashMap<String, String> handMap = janken.getHandMap();
        String myJyankenn = handMap.get(myHand);
        String enemyJyankenn = handMap.get(enemyHand);

        // 結果出力
        System.out.println("自分の手は" + myJyankenn + ", 対戦相手の手は" + enemyJyankenn);
        System.out.println(janken.playGame(myHand, enemyHand));
    }
}
