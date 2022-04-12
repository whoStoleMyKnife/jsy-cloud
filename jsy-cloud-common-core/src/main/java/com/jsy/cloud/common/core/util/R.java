package com.jsy.cloud.common.core.util;

import com.jsy.cloud.common.core.constant.CommonConstants;
import lombok.Builder;

@Builder
public class R<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> R<T> ok() {
        return result(CommonConstants.OK, null, null);
    }

    public static <T> R<T> ok(T data) {
        return result(CommonConstants.OK, null, data);
    }

    public static <T> R<T> fail() {
        return result(CommonConstants.FAIL, null, null);
    }

    public static <T> R<T> fail(String msg) {
        return result(CommonConstants.FAIL, msg, null);
    }

    private static <T> R<T> result(Integer code, String msg, T data) {
        return R.<T>builder().code(code).msg(msg).data(data).build();
    }
}
