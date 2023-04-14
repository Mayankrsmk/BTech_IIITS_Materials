import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.*;
public class FileNIOExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./buffered_output.txt");
		BufferedWriter bw=null;
		if(Files.exists(path)) {
			bw = Files.newBufferedWriter(path,StandardOpenOption.APPEND);
			System.out.println("File exists");
			
		}
		else {
			bw = Files.newBufferedWriter(path,StandardOpenOption.CREATE_NEW);
			System.out.println("File created");
		}
		bw.write("one\n");
		bw.write("two\n");
		bw.write("three\n");
		bw.close();
		
		BufferedReader br = Files.newBufferedReader(path);
		String line;
		while((line =br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
