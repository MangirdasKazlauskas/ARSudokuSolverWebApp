package com.sudoku.model;

import javax.persistence.*;

public class SudokuAndroid {
    private Long duration;
    private String initial;
    private String solved;
    private String type;

    public SudokuAndroid(){}

    public SudokuAndroid(Long duration, String solved, String initial, String type) {
        this.duration = duration;
        this.solved = solved;
        this.initial = initial;
        this.type = type;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getInitial() { return initial; }

    public void setInitial(String initial) { this.initial = initial; }

    public String getSolved() { return solved; }

    public void setSolved(String solved) { this.solved = solved; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
