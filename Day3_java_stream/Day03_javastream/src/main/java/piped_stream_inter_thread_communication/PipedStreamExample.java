package piped_stream_inter_thread_communication;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class PipedStreamExample {

        public static void main(String[] args) {
            try {
                PipedOutputStream outputStream = new PipedOutputStream();
                PipedInputStream inputStream = new PipedInputStream(outputStream); // Connecting both streams

                WriterThread writer = new WriterThread(outputStream);
                ReaderThread reader = new ReaderThread(inputStream);

                writer.start();
                reader.start();

            } catch (IOException e) {
                System.err.println("Error initializing piped streams: " + e.getMessage());
            }
        }
}
