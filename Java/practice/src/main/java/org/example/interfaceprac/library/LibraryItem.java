package org.example.interfaceprac.library;

// 추상클래스이기 때문에 Borrowable의 메서드를 구현할 의무가 없음
// LibraryItem을 상속받은 클래스에서는 모두 구현해야 함
public abstract class LibraryItem implements Borrowable {
    String title;
    int ID;
    boolean isBorrowed;

    public LibraryItem(String title, int ID) {
        this.title = title;
        this.ID = ID;
        this.isBorrowed = false;
    }
}
