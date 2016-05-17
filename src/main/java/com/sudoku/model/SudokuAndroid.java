package com.sudoku.model;

import java.io.File;

/**
 * Created by Mangirdas on 2016-05-17.
 */
public class SudokuAndroid {
    private Long id;
    private Long duration;
    private File initialSudoku;
    private File solvedSudoku;
    private String type;

    public SudokuAndroid(){}

    public SudokuAndroid(Long duration, String type, File solvedSudoku, File initialSudoku) {
        this.duration = duration;
        this.type = type;
        this.solvedSudoku = solvedSudoku;
        this.initialSudoku = initialSudoku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public File getInitialSudoku() {
        return initialSudoku;
    }

    public void setInitialSudoku(File initialSudoku) {
        this.initialSudoku = initialSudoku;
    }

    public File getSolvedSudoku() {
        return solvedSudoku;
    }

    public void setSolvedSudoku(File solvedSudoku) {
        this.solvedSudoku = solvedSudoku;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
