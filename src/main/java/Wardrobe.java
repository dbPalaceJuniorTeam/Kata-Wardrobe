import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Wardrobe {

    private int[] sizes = {50,75,100,120};

    private List<Map<Integer,Integer>> map;


    public Wardrobe() {

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

    public List<Map<Integer, Integer>> combinations() {
        int maxSize = 250;
        int aux = 0;
        ArrayList<Map<Integer, Integer>> result = new ArrayList<>();

       for (int i = 0; i<6; i++){
           for (int j = 0;j<sizes.length;j++){
              int sizeValue = sizes[j]*i;
              for (int k = 0;k<6;k++){
                  for (int l = 0;l<sizes.length;l++){
                      int sizeValue2 = sizes[l]*k;
                      if (sizeValue2+sizeValue == maxSize){
                          Map<Integer,Integer> map = new HashMap<>();
                          map.put(sizes[j],i);
                          map.put(sizes[l],k);
                          result.add(map);
                      }
                  }
              }
           }
       }

        List<Map<Integer, Integer>> result2 = result.stream()
               .distinct()
               .collect(Collectors.toList());

        return result2;
    }
}
