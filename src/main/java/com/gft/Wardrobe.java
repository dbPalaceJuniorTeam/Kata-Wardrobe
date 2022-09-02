package com.gft;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Wardrobe {

    private int[] sizes;

    private List<Map<Integer,Integer>> map;


    public Wardrobe(int[] sizes) {
        this.sizes = sizes;
    }

    public int[] getSizes() {
        return sizes;
    }

    public void setSizes(int[] sizes) {
        this.sizes = sizes;
    }

    public List<Map<Integer, Integer>> getMap() {
        return map;
    }

    public void setMap(List<Map<Integer, Integer>> map) {
        this.map = map;
    }

    public List<Map<Integer, Integer>> combinations(int maxSize) {



        int minSize = Arrays.stream(sizes).min().orElse(0);
        int maxRepetition = maxSize/ minSize;
        ArrayList<Map<Integer, Integer>> result = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        map.put(minSize,maxRepetition);
        result.add(map);
        return result;
    }
}
