package Pruebas3;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOMapByteBufferFileChannelDemo {
	public static void main(String args[]) {
		try(FileChannel fc = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {
			long fcSize = fc.size();
			MappedByteBuffer buff = fc.map(FileChannel.MapMode.READ_ONLY, 0, fcSize);
			
			for(int i = 0; i < fcSize; i++) {
				System.out.println((char) buff.get());
			}
			System.out.println();
		} catch(InvalidPathException e) {
			
		} catch(IOException e) {
			
		}
	}
}
