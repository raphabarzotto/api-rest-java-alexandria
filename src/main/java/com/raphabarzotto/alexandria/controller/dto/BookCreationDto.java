package com.raphabarzotto.alexandria.controller.dto;

import com.raphabarzotto.alexandria.entity.Book;

public record BookCreationDto(String title, String genre) {

  public Book toEntity() {
    return new Book(title, genre);
  }
}
