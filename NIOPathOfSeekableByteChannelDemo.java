package Pruebas3;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class NIOPathOfSeekableByteChannelDemo {
	public static void main(String args[]) {
		int count;
		Path filepath = null;
		
		try {
			filepath = Path.of("test.txt");
			System.out.println(filepath.toAbsolutePath());
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
			return;
		}
		
		try(SeekableByteChannel sbc = Files.newByteChannel(filepath)) {
			ByteBuffer buff = ByteBuffer.allocate(128);
			do {
				count = sbc.read(buff);
				if (count != -1) {
					buff.rewind();
					for(int i = 0; i < count; i++) {
						System.out.println((char) buff.get());
					}
				}
			} while(count != -1);
		} catch(IOException e) {
			System.out.println("I/O Error " + e);		}
	}
}
