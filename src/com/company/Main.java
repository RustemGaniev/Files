package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String[] dirs = {"/Users/natalaganieva/Documents/Games/tmp",
                "/Users/natalaganieva/Documents/Games/src",
                "/Users/natalaganieva/Documents/Games/res",
                "/Users/natalaganieva/Documents/Games/savegames",
                "/Users/natalaganieva/Documents/Games/src/main",
                "/Users/natalaganieva/Documents/Games/src/test",
                "/Users/natalaganieva/Documents/Games/res/drawables",
                "/Users/natalaganieva/Documents/Games/res/vectors",
                "/Users/natalaganieva/Documents/Games/res/icons"};

        for (String dir:dirs) {
            createDirectory(dir, sb);
        }



        File logFile = new File("/Users/natalaganieva/Documents/Games/tmp/tmp.txt");
        try {
            if (logFile.createNewFile())
                System.out.println("Log файл temp.txt успешно создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String log = sb.toString();

        try
                (FileWriter writer = new FileWriter("/Users/natalaganieva/Documents/Games/tmp/tmp.txt", false)) {
            writer.write(log);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static StringBuilder createDirectory(String path, StringBuilder sb) {

        File dir = new File(path);
        if (dir.mkdir()) {
            sb.append("каталог " + path + " успешно создан, ");
        }
        return sb;
    }
    }




