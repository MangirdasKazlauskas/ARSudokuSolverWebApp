package com.sudoku.controller;

import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mangirdas on 2016-05-17.
 */
@RestController
public class CreateController {
    @Autowired
    private SudokuRepository repository;

    @RequestMapping(value = "/create")
    public String create(@RequestBody Sudoku sudoku){
        repository.saveAndFlush(sudoku);
        return "Sudoku succesfully created! (id = " + sudoku.getId() + ")";
    }

    /*@RequestMapping(value = "/create")
    public String test(){
        System.out.println("INVOKED");
        Sudoku sudoku = new Sudoku();
        // int id = sudokuRepository.findAll().size() + 1;
        sudoku.setInitial("Test");
        sudoku.setSolved("Test");
        sudoku.setType("EASY");
        sudoku.setDuration((long)25);
        repository.saveAndFlush(sudoku);
        return "Sudoku succesfully created! (id = " + sudoku.getId() + ")";
    }*/
}
