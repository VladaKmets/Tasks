import com.vlada.tasks.valuesdoubled.ValuesDoubled;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ValuesDoubledTest {

    @Test
    public void main() {
        //given
        Integer [] integers = {2,3,7,5,6};

        //when
        ValuesDoubled.calculate(integers);

        //then
        Integer [] doubledValues = {4,6,14,10,12};
        assertArrayEquals(doubledValues,integers);
    }
}