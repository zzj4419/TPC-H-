package mysql2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {
	public Table(DefaultTableModel tm) {
		// TODO Auto-generated constructor stub
		super(tm);
	}

	public boolean isCellEditable(int row,int column)
	{
		return false;
	}
}
