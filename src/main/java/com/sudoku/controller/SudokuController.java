package com.sudoku.controller;

import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/")
public class SudokuController {
    @Autowired
    private SudokuRepository sudokuRepository;

    @RequestMapping(value = "easySudokus", method = RequestMethod.GET)
    public List<Sudoku> listEasy(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for(Sudoku temp : tempRep)
            if (Objects.equals(temp.getType(), "EASY"))
                newRep.add(j++, temp);
        return newRep;
    }

    @RequestMapping(value = "mediumSudokus", method = RequestMethod.GET)
    public List<Sudoku> listMedium(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for (Sudoku temp : tempRep)
            if (Objects.equals(temp.getType(), "MEDIUM"))
                newRep.add(j++, temp);

        return newRep;
    }
    @RequestMapping(value = "hardSudokus", method = RequestMethod.GET)
    public List<Sudoku> listHard(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for (Sudoku temp : tempRep)
            if (Objects.equals(temp.getType(), "HARD"))
                newRep.add(j++, temp);
        return newRep;
    }

    @RequestMapping(value = {"easySudokus/{id}", "mediumSudokus/{id}", "hardSudokus/{id}"}, method = RequestMethod.GET)
    public Sudoku get(@PathVariable Long id){
        return sudokuRepository.findOne(id);
    }

}
