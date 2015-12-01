/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Claudio
 */
public class FilesLib {
    public static void creteDir(String filename) throws IOException {
        Path path = Paths.get(filename);
        Files.createDirectories(path.getParent());
    }
    
    public static void creteFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        if (Files.exists(path) == false) {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
        }
    }

    public static void deleteFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        if (Files.exists(path) == true) {
            Files.delete(path);
        }
    }
}
