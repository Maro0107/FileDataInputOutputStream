import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args)throws IOException {

        DataOutputStream out = null;

        try{
            out = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream("files\\test.dat")));

            out.writeUTF("text test");
            out.writeShort(3200);
            out.writeLong(125542222555L);
            out.writeFloat(23.56f);
            out.writeDouble(255.66d);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); //wymuszenie zapisu z bufora

        }catch (IOException e){
            e.printStackTrace();
        }finally {

            if (out != null) out.close();
        }
    }
}
