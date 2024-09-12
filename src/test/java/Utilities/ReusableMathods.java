package Utilities;

import io.cucumber.java.sl.In;

import java.io.*;
import java.util.HashMap;

public class ReusableMathods {
    public static HashMap<String, String> readFromPropertyFile(String path)throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        HashMap<String, String> map = new HashMap<>();
        while(br.readLine()!=null){
            map.put(br.readLine().split("=")[0],br.readLine().split("=")[1]);

        }
        br.close();
        return map;
    }
    public void writetoPropertyFile(String path) throws IOException{
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Amit");
        bw.flush();
        bw.close();
    }
}
