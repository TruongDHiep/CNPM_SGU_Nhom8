/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.FormQuanLy;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class BanHangForm extends JPanel {

    public BanHangForm(int width, int height) {
        setLayout(null);

        ChonSanPhamPanel cspbh = new ChonSanPhamPanel(0, 0, width - 555, height);
        this.add(cspbh);
       this.setBackground(Color.WHITE);
        HoaDonBanHang hdbh = new HoaDonBanHang(width - 550, 0, 550, height);
        this.add(hdbh);
        
        hdbh.setTarget(cspbh);
        cspbh.setTarget(hdbh);
    }
}
