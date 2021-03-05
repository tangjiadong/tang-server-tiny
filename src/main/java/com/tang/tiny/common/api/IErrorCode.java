package com.tang.tiny.common.api;

/**
 * 封装API的错误码
 * Created by Tang on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
