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
		case 2627:
			// If errorCode is 2627 (pk_issue), check for specific string in error message.
			// Return correct message to the user
			if (sqlException.getMessage().contains("uq_studentEmail")) {
				errorMessage = "The mail address is already in use";
			} else if (sqlException.getMessage().contains("pk_student")) {
				errorMessage = "Student with that studentID already exists";
			} else if (sqlException.getMessage().contains("pk_course")) {
				errorMessage = "Course with that course code already exists";
			}
			break;
		case 515:
			errorMessage = "Value cannot be empty";
			break;
		case 2628:
			if (sqlException.getMessage().contains("courseName")) {
				errorMessage = "Course name to long. Please try again. Maximum amount of letters: 50";
			} else {
				errorMessage = "Maximum letters for text fields: 50";
			}
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