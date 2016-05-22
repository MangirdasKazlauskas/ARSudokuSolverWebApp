package com.sudoku;

import com.sudoku.controller.CreateController;
import com.sudoku.model.SudokuAndroid;
import com.sudoku.repository.SudokuRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CreateControllerTest {
    @InjectMocks
    private CreateController cc;

    @Mock
    private SudokuRepository sudokuRepository;

    @Before
    public void init(){ MockitoAnnotations.initMocks(this); }

    @Test
    public void testCreate(){
        SudokuAndroid s = new SudokuAndroid();
        s.setDuration(1L);

        String response = cc.create(s);
        assertThat("Sudoku succesfully created! (duration = " + s.getDuration() + ")", is(response));
    }
}