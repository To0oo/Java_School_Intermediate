
/**
 * ジャンケンプログラムを作成してください。
 * "ジャンケン"と表示させる
 * "0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
 * それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
 * 今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
 */

import java.util.Random;

public class ComprehensiveBeginner02_02 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");

            int inputNum = scanner.nextInt();

            if (inputNum == 0 || inputNum == 1 || inputNum == 2) {

                int cpu = new Random().nextInt(3);

                if (inputNum == 2) {

                    if (cpu == 0) {

                        System.out.println("cpu = 0");
                        System.out.println("勝ちました");

                    } else if (cpu == 1) {

                        System.out.println("cpu = 1");
                        System.out.println("負けました");

                    } else if (cpu == 2) {

                        System.out.println("cpu = 2");
                        System.out.println("あいこです");

                    }
                } else if (inputNum == 1) {

                    if (cpu == 0) {

                        System.out.println("cpu = 0");
                        System.out.println("負けました");

                    } else if (cpu == 1) {

                        System.out.println("cpu = 1");
                        System.out.println("あいこです");

                    } else if (cpu == 2) {

                        System.out.println("cpu = 2");
                        System.out.println("勝ちました");

                    }
                } else if (inputNum == 0) {

                    if (cpu == 0) {

                        System.out.println("cpu = 0");
                        System.out.println("あいこです");

                    } else if (cpu == 1) {

                        System.out.println("cpu = 1");
                        System.out.println("勝ちました");

                    } else if (cpu == 2) {

                        System.out.println("cpu = 2");
                        System.out.println("負けました");

                    }

                }
                scanner.close();
                break;

            } else {

                System.out.println("0:グー 1:チョキ 2: パー 以外の物が入力されました。");

            }

        }

    }

}
