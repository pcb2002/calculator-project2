package step3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType matchSymbol(char symbol){
        for(OperatorType op : OperatorType.values()){
            if (op.symbol == symbol){
                return op;
            }
        }throw new IllegalAccessException("올바른 연산자가 아닙니다: " + symbol);
    }
}
