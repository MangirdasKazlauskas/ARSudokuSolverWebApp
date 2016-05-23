package com.sudoku.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sudoku {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long duration;
    private String initial;
    private String solved;
    private String type;

    public Sudoku(){}

    public Sudoku(Long duration, String solved, String initial, String type) {
        this.duration = duration;
        this.solved = solved;
        this.initial = initial;
        this.type = type;
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

    public String getInitial() { return initial; }

    public void setInitial(String initial) { this.initial = initial; }

    public String getSolved() { return solved; }

    public void setSolved(String solved) { this.solved = solved; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
