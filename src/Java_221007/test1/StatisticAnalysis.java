package Java_221007.test1;

import Java_221007.test2.PopulationMove;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticAnalysis {
    private String address;
    private List<PopulationList> populationLists = new ArrayList<>();
    BufferedReader br = null;
    PopulationList pl = null;

    public StatisticAnalysis(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public PopulationList parse(String data) {

        String[] arr = data.split(",");
        return new PopulationList(Integer.parseInt(arr[0]), Integer.parseInt(arr[6]));
    }
    public void populationStatisticsAnalysis() {
        try{
            br = Files.newBufferedReader(Path.of(this.address), StandardCharsets.UTF_8);
            String str = "";
            while((str=br.readLine()) != null) {
                populationLists.add(parse(str));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printPopulationLists() {
        for (PopulationList p : populationLists) {
            System.out.println(p.getMoveInCity() + ", " + p.getMoveOutCity());
        }
    }

    public String moveOutFromSeoul() throws IOException {
        Map<Integer,Integer> moveOutFromSeoulMap = new HashMap<>();
        int[] city = {11,26,27,28,29,30,31,36,41,42,43,44,45,46,47,48,50};
        String seoulFile = "";

        for(int i=0; i< city.length; i++) {
            moveOutFromSeoulMap.put(city[i], 0);
        }
        for (PopulationList fromTo : populationLists) {
            if (fromTo.getMoveOutCity() == 11) {
                moveOutFromSeoulMap.put(fromTo.getMoveInCity(), moveOutFromSeoulMap.get(fromTo.getMoveInCity()) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : moveOutFromSeoulMap.entrySet()) {
            seoulFile += "[\'"+changeCityName(entry.getKey()) + "\', " + entry.getValue() +"],";
        }
        return seoulFile;
    }

    public String moveOutFromTo() {
        Map<String,Integer> fromToCity = new HashMap<>();
        String FromTo = "";

        for(PopulationList fromTo : populationLists) {
            String str = fromTo.getMoveOutCity() + "," + fromTo.getMoveInCity();
            if (fromToCity.get(str) == null){
                fromToCity.put(str,0);
            }
            fromToCity.put(str,fromToCity.get(str)+1);
        }
        for(Map.Entry<String, Integer> entry : fromToCity.entrySet()) {
            String[] cityNum = entry.getKey().split(",");
           FromTo  += "["+changeIntName(Integer.parseInt(cityNum[0]))+", "+changeIntName(Integer.parseInt(cityNum[1]))+", " + entry.getValue() +"],";
        }
        return FromTo;
    }

    public void writeFromTo(String fromToFile) throws IOException {
        File file = new File("./FromTo.txt");
        if(!file.exists()){ // 파일이 존재하지 않으면
            file.createNewFile(); // 신규생성
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append(fromToFile);
        writer.close();
    }
    public void writeSeoul(String seoulFile) throws IOException {
        File file = new File("./moveOutFromSeoul.txt");
        if(!file.exists()){ // 파일이 존재하지 않으면
            file.createNewFile(); // 신규생성
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append(seoulFile);
        writer.close();
    }

    public String changeCityName(int num) {
        Map<Integer,String> cityName = new HashMap<>();
        int[] city = {11,26,27,28,29,30,31,36,41,42,43,44,45,46,47,48,50};
        String[] cityStr = {"서울","부산","대구","인천","광주","대전","울산","세종","경기","강원","충북","충남","전북","전남","경북","경남","제주"};
        for(int i=0; i< city.length; i++) {
            cityName.put(city[i],cityStr[i]);
        }
        return cityName.get(num);
    }

    public int changeIntName(int num) {
        Map<Integer,Integer> cityIntName = new HashMap<>();
        int[] city = {11,26,27,28,29,30,31,36,41,42,43,44,45,46,47,48,50};
        int[] cityInt = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        for(int i=0; i< city.length; i++) {
            cityIntName.put(city[i],cityInt[i]);
        }
        return cityIntName.get(num);
    }
}
