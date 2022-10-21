import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("textfile.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("igdfgdfg");
            pw.println("igdfgd2342341342fg");
            pw.println("igdfg3124dfg");
            pw.println("igdf1342gdfg");

            pw.close();
            
            br = new BufferedReader(new FileReader("textfile.txt"));
            String  line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
