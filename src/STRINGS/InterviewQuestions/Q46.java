package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46 {

    static List<String> removeSubFolders(String[] folder) {

        // Time Complexity: O(n*log n)
        // Space Complexity: O(n)

        int n = folder.length;
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();

        result.add(folder[0]);

        for (int i = 1; i < n; i++) {

            String currFolder = folder[i];
            String lastFolder = result.get(result.size() - 1);

            lastFolder += "/";

            if (!currFolder.startsWith(lastFolder)) result.add(currFolder);
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->1233

        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> ans = removeSubFolders(folder);
        System.out.println(ans);


    }
}
