package com.sudoku;

import com.sudoku.controller.SudokuController;
import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SudokuControllerTest {
    @InjectMocks
    private SudokuController sc;

    @Mock
    private SudokuRepository sudokuRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSudokuGet(){
        Sudoku s = new Sudoku();
        s.setId(1L);
        when(sudokuRepository.findOne(1L)).thenReturn(s);

        Sudoku sudoku = sc.get(1L);

        verify(sudokuRepository).findOne(1L);

        assertThat(sudoku.getId(), is(1L));
    }
}