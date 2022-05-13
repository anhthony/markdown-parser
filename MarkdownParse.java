//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            if(openBracket == -1 || closeBracket == -1 || openParen == -1 || closeParen == 1)
            {
                break;
            }
            //account for a starting white space before the link
            else if((openBracket - 1) < 0)
            {
                break;
            }
            //check if it's an image
            if((markdown.substring(openBracket -1, openBracket).equals("!"))) 
            {
                
            }
            //check that it is a link by having "](" next together
            else if(!markdown.substring(closeBracket + 1, closeBracket+2).equals("("))
            {
                
            }
            else 
            {

                String link = markdown.substring(openParen + 1, closeParen);
                //check that it is a link because links have a "."
                if(link.indexOf(".") != -1)
                {
                    toReturn.add(link);
                }
            }
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        }
}
