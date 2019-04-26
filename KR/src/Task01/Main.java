package Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(get(s -> s.length()<5).toString());
    }

    public static List<String> get(Predicate<String> predicate) throws FileNotFoundException {
        File file = new File("src/Task01/file.txt");
        Scanner sc = new Scanner(file);
        HashMap<String, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> s : list) {
            if (predicate.test(s.getKey())) words.add(s.getKey());
        }
        return words;
    }
}

