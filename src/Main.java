import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private FolderManger folderManger;

    public static void main(String[] args) throws IOException {
        StringBuffer b = new StringBuffer("name");
      StringBuffer ö =   b.insert(4 , 's');
        System.out.println(ö);
        Scanner s = new Scanner(System.in);
        String email =s.nextLine();

    }

    public void run() {
        folderManger = new FolderManger();
        folderManger.addToList();
        folderManger.createDis();
        System.out.println(folderManger.getList());

    }
}






