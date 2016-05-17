package com.sudoku;

import com.dropbox.core.v1.DbxClientV1;
import com.dropbox.core.v1.DbxEntry;
import com.dropbox.core.v1.DbxWriteMode;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import com.sudoku.model.Dropbox;
import com.sudoku.model.Sudoku;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dropbox.core.*;
import java.io.*;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws IOException, DbxException {
        /*Dropbox dropbox = new Dropbox();
        dropbox.authDropbox();*/
        SpringApplication.run(App.class, args);
    }
}
