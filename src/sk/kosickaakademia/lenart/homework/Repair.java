package sk.kosickaakademia.lenart.homework;

import java.io.*;
import java.nio.Buffer;

public class Repair {
    public void repairTextFile(String fileName) {
        BufferedReader reader;
        String line;
        char ch;
        try{
            if (!new File(fileName).exists()){
                System.out.println("File does not exist!");
            }
            FileReader fr = new FileReader(fileName);
            File repairedFile = new File("resources/git.txt");
            repairedFile.createNewFile();
            FileWriter fw = new FileWriter(repairedFile);
            reader = new BufferedReader(fr);
            while ((line = reader.readLine()) != null){
                char[] originalLine = new char[line.length()];
                for (int i = 0; i < line.length(); i++){
                    ch = line.charAt(i);
                    if (ch == 'I') ch = 'Y';
                    else if (ch == 'Y') ch = 'I';
                    else if (ch == 'i') ch = 'y';
                    else if (ch == 'y') ch = 'i';
                    else if (ch == '?') continue;
                    fw.write(ch);
                }
                fw.write("\n");
            }
            reader.close();
            fw.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
