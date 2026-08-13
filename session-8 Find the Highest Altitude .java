import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            highest = Math.max(highest, altitude);
        }

        System.out.println(highest);
    }
}


Your Output
1