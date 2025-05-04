package level1;

import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙 연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);
            int result = 0;

            switch (operator) {
                case '+':
                    System.out.println("덧셈 결과 : "+(num1+num2));
                    break;
                case '-':
                    System.out.println("뺄셈 결과 : "+(num1-num2));
                    break;
                case '*':
                    System.out.println("곱셈 결과 : "+(num1*num2));
                    break;
                case '/':
                    if(num2==0) {
                        System.out.println("나눗셈 연산에서 분모에 0을 입력할 수 없습니다");
                        break;
                    }
                    System.out.println("나눗셈 결과 : "+(num1/num2));
                    break;
                default:
                    System.out.println("연산기호는 +,-,*,/ 만 사용이 가능합니다");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String answer = sc.next();
            if(answer.equals("exit")) break;


        }


    }
}
