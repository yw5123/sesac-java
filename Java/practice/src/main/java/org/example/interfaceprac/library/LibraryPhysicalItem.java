package org.example.interfaceprac.library;

// 문제에 나와있는대로 기능을 분리해서 물리적 위치로 묶었는데
// 책과 전자책을 묶어서 추상 클래스를 만드는 게 좋을수도 있음
// 지금 단계에서 정답은 없음!

public abstract class LibraryPhysicalItem extends LibraryItem {
    String location;

    public LibraryPhysicalItem(String title, int ID, String location) {
        super(title, ID);
        this.location = location;
    }
}
