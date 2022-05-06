// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest


import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksMyTest() throws IOException {
        Path fileName = Path.of("./MyTest.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://google.com", "google.html", "abc.com");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksFarApart() throws IOException {
        Path fileName = Path.of("./FarApart.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksImage() throws IOException {
        Path fileName = Path.of("./ImageReference.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("./test-file2.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://something.com", "some-page.html");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("./test-file3.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("./test-file4.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("./test-file5.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("./test-file6.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("./test-file7.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("./test-file8.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks9() throws IOException {
        Path fileName = Path.of("./test-file9.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }




}
