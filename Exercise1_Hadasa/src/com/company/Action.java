package com.company;

import java.io.File;

/**
 * Created by hackeru on 3/14/2017.
 */
public abstract class Action {
    public File file;

    public Action(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public  abstract  void operetion(File file);
}
