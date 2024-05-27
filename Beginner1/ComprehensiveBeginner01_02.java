/**
 * 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
 * 小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。
*/

public class ComprehensiveBeginner01_02 {
    
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("整数を3つ入力してください。");

        int inputNum = scanner.nextInt();

        int inputNum2 = scanner.nextInt();

        int inputNum3 = scanner.nextInt();

        scanner.close();

        System.out.println("入力した整数は" + inputNum + "と" + inputNum2 + "と" + inputNum3 + "です。");

        if (inputNum <= inputNum2 && inputNum2 <= inputNum3 && inputNum <= inputNum3) {

            System.out.println("OK");

        } else {

            System.out.println("NG");
            
        }

    }
    
}
