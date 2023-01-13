package projeto_curso_em_ingles.menuBars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JLabel label;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadMenuItem;
    JMenuItem saveMenuItem;
    JMenuItem exitMenuItem;

    JMenuItem cutMenuItem;
    JMenuItem copyMenuItem;
    JMenuItem pathMenuItem;

    JMenuItem findMenuItem;
    JMenuItem helpMenuItem;
    JMenuItem aboutMenuItem;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel(" ");
        label.setBounds(50,50,100,30);
        label.setLayout(new FlowLayout());
        label.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        menuBar = new JMenuBar();

        fileMenu = new JMenu("Files");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadMenuItem = new JMenuItem("Load");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pathMenuItem = new JMenuItem("Path");

        findMenuItem = new JMenuItem("Find");
        helpMenuItem = new JMenuItem("Help");
        aboutMenuItem = new JMenuItem("About");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadMenuItem.setMnemonic(KeyEvent.VK_L);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.setMnemonic(KeyEvent.VK_E);

        cutMenuItem.setMnemonic(KeyEvent.VK_C);
        copyMenuItem.setMnemonic(KeyEvent.VK_C);
        pathMenuItem.setMnemonic(KeyEvent.VK_P);

        findMenuItem.setMnemonic(KeyEvent.VK_F);
        helpMenuItem.setMnemonic(KeyEvent.VK_H);
        aboutMenuItem.setMnemonic(KeyEvent.VK_A);

        loadMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        cutMenuItem.addActionListener(this);
        copyMenuItem.addActionListener(this);
        pathMenuItem.addActionListener(this);
        findMenuItem.addActionListener(this);
        helpMenuItem.addActionListener(this);
        aboutMenuItem.addActionListener(this);

        fileMenu.add(loadMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pathMenuItem);

        helpMenu.add(findMenuItem);
        helpMenu.add(helpMenuItem);
        helpMenu.add(aboutMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.add(label);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadMenuItem){
            label.setText("Load");
            System.out.println("Load");
        }else if (e.getSource()==saveMenuItem){
            label.setText("Save");
            System.out.println("Save");
        }else if (e.getSource()==exitMenuItem){
            label.setText("Exit");
            System.out.println("Exit");
        }else if (e.getSource()==cutMenuItem){
            label.setText("Cut");
            System.out.println("Cut");
        }else if (e.getSource()==copyMenuItem){
            label.setText("Copy");
            System.out.println("Copy");
        }else if (e.getSource()==pathMenuItem){
            label.setText("Path");
            System.out.println("Path");
        }else if (e.getSource()==findMenuItem){
            label.setText("Find");
            System.out.println("Find");
        }else if (e.getSource()==helpMenuItem){
            label.setText("Help");
            System.out.println("Help");
        }else if (e.getSource()==aboutMenuItem){
            label.setText("About");
            System.out.println("About");
        }
    }
}
