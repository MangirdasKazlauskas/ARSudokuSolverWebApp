package com.sudoku;

import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class SudokuRepositoryIntegrationTest {
    @Autowired
    private SudokuRepository sudokuRepository;

    @Test
    public void testFindAll(){
        List<Sudoku> sudokus = sudokuRepository.findAll();
        assertThat(sudokus.size(), is(greaterThanOrEqualTo(0)));
    }
}