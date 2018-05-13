package me.adeane6.util;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class CollectionsUtil {
    public static <T> List<T> filterListByClass(List<?> list, Class<T> clazz) {
        return list.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(toList());
    }
}
