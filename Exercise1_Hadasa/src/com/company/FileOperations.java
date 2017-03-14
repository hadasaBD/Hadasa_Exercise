package com.company;

import java.io.File;

/**
 * Created by hackeru on 2/28/2017.
 */
public abstract class FileOperations {

     public File file;
   //  public String path;

    public FileOperations(String path) {// ניתן לבנות בנאי את לא ליצור מופע ממנו אלא רק הבנים ישתמשו בנאי האבא הזה
        //  this.path = path;
        if (pathValid(path))
            this.file = new File(path);
    }

    public static boolean pathValid (String s){
    // לבדוק את חוקיות נתיב הקובץ
        File file= new File(s);
        if (file.exists() && file.isFile() && file.canRead() && file.canWrite()){
            System.out.println("The path is valid");
            return true;
        }
        else {
            System.out.println("Error : This is not file");
            exeption(file);
            return false;
        }

   }
   public static void exeption(File file){
        if (!file.isFile()) {
            System.out.println("This is not file,This folder has. ");
            System.out.println("Input the path to the file .");
        }

   }
   public  abstract  void operetion(File file);

}





