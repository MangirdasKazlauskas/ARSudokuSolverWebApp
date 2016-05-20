package com.sudoku.controller;

import com.sudoku.model.Sudoku;
import com.sudoku.model.SudokuAndroid;
import com.sudoku.repository.SudokuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateController {
    @Autowired
    private SudokuRepository repository;

    @RequestMapping(value = "/create")
    public String create(@RequestBody SudokuAndroid sudokuAndroid){
        Long duration = sudokuAndroid.getDuration();
        String initialUrl = sudokuAndroid.getInitial();
        String solvedUrl = sudokuAndroid.getSolved();
        String type = sudokuAndroid.getType();
        Sudoku sudoku = new Sudoku(duration, initialUrl, solvedUrl, type);
        repository.saveAndFlush(sudoku);
        return "Sudoku succesfully created! (duration = " + sudoku.getDuration() + ")";
    }
}
