import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class StringBufferTest {
    public static void main(String[] args) {
        String fileName = "text.txt";
        byte inputByte[]={0};
        long start,end;
        inputByte = Files.readAllBytes(Paths.get(fileName));
        start = System.currentTimeMillis();
        String outputString ="";
        for(byte b : inputByte){
            outputString+=(char)b;
        }
        end=System.currentTimeMillis();
        System.out.println(end-start);
        // execute the below code for string builder
        start = System.currentTimeMillis();
        StringBuilder outputString2 = new StringBuilder();
        for(byte b : inputByte){
            outputString2.append((char)b);
        }
        end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
