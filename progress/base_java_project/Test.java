import java.util.Arrays;

public class Test {

    int value1;
    String value2;
    int[] array;

    Test(int value1, String value2, int[] array) {
        this.value1 = value1;
        this.value2 = value2;
        this.array = array;
    }

    @Override
    public String toString() {
        return (
            "Test{value1=" +
            value1 +
            ", value2='" +
            value2 +
            "', array=" +
            Arrays.toString(array) +
            "}"
        );
    }
}
