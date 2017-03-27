package com.pw.eiti;

import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0 || !args[0].endsWith(".json")) {
            System.out.println("Specify path to file with graphs in json format as parameter");
        }
        String path = args[0];
        try {
            List<Graph> graphs = InputFileParser.parse(path);
            //TODO - process graphs
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
