package task3_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class School {

    public static void main(String[] args) {
        Set<String> numbers = new HashSet<>();
        Random random = new Random();

        while(numbers.size() < 15) {
            int part1 = random.nextInt(8) + 2;
            int part2 = random.nextInt(8) + 2;
            String str1 = Integer.toString(part1);
            String str2 = Integer.toString(part2);
            if (!numbers.contains(str1 + " * " + str2) && !numbers.contains(str2 + " * " + str1)) {
                numbers.add(str1 + " * " + str2);
            }
        }

        Iterator<String> i = numbers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
