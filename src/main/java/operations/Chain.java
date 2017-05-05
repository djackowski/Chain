package operations;

public class Chain {
    private OperationParser operationParser = new OperationParser();

    public int calculate(String string) {

        Operation parsed = operationParser.parse(string);
        int first = parsed.getFirstOperand();
        int second = parsed.getSecondOperand();

        String sign = parsed.getSign();
        char charSign = sign.charAt(0);
        switch (charSign) {
            case '+':
                return new AdditionOperationChain().execute(first, second);
            case '-':
                return new SubstractionOperationChain().execute(first, second);
            case '/':
                return new DivistionOperationChain().execute(first, second);
            case 'x':
                return new MultiplicationOperationChain().execute(first, second);
            default:
                return 0;
        }

    }


}
