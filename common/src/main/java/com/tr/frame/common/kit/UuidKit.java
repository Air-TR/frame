package com.tr.frame.common.kit;

import java.util.UUID;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
public class UuidKit {

    public static String createUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
