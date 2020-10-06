/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quang.util;

/**
 *
 * @author ASUS
 */

public class MathUtil {
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) throw new IllegalArgumentException("Invalid input. n must be >= 0");
        if (n == 0 || n == 1) return 1;
        return n * computeFactorial(n - 1);
    }
}










/*đây là class chứa các hàm toán học, tính toán, với mục tiêu xài chung
cho các nơi khác, phàm cái gì mang tính xài chung, ta sẽ dùng STATIC*/


//tính n! = 1.2.3...n. Vì n! tăng giá trị rất nhanh, sớm tràn miền int
    //tính giai thừa từ 15 trở lại



//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;