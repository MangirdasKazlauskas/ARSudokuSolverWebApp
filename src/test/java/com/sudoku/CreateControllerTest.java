package com.sudoku;

import com.sudoku.controller.CreateController;
import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CreateControllerTest {
    @InjectMocks
    private CreateController cc;

    @Mock
    private SudokuRepository sudokuRepository;

    @Before
    public void init(){ MockitoAnnotations.initMocks(this); }

    @Test
    public void testCreate(){
        Sudoku s = new Sudoku();
        s.setId(1L);

        String response = cc.create(s);
        assertThat("Sudoku succesfully created! (id = " + s.getId() + ")", is(response));
    }
}