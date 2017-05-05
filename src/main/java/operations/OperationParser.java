package operations;

public class OperationParser {

    public Operation parse(String string) {
//        String[] words = string.split("\\W+");
        String[] words =  string.split("\\s+");
        int operandFirst = Integer.parseInt(words[0]);
        int operandSecond = Integer.parseInt(words[2]);
        String sign = words[1];

        return new Operation(operandFirst, operandSecond, sign);
    }
}
