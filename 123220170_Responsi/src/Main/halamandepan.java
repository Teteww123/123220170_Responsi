package Main;

import View.Mahasiswa.ViewData;
import View.Dosen.ViewDataDosen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class halamandepan extends JFrame {
    
    JLabel teks1 = new JLabel("Selamat Datang");
    JLabel teks2 = new JLabel("Silahkan Pilih Untuk Melanjutkan");
    
       
    JButton viewmahasiswa = new JButton("View Data Mahasiswa");
    JButton viewdosen = new JButton("View Data Dosen");
    JButton logout = new JButton("Logout");
    
    
    public halamandepan(){
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(teks1);
        teks1.setBounds(20, 20, 250, 24);
        teks1.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(teks2);
        teks2.setBounds(20, 50, 300, 25);
        teks2.setFont(new Font("Arial", Font.PLAIN, 12));
       
        
        add(viewmahasiswa);
        viewmahasiswa.setBounds(130, 200, 200, 32);
        
        add(viewdosen);
        viewdosen.setBounds(130, 240, 200, 32);
        
        add(logout);
        logout.setBounds(130, 280, 200, 32);
        
        
        viewmahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewData();
            }
        });
        
        viewdosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
                
            }
        });
    }
}