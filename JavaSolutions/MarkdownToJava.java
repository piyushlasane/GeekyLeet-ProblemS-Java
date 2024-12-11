import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class MarkdownToJava {
    public static void main(String[] args) {
        // Folder containing the .md files
        String sourceFolder = "E:\\Code Playground\\LeetCode-Java"; // Replace with the path to your .md files
        // Folder to save the extracted .java files
        String targetFolder = "JavaSolutions"; // You can change the folder name here

        try {
            // Create target folder if it doesn't exist
            Files.createDirectories(Paths.get(targetFolder));

            File folder = new File(sourceFolder);
            File[] files = folder.listFiles((_, name) -> name.endsWith(".md"));

            if (files != null) {
                for (File mdFile : files) {
                    String fileName = mdFile.getName().replace(".md", ".java");
                    File javaFile = new File(targetFolder + File.separator + fileName);
                    
                    // Read the .md file
                    String content = new String(Files.readAllBytes(mdFile.toPath()));

                    // Extract code blocks using regex
                    Pattern pattern = Pattern.compile("```java(.*?)```", Pattern.DOTALL);
                    Matcher matcher = pattern.matcher(content);

                    if (matcher.find()) {
                        String javaCode = matcher.group(1).trim();
                        // Write the extracted Java code to a .java file
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(javaFile))) {
                            writer.write(javaCode);
                            System.out.println("Saved Java code to: " + javaFile.getName());
                        }
                    } else {
                        System.out.println("No Java code found in: " + mdFile.getName());
                    }
                }
            } else {
                System.out.println("No .md files found in the specified directory.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
