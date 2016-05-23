package com.sudoku.service.impl;

import com.sudoku.dao.SudokuDao;
import com.sudoku.model.Sudoku;
import com.sudoku.service.SudokuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SudokuServiceImpl implements SudokuService{

    @Autowired
    private SudokuDao sudokuDao;

    @Override
    public List<Sudoku> findAllSudokus(){
        return sudokuDao.findAll();
    }

    @Override
    public Sudoku findOneSudoku(Long id){
        return sudokuDao.findOne(id);
    }

    @Override
    public Sudoku saveAndFlushSudoku(Sudoku s){
        return sudokuDao.saveAndFlush(s);
    }
}
