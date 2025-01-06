package com.example.demo.myuser;

import lombok.Getter;

@Getter
public class ApiResponse<T> {
    private final String message;
    private final String code;
    private final T data;

    public ApiResponse(T data) {
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

    public static <T> ApiResponse<T> error(String message, String code) {
        return new ApiResponse<>(message, code, null);
    }
}
