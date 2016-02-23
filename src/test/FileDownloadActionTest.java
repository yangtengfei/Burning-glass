import java.io.InputStream;

import com.tengfeiyang.action.FileDownloadAction;


public class FileDownloadActionTest {

	public static void main(String[] args) throws Exception {
		FileDownloadAction action = new FileDownloadAction();
		action.setFileName("Java");
		InputStream stream = action.getDownloadFile();
		
		System.out.println(stream + "==");
	}

}
