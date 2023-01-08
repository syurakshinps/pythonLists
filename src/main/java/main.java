import java.util.*;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("the", "cat", "cat", "on", "sat", "mat", "mat", "the"));
        HashMap<String, Integer> mymap = new HashMap<>();
        Collections.sort(list);


        for (String s : list
        ) {
            int count = 1;
            mymap.put(s, count);
            for (int i = 0; i < list.size(); i++) {
                if (s.equals(list.get(i))) {
                    mymap.replace(s, count++);
                }

            }
        }
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(mymap);
        System.out.println(treeMap);
        int max = 0;
        for (int i: mymap.values()
             ) {
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);

        String key = Collections.max(mymap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);

    }
}