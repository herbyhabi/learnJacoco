import java.io.File;
import java.io.FileNotFoundException;

public class FunctionsUtil extends BasicTest {
    public static boolean deleteFile(String delPath) throws Exception{
        try{
            File file = new File(delPath);
            if(!file.isDirectory()){
                file.delete();
            }else if(file.isDirectory()){
                String [] fileList = file.list();

                for(String f : fileList){
                    File delFile = new File(delPath + "\\" + f);
                    if(!delFile.isDirectory()){
                        delFile.delete();
                        System.out.println(delFile.getAbsolutePath() + " ****deleted!");
                    }else if(delFile.isDirectory()){
                        deleteFile(delPath + "\\" + f);
                    }
                }
                System.out.println(file.getAbsolutePath()+ " ****deleted!");
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}
