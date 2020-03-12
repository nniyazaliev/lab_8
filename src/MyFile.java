import java.io.*;

class MyFile {
    public static void main(String[] args) throws IOException {
        String sline;
        int c = 0;

            FileInputStream sourceFile = new FileInputStream("C:\\Users\\nurbo\\IdeaProjects\\JavaLabs\\lab_8\\src\\input.txt");
            BufferedReader bufferFile = new BufferedReader(new InputStreamReader(sourceFile));
            while ((sline = bufferFile.readLine()) != null) {
                sline = sline.replaceAll("[^ a-zA-Z]", "");
                for (String word : sline.split(" ")) {
                    if (word.length() < 5) {
                        System.out.println(word);
                        c++;
                    }
                }
            }

            System.out.println("Numbers of words, where word.length < 5: " + c);

            System.out.println("File Not Found");
            System.exit(0);
    }
}
