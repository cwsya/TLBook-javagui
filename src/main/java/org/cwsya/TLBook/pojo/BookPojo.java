package org.cwsya.TLBook.pojo;

import java.util.Date;

/**
 * @author cws
 */
public class BookPojo {
    private String bookId;
    private String bookName;
    private String bookDescribe;
    private String bookCover;
    private String bookClass;
    private Date bookTime;
    private Integer bookDownloadTimes;
    private String className;

    @Override
    public String toString() {
        return "BookPojo{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookDescribe='" + bookDescribe + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", bookClass='" + bookClass + '\'' +
                ", bookTime=" + bookTime +
                ", bookDownloadTimes=" + bookDownloadTimes +
                ", className='" + className + '\'' +
                '}';
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescribe() {
        return bookDescribe;
    }

    public void setBookDescribe(String bookDescribe) {
        this.bookDescribe = bookDescribe;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Integer getBookDownloadTimes() {
        return bookDownloadTimes;
    }

    public void setBookDownloadTimes(Integer bookDownloadTimes) {
        this.bookDownloadTimes = bookDownloadTimes;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public BookPojo() {
    }

    public BookPojo(String bookId, String bookName, String bookDescribe, String bookCover, String bookClass, Date bookTime, Integer bookDownloadTimes, String className) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescribe = bookDescribe;
        this.bookCover = bookCover;
        this.bookClass = bookClass;
        this.bookTime = bookTime;
        this.bookDownloadTimes = bookDownloadTimes;
        this.className = className;
    }
}
