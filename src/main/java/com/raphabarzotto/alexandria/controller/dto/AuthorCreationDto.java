package com.raphabarzotto.alexandria.controller.dto;

import com.raphabarzotto.alexandria.entity.Author;

public record AuthorCreationDto(String name, String nationality) {

  public Author toEntity() {
    return new Author(name, nationality);
  }
}
