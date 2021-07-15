package Pruebas3;
import java.io.*;
import java.nio.file.*;

// A diferencia del NIO que usaba MapByte o SeekableByte o FileChannel o MappedChannel,
// al usar el Stream para escribir sobre escribimnos el archivo al completo, 
// no solo los bytes seleccionados.
public class NIOStreamWriteDemo {
	public static void main(String args[]) {
		try(OutputStream ops = new BufferedOutputStream(
				Files.newOutputStream(Path.of("test.txt")))) {
			for(int i = 0; i < 26; i++) {
				ops.write((byte)('A' + i));
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error " + e);
		}
	}
}
