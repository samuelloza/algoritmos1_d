package week1;

import java.io.File;

public class folder_recursivo {

	public static void main(String[] args) {
		File root = new File("/home/sam/JalaU/aaaa");
		recursive_file(root, "|");

	}
	
	public static void recursive_file(File file, String indent) {
		//caso base
		// es archivo?
		if (file.isDirectory() == false) {
			System.out.println(indent + "-" + file.getName());
			return;
		} else {
			System.out.println(indent + "-" + file.getName());
			if (file.isDirectory()) {
				File [] files = file.listFiles();
				for( File f: files) {
					recursive_file(f, indent + "-");
				}
			}
		}
	}
}
