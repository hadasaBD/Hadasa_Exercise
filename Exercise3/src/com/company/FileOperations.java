package com.company;

import java.io.File;


public class FileOperations {

    public boolean checkpath(String filePathString){

        if (!new File(filePathString).exists()||!(new File(filePathString).isFile())){

            return false;
        }

        return true;
    }
}
