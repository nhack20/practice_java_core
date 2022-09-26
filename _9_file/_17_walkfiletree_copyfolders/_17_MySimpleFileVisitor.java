package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._17_walkfiletree_copyfolders;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class _17_MySimpleFileVisitor extends SimpleFileVisitor<Path> {
    Path from; //source
    Path to; //destination

    public _17_MySimpleFileVisitor(Path from, Path to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = to.resolve(from.relativize(dir));
        Files.copy(dir, newDestination);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        Path newDestination = to.resolve(from.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }
}
