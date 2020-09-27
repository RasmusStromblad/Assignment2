package backend;

import java.sql.SQLException;

public class ErrorHandler {

	// Function to return error message later to be used in the controller
	public String getError(SQLException sqlException) {
		// Get the errorCode from the parameter
		int errorCode = sqlException.getErrorCode();
		String errorMessage = "";

		// Switch case to determine witch error message to return, depending on the
		// error code
		switch (errorCode) {
		case 515:
			errorMessage = "Value cannot be empty";
			break;
		case 0:
			errorMessage = "Connection lost. Please check your internet connection";
			break;
		default:
			errorMessage = "Something went wrong. Please try again";
			break;
		}

		return errorMessage;
	}
}