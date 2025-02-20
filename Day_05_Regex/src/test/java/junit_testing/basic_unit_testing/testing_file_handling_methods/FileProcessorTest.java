package junit_testing.basic_unit_testing.testing_file_handling_methods;



import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private static final String TEST_FILENAME = "testfile.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    @AfterEach
    void cleanUp() {
        File file = new File(TEST_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    @DisplayName("Test writing and reading from a file")
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, this is a test file!";
        fileProcessor.writeToFile(TEST_FILENAME, content);

        String readContent = fileProcessor.readFromFile(TEST_FILENAME);
        assertEquals(content, readContent, "The content read should match the written content.");
    }

    @Test
    @DisplayName("Test if the file exists after writing")
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILENAME, "Sample Content");

        File file = new File(TEST_FILENAME);
        assertTrue(file.exists(), "File should exist after writing.");
    }

    @Test
    @DisplayName("Test reading a non-existing file throws FileNotFoundException")
    void testReadNonExistingFile() {
        Exception exception = assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
        assertTrue(exception.getMessage().contains("File not found"), "Exception message should indicate file not found.");
    }
}
