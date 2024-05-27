import java.util.Random;

/**
 * スロットマシーンプログラムを作成してください。
 * "ゾロ目で大当たり！チャンスは30回"と表示させる
 * "begin と入力してください> " と入力すると、開始するようにする
 * ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
 * 大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
 * 30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
 */

public class ComprehensiveBeginner02_01 {

    public static void main(String[] args) {

        final String START = "begin";

        int hit = 0;

        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.println("begin と入力してください");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String inputNum = scanner.nextLine();

        scanner.close();

        if (inputNum.equals(START)) {

            for (int i = 1; i <= 30; i++) {

                int a = new Random().nextInt(9) + 1;
                int b = new Random().nextInt(9) + 1;
                int c = new Random().nextInt(9) + 1;

                System.out.println(i + "回目:" + a + b + c);

                if (a == b && a == c && b == c) {

                    System.out.println(i + "回目で大当たりです。おめでとうございます!");

                    hit++;

                    break;

                } else if (i == 30) {

                    if (hit == 0) {

                        System.out.println("残念でした。終わります。");

                    }

                }

            }

        }

    }

}