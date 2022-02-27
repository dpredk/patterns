package com.pda.patterns.tomap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Arrays.asList("1", "2", "3")
                .stream()
                .map(Collectors.groupingBy());
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Mumbai");
        linkedList.add("Delhi");
        linkedList.add("Noida");
        linkedList.add("Gao");
        linkedList.add("Patna");

        TreeMap<String, String> map  = new TreeMap<>();
        Iterator<String>  itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println("Element is ="+itr.next());
        }
    }

    public List<Integer> getIterleavedNumbers(List<Integer> source) {
        Collections.sort(source);
        Map<String, List<Integer>> map = Stream.generate((i) -> i)
                .map(index -> Pair.of(index, source.get(index)))
                .collect(Collectors.groupingBy(if index_is_pair -> left else -> right));

        map.get("left");
        Collections.sort(map.get("right"), Comparator.reverseOrder());
    }
}
