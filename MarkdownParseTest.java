import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksMyTest() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/MyTest.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://google.com", "google.html", "abc.com");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksFarApart() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/FarApart.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksImage() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/ImageReference.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of("https://something.com", "some-page.html");
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("/Users/Anthony/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        List<String> expectedList = List.of();
        assertEquals(expectedList, MarkdownParse.getLinks(content));
    }

}
