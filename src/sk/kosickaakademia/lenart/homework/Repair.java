package sk.kosickaakademia.lenart.homework;

import java.io.*;

public class Repair {
    public void repairTextFile(String fileName) {
        BufferedReader reader;
        try{
            if (!new File(fileName).exists()){
                System.out.println("File does not exist!");
            }
            FileReader fr = new FileReader(fileName);
            File file = new File("resource/repaired");
            file.createNewFile();

            FileWriter fw = new FileWriter(file);
            reader = new BufferedReader(fr);
            String line;
            while((line= reader.readLine())!=null){
                for (int i = 0; i < line.length(); i++){
                    char z = line.charAt(i);
                    switch (z){
                        case 'i' : fw.write('y'); break;
                        case 'I' : fw.write('Y'); break;
                        case 'y' : fw.write('i'); break;
                        case 'Y' : fw.write('I'); break;
                        case '?' : break;
                        default: fw.write(z);
                    }
                }
                fw.write("\n");
            }
            fr.close();
            fw.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}