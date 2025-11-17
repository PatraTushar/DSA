package Greedy;


import java.util.HashSet;
import java.util.Set;

public class Q48 {

    static int minimumTeaching(int n, int[][] languages, int[][] friendships) {

        // Let F = #friendships, L = avg #languages per user, S = #sad users, n = #languages
        //  Time Complexity: O(f * l) +O(s * l)
        //  Space Complexity: O(s + n + l)



        int fLength = friendships.length;


        Set<Integer> sadUser = new HashSet<>();


        for (int i = 0; i < fLength; i++) {

            HashSet<Integer> langSet = new HashSet<>();

            int u = friendships[i][0] - 1;
            int v = friendships[i][1] - 1;

            for (int lang : languages[u]) {

                langSet.add(lang);
            }

            boolean canTalk = false;

            for (int lang : languages[v]) {

                if (langSet.contains(lang)) {

                    canTalk = true;
                    break;
                }


            }

            if (!canTalk) {

                sadUser.add(u);
                sadUser.add(v);


            }


        }

        int[] languageCount = new int[n + 1];
        int mostKnownLang = 0;

        for (int user : sadUser) {

            for (int lang : languages[user]) {

                languageCount[lang]++;
                mostKnownLang = Math.max(mostKnownLang, languageCount[lang]);


            }


        }

        return sadUser.size() - mostKnownLang;


    }

    public static void main(String[] args) {

        int n = 2;
        int[][] languages = {{1}, {2}, {1, 2}};
        int[][] friendships = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(minimumTeaching(n, languages, friendships));
    }
}
