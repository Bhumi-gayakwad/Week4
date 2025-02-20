package piped_stream_inter_thread_communication;


import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\nReading completed.");
            inputStream.close(); // Close stream after reading
        } catch (IOException e) {
            System.err.println("ReaderThread Error: " + e.getMessage());
        }
    }
}
