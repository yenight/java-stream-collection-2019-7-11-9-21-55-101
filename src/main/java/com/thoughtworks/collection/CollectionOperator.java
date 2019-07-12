package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if (left < right) {
            return IntStream.rangeClosed(left, right)
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            return IntStream.rangeClosed(right, left)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if (left < right) {
            return IntStream.rangeClosed(left, right)
                    .boxed()
                    .filter(x->x%2==0)
                    .collect(Collectors.toList());
        } else {
            return IntStream.rangeClosed(right, left)
                    .boxed()
                    .filter(x->x%2==0)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array)
                .boxed()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array)
                .filter(x->x==array[array.length-1])
                .sum();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
