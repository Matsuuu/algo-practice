package DataRandomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomizer {

    public static List<Integer> getRandomData(int amount) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }
}
