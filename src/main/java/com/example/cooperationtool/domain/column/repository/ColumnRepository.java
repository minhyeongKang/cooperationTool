package com.example.cooperationtool.domain.column.repository;

import com.example.cooperationtool.domain.column.entity.Columns;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ColumnRepository extends JpaRepository<Columns, Long> {
        @Query("SELECT c FROM Columns c WHERE c.name = :name")
        Optional<Columns> findByName(@Param("name") String name);
        @Query
        List<Columns> findByBoardIdOrderByOrderAsc(Long boardId);
}
