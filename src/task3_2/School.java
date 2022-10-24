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
            if (!numbers.contains(part1 + part2) && !numbers.contains(part2 + part1)) {
                numbers.add(part1 + " * " + part2 + " = ?\n");
            }
        }
        return numbers;
    }
}
