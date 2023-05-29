import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNumberOfIntegerTest {

    private ReturnNumberOfInteger returnNumberOfInteger;

    @Test
    public void checkNumberOfInteger(){
        int number = ReturnNumberOfInteger.findTheNumberOfFigures(new String[]{"Ab1396","Q2RBS","G381AC"});
        assertEquals(8,number);

    }

}