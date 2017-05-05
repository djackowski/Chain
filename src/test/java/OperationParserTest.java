import operations.Operation;
import operations.OperationParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationParserTest {


    @Test
    public void parse() throws Exception {
        //Given
        OperationParser operationParser = new OperationParser();
        String operationToBeParsed = "2 x 2";
        //When
        Operation parsedOperation = operationParser.parse(operationToBeParsed);
        //Then
        assertEquals(parsedOperation, new Operation(2, 2, "x"));
    }

}