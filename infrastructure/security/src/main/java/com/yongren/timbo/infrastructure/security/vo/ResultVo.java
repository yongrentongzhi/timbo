package com.yongren.timbo.infrastructure.security.vo;

import java.util.Arrays;
import java.util.List;

public class ResultVo<T> {

    /**
     * 响应说明
     */
    private List<String> messageList;
    /**
     * 响应内容
     */
    private T result;
    /**
     * 响应状态
     */
    private boolean status;


    public ResultVo() {
    }

    private ResultVo(List<String> messageList, T result, boolean status) {
        this.messageList = messageList;
        this.result = result;
        this.status = status;
    }

    public static <T> ResultVo<T> success(String... message) {
        return new ResultVo<>(Arrays.asList(message), null, true);
    }

    public static <T> ResultVo<T> success(T result, String... message) {
        return new ResultVo<>(Arrays.asList(message), result, true);
    }

    public static <T> ResultVo<T> fail(String... message) {
        return new ResultVo<>(Arrays.asList(message), null, false);
    }

    public static <T> ResultVo<T> fail(T result, String... message) {
        return new ResultVo<>(Arrays.asList(message), result, false);
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
