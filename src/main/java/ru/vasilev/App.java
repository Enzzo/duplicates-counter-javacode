package ru.vasilev;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

    }

    public static <K> Map<K, Integer> duplicatesCounter(Collection<K> collection) {
        Map<K, Integer> result = new HashMap<K, Integer>();
        collection.forEach(k -> result.put(k, result.getOrDefault(k, 0) + 1));
        return result;
    }
}