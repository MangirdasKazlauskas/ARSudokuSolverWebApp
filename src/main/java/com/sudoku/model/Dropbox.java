package com.sudoku.model;

import com.dropbox.core.*;
import com.dropbox.core.v1.DbxClientV1;
import com.dropbox.core.v1.DbxEntry;
import com.dropbox.core.v1.DbxWriteMode;

import java.io.*;

public class Dropbox {
    private static final String ACCESS_TOKEN = "g3x8aRWB0rAAAAAAAAAACw9agTESWiTCYSrxvRzTM80ig2Y7p35QGUSqRScuALZv";

    private DbxClientV1 dbxClient;

    public DbxClientV1 authDropbox() throws DbxException, IOException {
        DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
        this.dbxClient = new DbxClientV1(config, ACCESS_TOKEN);

        System.out.println(dbxClient.getAccountInfo().displayName);

        return dbxClient;
    }

    public Sudoku uploadFileToDropbox(SudokuAndroid file) throws IOException, DbxException {
        Sudoku sudoku = new Sudoku();
        File sudokuInitial = new File(file.getId() + ".png");
        File sudokuSolved = new File(file.getId() + "r.png");
        FileInputStream fisInitial = new FileInputStream(sudokuInitial);
        FileInputStream fisSolved = new FileInputStream(sudokuSolved);
        try{
            DbxEntry.File uploadInitial = dbxClient.uploadFile("/" + file.getId() + ".png",
                    DbxWriteMode.add(), sudokuInitial.length(), fisInitial);
            DbxEntry.File uploadSolved = dbxClient.uploadFile("/" + file.getId() + "r.png",
                    DbxWriteMode.add(), sudokuSolved.length(), fisSolved);

            sudoku.setInitial((dbxClient.createShareableUrl("/" + file.getId() + ".png")) + "&raw=1");
            sudoku.setSolved((dbxClient.createShareableUrl("/" + file.getId() + "r.png")) + "&raw=1");
            /*System.out.println("Uploaded: " + uploadInitial.toString());
            System.out.println("Uploaded: " + uploadSolved.toString());*/
            sudoku.setDuration(file.getDuration());
            sudoku.setType(file.getType());

        } finally {
            fisInitial.close();
            fisSolved.close();
        }
        return sudoku;
    }
}
