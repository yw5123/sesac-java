package com.example.relation.domain.post.exceptions;

public class DuplicateEntityException extends RuntimeException {
    public DuplicateEntityException(String message) {
        super(message);
    }

    public DuplicateEntityException() {
        super("이미 존재하는 데이터입니다.");
    }
}
