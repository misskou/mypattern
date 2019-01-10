package pattern.singleton.lazy;

import java.io.*;

public class SingleOnlyTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream os = null;
        FileInputStream fis = null;
        ObjectInputStream is = null;
        try {
            InnerClass ic = InnerClass.getInstance();
            fos = new FileOutputStream("D:\\a.txt");

            os = new ObjectOutputStream(fos);

            os.writeObject(ic);

            fis = new FileInputStream("D:\\a.txt");
            is = new ObjectInputStream(fis);
            InnerClass icread = (InnerClass)is.readObject();

            System.out.println( ic == icread);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            os.close();
            fis.close();
            is.close();
        }

    }
}
