package buffered_streams;
import java.io.*;
public class BufferedFileCopy {
    public static void main(String[] args) {
        File source = new File("src/main/java/buffered_streams/source.txt");
        File dest = new File("src/main/java/buffered_streams/destination.txt");

        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

