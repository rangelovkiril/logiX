package src;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        try (var exec = Executors.newVirtualThreadPerTaskExecutor()) {
            exec.submit(() -> {
                Path file = Path.of("./logs/example.log");
                while (true) {
                    try {
                        String content = Files.readString(file);
                        System.out.println(content);
                        Thread.sleep(3000); 
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
