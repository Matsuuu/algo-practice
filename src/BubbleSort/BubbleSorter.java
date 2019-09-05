package BubbleSort;

import Base.Sorter;
import Graphics.BarGraph;

import java.util.List;

public class BubbleSorter extends Sorter {

    public BubbleSorter(BarGraph graph, List<Integer> numbers) {
        super(graph, numbers);
    }

    public void sortData() {
        setIteratorStart(0);
        maxSize = numbers.size() - 1;
        barGraph.getBarGraph("Bubble Sort", numbers);

        while (!sorted) {
            int currentValue = numbers.get(iterator);
            int nextValue = numbers.get(iterator + 1);

            if (currentValue > nextValue) {
                movesThisRound++;
                numbers.set(iterator + 1, currentValue);
                numbers.set(iterator, nextValue);
            }
            barGraph.updateBars(numbers);
            delay();
            iterator++;
            endOrReset();
        }
        System.out.println("SORTED");
        System.out.println(numbers);

    }
}
