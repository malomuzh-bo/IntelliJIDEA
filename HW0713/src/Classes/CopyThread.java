package Classes;

import java.nio.file.*;
import java.io.*;

public class CopyThread extends Thread{
    private File dir;
    private File newDir;

    public CopyThread(File sourceDirectory, File destinationDirectory) {
        this.dir = sourceDirectory;
        this.newDir = destinationDirectory;
    }

    @Override
    public void run() {
        try {
            copyDirectory(dir.toPath(), newDir.toPath());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void copyDirectory(Path sourcePath, Path destinationPath) throws IOException {
        Files.walk(sourcePath)
                .forEach(q -> {
                    Path dest = destinationPath.resolve(sourcePath.relativize(q));
                    try {
                        if (Files.isDirectory(q)) {
                            Files.createDirectories(dest);
                        } else {
                            Files.copy(q, dest, StandardCopyOption.REPLACE_EXISTING);
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                });
    }
}
