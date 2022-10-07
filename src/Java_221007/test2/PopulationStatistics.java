package Java_221007.test2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {

    public List<PopulationMove> readFileByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String s = "";

        while ((s = br.readLine()) != null) {
            PopulationMove pm = parse(s);
        }
        br.close();
        return pml;
    }


    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[6]);
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        String str = "";

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + ", " + populationMove.getToSido() + "\n";
    }

    public static void main(String[] args) throws IOException {
        String address = "./2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.createAFile("from_to.txt");
        List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

    }

}
