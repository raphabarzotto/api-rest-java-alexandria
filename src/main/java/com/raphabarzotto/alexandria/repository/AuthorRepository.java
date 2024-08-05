package com.raphabarzotto.alexandria.repository;

import com.raphabarzotto.alexandria.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
  // <Entity, Tipo_da_PK>
}
