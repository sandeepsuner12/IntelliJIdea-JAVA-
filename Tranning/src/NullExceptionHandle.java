import java.io.File;

public class NullExceptionHandle {

    public static void main(String[] args) {
        File file = getFile();
        //System.out.println(file);
       // file.canRead();
        if(file!=null)
        {
            file.canRead();
        }
        else System.out.println("File is null");
    }

    private static File getFile() {
        return null;
    }
}
