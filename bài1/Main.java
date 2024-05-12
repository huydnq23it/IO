package IO;

import java.io.File;
import java.io.FileInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() throws Exception {
        FileInputStream file = new FileInputStream("D:\\codejava\\LapTrinhJava\\src\\IO\\1.txt");
        int s;
        while ((s=file.read())!=-1) {
            System.out.print(Character.toChars(s));
        }
    }
    public static void main(String[] args) throws Exception{
    	String workingDirectory = System.getProperty("user.dir");
        System.out.println("Thư mục làm việc hiện tại: " + workingDirectory);
        new Main();
    }
}