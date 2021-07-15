package Pruebas3;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOWritingUsingMappedChannelDemo {
	public static void main(String args[]) {
		try(FileChannel fc = (FileChannel) Files.newByteChannel(Path.of("test.txt"), 
				StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
			MappedByteBuffer buff = fc.map(FileChannel.MapMode.READ_WRITE, 0, 26);
			
			for(int i = 0; i < 26; i++) {
				buff.put((byte)('A' + i));
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error " + e);
		}
	}
}
