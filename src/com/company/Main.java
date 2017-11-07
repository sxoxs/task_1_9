package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> strList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите последовательно 3 строки");
        for (int i = 0; i++ < 3;) {
            strList.add(br.readLine());
        }
        writeInFile(spliteWord(strList));
        System.out.println("Слова из строк внесены в файл");
    }

    static void writeInFile (ArrayList<String> arrayStr) throws  IOException{
        try (PrintWriter pw = new PrintWriter("text_1_9.txt")) {
            for (String line : arrayStr){
                pw.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Ошибка открытия файла");
        }
    }

    static ArrayList<String> spliteWord (ArrayList<String> arrayLine) {
        ArrayList<String> arrayWord = new ArrayList<>();

        for (String line : arrayLine) {
            for (String subLine : line.split(" ")){
                arrayWord.add(subLine);
            }
        }
        return arrayWord;
    }
}
