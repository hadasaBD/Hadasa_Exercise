package com.company;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        // write your code here
     //  System.out.println("new");
      //  String s = "jdh\nfjh";
     //   String s1 = "jdh\\fjh";
      //  String s2 = "jdh\\\\\fjh";
     //   System.out.println(s);
      //  System.out.println(s1);
     //   System.out.println(s2);
        File file = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\hadasa_my_programs\\MyFile.txt");
        File file2 = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\hadasa_my_programs");
        //getMaxInteger(file);
        String s0 = "C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\hadasa_my_programs";
        String s01 ="MyFile.txt";
        fileExistsInFolder(file2,s01);
        System.out.println(fileMaxInFolder(file2));
    }

  /*  static int getMaxInteger(File file) {
        InputStream inputStream = null;
        int max = Integer.MIN_VALUE;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[4];
            int actuallyRead;
            while ((actuallyRead = inputStream.read(bytes)) != -1) {
                if (actuallyRead != 4)
                    throw new InvalidParameterException("עבדת עלי זה בכלל לא מספרים");
                int num = ByteBuffer.wrap(bytes).getInt();
                if (num > max)
                    max = num;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidParameterException invalidParameterException) {
            invalidParameterException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null)
                try {
                inputStream.close();
                }
                catch (IOException e){
                e.printStackTrace();
                }
        }

        return max;
    }
    */
    public static boolean fileExistsInFolder(File folder, String fileName){
        if(!folder.exists())
            throw new InvalidParameterException("folder does not exist");
        if(!folder.isDirectory())
            throw new InvalidParameterException("this is not a folder");
        File[] files = folder.listFiles();
        for(File f : files){
            if(f.isFile() && f.getName().equals(fileName))
                return true;
        }
        for(File f : files){
            if(f.isDirectory() && fileExistsInFolder(f, fileName))
                return true;
        }
        return false;
    }
    public static File fileMaxInFolder(File folder){
        File res;
        if(!folder.exists())
            throw new InvalidParameterException("folder does not exist");
        if(!folder.isDirectory())
            throw new InvalidParameterException("this is not a folder");
        File maxFile= folder;
        File[] files = folder.listFiles();
        for(File f : files) {
            if (f.isFile() && f.length() > maxFile.length())
                maxFile = f;
        }
        for(File f : files) {
            if (f.isDirectory()) {
                res = fileMaxInFolder(f);
                if (res.isFile() && res.length() > maxFile.length())
                    maxFile = res;
            }
        }

        return maxFile.getAbsoluteFile();
    }
}



