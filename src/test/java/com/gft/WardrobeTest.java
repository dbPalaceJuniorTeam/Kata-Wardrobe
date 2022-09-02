package com.gft;

import com.gft.Wardrobe;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WardrobeTest {

    @Test
    void fillTheWallWithOnly50CmWardrobe(){

        ArrayList<Map<Integer,Integer>> list = new ArrayList<>();

        Map<Integer,Integer> map1 = new HashMap<>();

        map1.put(50,5);

        list.add(map1);

        Wardrobe wardrobe = new Wardrobe(new int[] {50});



        assertEquals(list,wardrobe.combinations(250));

    }

    @Test
    void makeMostOfSpace(){
        Wardrobe wardrobe = new Wardrobe(new int[] {50});

        ArrayList<Map<Integer,Integer>> list = new ArrayList<>();

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Map<Integer,Integer> map3 = new HashMap<>();
        Map<Integer,Integer> map4 = new HashMap<>();
        Map<Integer,Integer> map5 = new HashMap<>();

        map1.put(50,5);

        map2.put(50,3);
        map2.put(100,1);

        map3.put(75,2);
        map3.put(100,1);

        map4.put(50,2);
        map4.put(75,2);

        map5.put(50,1);
        map5.put(100,2);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);

        //assertEquals(list,wardrobe.combinations());
    }

    @Test
    void cheapestCombination(){

    }
}
