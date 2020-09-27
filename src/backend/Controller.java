package backend;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import view.Frame;

public class Controller {

	// Declare variables

	private DataAccessLayer dataAccessLayer;
	private Frame frame;
	private ErrorHandler errorHandler;

	// Get and set methods

	public DataAccessLayer getDataAccessLayer() {
		return dataAccessLayer;
	}

	public void setDataAccessLayer(DataAccessLayer dataAccessLayer) {
		this.dataAccessLayer = dataAccessLayer;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	// Constructor for Controller class
	public Controller(DataAccessLayer dataAccessLayer, Frame frame, ErrorHandler errorHandler) {
		this.frame = frame;
		this.dataAccessLayer = dataAccessLayer;
		this.errorHandler = errorHandler;

		declareEvents();
	}

	// Gather all application interaction
	public void declareEvents() {

		// Go from assignment 2 to 3
		frame.getBtn_assignment3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get source of the action listener from parameter e and close it
				Container window = ((JButton) e.getSource()).getParent();
				window.setVisible(false);

				frame.getPanel_contentAssignment2().setVisible(true);
			}
		});

		// Go from assignment 3 to 2
		frame.getBtn_assignment2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get source of the action listener from parameter e and close it
				Container window = ((JButton) e.getSource()).getParent();
				window.setVisible(false);

				frame.getPanel_contentAssignment1().setVisible(true);
			}
		});

		// 1
		frame.getBtn_getKeys().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getAllKeys();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 2
		frame.getBtn_getTableConstraints().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getTableConstraints();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 3.1
		frame.getBtn_getAllTables().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getAllTablesInDatabse();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 3.2
		frame.getBtn_getAllTables2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getAllTablesInDatabse2();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 4.1
		frame.getBtn_getColumnsFromEmployee().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getColumnsOfEmployeeTable();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 4.2
		frame.getBtn_getColumnsFromEmploee2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getColumnsOfEmployeeTable2();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 5
		frame.getBtn_getMetadata().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getMetaData();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 6
		frame.getBtn_getLargestTable().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getTableWithMostRows();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// Assignment 3

		// 1
		frame.getBtn_nokSek().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getNOKToSEK();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 2
		frame.getBtn_mostExpensiveValue().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getMostExpensiveValue();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 3
		frame.getBtn_fotografernaLocation().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getFotografernaLocation();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 4
		frame.getBtn_sickEmployees().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getSickEmployees();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 5
		frame.getBtn_familyRelations().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getFamilyrelation();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 6
		frame.getBtn_aBerglundsEmployees().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getABerglundsCustomers();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

		// 7
		frame.getBtn_customerAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					// Create a result set containing return value from the dataAccessLayer function
					keysResultSet = dataAccessLayer.getAccountsForCustomer();
					// Update the table to contain the data from the result set
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException sqlException) {
					// Tell the user if something goes wrong
					String errorMessage = errorHandler.getError(sqlException);
					if (sqlException.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, errorMessage);
					} else {
						frame.getLbl_assignment1Response().setForeground(Color.red);
						frame.getLbl_assignment1Response().setText(errorMessage);
					}
				}
			}
		});

	}

	public void updateTableModel(DefaultTableModel tableModel, ResultSet rs) {
		// Reset the table inserted
		tableModel.setRowCount(0);
		tableModel.setColumnCount(0);

		try {
			// Retrieve meta data from the getCoursesStudiedForStudent result set
			ResultSetMetaData metaData = rs.getMetaData();

			// Get number of columns from the meta data
			int columnCount = metaData.getColumnCount();

			// Get column names from meta data and add to model
			for (int i = 1; i <= columnCount; i++) {
				tableModel.addColumn(metaData.getColumnLabel(i));
			}

			// Create array of objects with the size of the column count
			Object[] rowData = new Object[columnCount];

			// Scroll through result set
			while (rs.next()) {
				for (int i = 0; i < columnCount; i++) {
					// Create the row data later to be displayed in the table
					rowData[i] = rs.getObject(i + 1);
				}

				// Add the data to the table
				tableModel.addRow(rowData);
			}
		} catch (SQLException sqlException) {

		}
	}

}
