package ejercicios;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class UsernamesChangesLogic {

    public static List<String> possibleChanges(List<String> usernames) {
        // Write your code here
        List<String> solutionStr = new ArrayList<String>();
        boolean bobbysFlag = false;
        for (String username : usernames) {

            bobbysFlag = false;
            String currName = username.toLowerCase();
            int currNameLength = currName.length();
            for (int i = 0; i < currNameLength; i++) {

                int a = currName.charAt(i);
                for (int j = i + 1; j < currNameLength; j++) {

                    int b = currName.charAt(j);
                    if (b < a) {
                        bobbysFlag = true;
                        break;
                    }
                }
                if (bobbysFlag) {
                    solutionStr.add("YES");
                    break;
                }
            }
            if (!bobbysFlag)
                solutionStr.add("NO");
        }

        return solutionStr;
    }
}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int usernamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> usernames = IntStream.range(0, usernamesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = UsernamesChangesLogic.possibleChanges(usernames);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}