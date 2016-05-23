package com.sudoku.dao.impl;

import com.sudoku.dao.SudokuDao;
import com.sudoku.dao.repository.SudokuRepository;
import com.sudoku.model.Sudoku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SudokuDaoImpl implements SudokuDao {
    @Autowired
    private SudokuRepository sudokuRepository;

    @Override
    public List<Sudoku> findAll(){
        return sudokuRepository.findAll();
    }

    @Override
    public Sudoku findOne(Long id){
        return sudokuRepository.findOne(id);
    }

    @Override
    public Sudoku saveAndFlush(Sudoku s){
        return sudokuRepository.saveAndFlush(s);
    }
}
