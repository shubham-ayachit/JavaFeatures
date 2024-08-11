package java11features;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Java11FeaturesMain {

    public static void main(String[] args) {
        System.out.println("Java 11 Features");
        System.out.println("1. Local-Variable Syntax for Lambda Parameters");
        // Before Java 11
        //    List<String> list = Arrays.asList("a", "b", "c");
        //    list.forEach(s -> System.out.println(s));
        // After Java 11
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach((var s) -> System.out.println(s));

        System.out.println("2. String Methods");
        System.out.println("isBlank() method");
        String str = "  ";
        System.out.println(str.isBlank()); //true
        System.out.println("strip() method");
        String str1 = "  Shubham  ";
        System.out.println(str1.strip()); //Shubham
        System.out.println("stripLeading() method");
        String str2 = "  Shubham  ";
        System.out.println(str2.stripLeading()); //Shubham
        System.out.println("stripTrailing() method");
        String str3 = "  Shubham  ";
        System.out.println(str3.stripTrailing()); //  Shubham
        System.out.println("repeat() method");
        String str4 = "Shubham ";
        System.out.println(str4.repeat(3)); //Shubham Shubham Shubham

        System.out.println("3. Optional Enhacements");
        // Before Java 11
        //    Optional<String> optional = Optional.of("Shubham");
        //    System.out.println(optional.isEmpty());
        // After Java 11
        var optional = java.util.Optional.of("Shubham");
        System.out.println(optional.isEmpty());

        System.out.println("4. HTTP Client");
        //Uses HTTP/2 and WebSocket
        //Supports both synchronous and asynchronous programming
        //Supports both HTTP and HTTPS
        //Supports both HTTP/1.1 and HTTP/2
        //Supports both WebSocket and Server-Sent Events (SSE)
        //Supports both HTTP/2 server push and HTTP/2 multiplexing
        //Supports both HTTP/2 prioritization and HTTP/2 flow control
        //Supports both HTTP/2 request and response streams
        //Supports both HTTP/2 connection and session management
        //Supports both HTTP/2 request and response headers
        //Supports both HTTP/2 request and response bodies
        //Supports both HTTP/2 request and response trailers

        //Before Java 11, the HttpURLConnection class was used to send HTTP requests and receive HTTP responses.
        //Third-party libraries like Apache HttpClient, OkHttp, and Retrofit were used to send HTTP requests and receive HTTP responses.

        //Java 11 introduced a new HTTP client API in the java.net.http package.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("http://echo.jsontest.com/title/ipsum/content/blah"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("5. Files Methods");
        //Java 11 introduced several new methods in the java.nio.file.Files class.
        //The Files.readString() method reads the contents of a file into a string.
        try {
            String string = Files.readString(Paths.get("resources\\file.txt"));
            System.out.println(string);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        //The Files.writeString() method writes a string to a file.
        try {
            Files.writeString(Paths.get("resources\\file.txt"), "Hello, World!");
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        //The Files.readAllLines() method reads all lines from a file into a list of strings.
        try {
            List<String> lines = Files.readAllLines(Paths.get("resources\\file.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        //The Files.write() method writes a list of strings to a file.
        try {
            List<String> lines = Arrays.asList("Hello", "World");
            Files.write(Paths.get("resources\\file.txt"), lines);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        //The Files.readAllLines() method reads all lines from a file into a list of strings.
        try {
            List<String> lines = Files.readAllLines(Paths.get("resources\\file.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        //Java 11 introduced running a single-file program using the java command without compiling it first.
        //The java command can run a single-file program without compiling it first.
        //The java command reads the source code from the file and compiles it in memory.
        //The java command runs the compiled code.
        //Example: java src/java11features/Java11FeaturesMain.java
        //No need to javac Java11FeaturesMain.java before running the program.


    }

}
