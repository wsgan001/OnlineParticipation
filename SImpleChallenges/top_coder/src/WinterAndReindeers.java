import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class WinterAndReindeers {

    public int getNumber(String[] allA, String[] allB, String[] allC) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        for (int i = 0; i < allA.length; i++) {
            for (int j = 0; j < allA[i].length(); j++) {
                a.add(Character.toString(allA[i].charAt(j)));
            }
        }
        for (int i = 0; i < allB.length; i++) {
            for (int j = 0; j < allB[i].length(); j++) {
                b.add(Character.toString(allB[i].charAt(j)));
            }
        }
        for (int i = 0; i < allC.length; i++) {
            for (int j = 0; j < allC[i].length(); j++) {
                c.add(Character.toString(allC[i].charAt(j)));
            }
        }
        String s = lcs(a, b);
        int len = s.length();
        int length = c.size();
        int count = 0;
        int res = Integer.MAX_VALUE;
        int i_;

        for (int i = 0; i < len; i++) {

            int j=0;
                if (c.get(j).equals(Character.toString(s.charAt(i)))) {
                    i_ = i + 1;   j++;
                    while(i_<len && j<length){
                    while (!c.get(j).equals(Character.toString(s.charAt(i_)))) {
                        count++;
                        i_++;
                        if (i_ >= len)
                            break;

                    }
                        i_++;
                        j++;
                    }

                }


            res = Math.min(res, count);
        }



    return s.length()-res;
}

    private String lcs(ArrayList<String> allA, ArrayList<String> allB) {
        int m = allA.size();
        int n = allB.size();
        String L[][] = new String[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = "";

                else if (allA.get(i - 1).equals(allB.get(j - 1)))
                    L[i][j] = L[i - 1][j - 1] + allA.get(i - 1);

                else
                    L[i][j] = (L[i - 1][j].length() > L[i][j - 1].length()) ? L[i - 1][j] : L[i][j - 1];
            }
        }
        return L[m][n];
    }

    // BEGIN KAWIGIEDIT TESTING
    // Generated by KawigiEdit 2.1.8 (beta) modified by pivanof
    private static boolean KawigiEdit_RunTest(int testNum, String[] p0, String[] p1, String[] p2, boolean hasAnswer, int p3) {
        System.out.print("Test " + testNum + ": [" + "{");
        for (int i = 0; p0.length > i; ++i) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("\"" + p0[i] + "\"");
        }
        System.out.print("}" + "," + "{");
        for (int i = 0; p1.length > i; ++i) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("\"" + p1[i] + "\"");
        }
        System.out.print("}" + "," + "{");
        for (int i = 0; p2.length > i; ++i) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("\"" + p2[i] + "\"");
        }
        System.out.print("}");
        System.out.println("]");
        WinterAndReindeers obj;
        int answer;
        obj = new WinterAndReindeers();
        long startTime = System.currentTimeMillis();
        answer = obj.getNumber(p0, p1, p2);
        long endTime = System.currentTimeMillis();
        boolean res;
        res = true;
        System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
        if (hasAnswer) {
            System.out.println("Desired answer:");
            System.out.println("\t" + p3);
        }
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        if (hasAnswer) {
            res = answer == p3;
        }
        if (!res) {
            System.out.println("DOESN'T MATCH!!!!");
        } else if ((endTime - startTime) / 1000.0 >= 2) {
            System.out.println("FAIL the timeout");
            res = false;
        } else if (hasAnswer) {
            System.out.println("Match :-)");
        } else {
            System.out.println("OK, but is it right?");
        }
        System.out.println("");
        return res;
    }

    public static void main(String[] args) {
        boolean all_right;
        all_right = true;

        String[] p0;
        String[] p1;
        String[] p2;
        int p3;

        // ----- test 0 -----
        p0 = new String[]{"X"};
        p1 = new String[]{"X", "Y"};
        p2 = new String[]{"X"};
        p3 = 1;
        all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
        // ------------------

        // ----- test 1 -----
        p0 = new String[]{"ABCXD"};
        p1 = new String[]{"BCDEF"};
        p2 = new String[]{"CD"};
        p3 = 3;
        all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
        // ------------------

        // ----- test 2 -----
        p0 = new String[]{"WE", "LOVE"};
        p1 = new String[]{"WORKING", "FOR", "SANTA"};
        p2 = new String[]{"JK"};
        p3 = 0;
        all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
        // ------------------

        // ----- test 3 -----
        p0 = new String[]{"ABCDE"};
        p1 = new String[]{"CDEAB"};
        p2 = new String[]{"B"};
        p3 = 2;
        all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
        // ------------------

        // ----- test 4 -----
        p0 = new String[]{"ABCABDEGAXAHDJBAAHFJDXBB", "ABHFHCDALFDJDBBA", "BABBAXAXXX"};
        p1 = new String[]{"ABLOCBAXBAHAJDXBIJKA", "JBABCDAHKFIUDALPJAH", "AABACX"};
        p2 = new String[]{"AXBADXBBAB", "CDD"};
        p3 = 23;
        all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
        // ------------------

        if (all_right) {
            System.out.println("You're a stud (at least on the example cases)!");
        } else {
            System.out.println("Some of the test cases had errors.");
        }
    }
    // PROBLEM STATEMENT
    //
    // It's winter time! Time to play some games.
    //
    //
    //
    //
    // Four reindeers are playing the following game.
    // The first three of them choose three non-empty strings: A, B, and C. (The strings are not necessarily distinct.)
    // Then, the fourth one (and it happens to be the youngest one) finds a string S that satisfies the following conditions:
    //
    //
    //
    // S is a subsequence of A. (I.e., either S equals A, or S can be obtained from A by removing some of its characters.)
    //
    //
    // S is a subsequence of B.
    //
    //
    // C is a (contiguous) substring of S.
    //
    //
    // There is no string longer than S that satisfies the previous three conditions.
    //
    //
    //
    //
    //
    // You are given three String[]s allA, allB and allC.
    // Concatenate all elements of allA, allB and allC to obtain strings A, B and C, respectively.
    // Return the length of the string S.
    // If there is no such string, return 0.
    //
    //
    // DEFINITION
    // Class:WinterAndReindeers
    // Method:getNumber
    // Parameters:String[], String[], String[]
    // Returns:int
    // Method signature:int getNumber(String[] allA, String[] allB, String[] allC)
    //
    //
    // CONSTRAINTS
    // -allA, allB and allC will each contain between 1 and 50 elements, inclusive.
    // -Each element of allA, allB and allC will contain between 1 and 50 characters, inclusive.
    // -Each element of allA, allB and allC will consist only of uppercase English letters ('A'-'Z').
    //
    //
    // EXAMPLES
    //
    // 0)
    // {"X"}
    // {"X", "Y"}
    // {"X"}
    //
    // Returns: 1
    //
    // In this case, A = "X", B = "XY", C = "X". The longest possible string that satisfies conditions from the statement is "X". Thus, the answer is 1.
    //
    // 1)
    // {"ABCXD"}
    // {"BCDEF"}
    // {"CD"}
    //
    // Returns: 3
    //
    // The longest possible string in this case is "BCD".
    //
    // 2)
    // {"WE", "LOVE"}
    // {"WORKING", "FOR", "SANTA"}
    // {"JK"}
    //
    // Returns: 0
    //
    // No string satisfies all criteria in this case. Thus, the answer is 0.
    //
    // 3)
    // {"ABCDE"}
    // {"CDEAB"}
    // {"B"}
    //
    // Returns: 2
    //
    //
    //
    // 4)
    // {"ABCABDEGAXAHDJBAAHFJDXBB", "ABHFHCDALFDJDBBA", "BABBAXAXXX"}
    // {"ABLOCBAXBAHAJDXBIJKA", "JBABCDAHKFIUDALPJAH", "AABACX"}
    // {"AXBADXBBAB", "CDD"}
    //
    // Returns: 23
    //
    //
    //
    // END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.8 (beta) modified by pivanof!
