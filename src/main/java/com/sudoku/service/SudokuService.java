package com.sudoku.service;

import com.sudoku.model.Sudoku;

import java.util.List;

public interface SudokuService {

    List<Sudoku> findAllSudokus();

    Sudoku findOneSudoku(Long id);

    Sudoku saveAndFlushSudoku(Sudoku sudoku);
}
