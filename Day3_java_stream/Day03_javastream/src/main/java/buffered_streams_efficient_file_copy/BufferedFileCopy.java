package buffered_streams_efficient_file_copy;

import java.io.*;

public class BufferedFileCopy {
    private static  final int BUFFER_SIZE=4096;

    public static long copyUsingUnbufferedStreams(){
        long startTime=System.nanoTime();
        try(
                FileInputStream foi = new FileInputStream("src/main/java/buffered_streams_efficient_file_copy/source");

                FileOutputStream fos = new FileOutputStream("src/main/java/buffered_streams_efficient_file_copy/destination");
                ){
            int data;
            while((data=foi.read())!=-1){
                fos.write(data);
            }
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
        return System.nanoTime()-startTime;
    }

    public static long copyUsingBufferedStreams(){
        long startTime = System.nanoTime();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/buffered_streams_efficient_file_copy/source"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/buffered_streams_efficient_file_copy/destination"));) {
            byte[] buffer = new byte[BUFFER_SIZE]; // Read/write in 4KB chunks
            int bytesRead;
            while((bytesRead=bis.read(buffer))!=-1){
                bos.write(buffer,0,bytesRead);
            }
        }catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }


    public static void main(String[] args) {
        long unbufferedTime = copyUsingUnbufferedStreams();
        System.out.println("Time taken with Unbuffered Streams: " + unbufferedTime + " ns");

        long bufferedTime = copyUsingBufferedStreams();
        System.out.println("Time taken with Buffered Streams: " + bufferedTime + " ns");

        System.out.println("\nPerformance Comparison:");
        if (bufferedTime < unbufferedTime) {
            System.out.println(" Buffered Streams are faster by " + (unbufferedTime - bufferedTime) + " ns");
        } else {
            System.out.println("⚠ Unbuffered Streams performed better (unlikely, but possible).");
        }
    }
    }


