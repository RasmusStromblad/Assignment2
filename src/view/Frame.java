package view;

import backend.Controller;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.CardLayout;

public class Frame extends JFrame {

	private Controller controller;
	private JFrame frame;
	private JTable table_content;
	private JPanel panel_contentAssignment1;
	private JScrollPane scrollPane_content;
	private DefaultTableModel tableModel_content;
	private JButton btn_getKeys;
	private JButton btn_getTableConstraints;
	private JButton btn_getAllTables;
	private JButton btn_getAllTables2;
	private JButton btn_getColumnsFromEmployee;
	private JButton btn_getColumnsFromEmploee2;
	private JButton btn_getMetadata;
	private JButton btn_getLargestTable;
	private JPanel panel_contentAssignment2;
	private JTable table_contentAssignment2;
	private JScrollPane scrollPane_contentAssignment2;
	private JButton btn_nokSek;
	private JButton btn_mostExpensiveValue;
	private JButton btn_fotografernaLocation;
	private JButton btn_sickEmployees;
	private JButton btn_familyRelations;
	private JButton btn_aBerglundsEmployees;
	private JButton btn_customerAccount;
	private JButton btn_assignment3;
	private JButton btn_assignment2;
	private DefaultTableModel tableModel_contentAssignment2;

	public Frame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));

		panel_contentAssignment1 = new JPanel();
		getContentPane().add(panel_contentAssignment1, "name_968404127355300");
		panel_contentAssignment1.setLayout(null);

		scrollPane_content = new JScrollPane();
		scrollPane_content.setBounds(10, 50, 800, 400);
		panel_contentAssignment1.add(scrollPane_content);

		table_content = new JTable(tableModel_content);
		scrollPane_content.setViewportView(table_content);

		btn_getKeys = new JButton("Get keys");
		btn_getKeys.setBounds(10, 471, 152, 23);
		panel_contentAssignment1.add(btn_getKeys);

		btn_getTableConstraints = new JButton("Get table constraints");
		btn_getTableConstraints.setBounds(10, 505, 154, 23);
		panel_contentAssignment1.add(btn_getTableConstraints);

		btn_getAllTables = new JButton("Get all tables");
		btn_getAllTables.setBounds(226, 471, 143, 23);
		panel_contentAssignment1.add(btn_getAllTables);

		btn_getAllTables2 = new JButton("Get all tables 2");
		btn_getAllTables2.setBounds(226, 505, 143, 23);
		panel_contentAssignment1.add(btn_getAllTables2);

		btn_getColumnsFromEmployee = new JButton("Get columns from employee");
		btn_getColumnsFromEmployee.setBounds(435, 471, 177, 23);
		panel_contentAssignment1.add(btn_getColumnsFromEmployee);

		btn_getColumnsFromEmploee2 = new JButton("Get columns from employee 2");
		btn_getColumnsFromEmploee2.setBounds(435, 505, 177, 23);
		panel_contentAssignment1.add(btn_getColumnsFromEmploee2);

		btn_getMetadata = new JButton("Get metadata");
		btn_getMetadata.setBounds(662, 471, 132, 23);
		panel_contentAssignment1.add(btn_getMetadata);

		btn_getLargestTable = new JButton("Get largest table");
		btn_getLargestTable.setBounds(662, 505, 132, 23);
		panel_contentAssignment1.add(btn_getLargestTable);

		btn_assignment3 = new JButton("Go to assignment 3");
		btn_assignment3.setBounds(10, 11, 164, 23);
		panel_contentAssignment1.add(btn_assignment3);

		panel_contentAssignment2 = new JPanel();
		getContentPane().add(panel_contentAssignment2, "name_968404147739400");
		panel_contentAssignment2.setLayout(null);

		scrollPane_contentAssignment2 = new JScrollPane();
		scrollPane_contentAssignment2.setBounds(10, 50, 800, 400);
		panel_contentAssignment2.add(scrollPane_contentAssignment2);

		table_contentAssignment2 = new JTable(tableModel_contentAssignment2);
		scrollPane_contentAssignment2.setViewportView(table_contentAssignment2);

		btn_nokSek = new JButton("NOK -> SEK");
		btn_nokSek.setBounds(10, 471, 132, 23);
		panel_contentAssignment2.add(btn_nokSek);

		btn_mostExpensiveValue = new JButton("Most expensive value");
		btn_mostExpensiveValue.setBounds(166, 471, 189, 23);
		panel_contentAssignment2.add(btn_mostExpensiveValue);

		btn_fotografernaLocation = new JButton("Fotograferna location");
		btn_fotografernaLocation.setBounds(378, 471, 177, 23);
		panel_contentAssignment2.add(btn_fotografernaLocation);

		btn_sickEmployees = new JButton("Sick employees");
		btn_sickEmployees.setBounds(10, 505, 132, 23);
		panel_contentAssignment2.add(btn_sickEmployees);

		btn_familyRelations = new JButton("Family relations");
		btn_familyRelations.setBounds(582, 471, 132, 23);
		panel_contentAssignment2.add(btn_familyRelations);

		btn_aBerglundsEmployees = new JButton("A Berglunds employees");
		btn_aBerglundsEmployees.setBounds(378, 505, 177, 23);
		panel_contentAssignment2.add(btn_aBerglundsEmployees);

		btn_customerAccount = new JButton("Customer 10000 account");
		btn_customerAccount.setBounds(166, 505, 189, 23);
		panel_contentAssignment2.add(btn_customerAccount);

		btn_assignment2 = new JButton("Go to assignment 2");
		btn_assignment2.setBounds(10, 11, 164, 23);
		panel_contentAssignment2.add(btn_assignment2);

		tableModel_content = (DefaultTableModel) table_content.getModel();
		tableModel_contentAssignment2 = (DefaultTableModel) table_contentAssignment2.getModel();

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable_content() {
		return table_content;
	}

	public void setTable_content(JTable table_content) {
		this.table_content = table_content;
	}

	public JPanel getPanel_content() {
		return panel_contentAssignment1;
	}

	public void setPanel_content(JPanel panel_content) {
		this.panel_contentAssignment1 = panel_content;
	}

	public JScrollPane getScrollPane_content() {
		return scrollPane_content;
	}

	public void setScrollPane_content(JScrollPane scrollPane_content) {
		this.scrollPane_content = scrollPane_content;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public DefaultTableModel getTableModel_content() {
		return tableModel_content;
	}

	public void setTableModel_content(DefaultTableModel tableModel_content) {
		this.tableModel_content = tableModel_content;
	}

	public JButton getBtn_getKeys() {
		return btn_getKeys;
	}

	public void setBtn_getKeys(JButton btn_getKeys) {
		this.btn_getKeys = btn_getKeys;
	}

	public JButton getBtn_getTableConstraints() {
		return btn_getTableConstraints;
	}

	public void setBtn_getTableConstraints(JButton btn_getTableConstraints) {
		this.btn_getTableConstraints = btn_getTableConstraints;
	}

	public JButton getBtn_getAllTables() {
		return btn_getAllTables;
	}

	public void setBtn_getAllTables(JButton btn_getAllTables) {
		this.btn_getAllTables = btn_getAllTables;
	}

	public JButton getBtn_getAllTables2() {
		return btn_getAllTables2;
	}

	public void setBtn_getAllTables2(JButton btn_getAllTables2) {
		this.btn_getAllTables2 = btn_getAllTables2;
	}

	public JButton getBtn_getColumnsFromEmployee() {
		return btn_getColumnsFromEmployee;
	}

	public void setBtn_getColumnsFromEmployee(JButton btn_getColumnsFromEmployee) {
		this.btn_getColumnsFromEmployee = btn_getColumnsFromEmployee;
	}

	public JButton getBtn_getColumnsFromEmploee2() {
		return btn_getColumnsFromEmploee2;
	}

	public void setBtn_getColumnsFromEmploee2(JButton btn_getColumnsFromEmploee2) {
		this.btn_getColumnsFromEmploee2 = btn_getColumnsFromEmploee2;
	}

	public JButton getBtn_getMetadata() {
		return btn_getMetadata;
	}

	public void setBtn_getMetadata(JButton btn_getMetadata) {
		this.btn_getMetadata = btn_getMetadata;
	}

	public JButton getBtn_getLargestTable() {
		return btn_getLargestTable;
	}

	public void setBtn_getLargestTable(JButton btn_getLargestTable) {
		this.btn_getLargestTable = btn_getLargestTable;
	}

	public JPanel getPanel_contentAssignment1() {
		return panel_contentAssignment1;
	}

	public void setPanel_contentAssignment1(JPanel panel_contentAssignment1) {
		this.panel_contentAssignment1 = panel_contentAssignment1;
	}

	public JPanel getPanel_contentAssignment2() {
		return panel_contentAssignment2;
	}

	public void setPanel_contentAssignment2(JPanel panel_contentAssignment2) {
		this.panel_contentAssignment2 = panel_contentAssignment2;
	}

	public JTable getTable_contentAssignment2() {
		return table_contentAssignment2;
	}

	public void setTable_contentAssignment2(JTable table_contentAssignment2) {
		this.table_contentAssignment2 = table_contentAssignment2;
	}

	public JScrollPane getScrollPane_contentAssignment2() {
		return scrollPane_contentAssignment2;
	}

	public void setScrollPane_contentAssignment2(JScrollPane scrollPane_contentAssignment2) {
		this.scrollPane_contentAssignment2 = scrollPane_contentAssignment2;
	}

	public JButton getBtn_nokSek() {
		return btn_nokSek;
	}

	public void setBtn_nokSek(JButton btn_nokSek) {
		this.btn_nokSek = btn_nokSek;
	}

	public JButton getBtn_mostExpensiveValue() {
		return btn_mostExpensiveValue;
	}

	public void setBtn_mostExpensiveValue(JButton btn_mostExpensiveValue) {
		this.btn_mostExpensiveValue = btn_mostExpensiveValue;
	}

	public JButton getBtn_fotografernaLocation() {
		return btn_fotografernaLocation;
	}

	public void setBtn_fotografernaLocation(JButton btn_fotografernaLocation) {
		this.btn_fotografernaLocation = btn_fotografernaLocation;
	}

	public JButton getBtn_sickEmployees() {
		return btn_sickEmployees;
	}

	public void setBtn_sickEmployees(JButton btn_sickEmployees) {
		this.btn_sickEmployees = btn_sickEmployees;
	}

	public JButton getBtn_familyRelations() {
		return btn_familyRelations;
	}

	public void setBtn_familyRelations(JButton btn_familyRelations) {
		this.btn_familyRelations = btn_familyRelations;
	}

	public JButton getBtn_aBerglundsEmployees() {
		return btn_aBerglundsEmployees;
	}

	public void setBtn_aBerglundsEmployees(JButton btn_aBerglundsEmployees) {
		this.btn_aBerglundsEmployees = btn_aBerglundsEmployees;
	}

	public JButton getBtn_customerAccount() {
		return btn_customerAccount;
	}

	public void setBtn_customerAccount(JButton btn_customerAccount) {
		this.btn_customerAccount = btn_customerAccount;
	}

	public JButton getBtn_assignment3() {
		return btn_assignment3;
	}

	public void setBtn_assignment3(JButton btn_assignment3) {
		this.btn_assignment3 = btn_assignment3;
	}

	public JButton getBtn_assignment2() {
		return btn_assignment2;
	}

	public void setBtn_assignment2(JButton btn_assignment2) {
		this.btn_assignment2 = btn_assignment2;
	}

	public DefaultTableModel getTableModel_contentAssignment2() {
		return tableModel_contentAssignment2;
	}

	public void setTableModel_contentAssignment2(DefaultTableModel tableModel_contentAssignment2) {
		this.tableModel_contentAssignment2 = tableModel_contentAssignment2;
	}

}
