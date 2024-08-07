package com.raphabarzotto.alexandria.repository;

import com.raphabarzotto.alexandria.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
  // <Entity, Tipo_da_PK>
}
