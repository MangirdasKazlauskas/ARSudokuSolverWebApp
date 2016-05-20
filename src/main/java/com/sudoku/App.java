package com.sudoku;

import com.dropbox.core.DbxException;
import com.sudoku.model.Dropbox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws IOException, DbxException {
        Dropbox dropbox = new Dropbox();
        dropbox.authDropbox();
        SpringApplication.run(App.class, args);
    }
}
