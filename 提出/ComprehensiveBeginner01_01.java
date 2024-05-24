/** 
 * 整数値を入力させ、その値が偶数ならばeven、
 * 奇数ならばoddと表示するプログラムを作成してください。
*/

public class ComprehensiveBeginner01_01 {
    
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("整数を入力してください。");

        int inputNum = scanner.nextInt();
        
        scanner.close();

        if (inputNum % 2 == 0) {

            System.out.println("even");

        } else {

            System.out.println("odd");
            
        }

    }
    
}
