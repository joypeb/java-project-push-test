package Java_221007.test1;

import java.io.IOException;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        String address = "./2021_인구관련연간자료_20220927_66125.csv";
        StatisticAnalysis statisticAnalysis = new StatisticAnalysis(address);
        statisticAnalysis.populationStatisticsAnalysis();
        //statisticAnalysis.writeSeoul(statisticAnalysis.moveOutFromSeoul());
        statisticAnalysis.writeFromTo(statisticAnalysis.moveOutFromTo());
    }
}

//서울:11,강원:42,경기:41,경남:48,경북:47,광주:29,대구:27,대전:30,부산:26,세종:36,울산:31,인천:28,전남:46,전북:45,제주:50,충남:44,충북:43
//서울:11,부산:26,대구:27,인천:28,광주:29,대전:30,울산:31,세종:36,경기:41,강원:42,충북:43,충남:44,전북:45,전남:46,경북:47,경남:48,제주:50
