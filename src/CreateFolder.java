import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		File folder = new File("MyFolder");
		if(!folder.exists()) {
			if(folder.mkdir()) {
				System.out.println("Folder Created");
			} else {
				System.out.println("Failed to Create Folder");
			}
		}

	}

}
