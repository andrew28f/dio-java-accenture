package Calculadora;

import java.util.function.Function;
import java.util.stream.LongStream;

public enum Operation {

    SUM(n -> LongStream.of(n).sum(), "+"),
    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2), "-");

    private final Calculate operationCallback;
    private final String symbol;

    Operation(Calculate operationCallback, String symbol) {
        this.operationCallback = operationCallback;
        this.symbol = symbol;
    }

    public Calculate getOperationCallback() {
        return operationCallback;
    }

    public String getSymbol() {
        return symbol;
    }
}
