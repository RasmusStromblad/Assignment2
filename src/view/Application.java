package view;
import backend.Controller;
import backend.ErrorHandler;
import backend.DataAccessLayer;

public class Application {
	
	public static void main(String[]args) {
			
			DataAccessLayer dataAccessLayer = new DataAccessLayer();
			Frame frame = new Frame();
			ErrorHandler errorHandler = new ErrorHandler();
			
			Controller controller = new Controller(dataAccessLayer, frame, errorHandler);
			frame.setVisible(true);
		}
}
