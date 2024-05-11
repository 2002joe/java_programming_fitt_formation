import java.util.*;

class question9 {

    
    static int versionCompare(String v1, String v2)
    {
        
        int vnum1 = 0, vnum2 = 0;

      
        for (int i = 0, j = 0; (i < v1.length() || j < v2.length());) {
            
            while (i < v1.length() && v1.charAt(i) != '.') {
                vnum1 = vnum1 * 10 + (v1.charAt(i) - '0');
                i++;
            }

            
            while (j < v2.length() && v2.charAt(j) != '.') {
                vnum2 = vnum2 * 10 + (v2.charAt(j) - '0');
                j++;
            }

            if (vnum1 > vnum2)
                return 1;
            if (vnum2 > vnum1)
                return -1;

            
            vnum1 = vnum2 = 0;
            i++;
            j++;
        }
        return 0;
    }

    
    static String getVersionChange(String version1, String version2) {
        int comparisonResult = versionCompare(version1, version2);

        if (comparisonResult < 0)
            return "upgraded";
        else if (comparisonResult > 0)
            return "downgraded";
        else
            return "not changed";
    }

    
    public static void main(String[] args)
    {
        String version1 = "4.8.2";
        String version2 = "4.8.4";

        System.out.println("Version change: " + getVersionChange(version1, version2));

        String version3 = "4.0.2";
        String version4 = "4.8.4";

        System.out.println("Version change: " + getVersionChange(version3, version4));
    }
}
