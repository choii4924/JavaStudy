package exe.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheackedException {
    /*
     * CheckedException : 반드시 예외처리가 필요한 예외
     * 
     * => 조건 검사가 어렵고, 예측 불가능한 상황에서 발생하므로
     *    미리 예외처리 구문을 작성해야 함
     * => 주로 외부 매개체와 입출력이 일어날 때 발생 (파일, 네트워크 통신 등)
     */

    public void test1() {
        // test2();  // 내부에서 try~catch 처리함
        try {
            test3(); // 여기서는 throws로 던지므로 try~catch 필요
        } catch (IOException e) {
            System.out.println("test3 실행 중 예외 발생!");
        }
    }

    // 내부에서 try~catch로 처리하는 방식
    public void test2() {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in));
        System.out.print("입력 : ");
        try {
            String str = br.readLine(); // IOException 발생 가능
            System.out.println("입력받은 값 : " + str);
        } catch (IOException e) {
            System.out.println("예외 발생!!");
        }
    }

    // 예외를 밖으로 던지는 방식
    public void test3() throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String str = br.readLine(); // IOException 발생 가능
        System.out.println("입력받은 값 : " + str);
    }
}
