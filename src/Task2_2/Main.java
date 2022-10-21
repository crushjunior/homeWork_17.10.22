package Task2_2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        Set<Integer> set = new HashSet<>(20);

        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt(1000));
        }

        System.out.println(set);

        set.removeIf(integer -> integer %2 != 0);
        System.out.println(set);
    }
}
