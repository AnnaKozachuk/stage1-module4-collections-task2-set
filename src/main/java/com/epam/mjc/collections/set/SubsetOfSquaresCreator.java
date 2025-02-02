package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> squareSet = new TreeSet<>();
        for (int num : sourceList) {
            squareSet.add(num * num);
        }
        return ((TreeSet<Integer>) squareSet).subSet(lowerBound, true, upperBound, true);

    }
}
