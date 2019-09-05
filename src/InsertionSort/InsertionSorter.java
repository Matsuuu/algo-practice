package InsertionSort;

import Base.Sorter;
import Graphics.BarGraph;

import java.util.List;

public class InsertionSorter extends Sorter {

    public InsertionSorter(BarGraph barGraph, List<Integer> numbers) {
        super(barGraph, numbers);
    }

    public void sortData() {
        setIteratorStart(1); // Skip the first one
        barGraph.getBarGraph("Insertion sort", numbers);

        while (!sorted)  {
            int currValue = numbers.get(iterator);
            int prevValue = numbers.get(iterator - 1);
            if (currValue < prevValue) {
                movesThisRound++;
                numbers.remove(iterator);
                int placeFinder = iterator - 1;
                while (numbers.get(placeFinder) > currValue && placeFinder != 0) {
                    placeFinder--;
                }
                numbers.add(placeFinder, currValue);

                barGraph.updateBars(numbers);
            }
            delay();
            iterator++;
            endOrReset();
        }
        System.out.println("SORTED");
        System.out.println(numbers);
    }
}
