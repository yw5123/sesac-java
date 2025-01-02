package com.example.demo.myjpasitev4;

import lombok.Getter;

@Getter
public class ApiResponse<T> {
    private final String message;
    private final String code;
    private final T data;

    private ApiResponse(T data) {
        this.message = "Success";
        this.code = "SUCCESS";
        this.data = data;
    }

    public ApiResponse(String message, String code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(data);
    }

    public static <T> ApiResponse<T> ok(String message, String code, T data) {
        return new ApiResponse<>(message, code, data);
    }
}
