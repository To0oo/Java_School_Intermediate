/**
 * とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成してください。
 */

public class ComprehensiveBeginner01_04 {
    
    public static void main(String[] args) {

        // 人数を入力
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("人数を入力してください。");

        int inputNum = scanner.nextInt();

        scanner.close();

        // 入場料の合計
        if (inputNum >= 5 && inputNum <= 19) {

            int fee = inputNum * 550;

            System.out.println(inputNum + "名なので1人、550円で合計、" + fee + "円です。");

        } else if (inputNum >= 20) {

            int fee2 = inputNum * 500;

            System.out.println(inputNum + "名様なので1人、500円で合計、" + fee2 + "円です。");

        } else {

            int fee3 = inputNum * 600;

            System.out.println(inputNum + "名様なので1人、600円で合計、" + fee3 + "円です。");
            
        } 

    }
    
}
