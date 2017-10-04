/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NasabahGenerator {

    public static List<Person> inputFileNasabah(String filename) throws FileNotFoundException, IOException {
        List<Person> people = new ArrayList<>();
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {
            String[] arrayModel = line.split(",");
            Person person = new Person(
                    arrayModel[0],
                    arrayModel[1].trim(),
                    arrayModel[2].trim(),
                    Integer.parseInt(arrayModel[3].trim()),
                    Integer.parseInt(arrayModel[4].trim()),
                    Double.parseDouble(arrayModel[5].trim()),
                    Double.parseDouble(arrayModel[6].trim()),
                    Double.parseDouble(arrayModel[7].trim()),
                    Double.parseDouble(arrayModel[8].trim()),
                    Integer.parseInt(arrayModel[9].trim()),
                    arrayModel[10].trim());

            people.add(person);
        }
        return people;

    }
}
