package Pruebas3;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOWritingUsingFileChannelDemo {
	public static void main(String args[]) {
		try(FileChannel fc = (FileChannel) Files.newByteChannel(Path.of("test.txt"), 
				StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			ByteBuffer buff = ByteBuffer.allocate(26);
			
			for(int i = 0; i < 26; i++) {
				buff.put((byte)('A' + i));
			}
	
			for(int k = 0; k < 3; k++) {
				buff.rewind();
				fc.write(buff);
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error : " + e);
		} catch (IOException e) {
			System.out.println("I/O Error : " +e);
			System.exit(1);
		}
	}
}
