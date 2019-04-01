package duplicateFinder;

import java.util.*;

public class Main {
    static final int SIZE=10_000_000;

    public static void main(String[] args) {
        List<Integer> generatedNumbers = new ArrayList<>(SIZE);

        Long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            generatedNumbers.add(new Random().nextInt(SIZE));
        }
        Long now = System.currentTimeMillis();
        System.out.printf("Numbers generated in %.2f %s", (now - start) / 1000F, System.lineSeparator());

        findDuplicates(generatedNumbers);
        Long afterSetSolution = System.currentTimeMillis() - now;
        System.out.printf("Solution time with HashSet : %.2f s", afterSetSolution / 1000F);
    }

    private static void findDuplicates(List<Integer> source) {
        Set<Integer> numbers = new HashSet<>();

        for (Integer number : source) {
            if (!numbers.add(number)) {
                System.out.println(number);
            }
        }
    }
}


