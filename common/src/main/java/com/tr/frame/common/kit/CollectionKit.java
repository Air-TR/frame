package com.tr.frame.common.kit;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
public class CollectionKit extends CollectionUtils {

    public static <T> List<T> mergeToList(Collection<T>... collections) {
        List<T> list = new ArrayList<>();
        for (Collection<T> collection : collections) {
            if (Objects.isNull(collection)) continue;
            list.addAll(collection);
        }
        return list;
    }

}
