package step3;
import java.util.ArrayList;
import java.util.List;

// T는 Number를 상속받은 타입(Integer, Double, Float 등)만 가능
public class ArithmeticCalculator<T extends Number>{
    private List<Double> results = new ArrayList<>();

    public double calculate(T num1, T num2, char symbol) {
        OperatorType op = OperatorType.matchSymbol(symbol);
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        double res = switch (op) {
            case PLUS -> n1 + n2;
            case MINUS -> n1 - n2;
            case MULTIPLY -> n1 * n2;
            case DIVIDE -> {
                if (n2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                yield n1 / n2;
            }
        };
        results.add(res);
        return res;
    }

    public List<Double> getResults(){
        return results;
    }

    void removeResult(){
        results.removeFirst();
    }

}