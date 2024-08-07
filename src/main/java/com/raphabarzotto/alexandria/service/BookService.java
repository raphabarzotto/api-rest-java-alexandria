package com.raphabarzotto.alexandria.service;

import com.raphabarzotto.alexandria.entity.Book;
import com.raphabarzotto.alexandria.repository.BookRepository;
import com.raphabarzotto.alexandria.service.exception.BookNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Book findById(Long id) throws BookNotFoundException {
    return bookRepository.findById(id)
        .orElseThrow(BookNotFoundException::new);
  }

  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  public Book create(Book book) {
    return bookRepository.save(book);
  }

  public Book update(Long id, Book book) throws BookNotFoundException {
    Book bookFromDb = findById(id);

    bookFromDb.setTitle(book.getTitle());
    bookFromDb.setGenre(book.getGenre());

    return bookRepository.save(bookFromDb);
  }

  public Book deleteById(Long id) throws BookNotFoundException {
    // pega a entidade antes de apagar, para poder retorná-la e soltar erro etc
    Book book = findById(id);

    bookRepository.deleteById(id);

    return book;
  }
}
