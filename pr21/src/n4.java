import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class n4 {
    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Не найдено");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        n4 a = new n4();
        a.Filelist("C:/Users/bakla/OneDrive/Документы");
    }
}
