/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static quang.util.MathUtil.computeFactorial;

/**
 *
 * @author ASUS
 */
public class MathUtilTest {
        
        @Test //báo cho JVM biết rằng đây là hàm main()
        //trong hàm này chứa các lệnh để test code chính của mình ở bên MathUtil
        //ta test các tình huống thành công ở đây, 
        //thành công: cF(5) -> 120 gọi là thành công 
        public void testSuccessfulCases() {
            assertEquals(120, computeFactorial(5));
            assertEquals(720, computeFactorial(6));
            assertEquals(1, computeFactorial(0));
            assertEquals(1, computeFactorial(1));
            assertEquals(2, computeFactorial(2));
        }   
        
        //annotation, dấu hiệu báo cho JVM và thư viện jar liên quan
        //biết cần phải làm gì
        @Test(expected = IllegalArgumentException.class)
        public void testFailedCases() {
            //kì vọng ném ra ngoại lệ
            //ngoại lệ không phải là 1 value để có thể so sánh được
            //nên ko xài hàm assertEquals() được
            //computeFactorial(-5);
            computeFactorial(16); //giai thua tang rat nhanh, khong choi qua 15
        }        
        
        //code có thể tiềm ẩn lỗi login nhưng Clean&Build luôn ra file .jar
        //nếu code ko sai cú pháp
        //mình phải DISABLE CÁI NÚT CLEAN & BUILD NẾU CODE CÒN MÀU ĐỎ
        //TỨC LÀ CÒN ERROR LOGIN
        //NHỚ 2 CON SỐ: 1005 Netbeans 8, 1204 Netbeans 10 trở lên
        //khi chơi với Ant project
}