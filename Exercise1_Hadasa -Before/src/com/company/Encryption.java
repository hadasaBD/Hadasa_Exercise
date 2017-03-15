package com.company;

import java.io.File;

/**
 * Created by hackeru on 2/28/2017.
 */
public class Encryption extends FileOperations {

    public Encryption(String path) {

            super(path);
            this.operetion(this.file);

    }

    @Override
    public void operetion(File file) {
    // דורסים את הפונקציה לפי הפעולה שאנו רוצים כאן שהיא פעולת הצפנה
        System.out.println(" Encryption");

    }
}
