import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitTest {

    @DisplayName("1+2=3이다")
    @Test
    public void JunitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;


        Assertions.assertEquals(a + b, sum);
    }
}