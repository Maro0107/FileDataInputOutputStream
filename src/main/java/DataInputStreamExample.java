import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args)throws IOException {

        DataInputStream in = null;

        try {

            in = new DataInputStream(new BufferedInputStream(
                    new FileInputStream("files\\test.dat")));

//            out.writeUTF("text test");
            String str = in.readUTF();
            System.out.println(str);
//            out.writeShort(3200);
            short shortNum = in.readShort();
            System.out.println(shortNum);
//            out.writeLong(125542222555L);
            long longNum = in.readLong();
            System.out.println(longNum);
//            out.writeFloat(23.56f);
            float floatNum = in.readFloat();
            System.out.println(floatNum);
//            out.writeDouble(255.66d);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);
//            out.writeByte(12);
            byte _byte = in.readByte();
            System.out.println(_byte);
//            out.writeChar('A');
            char _char = in.readChar();
            System.out.println(_char);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (in != null) in.close();
        }


    }
}
