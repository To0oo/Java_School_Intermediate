/**
 * 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
 * buyDrink() メソッドを持つ、Coffee クラスを使用する
 * buyDrink() メソッドを持つ、Juice クラスを使用する
 * バヤリース の オレンジ 味です。130 円になります。
 * 午後の紅茶 の レモンティー 味です。150 円になります。
 * ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
 * ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
 */

public class ComprehensiveBeginner02_03 {

    public static void main(String[] args) {

        Juice a001 = new Juice();
        a001.name = "バヤリース";
        a001.buyDrink();

        Juice a002 = new Juice();
        a002.name = "午後の紅茶";
        a002.buyDrink();

        Coffee b001 = new Coffee();
        b001.name = "ボス";
        b001.buyDrink();

        Coffee b002 = new Coffee();
        b002.name = "ジョージア";
        b002.buyDrink();

    }

}

class Juice {

    final String JUICE_BAYARISU = "バヤリース";
    final String JUICE_GOGOTEA = "午後の紅茶";

    String name = "drink";
    String type = "nothing";
    int price = 0;

    public void buyDrink() {

        if (name.equals(JUICE_BAYARISU)) {

            type = "オレンジ";
            price = 130;

        } else if (name.equals(JUICE_GOGOTEA)) {

            type = "レモンティー";
            price = 150;

        }

        System.out.println(name + "の" + type + "味です。" + price + "円になります。");

    }

}

class Coffee {

    final String COFFEE_BOSS = "ボス";
    final String COFFEE_GEORGIA = "ジョージア";

    String name = "drink";
    String type = "nothing";
    String milk = "nothing";
    int price = 0;

    public void buyDrink() {

        if (name.equals(COFFEE_BOSS)) {

            type = "控えめ";
            milk = "無し";
            price = 110;

        } else if (name.equals(COFFEE_GEORGIA)) {

            type = "甘め";
            milk = "入り";
            price = 120;

        }

        System.out.println(name + "の甘さは" + type + "、ミルク" + milk + "です。" + price + "円になります。");

    }

}
