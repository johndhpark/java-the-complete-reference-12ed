
// Using directories.
import java.io.File;

class DirList {
    public static void main(String[] args) {
        String dirname = "/Users/johnpark/practice_java";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);

                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory.");
                } else {
                    if (f.isHidden()) {
                        System.out.println(s[i] + "is a hidden file");
                    } else {
                        System.out.println(s[i] + "is a file.");
                    }
                    System.out.println("Writable: " + f.canWrite());
                    System.out.println("Readable: " + f.canRead());
                    System.out.println("Executable: " + f.canExecute());
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}