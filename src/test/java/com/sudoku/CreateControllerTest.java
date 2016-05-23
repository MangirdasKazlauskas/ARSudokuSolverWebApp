package com.sudoku;

import com.sudoku.controller.CreateController;
import com.sudoku.model.Sudoku;
import com.sudoku.model.SudokuAndroid;
import com.sudoku.service.SudokuService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class CreateControllerTest {
    @InjectMocks
    private CreateController cc;

    @Mock
    private SudokuService sudokuService;

    @Before
    public void init(){ MockitoAnnotations.initMocks(this); }

    @Test
    public void testCreate(){
        SudokuAndroid s = new SudokuAndroid();
        s.setDuration(1L);

        Sudoku response = cc.create(s);

        assertThat(s.getDuration(), is(response.getDuration()));
    }

    @Test
    public void testCreateEmpty(){
        SudokuAndroid s = new SudokuAndroid();

        Sudoku response = cc.create(s);

        assertThat(response.getDuration(), is(nullValue()));
    }
}