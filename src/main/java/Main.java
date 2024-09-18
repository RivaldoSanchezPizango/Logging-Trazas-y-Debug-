import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws Exception {

        AverageList averageListGreatherThan5 = null;
        AverageList averageListGreatherThan10 = null;
        AverageList averageListEmpty = null;

        try {
            averageListGreatherThan5 = new AverageList(Arrays.asList(1, 2, 3, 4, 5, 6));
            averageListGreatherThan10 = new AverageList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            averageListEmpty = new AverageList(new ArrayList<>());
        } catch (Exception e) {
            logger.info("La lista esta vacia " + e);
        }

    }
}
