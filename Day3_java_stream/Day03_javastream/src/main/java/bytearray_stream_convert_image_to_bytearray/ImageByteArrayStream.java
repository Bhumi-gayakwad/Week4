package bytearray_stream_convert_image_to_bytearray;

import java.io.*;

public class ImageByteArrayStream {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/bytearray_stream_convert_image_to_bytearray/input.jpg";  // Original image file
        String outputImagePath = "src/main/java/bytearray_stream_convert_image_to_bytearray/output.jpg"; // New image file after conversion

        try {
            // Read the image file into a byte array
            FileInputStream fis = new FileInputStream(inputImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();

            byte[] imageBytes = baos.toByteArray(); // Convert image to byte array

            // Write the byte array back to a new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImagePath);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            bais.close();

            System.out.println("Image successfully converted to byte array and written back!");

        } catch (IOException e) {
            System.out.println("Error processing the image: " + e.getMessage());
        }
    }
}

