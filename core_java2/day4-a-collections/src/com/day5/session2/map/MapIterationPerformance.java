package com.day5.session2.map;

import java.util.HashMap;
import java.util.Map;

public class MapIterationPerformance {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = 10_00_000;

        // Fill the map
        for (int i = 0; i < size; i++) {
            map.put(i, i * 2);
        }

        // keySet() version
        long start1 = System.nanoTime();
        long sum1 = 0;
        for (Integer key : map.keySet()) {
            sum1 += map.get(key);
        }
        long end1 = System.nanoTime();
        System.out.println("keySet duration: " + (end1 - start1) / 1_000_000.0 + " ms");

        // entrySet() version
        long start2 = System.nanoTime();
        long sum2 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum2 += entry.getValue();
        }
        long end2 = System.nanoTime();
        System.out.println("entrySet duration: " + (end2 - start2) / 1_000_000.0 + " ms");

        // Just to prevent dead code elimination
        System.out.println("Sums: " + sum1 + ", " + sum2);
    }
}