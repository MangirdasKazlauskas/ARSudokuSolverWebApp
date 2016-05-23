package com.sudoku.controller;

import com.sudoku.model.Sudoku;
import com.sudoku.model.SudokuAndroid;
import com.sudoku.service.SudokuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateController {
    @Autowired
    private SudokuService sudokuService;

    @RequestMapping(value = "/create")
    public Sudoku create(@RequestBody SudokuAndroid sudokuAndroid){
        Long duration = sudokuAndroid.getDuration();
        String initialUrl = sudokuAndroid.getInitial();
        String solvedUrl = sudokuAndroid.getSolved();
        String type = sudokuAndroid.getType();
        Sudoku sudoku = new Sudoku(duration, solvedUrl, initialUrl, type);
        sudokuService.saveAndFlushSudoku(sudoku);
        return sudoku;
    }
}
