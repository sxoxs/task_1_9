package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> strList = new ArrayList<>();

        System.out.println("Выедите последовательно 3 строки");
        for (int i = 0; i++ < 3;) {
            strList.add(inConsole());
        }
        writeInFile(spliteWord(strList));
        System.out.println("Слова из строк внесены в файл");
    }

    static String inConsole () throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    static void writeInFile (ArrayList<String> arrayStr) throws  IOException{
        try (PrintWriter pw = new PrintWriter("text_1_9.txt")) {
            for (String i : arrayStr){
                pw.println(i);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Ошибка открытия файла");
        }
    }

    static ArrayList<String> spliteWord (ArrayList<String> arrayLine) {
        ArrayList<String> arrayWord = new ArrayList<>();

        for (String i : arrayLine) {
            for (String j : i.split(" ")){
                arrayWord.add(j);
            }
        }
        return arrayWord;
    }
}
