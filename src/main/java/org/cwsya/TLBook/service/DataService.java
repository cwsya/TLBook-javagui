package org.cwsya.TLBook.service;

import org.cwsya.TLBook.pojo.BookPojo;

import java.util.List;

/**
 * @author cws
 */
public interface DataService {
    List<BookPojo> getBook(Integer page,String name);
}
