/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author pradeep
 */
class Notepad implements ActionListener {
    
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help ;
    JMenuItem cut,copy,paste,select ;
    JTextArea ta ;
    
    Notepad()
    {
        f = new JFrame() ;
        
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        select = new JMenuItem("Select-All");
        
        
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        select.addActionListener(this);
        
        mb = new JMenuBar();
        mb.setBounds(5,5,400,30);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        
        mb.add(file);
        mb.add(edit);
        mb.add(select);
        mb.add(help);
        
        
        ta = new JTextArea() ;
        ta.setBounds(5,40,800,600);
        
        f.add(mb);
        f.add(ta);
        
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Notepad();
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if( e.getSource() == cut )
            ta.cut();
        if( e.getSource() == copy )
            ta.copy();
        if( e.getSource() == paste )
            ta.paste();
        if( e.getSource() == select )
            ta.selectAll();
    }
    
}
