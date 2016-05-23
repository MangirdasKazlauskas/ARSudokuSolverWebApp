package com.sudoku.dao;

import com.sudoku.model.Sudoku;

import java.util.List;

public interface SudokuDao {

    List<Sudoku> findAll();

    Sudoku findOne(Long id);

    Sudoku saveAndFlush(Sudoku s);
}
