package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAccessLayer {

	// Set url to database
	String url = "jdbc:sqlserver://localhost:1433;database=CRONOS";

	// Assignment 2

	// Functions to execute querys in the database. All functions calls either
	// executeQuery or executeUpdate depending on return value. This is done to
	// prevent code repeating

	// 1 -
	public ResultSet getAllKeys() throws SQLException {
		String query = "SELECT \r\n" + "DISTINCT\r\n" + "CONSTRAINT_NAME AS 'KEY',\r\n"
				+ "TABLE_SCHEMA AS 'Schema',\r\n" + "TABLE_NAME AS 'TableName'\r\n"
				+ "FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE";
		return executeQuery(query);
	}

	// 2 -
	public ResultSet getTableConstraints() throws SQLException {
		String query = "SELECT type, name, type_desc\r\n" + "FROM sys.objects\r\n"
				+ "WHERE type_desc LIKE '%Constraint'";
		return executeQuery(query);
	}

	// 3.1 -
	public ResultSet getAllTablesInDatabse() throws SQLException {
		String query = "SELECT TABLE_NAME AS 'Table Name' \r\n" + "FROM INFORMATION_SCHEMA.TABLES";
		return executeQuery(query);
	}

	// 3.2 -
	public ResultSet getAllTablesInDatabse2() throws SQLException {
		String query = "SELECT name AS 'Table Name'\r\n" + "FROM sysobjects \r\n" + "WHERE xtype = 'U'";
		return executeQuery(query);
	}

	// 4.1 -
	public ResultSet getColumnsOfEmployeeTable() throws SQLException {
		String query = "SELECT COLUMN_NAME\r\n" + "FROM INFORMATION_SCHEMA.COLUMNS\r\n"
				+ "WHERE TABLE_NAME = 'CRONUS Sverige AB$Employee'";
		return executeQuery(query);
	}

	// 4.2 -
	public ResultSet getColumnsOfEmployeeTable2() throws SQLException {
		String query = "SELECT name\r\n" + "FROM sys.columns \r\n"
				+ "WHERE object_id = OBJECT_ID('CRONUS Sverige AB$Employee')";
		return executeQuery(query);
	}

	// 5 -
	public ResultSet getMetaData() throws SQLException {
		String query = "SELECT *\r\n" + "FROM INFORMATION_SCHEMA.TABLES\r\n"
				+ "WHERE TABLE_NAME LIKE 'CRONUS Sverige AB$Employee%'";
		return executeQuery(query);
	}

	// 6 -
	public ResultSet getTableWithMostRows() throws SQLException {
		String query = "SELECT TOP 1 [TableName] = so.name, [RowCount] = MAX(si.rows) \r\n"
				+ "FROM sysobjects so, sysindexes si \r\n" + "WHERE so.xtype = 'U' AND \r\n"
				+ "si.id = OBJECT_ID(so.name) \r\n" + "GROUP BY \r\n" + "so.name \r\n" + "ORDER BY \r\n" + "2 DESC";
		return executeQuery(query);
	}

	// Global function to execute querys inserted as parameter
	public ResultSet executeQuery(String queryToExecute) throws SQLException {
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

		String user = "user";
		String password = "userpass";

		// Create a connection to the database
		Connection con = DriverManager.getConnection(url, user, password);

		// Create a connection to the database Connection con
		DriverManager.getConnection(url, user, password);

		PreparedStatement ps = con.prepareStatement(queryToExecute);

		ResultSet result = ps.executeQuery();

		return result;
	}

}
