import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FolderManger implements Methods {
    private Files files;
    private File f ;
    private ArrayList<String> list =  new ArrayList<String>();
    private StringBuilder br = new StringBuilder();
//    private Path currentRelativePath = Paths.get("");
//    private String curentPath = currentRelativePath.toAbsolutePath().toString();
private String curentPath ="C:\\Users\\abodi\\Downloads";
    public ArrayList<String> getList(){
        return list;
    }

    @Override
    public void addToList() {
        for (int i = 0; i < getFilesList(curentPath).length; i++) {
            String extension = getExtension(getFilesList(curentPath)[i]);
            if (!list.contains(extension)) {
                list.add(extension);
            }

        }
    }

    @Override
    public String[] getFilesList(String path) {

         f = new File(path);
        String[] files = f.list();


        return files;
    }

    @Override
    public String getExtension(String fileName) {
        char[] array = fileName.toCharArray();
        for (int i = 0; i < fileName.toCharArray().length; i++) {
            if (array[i] == '.') {
                return fileName.substring(i + 1, fileName.length());
            }
        }
        return null;
    }

    @Override
    public void createFolder(String folderName, String path) {

        f = new File(String.valueOf(br.append(path).append("/").append(folderName)));
        f.mkdir();



    }
    public void createDis(){
        for (int i = 0; i < list.size(); i++) {
            try {
                createFolder(list.get(i), curentPath);
            }catch (Exception e ){
                JOptionPane.showMessageDialog(null , "couldn't create folders");
            }
        }
    }

    @Override
    public void moveFolders(){
        files.move();
    }
}
