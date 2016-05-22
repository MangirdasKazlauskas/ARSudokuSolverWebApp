package com.sudoku;

import com.sudoku.controller.SudokuController;
import com.sudoku.model.Sudoku;
import com.sudoku.repository.SudokuRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void testSudokuGetNull(){
        when(sudokuRepository.findOne(1L)).thenReturn(null);

        Sudoku sudoku = sc.get(1L);

        verify(sudokuRepository).findOne(1L);

        assertThat(sudoku, is(nullValue()));
    }
    @Test
    public void testSudokuListEasy(){
        Sudoku s = new Sudoku();
        s.setType("EASY");
        List<Sudoku> list = new ArrayList<Sudoku>();
        list.add(s);
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listEasy();

        verify(sudokuRepository).findAll();

        assertThat(testList.get(0).getType(), is("EASY"));
    }
    @Test
    public void testSudokuListMedium(){
        Sudoku s = new Sudoku();
        s.setType("MEDIUM");
        List<Sudoku> list = new ArrayList<Sudoku>();
        list.add(s);
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listMedium();

        verify(sudokuRepository).findAll();

        assertThat(testList.get(0).getType(), is("MEDIUM"));
    }
    @Test
    public void testSudokuListHard(){
        Sudoku s = new Sudoku();
        s.setType("HARD");
        List<Sudoku> list = new ArrayList<Sudoku>();
        list.add(s);
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listHard();

        verify(sudokuRepository).findAll();

        assertThat(testList.get(0).getType(), is("HARD"));
    }
    @Test
    public void testSudokuListEasySize(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 5; i++){
            Sudoku s = new Sudoku();
            s.setType("EASY");
            list.add(s);
            s = new Sudoku();
            s.setType("HARD");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listEasy();

        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo ir 5 type HARD Sudoku, bet ideti buvo tik 5 EASY, todel ir grazina 5
        assertThat(testList.size(), is(5));
    }
    @Test
    public void testSudokuListMediumSize(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 10; i++){
            Sudoku s = new Sudoku();
            s.setType("MEDIUM");
            list.add(s);
            s = new Sudoku();
            s.setType("EASY");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testMedium = sc.listMedium();

        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo ir 10 type HARD Sudoku, bet ideti buvo tik 10 MEDIUM, todel ir grazina 10
        assertThat(testMedium.size(), is(10));
    }
    @Test
    public void testSudokuListHardSize(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 6; i++){
            Sudoku s = new Sudoku();
            s.setType("HARD");
            list.add(s);
            s = new Sudoku();
            s.setType("MEDIUM");
            list.add(s);
            s = new Sudoku();
            s.setType("EASY");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listHard();

        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo ir 12 kitokio tipo Sudoku, bet ideti buvo tik 6 HARD
        assertThat(testList.size(), is(6));
    }
    @Test
    public void testSudokuListEasyEmpty(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 10; i++){
            Sudoku s = new Sudoku();
            s.setType("HARD");
            list.add(s);
            s = new Sudoku();
            s.setType("MEDIUM");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listEasy();
        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo 20 kitokio tipo Sudoku, bet EASY buvo 0 (tuscias sarasas)
        assertThat(testList.isEmpty(), is(Boolean.TRUE));
    }
    @Test
    public void testSudokuListMediumEmpty(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 100; i++){
            Sudoku s = new Sudoku();
            s.setType("HARD");
            list.add(s);
            s = new Sudoku();
            s.setType("EASY");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listMedium();
        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo 200 kitokio tipo Sudoku, bet MEDIUM buvo 0 (tuscias sarasas)
        assertThat(testList.isEmpty(), is(Boolean.TRUE));
    }
    @Test
    public void testSudokuListHardEmpty(){
        // Initialize list
        List<Sudoku> list = new ArrayList<Sudoku>();
        for (int i = 0; i < 50; i++){
            Sudoku s = new Sudoku();
            s.setType("EASY");
            list.add(s);
            s = new Sudoku();
            s.setType("MEDIUM");
            list.add(s);
        }
        when(sudokuRepository.findAll()).thenReturn(list);

        List<Sudoku> testList = sc.listHard();
        verify(sudokuRepository).findAll();
        // Nepriklausomai nuo to, kad sarase buvo 100 kitokio tipo Sudoku, bet HARD buvo 0 (tuscias sarasas)
        assertThat(testList.isEmpty(), is(Boolean.TRUE));
    }
}