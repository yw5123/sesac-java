package org.example.interfaceprac.library;

public class EBook extends LibraryItem implements Downloadable {
    protected boolean isDownloadable;

    public EBook(String title, int ID) {
        super(title, ID);
    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public void isBorrowed() {

    }

    @Override
    public void download() {

    }

    @Override
    public void isDownloadable() {

    }
}
