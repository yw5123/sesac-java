package com.example.demo.myjpasitev4;

import lombok.Getter;

import java.util.Map;

@Getter
public class ApiResponse<T> {
    private final String message;
    private final String code;
    private final T data;
    private final Map<String, String> errors;

    private ApiResponse(T data) {
        this.message = "Success";
        this.code = "SUCCESS";
        this.data = data;
        this.errors = null;
    }

    public ApiResponse(String message, String code, T data, Map<String, String> errors) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.errors = errors;
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(data);
    }

    public static <T> ApiResponse<T> ok(String message, String code, T data) {
        return new ApiResponse<>(message, code, data, null);
    }

    public static <T> ApiResponse<T> error(String message, String code) {
        return new ApiResponse<>(message, code, null, null);
    }

    public static <T> ApiResponse<T> error(String message, String code, Map<String, String> errors) {
        return new ApiResponse<>(message, code, null, errors);
    }
}
