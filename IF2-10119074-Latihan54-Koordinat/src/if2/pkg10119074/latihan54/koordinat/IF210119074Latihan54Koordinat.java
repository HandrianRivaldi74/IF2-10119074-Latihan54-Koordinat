/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan54.koordinat;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat objWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);

        System.out.println("Warna Koordinat : "+objWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+objWarnaKoordinat.getX()+", y : "+objWarnaKoordinat.getY());
    }
    
}
