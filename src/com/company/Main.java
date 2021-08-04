package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File tmp = new File("/Users/natalaganieva/Documents/Games/tmp");
        if (tmp.mkdir())
            sb.append("Каталог Games/tmp успешно создан, ");

        File src = new File("/Users/natalaganieva/Documents/Games/src");
        if (src.mkdir())
            sb.append("каталог Games/src успешно создан, ");

        File res = new File("/Users/natalaganieva/Documents/Games/res");
        if (res.mkdir())
            sb.append("каталог Games/res успешно создан, ");

        File savegames = new File("/Users/natalaganieva/Documents/Games/savegames");
        if (savegames.mkdir())
            sb.append("каталог Games/savegames успешно создан, ");

        File main = new File("/Users/natalaganieva/Documents/Games/src/main");
        if (main.mkdir())
            sb.append("Каталог Games/src/main успешно создан, ");

        File test = new File("/Users/natalaganieva/Documents/Games/src/test");
        if (test.mkdir())
            sb.append("каталог Games/src/test успешно создан, ");

        File drawables = new File("/Users/natalaganieva/Documents/Games/res/drawables");
        if (drawables.mkdir())
            sb.append("каталог Games/res/drawables успешно создан, ");

        File vectors = new File("/Users/natalaganieva/Documents/Games/res/vectors");
        if (vectors.mkdir())
            sb.append("каталог Games/res/vectors успешно создан, ");

        File icons = new File("/Users/natalaganieva/Documents/Games/res/icons");
        if (icons.mkdir())
            sb.append("каталог Games/res/icons успешно создан, ");

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

}


