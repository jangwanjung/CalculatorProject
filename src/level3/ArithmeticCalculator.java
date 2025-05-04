package level3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator {

    private int num1;
    private int num2;
    private static List<Integer> resultList = new LinkedList();



    public void setCalculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public List<Integer> getResultList(){
        return resultList;
    }

    public void removeResult(){
        resultList.remove(0);
    }

    public int calculate(char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = sub(num1, num2);
                break;
            case '*':
                result = mul(num1, num2);
                break;
            case '/':
                result = div(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("연산자는 '+','-','*','/' 만 입력해야 합니다");
        }
        resultList.add(result);
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int mul(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        if(b==0) throw new IllegalArgumentException("'-'연산자 사용시에는 두번째 인자에다가는 0을 넣지 못합니다");
        return a / b;
    }

    public List<Integer> printHighResult(int num){
        return resultList.stream()
                .filter(result -> result > num)
                .collect(Collectors.toList());
    }
}
