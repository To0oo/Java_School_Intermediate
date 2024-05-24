/**
 * 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
 * 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
 */

public class ComprehensiveBeginner01_03 {
        
    public static void main(String[] args) {
    
        // a,b,cを入力するコード
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("式のa、b、cに入る整数を3つ入力してください。");

        System.out.println("a");
        int inputNumA = scanner.nextInt();

        System.out.println("b");
        int inputNumB = scanner.nextInt();

        System.out.println("c");
        int inputNumC = scanner.nextInt();

        scanner.close();
    
        // できた式
        System.out.println("入力した整数は" + inputNumA + "と" + inputNumB + "と" + inputNumC + "です。");
        System.out.println("よって、式は y=" + inputNumA + "x^2 + " + inputNumB + "x + " + inputNumC + "です。");
        System.out.println("この式の判定は");

        // 判別式D求める
        int D = inputNumB * inputNumB - 4 * inputNumA * inputNumC;

        // 実数解        
        if (D > 0) {        

            System.out.println("実解です");

        // 重解
        } else if (D == 0) {   

            System.out.println("重解です");

        // 虚数解    
        } else {               

            System.out.println("虚数解です");

        }

    }
    
}
