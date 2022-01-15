package Equip;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/*
 * laden und speichern
 */
public class SaveLoad {

    public static boolean op = true;        // Main.maxOp;
    public static boolean sk = true;        // Main.lvlSk;
    public static boolean taktikzentrum = true;        //Bausystem.takti;
    public static boolean hospital = true;        //Bausystem.hospi;
    public static boolean brennendesBlut = true;        //Bausystem.brennendesBlut;
    public static boolean steinhaut = true;        //Bausystem.steinhaut;
    public static boolean verrotten = true;        //Bausystem.verrotten;
    public static boolean hoellaenaura = true;        //Bausystem.hoellenaura;
    public static boolean geisterruestung = true;        //Bausystem.geisterruestung;
    public static boolean dunklesOmen = true;        //Bausystem.dunklesOmen;
    public static boolean energiefokuss = true;        //Bausystem.energiefokuss;
    public static boolean meditation = true;        //Bausystem.meditation;
    public static boolean heiligerRitus = true;        //Bausystem.heiligerRitus;
    public static boolean goetterschild = true;        //Bausystem.goetterschild;
    public static boolean equips = true;        // Main.getListEquips();		Main.setEquips(LinkedList<SetEquip> alpha);
    public static boolean ehs = true;        // Main.getListEhs();			Main.setEhVorlagen(LinkedList<EinheitenSave> beta);

    /* die werte der parametern (ints speichern). kannst du über die nebenstehenden befehle aufrufen. ebenso bitte die oben stehenden bools mitspeichern.
     * dann kann ich beim laden die häkchen entsprechend dem alten speicherstand setzen.
     * Main.getListEquips(); liefert dir eine LinkedList<SetEquip> und Main.getListEhs(); eine LinkedList<EinheitenSave>
     */
    public static void save() {
        final JFileChooser fc = new JFileChooser();

        final int returnVal = fc.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            final File file = fc.getSelectedFile();
            if (file.exists()) {

                final JOptionPane optionPane = new JOptionPane("Die Datei existiert bereits!\n" + "überschreiben?\n", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

                // Folgender Kram ist für PopUp. Das ist aus der API stumpf rauskopiert, da ich davon noch wenig Anhnung hab XD
                final JDialog dialog = new JDialog();
                dialog.setModal(true);
                dialog.setContentPane(optionPane);
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialog.addWindowListener(new WindowAdapter() {
                    public void windowClosing(final WindowEvent we) {
                    }
                });
                optionPane.addPropertyChangeListener(e -> {
                    final String prop = e.getPropertyName();

                    if (dialog.isVisible() && (e.getSource() == optionPane) && (JOptionPane.VALUE_PROPERTY.equals(prop))) {
                        // If you were going to check something
                        // before closing the window, you'd do
                        // it here.
                        dialog.setVisible(false);
                    }
                });
                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);

                final int value = (Integer) optionPane.getValue();
                if (value == JOptionPane.YES_OPTION) {
                    try {
                        writeInFile(file);
                    } catch (final IOException e) {
                        final JFrame f = new JFrame("ERROR");
                        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        f.setSize(350, 100);
                        final JLabel message = new JLabel("Error on Writing ... ");
                        f.getContentPane().add(message);
                        f.setLocation(400, 400);
                        f.setVisible(true);
                    }

                }
            } else {
                try {
                    writeInFile(file);
                } catch (final IOException e) {
                    final JFrame f = new JFrame("ERROR");
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setSize(350, 100);
                    final JLabel message = new JLabel("Error on Writing ... ");
                    f.getContentPane().add(message);
                    f.setLocation(400, 400);
                    f.setVisible(true);
                }
            }
            // Ab hier wieder eigener Code
        }
    }

    private static void writeInFile(final File file) throws IOException {
        final FileOutputStream fos;
        final ObjectOutputStream oos;
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

            for (final SetEquip equip : Main.getListEquips()) {
                oos.writeObject(equip);
            }
        }
        //System.out.printf("ich schreibe ehs %b\n", ehs);
        oos.writeBoolean(ehs);

        if (ehs) {
            oos.writeInt(Main.getListEhs().size());
            for (final EinheitenSave eh : Main.getListEhs()) {
                oos.writeObject(eh);
            }
        }

        oos.close();
        fos.close();
        final JFrame f = new JFrame("Speichern");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(350, 100);
        final JLabel message = new JLabel("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Daten erfolgreich gespeichert!</body></html>");
        f.getContentPane().add(message);
        f.setLocation(400, 400);
        f.setVisible(true);
    }

    /*beim laden müssen obige bools wieder belegt werden. die richtigen häkchen setzen mach ich dann von aussen.
     * ebenso die werte in die entsprechenden ints packen. orte sind ja oben geschrieben.
     * equips musst du in einer LinkedList<SetEquip> speichern und die methode Main.setEquips(...) mit diesem parameter aufrufen. die methode füllt dann die entsprechenden arrays.
     * ehs musst du in einer LinkedList<EinheitenSave> speichern und die methode Main.setEhVorlagen(...) mit diesem parameter aufrufen. die methode füllt dann die entsprechenden arrays.
     */
    public static void load() {
        final JFileChooser fc = new JFileChooser();
        final int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            final File file = fc.getSelectedFile();
            try {
                loadFromFile(file);
            } catch (final IOException | ClassNotFoundException e) {
                final JFrame f = new JFrame("ERROR");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(350, 100);
                final JLabel message = new JLabel("Error on Reading ... ");
                f.getContentPane().add(message);
                f.setLocation(400, 400);
                f.setVisible(true);
            }
        }
    }

    private static void loadFromFile(final File file) throws IOException, ClassNotFoundException {
        final FileInputStream fis = new FileInputStream(file);
        final ObjectInputStream ois = new ObjectInputStream(fis);

        final String anfang = (String) ois.readObject();

        if (!anfang.equals("Demonlords-Equip")) {
            final JFrame f = new JFrame("ERROR");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setSize(350, 100);
            final JLabel message = new JLabel("Die gewählte Datei ist keine Speicherdatei für das DL-Tool!");
            f.getContentPane().add(message);
            f.setLocation(400, 400);
            f.setVisible(true);

            return;
        }

        int tmp = ois.readInt();

        op = ois.readBoolean();
        if (op && tmp != -1) {
            Main.maxOp = tmp;
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
        if (goetterschild && tmp != -1) {
            Bausystem.goetterschild = tmp;
        }

        equips = ois.readBoolean();

        if (equips) {
            final int sizeOfEquips = ois.readInt();
            final LinkedList<SetEquip> list = new LinkedList<>();

            for (int i = 0; i < sizeOfEquips; i++) {
                list.add((SetEquip) ois.readObject());
            }
            Main.setEquips(list);
        }

        ehs = ois.readBoolean();

        if (ehs) {
            final int sizeOfEhs = ois.readInt();
            final LinkedList<EinheitenSave> list = new LinkedList<>();

            for (int i = 0; i < sizeOfEhs; i++) {
                list.add((EinheitenSave) ois.readObject());
            }
            Main.setEhVorlagen(list);
        }

        ois.close();
    }
}


