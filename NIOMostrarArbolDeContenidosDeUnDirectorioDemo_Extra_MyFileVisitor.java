package Pruebas3;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class NIOMostrarArbolDeContenidosDeUnDirectorioDemo_Extra_MyFileVisitor 
	extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path path, BasicFileAttributes att) throws IOException {
		System.out.println(path);
		return FileVisitResult.CONTINUE;
	}
}
