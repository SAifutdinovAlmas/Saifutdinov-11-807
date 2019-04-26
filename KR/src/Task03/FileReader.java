package Task03;

import java.util.Scanner;

public class FileReader extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner("C:\\Users\\User\\IdeaProjects\\KR\\src\\Task03\\text1");
        while(scanner.hasNextLine() ){
            FileWriter tw = new FileWriter(scanner.nextLine());
            tw.start();
        }
    }
}
