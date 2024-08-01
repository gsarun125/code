package jan.Day2;

/*
Print whether the version is upgraded, downgraded or not changed according to the
input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.0.2
Version2 4.8.4 Output: downgraded
 */
public class Qus7 {
    public static void main(String[] args) {
        String Version1 = "Version1 4.8.2";
        String Version2 = "Version2 4.9.2";
        int value = compareVersion(Version1.replaceAll("Version1", "").trim(), Version2.replaceAll("Version2", "").trim());
        if (value == -1) {
            System.out.println("upgraded");
        } else {
            System.out.println("downgraded");
        }
    }


    private static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0, v1Len = version1.length(), v2Len = version2.length(), n1, n2;
        System.out.println(version1);
        System.out.println(version2);
        while (i < v1Len || j < v2Len) {
            n1 = 0;
            n2 = 0;
            //extracting number before the '.' in version1
            while (i < v1Len && version1.charAt(i) != '.') {
                //storing digit in n1
                n1 = n1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            //storing digit in n1
            //extracting number before the '.' in version2
            while (j < v2Len && version2.charAt(j) != '.') {
                n2 = n2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            System.out.println(n1 + " " + n2);
            i++;
            j++;

            if (n1 < n2) return -1;
            else if (n1 > n2) {
                return 1;
            }
        }
        return 0;
    }
}
