package Base;

import Graphics.BarGraph;

import java.util.List;

public class Sorter {

    protected BarGraph barGraph;
    protected List<Integer> numbers;
    protected boolean sorted;
    protected int iterator;
    protected int iteratorStart;
    protected int maxSize;
    protected int movesThisRound;

    public Sorter() {
    }

    public Sorter(BarGraph barGraph, List<Integer> numbers) {
        this.barGraph = barGraph;
        this.numbers = numbers;
        this.maxSize = numbers.size() - 1;
        this.movesThisRound = 0;
        this.sorted = false;
    }

    protected void setIteratorStart(int i) {
        iterator = i;
        iteratorStart = i;
    }

    protected void delay() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void endOrReset() {
        if (iterator >= maxSize) {
            if (movesThisRound < 1) {
                sorted = true;
            } else {
                iterator = iteratorStart;
                movesThisRound = 0;
            }
        }
    }
}
