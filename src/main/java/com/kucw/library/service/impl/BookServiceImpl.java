package com.kucw.library.service.impl;

import com.kucw.library.dao.BookDao;
import com.kucw.library.model.Book;
import com.kucw.library.service.BookService;
import com.kucw.library.dto.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookById(Integer bookId) {
        return bookDao.getBookById(bookId);
    }

    @Override
    public Integer createBook(BookRequest bookRequest) {
        return bookDao.createBook(bookRequest);
    }

    @Override
    public void updateBook(Integer bookId, BookRequest bookRequest) {
        bookDao.updateBook(bookId, bookRequest);
    }

    @Override
    public void deleteBookById(Integer bookId) {
        bookDao.deleteBookById(bookId);
    }
}
