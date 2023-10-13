package com.kucw.library.dao;

import com.kucw.library.dto.BookRequest;
import com.kucw.library.model.Book;

public interface BookDao {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
