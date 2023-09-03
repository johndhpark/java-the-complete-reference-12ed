// Directory of .HTML files

import java.io.*;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Users/johnpark/practice_java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");

        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }

}
