package com.raphabarzotto.alexandria.controller.dto;

import com.raphabarzotto.alexandria.entity.Publisher;

public record PublisherCreationDto(String name, String address) {

  public Publisher toEntity() {
    return new Publisher(name, address);
  }
}
