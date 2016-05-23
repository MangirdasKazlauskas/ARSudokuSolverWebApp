package com.sudoku.dao.repository;

import com.sudoku.model.Sudoku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SudokuRepository extends JpaRepository<Sudoku, Long> {

}

