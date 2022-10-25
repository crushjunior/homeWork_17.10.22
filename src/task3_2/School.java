package task3_2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class School {
    public static void main(String[] args) {
        System.out.println(tasks());
    }
    public static Set<String> tasks() {
        Set<String> numbers = new HashSet<>();
        Random random = new Random();

        while(numbers.size() < 15) {
            int part1 = random.nextInt(8) + 2;
            int part2 = random.nextInt(8) + 2;
            String str1 = Integer.toString(part1 * part2);
            String str2 = Integer.toString(part2 * part1);
            if (!numbers.contains(str1) && !numbers.contains(str2)) {
                numbers.add(part1 + " * " + part2 + " = ?\n");
            }
        }
        return numbers;
    }
}
