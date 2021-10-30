import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JFrame {

    public  Tabla() {

        super("Tabla");
        DefaultTableModel JTbl = new DefaultTableModel();
        JTbl.addColumn("Nombre");
        JTbl.addColumn("Nacimiento");
        JTbl.addColumn("Estatura");

        String[] p1 = {"Luke Skywalker", "19 ABY", "1.72 metros"};
        String[] p2 = {"Leia Organa", "19 ABY", "1.5 metros"};
        String[] p3 = {"Han Solo", "c. 32 DBY", "1.8 metros"};
        String[] p4 = {"Landonis Balthazar Calrissian", "30 ABY", "1.77 metros"};
        String[] p5 = {"Chewbacca", "200 ABY", "2.3 metros"};
        String[] p6 = {"C-3PO", "Antes del 32 ABY", "1.77 metros"};
        String[] p7 = {"R2-D2", "20 ABY", "1.08 metros"};
        String[] p8 = {"Wilhuff Tarkin", "64 ABY", "1.82 metros"};
        String[] p9 = {"Mon Mothma", "46 ABY", "1.73 metros"};
        String[] p10= {"Yoda", "896 ABY", "0,66 metros"};

        JTbl.addRow(p1);
        JTbl.addRow(p2);
        JTbl.addRow(p3);
        JTbl.addRow(p4);
        JTbl.addRow(p5);
        JTbl.addRow(p6);
        JTbl.addRow(p7);
        JTbl.addRow(p8);
        JTbl.addRow(p9);
        JTbl.addRow(p10);

        JTable table = new JTable(JTbl);
        table.setBounds(12,22,500,500);
        setSize(750,700);
        add(table);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Tabla TLSW = new Tabla();
    }

}
