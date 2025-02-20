package piped_stream_inter_thread_communication;

import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());
            outputStream.close(); // Close stream after writing
        } catch (IOException e) {
            System.err.println("WriterThread Error: " + e.getMessage());
        }
    }
}
