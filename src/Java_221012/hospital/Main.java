package Java_221012.hospital;

import Java_221012.hospital.parser.HospitalParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "./Files/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLine(filename);

        for(Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}
