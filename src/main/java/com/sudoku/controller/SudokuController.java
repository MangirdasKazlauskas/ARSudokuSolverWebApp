package com.sudoku.controller;

import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Mangirdas on 2016-05-15.
 */
@RestController
@RequestMapping("api/v1/")
public class SudokuController {
    @Autowired
    private SudokuRepository sudokuRepository;

    @RequestMapping(value = "easySudokus", method = RequestMethod.GET)
    public List<Sudoku> list(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for (int i = 0; i < tempRep.size(); i++){
            Sudoku temp = tempRep.get(i);
            if (Objects.equals(temp.getType(), "EASY")){
                newRep.add(j++, temp);
            }
        }
        return newRep;
    }

    @RequestMapping(value = "mediumSudokus", method = RequestMethod.GET)
    public List<Sudoku> listMedium(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for (int i = 0; i < tempRep.size(); i++){
            Sudoku temp = tempRep.get(i);
            if (Objects.equals(temp.getType(), "MEDIUM")){
                newRep.add(j++, temp);
            }
        }
        return newRep;
    }
    @RequestMapping(value = "hardSudokus", method = RequestMethod.GET)
    public List<Sudoku> listHard(){
        List<Sudoku> tempRep = sudokuRepository.findAll();
        List<Sudoku> newRep = new ArrayList<Sudoku>();
        int j = 0;
        for (int i = 0; i < tempRep.size(); i++){
            Sudoku temp = tempRep.get(i);
            if (Objects.equals(temp.getType(), "HARD")){
                newRep.add(j++, temp);
            }
        }
        return newRep;
    }

    @RequestMapping(value = {"easySudokus/{id}", "mediumSudokus/{id}", "hardSudokus/{id}"}, method = RequestMethod.GET)
    public Sudoku get(@PathVariable Long id){
        return sudokuRepository.findOne(id);
    }

}
