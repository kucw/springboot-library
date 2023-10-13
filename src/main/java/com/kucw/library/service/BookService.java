package com.kucw.library.service;

import com.kucw.library.dto.BookRequest;
import com.kucw.library.model.Book;

public interface BookService {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
