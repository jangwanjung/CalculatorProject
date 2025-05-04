package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLv2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator arithmeticOperation = new Calculator();

        while(true) {


            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙 연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            arithmeticOperation.setCalculator(num1, num2);

            try{
                int result = arithmeticOperation.calculate(operator);
                System.out.println("result = " + result);

                System.out.print("가장 먼저 입력된 연산결과를 삭제시겠습니까? (yes 입력 시 삭제) : ");
                String answer2 = sc.next();

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
                String answer = sc.next();



                if (answer2.equals("yes")) arithmeticOperation.removeResult();

                if (answer.equals("exit")) {
                    System.out.println("연산결과 : " + arithmeticOperation.getResultList());
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
