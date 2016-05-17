package com.sudoku.repository;

import com.sudoku.model.Sudoku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mangirdas on 2016-05-15.
 */
public interface SudokuRepository extends JpaRepository<Sudoku, Long> {

}

