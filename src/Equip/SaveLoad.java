package Equip;

import java.util.LinkedList;
import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

/*
 * laden und speichern
 */
public class SaveLoad {

    public static boolean op = true;		// Main.maxOp;
    public static boolean sk = true;		// Main.lvlSk;
    public static boolean taktikzentrum = true;		//Bausystem.takti;
    public static boolean hospital = true;		//Bausystem.hospi;
    public static boolean brennendesBlut = true;		//Bausystem.brennendesBlut;
    public static boolean steinhaut = true;		//Bausystem.steinhaut;
    public static boolean verrotten = true;		//Bausystem.verrotten;
    public static boolean hoellaenaura = true;		//Bausystem.hoellenaura;
    public static boolean geisterruestung = true;		//Bausystem.geisterruestung;
    public static boolean dunklesOmen = true;		//Bausystem.dunklesOmen;
    public static boolean energiefokuss = true;		//Bausystem.energiefokuss;
    public static boolean meditation = true;		//Bausystem.meditation;
    public static boolean heiligerRitus = true;		//Bausystem.heiligerRitus;
    public static boolean goetterschild = true;		//Bausystem.goetterschild;
    public static boolean equips = true;		// Main.getListEquips();		Main.setEquips(LinkedList<SetEquip> alpha);
    public static boolean ehs = true;		// Main.getListEhs();			Main.setEhVorlagen(LinkedList<EinheitenSave> beta);
    public static String pfad = null;


    /* die werte der parametern (ints speichern). kannst du die nebenstehenden befehle aufrufen. ebenso bitte die oben stehenden bools mitspeichern.
     * dann kann ich beim laden die hentsprechend dem alten speicherstand setzen.
     * Main.getListEquips(); liefert dir eine LinkedList<SetEquip> und Main.getListEhs(); eine LinkedList<EinheitenSave>
     */
    public static void save()
    {JFileChooser fc = new JFileChooser();

        int returnVal = fc.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (file.exists()) {

                //System.out.printf("%s already exists!", file);
                final JOptionPane optionPane = new JOptionPane("Die Datei existiert bereits!\n" + "\n", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

                // Folgender Kram ist fPopUp. Das ist aus der API stumpf rauskopiert, da ich davon noch wenig Anhnung hab XD
                final JDialog dialog = new JDialog();
                dialog.setModal(true);
                dialog.setContentPane(optionPane);
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialog.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        //System.out.println("Thwarted user attempt to close window.");
                    }
                });
                optionPane.addPropertyChangeListener(new PropertyChangeListener() {
                    public void propertyChange(PropertyChangeEvent e) {
                        String prop = e.getPropertyName();

                        if (dialog.isVisible() && (e.getSource() == optionPane) && (JOptionPane.VALUE_PROPERTY.equals(prop))) {
                            // If you were going to check something
                            // before closing the window, you'd do
                            // it here.
                            dialog.setVisible(false);
                        }
                    }
                });
                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);

                int value = ((Integer) optionPane.getValue()).intValue();
                if (value == JOptionPane.YES_OPTION) {
                    //System.out.println("

                    // Wenn JA, dann wird
                    try {
                        writeInFile(file);
                    } catch (IOException e) {
                        JFrame f = new JFrame("ERROR");
                        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        f.setSize(350, 100);
                        JLabel message = new JLabel("Error on Writing ... ");
                        f.getContentPane().add(message);
                        f.setLocation(400, 400);
                        f.setVisible(true);
                    }
                    //System.out.println("Saving: " + file.getName() + ".");

                } else if (value == JOptionPane.NO_OPTION) {
                    //System.out.println("Nicht
                } else {
                    //System.out.println("Nicht
                }

            } else {
                try {
                    writeInFile(file);
                } catch (IOException e) {
                    JFrame f = new JFrame("ERROR");
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setSize(350, 100);
                    JLabel message = new JLabel("Error on Writing ... ");
                    f.getContentPane().add(message);
                    f.setLocation(400, 400);
                    f.setVisible(true);
                }
                //System.out.println("Saving: " + file.getName() + ".");

            }
            // Ab hier wieder eigener Code

        } else {
            //System.out.println("cancelled by user.");
        }

    }

    private static void writeInFile(File file) throws IOException {
        FileOutputStream fos;
        ObjectOutputStream oos;
        fos = new FileOutputStream(file);
        oos = new ObjectOutputStream(fos);

        oos.writeObject("Demonlords-Equip");
        oos.writeBoolean(op);
        if (op) {
            oos.writeInt(Main.maxOp);
        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(sk);
        if (sk) {
            oos.writeInt(Main.lvlSk);
        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(taktikzentrum);
        if (taktikzentrum) {
            oos.writeInt(Bausystem.takti);
        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(hospital);
        if (hospital) {
            oos.writeInt(Bausystem.hospi);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(brennendesBlut);
        if (brennendesBlut) {
            oos.writeInt(Bausystem.brennendesBlut);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(steinhaut);
        if (steinhaut) {
            oos.writeInt(Bausystem.steinhaut);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(verrotten);
        if (verrotten) {
            oos.writeInt(Bausystem.verrotten);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(hoellaenaura);
        if (hoellaenaura) {
            oos.writeInt(Bausystem.hoellenaura);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(geisterruestung);
        if (geisterruestung) {
            oos.writeInt(Bausystem.geisterruestung);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(dunklesOmen);
        if (dunklesOmen) {
            oos.writeInt(Bausystem.dunklesOmen);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(energiefokuss);
        if (energiefokuss) {
            oos.writeInt(Bausystem.energiefokuss);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(meditation);
        if (meditation) {
            oos.writeInt(Bausystem.meditation);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(heiligerRitus);
        if (heiligerRitus) {
            oos.writeInt(Bausystem.heiligerRitus);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(goetterschild);
        if (goetterschild) {
            oos.writeInt(Bausystem.goetterschild);

        } else {
            oos.writeInt(-1);

        }
        oos.writeBoolean(equips);
        if (equips) {
            oos.writeInt(Main.getListEquips().size());

            for (SetEquip equip : Main.getListEquips()) {
                oos.writeObject(equip);
            }
        }
        //System.out.printf("ich schreibe ehs %b\n", ehs);
        oos.writeBoolean(ehs);

        if (ehs) {
            oos.writeInt(Main.getListEhs().size());
            for (EinheitenSave eh : Main.getListEhs()) {
                oos.writeObject(eh);
            }
        }

        oos.close();
        fos.close();
        JFrame f = new JFrame("Speichern");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(350, 100);
        JLabel message = new JLabel("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Daten erfolgreich gespeichert!</body></html>");
        f.getContentPane().add(message);
        f.setLocation(400, 400);
        f.setVisible(true);
    }

    /*beim laden mobige bools wieder belegt werden. die richtigen hsetzen mach ich dann von aussen.
     * ebenso die werte in die entsprechenden ints packen. orte sind ja oben geschrieben.
     * equips musst du in einer LinkedList<SetEquip> speichern und die methode Main.setEquips(...) mit diesem parameter aufrufen. die methode fdann die entsprechenden arrays.
     * ehs musst du in einer LinkedList<EinheitenSave> speichern und die methode Main.setEhVorlagen(...) mit diesem parameter aufrufen. die methode fdann die entsprechenden arrays.
     */
    public static void load()
    {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //System.out.println("Opening: " + file.getName() + ".");
            try {
                loadFromFile(file);
            } catch (IOException e) {
                //System.out.printf("%s", e);
                JFrame f = new JFrame("ERROR");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(350, 100);
                JLabel message = new JLabel("Error on Reading ... ");
                f.getContentPane().add(message);
                f.setLocation(400, 400);
                f.setVisible(true);
            } catch (ClassNotFoundException e) {
                //System.out.printf("%s", e);
                JFrame f = new JFrame("ERROR");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(350, 100);
                JLabel message = new JLabel("Error on Reading ... ");
                f.getContentPane().add(message);
                f.setLocation(400, 400);
                f.setVisible(true);
            }
        } else {
            //System.out.println("cancelled by user.");
        }
    }

    private static void loadFromFile(File file) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        String anfang = (String) ois.readObject();

        if (!anfang.equals("Demonlords-Equip")) {
            //System.out.printf("%s ist eine falsche Datei", file);
            JFrame f = new JFrame("ERROR");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setSize(350, 100);
            JLabel message = new JLabel("Die gewDatei ist keine Speicherdatei fdas DL-Tool!");
            f.getContentPane().add(message);
            f.setLocation(400, 400);
            f.setVisible(true);

            return;
        }
        //System.out.printf("Geht los");
        int tmp = 0;

        op = ois.readBoolean();
        //System.out.printf("%b", op);
        tmp = ois.readInt();
        //System.out.printf("%d", tmp);
        if (op && tmp != -1) {
            //System.out.printf("\n %d \n", Main.maxOp);
            Main.maxOp = tmp;
            //System.out.printf("\n %d \n", Main.maxOp);

        }

        sk = ois.readBoolean();
        tmp = ois.readInt();
        if (sk && tmp != -1) {
            Main.lvlSk = tmp;
        }

        taktikzentrum = ois.readBoolean();
        tmp = ois.readInt();
        if (taktikzentrum && tmp != -1) {
            Bausystem.takti = tmp;
        }

        hospital = ois.readBoolean();
        tmp = ois.readInt();
        if (hospital && tmp != -1) {
            Bausystem.hospi = tmp;
        }

        brennendesBlut = ois.readBoolean();
        tmp = ois.readInt();
        if (brennendesBlut && tmp != -1) {
            Bausystem.brennendesBlut = tmp;
        }

        steinhaut = ois.readBoolean();
        tmp = ois.readInt();
        if (steinhaut && tmp != -1) {
            Bausystem.steinhaut = tmp;
        }

        verrotten = ois.readBoolean();
        tmp = ois.readInt();
        if (verrotten && tmp != -1) {
            Bausystem.verrotten = tmp;
        }

        hoellaenaura = ois.readBoolean();
        tmp = ois.readInt();
        if (hoellaenaura && tmp != -1) {
            Bausystem.hoellenaura = tmp;
        }

        geisterruestung = ois.readBoolean();
        tmp = ois.readInt();
        if (geisterruestung && tmp != -1) {
            Bausystem.geisterruestung = tmp;
        }

        dunklesOmen = ois.readBoolean();
        tmp = ois.readInt();
        if (dunklesOmen && tmp != -1) {
            Bausystem.dunklesOmen = tmp;
        }

        energiefokuss = ois.readBoolean();
        tmp = ois.readInt();
        if (energiefokuss && tmp != -1) {
            Bausystem.energiefokuss = tmp;
        }

        meditation = ois.readBoolean();
        tmp = ois.readInt();
        if (meditation && tmp != -1) {
            Bausystem.meditation = tmp;
        }

        heiligerRitus = ois.readBoolean();
        tmp = ois.readInt();
        if (heiligerRitus && tmp != -1) {
            Bausystem.heiligerRitus = tmp;
        }

        goetterschild = ois.readBoolean();
        tmp = ois.readInt();
        //System.out.printf("Goetterschild: %d\n", tmp);
        if (goetterschild && tmp != -1) {
            Bausystem.goetterschild = tmp;
        }

        equips = ois.readBoolean();
        //System.out.printf("equips: %b\n", equips);


        if (equips) {

            int sizeOfEquips = ois.readInt();
            //System.out.printf("sizeOfEquips: %d\n", sizeOfEquips);

            LinkedList<SetEquip> list = new LinkedList<SetEquip>();

            for (int i = 0; i < sizeOfEquips; i++) {
                list.add((SetEquip) ois.readObject());
            }
            //System.out.printf("List.size(): %d \n", list.size());
            Main.setEquips(list);
        }

        //System.out.printf("nun die einheiten\n");
        ehs = ois.readBoolean();
        //System.out.printf("ehs: %b\n", ehs);


        if (ehs) {
            int sizeOfEhs = ois.readInt();
            //System.out.printf("sizeOfEhs: %d\n", sizeOfEhs);
            LinkedList<EinheitenSave> list = new LinkedList<EinheitenSave>();

            for (int i = 0; i < sizeOfEhs; i++) {
                list.add((EinheitenSave) ois.readObject());
            }
            Main.setEhVorlagen(list);
        }

        //System.out.printf("Fertig geladen\n");
        ois.close();


    }
}
	

