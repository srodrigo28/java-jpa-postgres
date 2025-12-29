package com.treinamento.dev.repositories;

import java.util.UUID;
import com.treinamento.dev.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

    @Query(value = "SELECT * FROM tb_book WHERE publisher_id = :id", nativeQuery = true)
    BookModel findBookModelByTitle(String title);
}
