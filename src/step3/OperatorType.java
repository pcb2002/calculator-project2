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

    public static OperatorType matchSymbol(char symbol){
        for(OperatorType op : OperatorType.values()){
            if (op.symbol == symbol){
                return op;
            }
        }throw new IllegalArgumentException("올바른 연산자가 아닙니다: " + symbol);
    }
}
