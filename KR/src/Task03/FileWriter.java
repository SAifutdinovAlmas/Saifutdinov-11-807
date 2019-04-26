package Task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileWriter extends Thread {
    private String str;
    public FileWriter(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("C:\\Users\\User\\IdeaProjects\\KR\\src\\Task03\\text1"), true));
            pw.println(getStr());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

