package ru.gb.stepanov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class WriteToFile{
    public WriteToFile(String userData){
        try{
            String path = "./src/ru/gb/stepanov/note";
            File file = new File(path);
            StringBuilder sb = new StringBuilder();
            if(!file.exists()){
                file.createNewFile();
            }
            sb.append(LocalDate.now() + " -> " + userData);
            sb.append(System.lineSeparator());
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true));
            bw.write(sb.toString());
            bw.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}