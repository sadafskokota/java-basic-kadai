package kadai_018;

abstract public class Kato_Chapter18 {
    // 抽象メソッド：名前の後半（太郎・一郎・花子）を返す
    abstract String givenName();

    // 抽象メソッド：自己紹介
    abstract void eachIntroduce();

    // 苗字（共通）
    String familyName() {
        return "加藤";
    }

    // 住所（共通）
    void address() {
        System.out.println("住所は東京都中野区〇×です");
    }

    // フルネームを出力
    void printFullName() {
        System.out.println("名前は" + familyName() + givenName() + "です");
    }
}