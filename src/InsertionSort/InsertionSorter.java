package InsertionSort;

import Graphics.BarGraph;

import java.util.List;

public class InsertionSorter {

    private BarGraph barGraph;
    private List<Integer> numbers;

    public InsertionSorter(BarGraph barGraph, List<Integer> numbers) {
        this.barGraph = barGraph;
        this.numbers = numbers;
    }

    public void sortData() {
        int iterator = 1; // Skip the first one
        boolean sorted = false;
        barGraph.getBarGraph("Insertion sort", numbers);
        int maxSize = numbers.size() - 1;
        int movesThisRound = 0;

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
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (iterator >= maxSize) {
                if (movesThisRound < 1) {
                    sorted = true;
                } else {
                    iterator = 1;
                    movesThisRound = 0;
                }
            }
            iterator++;
        }
        System.out.println("SORTED");
        System.out.println(numbers);
    }
}
