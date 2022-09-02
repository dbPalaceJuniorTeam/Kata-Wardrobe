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

    public List<Map<Integer, Integer>> getCombinations(int maxSize) {

        List<Map<Integer, Integer>> allPossibleCombinations;

        allPossibleCombinations = generateAllPossibleCombinations(sizes, maxSize);

        List<Map<Integer,Integer>> result = new ArrayList<>();
               result = sumUp(allPossibleCombinations, maxSize,result);

        return result;
    }

    private List<Map<Integer,Integer>> sumWithRecursion(List<Map<Integer, Integer>> combinationsList, int maxSize, List<Map<Integer,Integer>> partial, List<Map<Integer,Integer>> result ){

        Map<Integer,Integer> aux = null;

        Integer checkTargetValue = 0;

        for (Map<Integer,Integer> x:partial){
           checkTargetValue += x.values().stream().reduce(0,(acc,newInteger) -> acc+=newInteger, (c1,c2) -> c1);
        }

        if (checkTargetValue == maxSize){
            result.addAll(partial);
            return result;
        }
        if (checkTargetValue > maxSize){
            return result;
        }

        for (int i = 0; i<combinationsList.size();i++){
            List<Map<Integer,Integer>> remaining = new ArrayList<>();

            Map<Integer,Integer> n = combinationsList.get(i);

            for (int j = i+1;j < combinationsList.size(); j++){

                remaining.add(combinationsList.get(j));
            }
            List<Map<Integer,Integer>> partial_rec = new ArrayList<Map<Integer,Integer>>(partial);

            partial_rec.add(n);

            sumWithRecursion(remaining,maxSize,partial_rec, result);
        }

        return null;
    }

    private List<Map<Integer,Integer>> sumUp(List<Map<Integer,Integer>> combinationsList, int maxSize, List<Map<Integer,Integer>> result){
        return sumWithRecursion(combinationsList, maxSize, new ArrayList<Map<Integer,Integer>>(), result);
    }

    private List<Map<Integer,Integer>> generateAllPossibleCombinations(int[] sizes, int maxSize){

        int minSizeValue = Arrays.stream(sizes).min().orElse(0);

        for (int i = 0; i < sizes.length; i++){
            for (int j = 0; j<maxSize/minSizeValue;j++)
        }

    }
}
