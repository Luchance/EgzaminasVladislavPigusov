package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * File reader class that reads from txt file which arguments used in tests
 * Was not used in test cases but it was in requirements so it should work if needed if initiated :)
 */

public class FileReader {

    /**
     * @param testData user made txt file with input info for tests
     * @return any argument from the list by the index
     * @throws IOException
     */

    public static List<String> getTestData(String testData) throws IOException {

        List<String> records = new ArrayList<String>();
        String record;

        BufferedReader file = new BufferedReader(new java.io.FileReader(testData));

        while ((record=file.readLine())!=null){
            records.add(record);
        }
        file.close();
        return records;
    }
}