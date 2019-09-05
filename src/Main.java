import BubbleSort.BubbleSorter;
import DataRandomizer.Randomizer;
import Graphics.BarGraph;
import InsertionSort.InsertionSorter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomData = Randomizer.getRandomData(100);

        BarGraph graph = new BarGraph();
        System.out.println(randomData);
        //startInsertionSorter(graph, randomData);
        startBubbleSorter(graph, randomData);
    }

    private static void startInsertionSorter(BarGraph graph, List<Integer> randomData) {
        InsertionSorter sorter = new InsertionSorter(graph, randomData);
        sorter.sortData();
    }

    private static void startBubbleSorter(BarGraph graph, List<Integer> randomData) {
        BubbleSorter sorter = new BubbleSorter(graph, randomData);
        sorter.sortData();
    }
}
