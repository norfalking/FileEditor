package gui;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.Application;

public class Window extends JFrame {
	
	// constructors
	public Window() {
		this.setTitle(Application.getTitle() + " v" + Application.getVersion());
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.loadMenuBar();
		
		this.setVisible(true);
	}
	
	
	
	// methods
	private void loadMenuBar() {	
		
		// File Menu Items
		JMenuItem menuItem_new = new JMenuItem("New");
		menuItem_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO create a new file
			}					
		});

		JMenuItem menuItem_open = new JMenuItem("Open");
		menuItem_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO open a specified file
			}					
		});
		
		JMenuItem menuItem_close = new JMenuItem("Close");
		menuItem_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO close the current file
			}					
		});
		
		JMenuItem menuItem_closeAll = new JMenuItem("Close All");
		menuItem_closeAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO close all the files
			}					
		});
		
		JMenuItem menuItem_save = new JMenuItem("Save");
		menuItem_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO save the current file with the current path
			}					
		});
		
		JMenuItem menuItem_saveAs = new JMenuItem("Save As");
		menuItem_saveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO save the current file with a specified path
			}					
		});
		
		JMenuItem menuItem_saveAll = new JMenuItem("Save All");
		menuItem_saveAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO save all the files with their current paths
			}					
		});
		
		JMenuItem menuItem_rename = new JMenuItem("Rename");
		menuItem_rename.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO rename the current file
			}					
		});
		
		JMenuItem menuItem_print = new JMenuItem("Print");
		menuItem_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO print the current file
			}					
		});
		
		JMenuItem menuItem_properties = new JMenuItem("Properties");
		menuItem_properties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO 
			}					
		});
	
		JMenuItem menuItem_exit = new JMenuItem("Exit");
		menuItem_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}					
		});
			
		// File Menu
		JMenu menu_file = new JMenu("File");
		menu_file.add(menuItem_new);
		menu_file.add(menuItem_open);
		menu_file.addSeparator();
		menu_file.add(menuItem_close);
		menu_file.add(menuItem_closeAll);
		menu_file.addSeparator();
		menu_file.add(menuItem_save);
		menu_file.add(menuItem_saveAs);
		menu_file.add(menuItem_saveAll);
		menu_file.addSeparator();
		menu_file.add(menuItem_rename);
		menu_file.add(menuItem_print);
		menu_file.addSeparator();
		menu_file.add(menuItem_properties);
		menu_file.addSeparator();
		menu_file.add(menuItem_exit);
			
		// Menu Bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu_file);
		
		this.setJMenuBar(menuBar);
	}

}
