import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckLeapYear {

    @Test
    public void Test_Check_Dividable_By_4_Not_100() {
        assertEquals(true, Main.isLeapYear(104));
    }

    @Test
    public void Test_Check_Dividable_By_400() {
        assertEquals(true, Main.isLeapYear(2000));
    }

    @Test
    public void Test_Check_Not_Dividable_By_4() {
        assertEquals(true, Main.isLeapYear(103));
    }

    @Test
    public void Test_Check_Dividable_By_4_And_100() {
        assertEquals(false, Main.isLeapYear(1900));
    }

    @Test
    public void Test_Check_Dividable_By_4000() {
        assertEquals(false, Main.isLeapYear(8000));
    }
}
