package operations;

public class Operation {
    private final int firstOperand;
    private final int secondOperand;
    private final String sign;

    public Operation(int firstOperand, int secondOperand, String sign) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.sign = sign;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation = (Operation) o;

        if (firstOperand != operation.firstOperand) return false;
        if (secondOperand != operation.secondOperand) return false;
        return sign != null ? sign.equals(operation.sign) : operation.sign == null;

    }

    @Override
    public int hashCode() {
        int result = firstOperand;
        result = 31 * result + secondOperand;
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        return result;
    }
}
