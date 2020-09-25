package backend;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import view.Frame;

public class Controller {

	private DataAccessLayer dataAccessLayer;
	private Frame frame;
	private ErrorHandler errorHandler;

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

	public Controller(DataAccessLayer dataAccessLayer, Frame frame, ErrorHandler errorHandler) {
		this.frame = frame;
		this.dataAccessLayer = dataAccessLayer;
		this.errorHandler = errorHandler;

		declareEvents();
	}

	public void declareEvents() {
		
		// Go from assignment 2 to 3
		frame.getBtn_assignment3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get source of the action listener from paremeter e and close it
				Container window = ((JButton) e.getSource()).getParent();
				window.setVisible(false);
				
				frame.getPanel_contentAssignment2().setVisible(true);
			}
		});
		
		// Go from assignment 3 to 2
				frame.getBtn_assignment2().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Get source of the action listener from paremeter e and close it
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
					keysResultSet = dataAccessLayer.getAllKeys();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 2
		frame.getBtn_getTableConstraints().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getTableConstraints();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 3.1
		frame.getBtn_getAllTables().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getAllTablesInDatabse();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 3.2
		frame.getBtn_getAllTables2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getAllTablesInDatabse2();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 4.1
		frame.getBtn_getColumnsFromEmployee().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getColumnsOfEmployeeTable();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 4.2
		frame.getBtn_getColumnsFromEmploee2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getColumnsOfEmployeeTable2();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 5
		frame.getBtn_getMetadata().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getMetaData();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 6
		frame.getBtn_getLargestTable().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getTableWithMostRows();
					updateTableModel(frame.getTableModel_content(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// Assignment 3

		// 1
		frame.getBtn_nokSek().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getNOKToSEK();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 2
		frame.getBtn_mostExpensiveValue().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getMostExpensiveValue();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 3
		frame.getBtn_fotografernaLocation().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getFotografernaLocation();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 4
		frame.getBtn_sickEmployees().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getSickEmployees();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 5
		frame.getBtn_familyRelations().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getFamilyrelation();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 6
		frame.getBtn_aBerglundsEmployees().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getABerglundsCustomers();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// 7
		frame.getBtn_customerAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet keysResultSet;
				try {
					keysResultSet = dataAccessLayer.getAccountsForCustomer();
					updateTableModel(frame.getTableModel_contentAssignment2(), keysResultSet);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
			// TODO Auto-generated catch block
			// String errorMessage = errorHandler.getError(sqlException);
			// FIXA
		}
	}

}
