package Equip;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.AWTKeyStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Oberflaeche extends JFrame {

    public static final String INFO_TEXT = "<html><div align=\"center\"><body>Willkommen werte Demonlords - und Ladys,<br><br>Auf jedem Schriftzug ist ein Tooltipp f\u00FCr leichteres Verst\u00E4ndniss der Funktionen.<br>Ursprünglich entwickelt von Inelucki. Zuletzt aktualisiert am 14.01.2022 von Skinny.<br>Bei Fragen, Bugs, Problemen, konstruktiver Kritik und Ideen die man noch einbauen k\u00F6nnte: <br> \nNachricht ingame oder im Discord an Skinny. Viel Spass damit. </body></div></html>";
    public static final String VERSION = "Version 3.1.0";
    public static int indexEquipSave = 0;    // stelle an der die nächsten equips gespeichert werden
    public static String russi = " ... ";
    public static String werti = " ... ";
    public static String prozente = " ...";
    public static String vorg = "<html><body><br><b>Waffe:</b> &nbsp;&nbsp;alles erlaubt<br> <b>Schild:</b> &nbsp;&nbsp;alles erlaubt<br> <b>R\u00FCstung:</b> &nbsp;&nbsp;alles erlaubt<br> <b>Helm:</b> &nbsp;&nbsp;alles erlaubt<br> <b>Schmuck:</b> &nbsp;&nbsp;alles erlaubt<br><body><html>";
    private static String titel;
    private static SpinnerNumberModel spinn_model;
    private static SpinnerNumberModel waffenschmiede_spinn_model;
    public final JButton btnEquipSpeichern;
    public final JButton btnAdd;
    final JCheckBox chckbxOpferpunkte;
    final JCheckBox chckbxSkLvl;
    final JCheckBox chckbxDunklesOmen;
    final JCheckBox chckbxGeisterrstung;
    final JCheckBox chckbxHllenaura;
    final JCheckBox chckbxVerrotten;
    final JCheckBox chckbxEnergiefokuss;
    final JCheckBox chckbxGtterschild;
    final JCheckBox chckbxHeiligerRitus;
    final JCheckBox chckbxMeditation;
    final JCheckBox chckbxHospital;
    final JCheckBox chckbxTaktikzentrum;
    final JCheckBox chckbxBrennendesBlut;
    final JCheckBox chckbxSteinhaut;
    final JCheckBox chckbxEquipvorlagen;
    final JCheckBox chckbxEinheitenvorlagen;
    private final JTextField textField_1;
    private final JTextField textField_2;
    private final JTextField textField_4;
    private final int[] fuellung = {0, 0};    // 0 = alles, 1=feuer/wind, 2=eis/erde
    private final int[] trpWerte = {0, 0, 0, 0};    // ap, vp, hp, mp
    private final JList<String> list_1;
    private final DefaultListModel<String> model_1;
    private final JList<String> list_2;
    private final DefaultListModel<String> model_2;
    private final JList<String> list_3;
    private final DefaultListModel<String> model_3;
    private final JList<String> list_4;
    private final DefaultListModel<String> model_4;
    private final JList<String> list_5;
    private final DefaultListModel<String> model_5;
    private final JList<String> list_6;
    private final DefaultListModel<String> model_6;
    private final JList<String> list_7;
    private final DefaultListModel<String> model_7;
    private final JComboBox<String> comboBox_4;
    private final JComboBox<String> comboBox_5;
    private final JComboBox<String> dhausbildungsdauerauswahl;
    private final DefaultComboBoxModel<String> box1;
    private final DefaultComboBoxModel<String> box2;
    private final DefaultComboBoxModel<String> box4;
    private final DefaultComboBoxModel<String> box5;
    private final DefaultComboBoxModel<String> box_6;
    private final JCheckBox chckbxMussFkWaffe;
    private final JCheckBox chckbxDarfKeineFk;
    private final JButton btnStart;
    private final JScrollingComboBox<String> comboBox_9;
    private final JScrollingComboBox<String> comboBox_10;
    private final JScrollingComboBox<String> comboBox_11;
    private final JScrollingComboBox<String> comboBox_12;
    private final JScrollingComboBox<String> comboBox_13;
    private final DefaultComboBoxModel<String> box_14;
    private final DefaultComboBoxModel<String> box_15;
    private final DefaultComboBoxModel<String> box_16;
    private final JLabel lblBla;
    private final JLabel lblSteinhaut;
    private final JLabel lblDunklesOmen;
    private final JLabel lblGeisterrstung;
    private final JLabel lblHllenaura;
    private final JLabel lblVerrotten;
    private final JLabel lblEnergiefocus;
    private final JLabel lblGtterschil;
    private final JLabel lblHeiligerRitus;
    private final JLabel lblMeditation;
    private final JLabel lblDrachenwut;
    private final JLabel lblDrachenhaut;
    private final JLabel lblDhStufe;
    private final JLabel lblDhDauer;
    private final JLabel lblNewLabel_6;
    private final JTextField Energiefokuss;
    private final JTextField DunklesOmen;
    private final JTextField Goetterschild;
    private final JTextField Geisterruestung;
    private final JTextField HeiligerRitus;
    private final JTextField Hoellenaura;
    private final JTextField Meditation;
    private final JTextField Verrotten;
    private final JTextField BrennendesBlut;
    private final JTextField Steinhaut;
    private final JTextField Drachenwut;
    private final JTextField Drachenhaut;
    private final JTextField DhStufe;
    private final JTextField textField_3;
    private final JTextField textField_5;
    private final JTable table;
    private final JTable table_1;
    private final JTextField textField_6;
    private Einheiten index = Main.einheiten[0];    // index eh liste
    private int vorrang = 0;    //0=keiner	1=att	2=def

    /**
     * Create the frame.
     */
    public Oberflaeche() {
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(50, 50, 920, 830);
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        final JScrollPane first = new JScrollPane();
        first.setBounds(0, 0, 900, 800);
        first.getVerticalScrollBar().setBlockIncrement(30);
        first.getHorizontalScrollBar().setBlockIncrement(30);
        first.getVerticalScrollBar().setUnitIncrement(20);
        first.getHorizontalScrollBar().setUnitIncrement(20);
        contentPane.add(first, BorderLayout.CENTER);

        final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setPreferredSize(new Dimension(888, 772));
        first.setViewportView(tabbedPane);

        final KeyStroke ctrlTab = KeyStroke.getKeyStroke("ctrl TAB");
        final KeyStroke ctrlShiftTab = KeyStroke.getKeyStroke("ctrl shift TAB");

        // Remove ctrl-tab from normal focus traversal
        final Set<AWTKeyStroke> forwardKeys = new HashSet<>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        forwardKeys.remove(ctrlTab);
        tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardKeys);

        // Remove ctrl-shift-tab from normal focus traversal
        final Set<AWTKeyStroke> backwardKeys = new HashSet<>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        backwardKeys.remove(ctrlShiftTab);
        tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, backwardKeys);

        // Add keys to the tab's input map
        final InputMap inputMap = tabbedPane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(ctrlTab, "navigateNext");
        inputMap.put(ctrlShiftTab, "navigatePrevious");

        final JPanel panel_1 = new JPanel();
        tabbedPane.addTab("R\u00FCstungs-Rechner", null, panel_1, null);
        panel_1.setLayout(null);


        final JLabel info = new JLabel(INFO_TEXT);
        info.setHorizontalAlignment(SwingConstants.LEFT);
        info.setVerticalAlignment(SwingConstants.TOP);
        info.setBounds(93, 6, 695, 102);
        panel_1.add(info);

        final JLabel lblOpferpunkte = new JLabel("Waffenschmiede:");
        lblOpferpunkte.setToolTipText("Gebt hier eure aktuelle Waffenschmiedestufe ein.");
        lblOpferpunkte.setBounds(144, 120, 107, 16);
        panel_1.add(lblOpferpunkte);

        final JLabel lblSklvl = new JLabel("SK-lvl:");
        lblSklvl.setToolTipText("Gebt hier euer aktuelles Level des Zaubers \"Schmiedekunst\" ein.");
        lblSklvl.setBounds(508, 120, 61, 16);
        panel_1.add(lblSklvl);

        waffenschmiede_spinn_model = new SpinnerNumberModel(10, 0, 10, 1);
        final JSpinner waffenschmiedespinner = new JSpinner();
        waffenschmiedespinner.setModel(waffenschmiede_spinn_model);
        waffenschmiedespinner.setBounds(263, 114, 80, 30);
        panel_1.add(waffenschmiedespinner);

        textField_1 = new JTextField();
        textField_1.setBounds(581, 114, 134, 28);
        textField_1.setText("0");
        panel_1.add(textField_1);
        textField_1.setColumns(10);

        final JLabel lblEinheiten = new JLabel("Einheiten:");
        lblEinheiten.setToolTipText("<html><body>W\u00E4hlt hier die Einheit f\u00FCr die ihr eine Ausr\u00FCstung erstellen lassen wollt.<br>\nDer Einheit sind bereits ihre Grundelemente und Kraft hinzugef\u00FCgt. <br>\nDer Dummy ist eine Einheit dessen Werte all 0 sind.<br>\nMan kann ihn also als \"keine Einheit\" verwenden.</body></html>");
        lblEinheiten.setBounds(22, 148, 84, 16);
        panel_1.add(lblEinheiten);

        final JLabel lblAngriffselemente = new JLabel("AngriffsElemente:");
        lblAngriffselemente.setToolTipText("Hier k\u00F6nnt ihr das Element eurer Waffe w\u00E4hlen.");
        lblAngriffselemente.setBounds(263, 148, 128, 16);
        panel_1.add(lblAngriffselemente);

        final JLabel lblVerteidigungselemente = new JLabel("VerteidigungsElemente:");
        lblVerteidigungselemente.setToolTipText("Hier k\u00F6nnt ihr ihr die Elementzusammenstellung f\u00FCr \nSchild und R\u00FCstung ausw\u00E4hlen.");
        lblVerteidigungselemente.setBounds(581, 148, 165, 16);
        panel_1.add(lblVerteidigungselemente);

        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(22, 176, 209, 88);
        panel_1.add(scrollPane);

        final JList<String> list = new JList<>();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);
        final DefaultListModel<String> model_0 = new DefaultListModel<>();
        for (final Einheiten eh : Main.einheiten) {
            model_0.addElement(eh.name);
        }
        list.setModel(model_0);
        list.setSelectedIndex(0);

        final JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(263, 176, 254, 88);
        panel_1.add(scrollPane_1);

        model_1 = new DefaultListModel<>();
        list_1 = new JList<>(model_1);
        list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listenFuellen(1, 0);
        scrollPane_1.setViewportView(list_1);

        final JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(581, 176, 254, 88);
        panel_1.add(scrollPane_2);

        model_2 = new DefaultListModel<>();
        list_2 = new JList<>(model_2);
        list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listenFuellen(2, 0);
        scrollPane_2.setViewportView(list_2);

        final JLabel lblAp = new JLabel("AP:");
        lblAp.setToolTipText("<html><body>Hier kann der Prozentsatz gew\u00E4hlt werden, <br>zu wieviel Prozent die Ausr\u00FCstung auf diesen Wert optimiert wird.</body></html>");
        lblAp.setBounds(22, 276, 42, 16);
        panel_1.add(lblAp);

        final JLabel lblVp = new JLabel("VP:");
        lblVp.setToolTipText("<html><body>Hier kann der Prozentsatz gew\u00E4hlt werden, <br>zu wieviel Prozent die Ausr\u00FCstung auf diesen Wert optimiert wird.</body></html>");
        lblVp.setBounds(22, 333, 42, 16);
        panel_1.add(lblVp);

        final JLabel lblHp = new JLabel("HP:");
        lblHp.setToolTipText("<html><body>Hier kann der Prozentsatz gew\u00E4hlt werden, <br>zu wieviel Prozent die Ausr\u00FCstung auf diesen Wert optimiert wird.</body></html>");
        lblHp.setBounds(22, 386, 42, 16);
        panel_1.add(lblHp);

        final JLabel lblMp = new JLabel("MP:");
        lblMp.setToolTipText("<html><body>Hier kann der Prozentsatz gew\u00E4hlt werden, <br>zu wieviel Prozent die Ausr\u00FCstung auf diesen Wert optimiert wird.</body></html>");
        lblMp.setBounds(22, 438, 42, 16);
        panel_1.add(lblMp);

        final JSlider slider = new JSlider();
        slider.setMajorTickSpacing(20);
        slider.setValue(0);
        slider.setSnapToTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setLabelTable(slider.createStandardLabels(10));
        slider.setBounds(61, 276, 290, 40);
        panel_1.add(slider);

        final JSlider slider_1 = new JSlider();
        slider_1.setMajorTickSpacing(20);
        slider_1.setValue(0);
        slider_1.setMinorTickSpacing(5);
        slider_1.setPaintTicks(true);
        slider_1.setSnapToTicks(true);
        slider_1.setPaintLabels(true);
        slider_1.setLabelTable(slider.createStandardLabels(10));
        slider_1.setBounds(61, 333, 290, 40);
        panel_1.add(slider_1);

        final JSlider slider_2 = new JSlider();
        slider_2.setMajorTickSpacing(20);
        slider_2.setValue(0);
        slider_2.setMinorTickSpacing(5);
        slider_2.setPaintTicks(true);
        slider_2.setSnapToTicks(true);
        slider_2.setPaintLabels(true);
        slider_2.setLabelTable(slider.createStandardLabels(10));
        slider_2.setBounds(61, 386, 290, 40);
        panel_1.add(slider_2);

        final JSlider slider_3 = new JSlider();
        slider_3.setMajorTickSpacing(20);
        slider_3.setMinorTickSpacing(5);
        slider_3.setPaintLabels(true);
        slider_3.setPaintTicks(true);
        slider_3.setSnapToTicks(true);
        slider_3.setValue(0);
        slider_3.setBounds(61, 438, 290, 40);
        panel_1.add(slider_3);

        chckbxMussFkWaffe = new JCheckBox("Muss FK Waffe tragen");
        chckbxMussFkWaffe.setToolTipText("<html><body>Diese Funktion steht nur Sch\u00FCtzen zur Verf\u00FCgung.<br>\nFalls gew\u00E4hlt erh\u00E4lt eure Einheit def. eine Fernkampfwaffe.</body></html>");
        chckbxMussFkWaffe.setBounds(508, 282, 180, 23);
        chckbxMussFkWaffe.setEnabled(true);
        panel_1.add(chckbxMussFkWaffe);

        final JCheckBox chckbxnderungDerKraft = new JCheckBox("\u00C4nderung der Kraft:");
        chckbxnderungDerKraft.setToolTipText("<html><body>nur die \u00C4NDERUNG der Kraft angeben, nicht die neue Summe.<br>\nz.B. durch Krafttr\u00E4nke.</body></html>");
        chckbxnderungDerKraft.setBounds(508, 364, 165, 23);
        panel_1.add(chckbxnderungDerKraft);

        textField_2 = new JTextField();
        textField_2.setEnabled(false);
        textField_2.setBounds(688, 359, 134, 28);
        textField_2.setText("0");
        panel_1.add(textField_2);
        textField_2.setColumns(10);

        final JCheckBox chckbxGrundelementeDerGewhlten = new JCheckBox("Grundelemente der gew\u00E4hlten Einheit l\u00F6schen");
        chckbxGrundelementeDerGewhlten.setToolTipText("<html><body>Setzt die gespeicherten Grundelemente der gew\u00E4hlten Einheit auf Elementlos.<br>\nNun k\u00F6nnt ihr auch andere Elemente f\u00FCr Waffen und R\u00FCstungen w\u00E4hlen.<br>\nz.B. f\u00FCr Elementtr\u00E4nke.</body></html>");
        chckbxGrundelementeDerGewhlten.setBounds(508, 405, 327, 23);
        panel_1.add(chckbxGrundelementeDerGewhlten);

        chckbxDarfKeineFk = new JCheckBox("Darf keine FK Waffe tragen");
        chckbxDarfKeineFk.setToolTipText("<html><body>Die Funktion steht nur Sch\u00FCtzen zur Verf\u00FCgung.<br>\nFalls gew\u00E4hlt, erh\u00E4lt eure Einheit def. eine Nahkampfwaffe.</body></html>");
        chckbxDarfKeineFk.setBounds(508, 323, 207, 23);
        chckbxDarfKeineFk.setEnabled(true);
        panel_1.add(chckbxDarfKeineFk);

        final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane_1.setBounds(6, 478, 855, 242);
        panel_1.add(tabbedPane_1);

        final JPanel panel_2 = new JPanel();
        tabbedPane_1.addTab("Equipment", null, panel_2, null);
        panel_2.setLayout(null);

        final JPanel panel_5 = new JPanel();
        panel_5.setBounds(6, 6, 541, 190);
        panel_2.add(panel_5);
        panel_5.setLayout(null);

        final JLabel lblNewLabel = new JLabel("<html><body>Waffe:<br> <br> Schild:<br> <br> R\u00FCstung:<br> <br> Helm:<br> <br> Schmuck:<br><body><html>");
        lblNewLabel.setBounds(0, 0, 70, 190);
        panel_5.add(lblNewLabel);

        final JLabel lblNewLabel_1 = new JLabel("<html><body>...<br> <br> ...<br> <br> ...<br> <br> ...<br> <br> ...<br><body><html>");
        lblNewLabel_1.setBounds(82, 0, 279, 190);
        panel_5.add(lblNewLabel_1);

        final JLabel lblNewLabel_2 = new JLabel("<html><body>AP:<br> <br> VP:<br> <br> HP:<br> <br> MP:<br> <br> Kraft:<br><body><html>");
        lblNewLabel_2.setBounds(373, 0, 86, 190);
        panel_5.add(lblNewLabel_2);

        final JLabel lblZhl = new JLabel("<html><body>...<br> <br> ...<br> <br> ...<br> <br> ...<br> <br> ...<br><body><html>");
        lblZhl.setBounds(471, 0, 70, 190);
        panel_5.add(lblZhl);

        final JLabel lblNameDesEquips = new JLabel("Name des Equips:");
        lblNameDesEquips.setToolTipText("<html><body>Gebt hier den Namen an, <br>unter dem die links stehende Ausr\u00FCstung gespeichert werden soll.</body></html>");
        lblNameDesEquips.setBounds(619, 25, 125, 16);
        panel_2.add(lblNameDesEquips);

        textField_4 = new JTextField();
        textField_4.setBounds(610, 53, 180, 28);
        panel_2.add(textField_4);
        textField_4.setColumns(10);

        btnEquipSpeichern = new JButton("Equip speichern");
        btnEquipSpeichern.setToolTipText("<html><body>Die hier gespeicherte Ausr\u00FCstung wird in s\u00E4mtliche <br>\nAusr\u00FCstungs-auswahlfelder dieses Tools \u00FCbertragen.\nNach dem beenden des Tools werden alle gespeicherten Ausr\u00FCstungen gel\u00F6scht.<br>\nL\u00F6schen kann man diese Vorlagen unter \"Extras\".</body></html>");
        btnEquipSpeichern.setBounds(619, 113, 125, 29);
        panel_2.add(btnEquipSpeichern);

        final JPanel panel_3 = new JPanel();
        tabbedPane_1.addTab("Vergleich", null, panel_3, null);
        panel_3.setLayout(null);

        final JLabel lblAktuelleRssi = new JLabel("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
        lblAktuelleRssi.setHorizontalAlignment(SwingConstants.CENTER);
        lblAktuelleRssi.setBounds(6, 29, 247, 167);
        panel_3.add(lblAktuelleRssi);

        final JLabel lblVergleichsrssi = new JLabel("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
        lblVergleichsrssi.setHorizontalAlignment(SwingConstants.CENTER);
        lblVergleichsrssi.setBounds(415, 29, 247, 167);
        panel_3.add(lblVergleichsrssi);

        box1 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_1 = new JComboBox<>();
        comboBox_1.setToolTipText("<html><body>Ausr\u00FCstung ausw\u00E4hlen um sie erneut anzuschauen.<br>\nFalls keine zu sehen ist , habt Ihr keine gespeichert.</body></html>");
        comboBox_1.setModel(box1);
        comboBox_1.setBounds(84, 0, 230, 27);
        panel_3.add(comboBox_1);


        box2 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_2 = new JComboBox<>();
        comboBox_2.setToolTipText("<html><body>Ausr\u00FCstung ausw\u00E4hlen um sie erneut anzuschauen.<br>\nFalls keine zu sehen ist , habt Ihr keine gespeichert.</body></html>");
        comboBox_2.setModel(box2);
        comboBox_2.setBounds(526, 0, 230, 27);
        panel_3.add(comboBox_2);

        final JLabel lblNewLabel_3 = new JLabel("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(265, 29, 158, 167);
        panel_3.add(lblNewLabel_3);

        final JLabel lblNewLabel_4 = new JLabel("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setBounds(674, 29, 158, 167);
        panel_3.add(lblNewLabel_4);

        final JPanel panel_7 = new JPanel();
        tabbedPane_1.addTab("Item sperren/vorgeben", null, panel_7, null);
        panel_7.setLayout(null);

        final JLabel lblWaffe = new JLabel("Waffe:");
        lblWaffe.setBounds(6, 47, 61, 16);
        panel_7.add(lblWaffe);

        final JLabel lblSchild = new JLabel("Schild:");
        lblSchild.setBounds(6, 77, 61, 16);
        panel_7.add(lblSchild);

        final JLabel lblRuestung = new JLabel("Ruestung:");
        lblRuestung.setBounds(6, 107, 75, 16);
        panel_7.add(lblRuestung);

        final JLabel lblHelm = new JLabel("Helm:");
        lblHelm.setBounds(6, 138, 61, 16);
        panel_7.add(lblHelm);

        final JLabel lblSonstiges = new JLabel("Sonstiges:");
        lblSonstiges.setBounds(6, 167, 75, 16);
        panel_7.add(lblSonstiges);

        comboBox_9 = new JScrollingComboBox<String>();
        comboBox_9.setModel(new DefaultComboBoxModel<>(new String[]{"besser nix", "Angespitzer Holzstock", "Kurzschwert", "Leichte Armbrust", "Wurfpfeile", "Kurzbogen", "Harfe der Banshee", "Langdolch der Geister", "Stabschleuder", "Federschwert", "Magmaaxt", "Wirbelwindfaust", "Eisdolch", "Novizenstab", "Tanzender Krummsäbel", "Krummsäbel","Froststab", "Schwere Armbrust", "Frostbrand", "Lichtbogen", "Chronitonklingen", "Feuerhellebarde", "Dreckschleuder", "Erdvernichter", "Bogen des Windes", "Zwergischer Schmiedehammer", "Feuerbogen", "Bo", "Zwergenaxt", "Elfischer Jagdbogen", "Flammenstab", "Eisbogen", "Heliosklinge", "Schwere Balliste des Drachentöters", "Eislanze", "Feuerkrallen", "Große Spaltaxt", "Dämonenarmbrust", "Sturmbogen", "Knochenarmbrust", "Splitterbogen", "Titanengladius", "Eissäbel", "Blutbeflecktes Schwert des Zorns", "Götterzucht", "Hammer des Gletscherkönigs", "Höllenschwert", "Dimensionenklingen", "Karmesinroter Bogen", "Stab der Erleuchtung", "Mjölnir", "Verzauberte Knochenaxt", "Uralter Sauwerfer", "Tödlicher Splitter"}));
        comboBox_9.setBounds(79, 43, 150, 27);
        panel_7.add(comboBox_9);

        comboBox_11 = new JScrollingComboBox<String>();
        comboBox_11.setModel(new DefaultComboBoxModel<>(new String[]{"besser nix", "Flickenpanzer", "Lederrüstung", "Dornenweste", "Lederharnisch", "Kettenhemd", "Dunkle Rüstung", "Kriegsausrüstung", "Himmlischer Plattenpanzer", "Zakaras Verschwindibusrobe", "Eiserne Jungfrau", "Maulwurfsrüstung", "Titanpanzer", "Neptunsrobe", "Lavarüstung", "Morgenreif-Harnisch", "Rüstung des Friedens", "Einhornfell", "Erdenmantel", "Paladin-Rüstung", "Heilige Rüstung des Drachentöters", "Obsidianpanzer", "Windmacht", "Plattenpanzer", "Gigas Rüstung", "Gewitterrüstung", "Tückische Rüstung", "Trutzrüstung", "Silberner Prunkharnisch", "Rostfreie Rüstung eines toten Helden", "Geschenk des Himmels", "Furcht"}));
        comboBox_11.setBounds(79, 103, 150, 27);
        panel_7.add(comboBox_11);

        comboBox_10 = new JScrollingComboBox<String>();
        comboBox_10.setModel(new DefaultComboBoxModel<>(new String[]{"besser nix", "Holzschild", "Rundschild", "Schild des Perseus", "Dornenschild", "Armschienen", "Wappenschild", "Polarkristall", "Brennender Schild", "Stachelschild", "Turmschild", "Sturmschild", "Tornadoschild", "Drachenschild", "Sturmblocker", "Federschild", "Heiliger Schild des Drachentöters", "Knochenschild", "Orkenschild", "Schild des Friedens", "Frostwurmschuppen", "Gewebter Harnisch des Ketzers", "Panzer der Schildkrötenprinzessin", "Brustkorb eines Erzfeindes", "Brustkorb eines kalten Erzfeindes"}));
        comboBox_10.setBounds(79, 73, 150, 27);
        panel_7.add(comboBox_10);

        comboBox_12 = new JScrollingComboBox<String>();
        comboBox_12.setModel(new DefaultComboBoxModel<>(new String[]{"besser nix", "Federkappe", "Zauberhut", "Eisenhelm", "Schädelplatte", "Spiegelhelm", "Totenschädelhelm", "Normannenhelm", "Gehörnter Helm", "Diadem der Toten", "Wolfsmaske", "Diadem", "Helm des Friedens", "Drachenhelm", "Heiliger Helm des Drachentöters", "Kalte Maske", "Athenes Weisheit", "Tarnkappe", "Kessel des Küchenmeisters", "Helm der Requisition", "Knochenhelm des Ketzers", "Verzierter Stahlhelm"}));
        comboBox_12.setBounds(79, 133, 150, 27);
        panel_7.add(comboBox_12);

        comboBox_13 = new JScrollingComboBox<String>();
        comboBox_13.setModel(new DefaultComboBoxModel<>(new String[]{"besser nix", "Ranzige Stiefel", "Bronzering", "geflügelte Sandalen", "Falkenring", "Blindenhund", "Voodoopuppe", "Tarot Karten", "Feenamulett", "Schutzring", "Höllenauge", "Glorienring", "Elfenbeinamulett", "Knochenring", "Amulett des Friedens", "Harnischamulett", "Lindwurmamulett", "Amulett der Kraft", "Feuerring", "Kraftring", "Ogerkraft-Amulett", "Ring des Geistes", "Sonnenring", "Riesiger ausgehöhlter Baumstumpf", "Phönixfederschmuck", "Aldeas Halsband", "Heiliger Wikingerring", "Eiserne Krafthandschuhe", "Auge der Seherin", "Ring des Spatzenkönigs", "Ring der Mäusekönigin", "Ring der 1000 Möglichkeiten"}));
        comboBox_13.setBounds(79, 163, 150, 27);
        panel_7.add(comboBox_13);

        final JLabel lblNewLabel_8 = new JLabel(vorg);
        lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_8.setBounds(572, 33, 256, 123);
        panel_7.add(lblNewLabel_8);

        final JLabel lblVorgegebeneGegenstnde = new JLabel("Vorgegebene Gegenst\u00E4nde:");
        lblVorgegebeneGegenstnde.setToolTipText("Diehier angeziegten Gegenst\u00E4nde werden der Einheit, bei berechnung der Ausr\u00FCstung, auf jeden fall angelegt.\nVorrausgesetzt Elemente, OP,FK , Kraft passen zu den anderen Vorgaben.\nWenn etwas nicht passt erhaltet ihr beim dr\u00FCcken von \"Start\" eine Fehlermeldung.\nVorgegebene Gegenst\u00E4nde haben eine h\u00F6here Priorit\u00E4t als Gesperrte.");
        lblVorgegebeneGegenstnde.setBounds(597, 6, 180, 16);
        panel_7.add(lblVorgegebeneGegenstnde);

        final JLabel lblGesperrteGegenstnde = new JLabel("Gesperrte Gegenst\u00E4nde:");
        lblGesperrteGegenstnde.setToolTipText("Die hier aufgelisteten Gegenst\u00E4nde werden bei der Berechnung der Ausr\u00FCstung nicht ber\u00FCcksichtigt.\nVorgegebene Gegenst\u00E4nde haben eine h\u00F6here Priorit\u00E4t als Gesperrte.");
        lblGesperrteGegenstnde.setBounds(315, 6, 160, 16);
        panel_7.add(lblGesperrteGegenstnde);

        final JRadioButton rdbtnSperren = new JRadioButton("sperren");
        rdbtnSperren.setToolTipText("Ist dieser Button aktiviert werden die Gegenst\u00E4nde bei Selektion gesperrt.");
        rdbtnSperren.setSelected(true);
        rdbtnSperren.setBounds(6, 2, 79, 23);
        panel_7.add(rdbtnSperren);

        final JRadioButton rdbtnVorgeben = new JRadioButton("vorgeben");
        rdbtnVorgeben.setToolTipText("Ist dieser Button aktiviert werden die Gegenst\u00E4nde bei Selektion als festgelegte/vorgegebene Gegenst\u00E4nde festgelegt.");
        rdbtnVorgeben.setBounds(109, 2, 90, 23);
        panel_7.add(rdbtnVorgeben);

        final JScrollPane scrollPane_5 = new JScrollPane();
        scrollPane_5.setBounds(251, 26, 274, 130);
        panel_7.add(scrollPane_5);

        model_3 = new DefaultListModel<>();
        list_3 = new JList<>(model_3);
        list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane_5.setViewportView(list_3);

        final JButton btnKomponentenEntfernen = new JButton("Komponenten entfernen");
        btnKomponentenEntfernen.setToolTipText("Nur die Selektierte Komponente wird wieder verf\u00FCgbar gemacht.");
        btnKomponentenEntfernen.setBounds(251, 164, 180, 29);
        panel_7.add(btnKomponentenEntfernen);

        final JButton btnListeLeeren_1 = new JButton("Liste leeren");
        btnListeLeeren_1.setToolTipText("Die Sperrung aller Gegenst\u00E4nde wird aufgehoben.");
        btnListeLeeren_1.setBounds(428, 164, 97, 29);
        panel_7.add(btnListeLeeren_1);

        final JButton btnZurcksetzen = new JButton("zur\u00FCcksetzen");
        btnZurcksetzen.setToolTipText("L\u00F6scht alle gesetzten Vorgegebenen Gegenst\u00E4nde.");
        btnZurcksetzen.setBounds(643, 162, 117, 29);
        panel_7.add(btnZurcksetzen);

        btnStart = new JButton("START");
        btnStart.setToolTipText("<html><body>Berechnet unter ber\u00FCcksichtigung der angegebenen Parameter<br> die optimal Ausr\u00FCstung aus.</body></html>");
        btnStart.setBounds(508, 438, 117, 29);
        panel_1.add(btnStart);

        final JLabel lblVersion = new JLabel("<html><body><b>" + VERSION + "</b></body></html>");
        lblVersion.setBounds(730, 6, 99, 16);
        panel_1.add(lblVersion);

        /* tab 2 */
        final JPanel panel = new JPanel();
        tabbedPane.addTab("Einheit bauen", null, panel, null);
        panel.setLayout(null);

        final JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(6, 195, 410, 244);
        panel.add(scrollPane_3);


        table = new JTable();
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        scrollPane_3.setViewportView(table);
        table.setModel(

                new DefaultTableModel(
                        new Object[][]{
                                {0, null, null, null, null},
                                {1, null, null, null, null},
                                {2, null, null, null, null},
                                {3, null, null, null, null},
                                {4, null, null, null, null},
                                {5, null, null, null, null},
                                {6, null, null, null, null},
                                {7, null, null, null, null},
                                {8, null, null, null, null},
                                {9, null, null, null, null},
                                {10, null, null, null, null},
                        },
                        new String[]{
                                "lvl", "AP", "Vp", "Hp", "MP"
                        }
                ) {
                    final Class[] columnTypes = new Class[]{
                            Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
                    };
                    final boolean[] columnEditables = new boolean[]{
                            false, false, false, false, false
                    };

                    public Class getColumnClass(final int columnIndex) {
                        return columnTypes[columnIndex];
                    }

                    public boolean isCellEditable(final int row, final int column) {
                        return columnEditables[column];
                    }
                });
        table.getColumnModel().getColumn(0).setPreferredWidth(55);
        table.getColumnModel().getColumn(1).setPreferredWidth(90);
        table.getColumnModel().getColumn(2).setPreferredWidth(90);
        table.getColumnModel().getColumn(3).setPreferredWidth(90);
        table.getColumnModel().getColumn(4).setPreferredWidth(90);
        table.setRowHeight(20);

        final JLabel lblEinheitWhlen = new JLabel("Einheit w\u00E4hlen:");
        lblEinheitWhlen.setToolTipText("<html><body>W\u00E4hlt hier die Einheit welche ihr lvln wollt.\nDie Einheitenwahl ist separat von der Einheitenwahl im R\u00FCstungs-Rechner.</body></html>");
        lblEinheitWhlen.setBounds(247, 6, 120, 16);
        panel.add(lblEinheitWhlen);

        final JComboBox<Object> comboBox = new JComboBox<>();
        lblEinheitWhlen.setLabelFor(comboBox);
        final ArrayList<String> ehs = new ArrayList<>();
        for (final Einheiten e : Main.einheiten) {
            ehs.add(e.name);
        }
        for (final Einheiten e : Main.zusatzUnits) {
            ehs.add(e.name);
        }

        comboBox.setModel(new DefaultComboBoxModel<>(ehs.toArray()));
        comboBox.setBounds(379, 2, 242, 27);
        panel.add(comboBox);

        final JLabel lblEhTrnken = new JLabel("EH tr\u00E4nken:");
        lblEhTrnken.setToolTipText("<html><body>Hier k\u00F6nnt Ihr den Trank ausw\u00E4hlen<br>\nden Ihr eurer Einheit verabreichen wollt.\nIm Moment kann man hier jeder Einheit jeden Trank verpassen,<br>\nwas in DL nicht m\u00F6glich ist.<br>\nW\u00E4hlt also Weise!<br>\nEinstellung wird in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblEhTrnken.setBounds(6, 108, 81, 16);
        panel.add(lblEhTrnken);

        final JComboBox<String> comboBox_8 = new JComboBox<>();
        comboBox_8.setModel(new DefaultComboBoxModel<>(new String[]{"kein Trank ausgew\u00E4hlt", "Sekret der Giftlaus    +50 Ap    KP: 0", "Zwergenbier    +150 Ap    KP: 35", "Waldrieseneiter    +350 Ap    KP: 80", "Drachenodem    +700 Ap    KP: 205", "Koboldhaare    +50 Vp    KP: 0", "Orkenhaut    +150 Vp    KP: 30", "Panzer der Orgulathkr\u00F6te    +350 Vp    KP: 75", "Vampirschatten    +700 Vp    KP: 150", "Wasser des Alus    +50 Hp    KP: 0", "Saft des Orksteppengrases    +150 Hp    KP: 40", "Einhorngalle    +400 Hp     KP: 85", "Hydrafett    +1000 Hp     KP: 260", "Engelstropfen    +50 Mp    KP: 0", "Wasser des Silberbachs    +100 Mp    KP: 30", "Feenspeichel    +200 Mp    KP: 60", "Trank der Weisheit    +750 Mp    KP: 80"}));
        comboBox_8.setSelectedIndex(0);
        comboBox_8.setBounds(83, 104, 194, 27);
        panel.add(comboBox_8);

        final JLabel lblGtterboni = new JLabel("G\u00F6tterboni:");
        lblGtterboni.setToolTipText("<html><body>Hier k\u00F6nnt ihr euren Gott w\u00E4hlen.<br>\nSobald ihr einen Gott gew\u00E4hlt habt, <br>\nwird sein Bonus mit max. Launepunkten den Werten hinzugerechnet.\nEinstellung wird in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblGtterboni.setBounds(6, 66, 81, 16);
        panel.add(lblGtterboni);

        final JComboBox<String> comboBox_3 = new JComboBox<>();
        comboBox_3.setMaximumRowCount(9);
        comboBox_3.setModel(new DefaultComboBoxModel<>(new String[]{"keiner", "Thor AP Mensch 30%", "Asklepios VP Mensch 35%", "Baldr HP Mensch 25%", "Horus MP Mensch 40%", "Enyo AP Untot 20%", "Anubis VP Untot 25%", "Hel HP Untot 20%", "H\u00F6dr AP D\u00E4monen 12,5%", "Loki Ap Drachen 10%", "Odin VP Drache 10%"}));
        comboBox_3.setBounds(83, 62, 174, 27);
        panel.add(comboBox_3);

        final JSeparator separator = new JSeparator();
        separator.setBounds(6, 136, 855, 12);
        panel.add(separator);

        final JLabel lblEquip = new JLabel("Equip 1:");
        lblEquip.setToolTipText("<html><body>In der linken Tabelle wird die Einheit nun gelevelt,<br>\nals wenn sie ab lvl 0 diese Ausr\u00FCstung tragen w\u00FCrde.<br>\nIn der zweiten Tabelle kann eine ANDERE Ausr\u00FCstung ber\u00FCcksichtigt werden, <br>\nsodass man vergleichen kann.</body></html>");
        lblEquip.setBounds(16, 160, 61, 16);
        panel.add(lblEquip);

        box4 = new DefaultComboBoxModel<>();
        comboBox_4 = new JComboBox<>();
        comboBox_4.setModel(box4);
        comboBox_4.setBounds(83, 156, 230, 27);
        panel.add(comboBox_4);

        box5 = new DefaultComboBoxModel<>();
        comboBox_5 = new JComboBox<>();
        comboBox_5.setModel(box5);
        comboBox_5.setBounds(586, 156, 230, 27);
        panel.add(comboBox_5);

        final JLabel lblEquip_1 = new JLabel("Equip 2:");
        lblEquip_1.setToolTipText("<html><body>In der linken Tabelle wird die Einheit nun gelevelt,<br>\nals wenn sie ab lvl 0 diese Ausr\u00FCstung tragen w\u00FCrde.<br>\nIn der zweiten Tabelle kann eine ANDERE Ausr\u00FCstung ber\u00FCcksichtigt werden, <br>\nsodass man vergleichen kann.</body></html>");
        lblEquip_1.setBounds(515, 160, 61, 16);
        panel.add(lblEquip_1);


        lblBla = new JLabel("Brennendes Blut:");
        lblBla.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 2% Ap pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblBla.setBounds(353, 34, 110, 16);
        panel.add(lblBla);
        lblBla.setVisible(false);

        lblSteinhaut = new JLabel("Steinhaut:");
        lblSteinhaut.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 2% Vp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblSteinhaut.setBounds(629, 34, 75, 16);
        panel.add(lblSteinhaut);
        lblSteinhaut.setVisible(false);

        lblDunklesOmen = new JLabel("Dunkles Omen:");
        lblDunklesOmen.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 1,5% Vp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblDunklesOmen.setBounds(261, 34, 101, 16);
        panel.add(lblDunklesOmen);
        lblDunklesOmen.setVisible(false);

        lblGeisterrstung = new JLabel("Geisterr\u00FCstung:");
        lblGeisterrstung.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 2% Hp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblGeisterrstung.setBounds(427, 34, 101, 16);
        panel.add(lblGeisterrstung);
        lblGeisterrstung.setVisible(false);

        lblHllenaura = new JLabel("H\u00F6llenaura:");
        lblHllenaura.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: +10 Mp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblHllenaura.setBounds(599, 34, 90, 16);
        panel.add(lblHllenaura);
        lblHllenaura.setVisible(false);

        lblVerrotten = new JLabel("Verrotten:");
        lblVerrotten.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 2% Ap pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblVerrotten.setBounds(741, 34, 75, 16);
        panel.add(lblVerrotten);
        lblVerrotten.setVisible(false);

        lblEnergiefocus = new JLabel("Energiefocus:");
        lblEnergiefocus.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 1% Ap pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblEnergiefocus.setBounds(261, 34, 90, 16);
        panel.add(lblEnergiefocus);
        lblEnergiefocus.setVisible(false);

        lblGtterschil = new JLabel("G\u00F6tterschild:");
        lblGtterschil.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 1% Hp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblGtterschil.setBounds(417, 34, 90, 16);
        panel.add(lblGtterschil);
        lblGtterschil.setVisible(false);

        lblHeiligerRitus = new JLabel("Heiliger Ritus:");
        lblHeiligerRitus.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 1,5% Vp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblHeiligerRitus.setBounds(569, 34, 101, 16);
        panel.add(lblHeiligerRitus);
        lblHeiligerRitus.setVisible(false);

        lblMeditation = new JLabel("Meditation:");
        lblMeditation.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: +6 Mp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblMeditation.setBounds(726, 34, 90, 16);
        panel.add(lblMeditation);
        lblMeditation.setVisible(false);

        lblDrachenwut = new JLabel("Drachenwut:");
        lblDrachenwut.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 1% Ap pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblDrachenwut.setBounds(261, 34, 101, 16);
        panel.add(lblDrachenwut);
        lblDrachenwut.setVisible(false);

        lblDrachenhaut = new JLabel("Drachenhaut:");
        lblDrachenhaut.setToolTipText("<html><body>Entsprechendes Forschungslvl kann hier eingetragen werden.<br>\nBonus: 2,5% Vp pro Stufe.<br>\nForschungsboni werden auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblDrachenhaut.setBounds(427, 34, 101, 16);
        panel.add(lblDrachenhaut);
        lblDrachenhaut.setVisible(false);

        lblDhStufe = new JLabel("Drachenhofstufe:");
        lblDhStufe.setToolTipText("<html><body>Entsprechende Drachenhofstufe kann hier gewaehlt werden.<br>\nDrachenhofstufe wird auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblDhStufe.setBounds(579, 34, 101, 16);
        panel.add(lblDhStufe);
        lblDhStufe.setVisible(false);

        lblDhDauer = new JLabel("Brutdauer:");
        lblDhDauer.setToolTipText("<html><body>Entsprechende Ausbildungsgauer kann hier gewaehlt werden.<br>\nAusbildungsdauer wird auch in der Bastelecke ber\u00FCcksichtigt.</body></html>");
        lblDhDauer.setBounds(741, 34, 101, 16);
        panel.add(lblDhDauer);
        lblDhDauer.setVisible(false);

        Energiefokuss = new JTextField();
        Energiefokuss.setText("0");
        Energiefokuss.setBounds(261, 62, 134, 28);
        panel.add(Energiefokuss);
        Energiefokuss.setColumns(10);
        Energiefokuss.setVisible(false);

        DunklesOmen = new JTextField();
        DunklesOmen.setText("0");
        DunklesOmen.setBounds(261, 62, 134, 28);
        panel.add(DunklesOmen);
        DunklesOmen.setColumns(10);
        DunklesOmen.setVisible(false);

        Goetterschild = new JTextField();
        Goetterschild.setText("0");
        Goetterschild.setBounds(417, 62, 134, 28);
        panel.add(Goetterschild);
        Goetterschild.setColumns(10);
        Goetterschild.setVisible(false);

        Geisterruestung = new JTextField();
        Geisterruestung.setText("0");
        Geisterruestung.setBounds(417, 62, 134, 28);
        panel.add(Geisterruestung);
        Geisterruestung.setColumns(10);
        Geisterruestung.setVisible(false);

        HeiligerRitus = new JTextField();
        HeiligerRitus.setText("0");
        HeiligerRitus.setBounds(569, 60, 134, 28);
        panel.add(HeiligerRitus);
        HeiligerRitus.setColumns(10);
        HeiligerRitus.setVisible(false);

        Hoellenaura = new JTextField();
        Hoellenaura.setText("0");
        Hoellenaura.setBounds(570, 60, 134, 28);
        panel.add(Hoellenaura);
        Hoellenaura.setColumns(10);
        Hoellenaura.setVisible(false);

        Meditation = new JTextField();
        Meditation.setText("0");
        Meditation.setBounds(726, 60, 134, 28);
        panel.add(Meditation);
        Meditation.setColumns(10);
        Meditation.setVisible(false);

        Verrotten = new JTextField();
        Verrotten.setText("0");
        Verrotten.setBounds(726, 60, 134, 28);
        panel.add(Verrotten);
        Verrotten.setColumns(10);
        Verrotten.setVisible(false);

        BrennendesBlut = new JTextField();
        BrennendesBlut.setText("0");
        BrennendesBlut.setBounds(353, 62, 134, 28);
        panel.add(BrennendesBlut);
        BrennendesBlut.setColumns(10);
        BrennendesBlut.setVisible(false);

        Steinhaut = new JTextField();
        Steinhaut.setText("0");
        Steinhaut.setBounds(629, 60, 134, 28);
        panel.add(Steinhaut);
        Steinhaut.setColumns(10);
        Steinhaut.setVisible(false);

        Drachenwut = new JTextField();
        Drachenwut.setText("0");
        Drachenwut.setBounds(261, 62, 134, 28);
        panel.add(Drachenwut);
        Drachenwut.setColumns(10);
        Drachenwut.setVisible(false);

        Drachenhaut = new JTextField();
        Drachenhaut.setText("0");
        Drachenhaut.setBounds(417, 62, 134, 28);
        panel.add(Drachenhaut);
        Drachenhaut.setColumns(10);
        Drachenhaut.setVisible(false);

        DhStufe = new JTextField();
        DhStufe.setText("0");
        DhStufe.setBounds(570, 60, 134, 28);
        panel.add(DhStufe);
        DhStufe.setColumns(10);
        DhStufe.setVisible(false);

        final DefaultComboBoxModel<String> dhausbildungsdauerauswahlmodel = new DefaultComboBoxModel<>();
        dhausbildungsdauerauswahlmodel.addElement("0,5");
        dhausbildungsdauerauswahlmodel.addElement("1");
        dhausbildungsdauerauswahlmodel.addElement("1,5");
        dhausbildungsdauerauswahlmodel.addElement("2");
        dhausbildungsdauerauswahlmodel.addElement("2,5");
        dhausbildungsdauerauswahlmodel.addElement("3");
        dhausbildungsdauerauswahl = new JComboBox<>();
        dhausbildungsdauerauswahl.setModel(dhausbildungsdauerauswahlmodel);
        dhausbildungsdauerauswahl.setBounds(726, 60, 134, 28);
        panel.add(dhausbildungsdauerauswahl);
        dhausbildungsdauerauswahl.setVisible(false);

        final JLabel lblTaktikzentrum = new JLabel("Taktikzentrum:");
        lblTaktikzentrum.setBounds(308, 108, 110, 16);
        panel.add(lblTaktikzentrum);

        textField_3 = new JTextField();
        textField_3.setText("0");
        textField_3.setBounds(417, 102, 134, 28);
        panel.add(textField_3);
        textField_3.setColumns(10);

        final JLabel lblHospital = new JLabel("Hospital:");
        lblHospital.setBounds(579, 108, 69, 16);
        panel.add(lblHospital);

        textField_5 = new JTextField();
        textField_5.setText("0");
        textField_5.setBounds(649, 102, 134, 28);
        panel.add(textField_5);
        textField_5.setColumns(10);

        final JScrollPane scrollPane_4 = new JScrollPane();
        scrollPane_4.setBounds(451, 195, 410, 244);
        panel.add(scrollPane_4);

        table_1 = new JTable();
        table_1.setCellSelectionEnabled(true);
        table_1.setColumnSelectionAllowed(true);
        scrollPane_4.setViewportView(table_1);
        table_1.setModel(new DefaultTableModel(
                new Object[][]{
                        {0, null, null, null, null},
                        {1, null, null, null, null},
                        {2, null, null, null, null},
                        {3, null, null, null, null},
                        {4, null, null, null, null},
                        {5, null, null, null, null},
                        {6, null, null, null, null},
                        {7, null, null, null, null},
                        {8, null, null, null, null},
                        {9, null, null, null, null},
                        {10, null, null, null, null},
                },
                new String[]{
                        "lvl", "AP", "VP", "HP", "MP"
                }
        ) {
            final Class[] columnTypes = new Class[]{
                    Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
            };
            final boolean[] columnEditables = new boolean[]{
                    false, false, false, false, false
            };

            public Class getColumnClass(final int columnIndex) {
                return columnTypes[columnIndex];
            }

            public boolean isCellEditable(final int row, final int column) {
                return columnEditables[column];
            }
        });
        table_1.getColumnModel().getColumn(0).setPreferredWidth(55);
        table_1.getColumnModel().getColumn(1).setPreferredWidth(90);
        table_1.getColumnModel().getColumn(2).setPreferredWidth(90);
        table_1.getColumnModel().getColumn(3).setPreferredWidth(90);
        table_1.getColumnModel().getColumn(4).setPreferredWidth(90);
        table_1.setRowHeight(20);

        final JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(6, 451, 855, 12);
        panel.add(separator_2);

        box_6 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_6 = new JComboBox<>();
        comboBox_6.setModel(box_6);
        comboBox_6.setBounds(6, 581, 170, 27);
        panel.add(comboBox_6);

        final JLabel lblBastelecke = new JLabel("Bastelecke");
        lblBastelecke.setToolTipText("Klick mich! :-)");
        lblBastelecke.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblBastelecke.setHorizontalAlignment(SwingConstants.CENTER);
        lblBastelecke.setBounds(96, 475, 81, 16);
        panel.add(lblBastelecke);

        final JLabel lblEquipWhlen = new JLabel("Equip w\u00E4hlen:");
        lblEquipWhlen.setToolTipText("<html><body>Informationen auf dem Schriftzug \"Bastelecke\".</body></html>");
        lblEquipWhlen.setBounds(16, 553, 101, 16);
        panel.add(lblEquipWhlen);

        final JLabel lblKomponentenZumLvln = new JLabel("Komponenten zum lvln:");
        lblKomponentenZumLvln.setToolTipText("<html><body>Informationen auf dem Schriftzug \"Bastelecke\".</body></html>");
        lblKomponentenZumLvln.setBounds(16, 620, 160, 16);
        panel.add(lblKomponentenZumLvln);

        final JComboBox<String> comboBox_7 = new JComboBox<>();
        comboBox_7.setMaximumRowCount(5);
        comboBox_7.setModel(new DefaultComboBoxModel<>(new String[]{"AP lvln", "VP lvln", "HP lvln", "MP lvn"}));
        comboBox_7.setBounds(6, 648, 170, 27);
        panel.add(comboBox_7);

        spinn_model = new SpinnerNumberModel(1, 1, 10, 1);
        final JSpinner spinner = new JSpinner();
        spinner.setModel(spinn_model);
        spinner.setBounds(16, 687, 43, 28);
        panel.add(spinner);

        btnAdd = new JButton("add");
        btnAdd.setBounds(196, 580, 61, 29);
        panel.add(btnAdd);

        final JButton btnAdd_1 = new JButton("add");
        btnAdd_1.setBounds(196, 647, 61, 29);
        panel.add(btnAdd_1);

        final JLabel lblXLvln = new JLabel("x lvln");
        lblXLvln.setBounds(65, 692, 61, 16);
        panel.add(lblXLvln);

        final JScrollPane scrollPane_6 = new JScrollPane();
        scrollPane_6.setBounds(320, 474, 208, 200);
        panel.add(scrollPane_6);

        model_4 = new DefaultListModel<>();
        list_4 = new JList<>();
        list_4.setModel(model_4);
        scrollPane_6.setViewportView(list_4);

        final JButton btnKomponenteDelete = new JButton("Komponente/n entfernen");
        btnKomponenteDelete.setBounds(327, 713, 194, 29);
        panel.add(btnKomponenteDelete);

        final JButton btnListeLeeren = new JButton("Liste leeren");
        btnListeLeeren.setBounds(370, 687, 117, 29);
        panel.add(btnListeLeeren);

        final JButton btnGo = new JButton("go!");
        btnGo.setBounds(540, 553, 81, 29);
        panel.add(btnGo);

        lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_6.setBounds(629, 478, 208, 196);
        lblNewLabel_6.setBorder(new LineBorder(Color.DARK_GRAY));
        panel.add(lblNewLabel_6);

        textField_6 = new JTextField();
        textField_6.setBounds(586, 712, 134, 28);
        panel.add(textField_6);
        textField_6.setColumns(10);

        final JButton btnSpeichern = new JButton("Speichern");
        btnSpeichern.setToolTipText("<html><body>Man speichert die ausgerechnete Einheit aus dem rechtesten Feld in der Bastelecke.<br>\nDie hier gespeicherte Einheit wird in s\u00E4mtliche <br>\nEinheits-auswahlfelder dieses Tools \u00FCbertragen.\nNach dem beenden des Tools werden alle gespeicherten Einheiten gel\u00F6scht.<br>\nL\u00F6schen kann man diese Vorlagen unter \"Extras\".</body></html>");
        btnSpeichern.setBounds(743, 692, 117, 29);
        panel.add(btnSpeichern);

        final JLabel lblNameDerEinheit = new JLabel("Name der Einheit:");
        lblNameDerEinheit.setToolTipText("Hier den Namen eingeben unter dem die Vorlgae gespeichert werden soll.");
        lblNameDerEinheit.setBounds(584, 687, 120, 16);
        panel.add(lblNameDerEinheit);

        /* tab 3 */
        final JPanel panel_4 = new JPanel();
        tabbedPane.addTab("Truppe bauen", null, panel_4, null);
        panel_4.setLayout(null);

        box_14 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_14 = new JComboBox<>();
        comboBox_14.setBounds(158, 6, 200, 27);
        comboBox_14.setModel(box_14);
        panel_4.add(comboBox_14);

        final JLabel lblEinheit = new JLabel("Einheit 1: ");
        lblEinheit.setToolTipText("Erste Einheit zum Vergleich w\u00E4hlen.");
        lblEinheit.setBounds(66, 10, 80, 16);
        panel_4.add(lblEinheit);

        final JLabel lblEinheit_1 = new JLabel("Einheit 2: ");
        lblEinheit_1.setToolTipText("Zweite Einheit zum Vergleich w\u00E4hlen.");
        lblEinheit_1.setBounds(496, 10, 74, 16);
        panel_4.add(lblEinheit_1);

        box_15 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_15 = new JComboBox<>();
        comboBox_15.setBounds(582, 6, 200, 27);
        comboBox_15.setModel(box_15);
        panel_4.add(comboBox_15);

        final JLabel lblEinheit_2 = new JLabel("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");
        lblEinheit_2.setBounds(23, 38, 400, 215);
        panel_4.add(lblEinheit_2);

        final JLabel lblEinheit_3 = new JLabel("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");
        lblEinheit_3.setBounds(457, 38, 400, 215);
        panel_4.add(lblEinheit_3);

        final JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.GRAY);
        separator_1.setBounds(6, 267, 873, 12);
        panel_4.add(separator_1);

        final JLabel lblEinheitWaehlen = new JLabel("Einheit waehlen:");
        lblEinheitWaehlen.setToolTipText("Einheit waehlen welche in die Liste gesetzt werden soll.");
        lblEinheitWaehlen.setBounds(16, 324, 115, 16);
        panel_4.add(lblEinheitWaehlen);

        box_16 = new DefaultComboBoxModel<>();
        final JComboBox<String> comboBox_16 = new JComboBox<>();
        comboBox_16.setBounds(6, 352, 140, 27);
        comboBox_16.setModel(box_16);
        panel_4.add(comboBox_16);

        final JLabel lblAnzahl = new JLabel("Anzahl:");
        lblAnzahl.setToolTipText("Hier die gew\u00FCnschte Anzahl der hinzuzuf\u00FCgenden Einheiten w\u00E4hlen.");
        lblAnzahl.setBounds(16, 391, 61, 16);
        panel_4.add(lblAnzahl);

        final JSpinner spinner_1 = new JSpinner();
        spinner_1.setModel(new SpinnerNumberModel(0, 0, null, 1));
        spinner_1.setBounds(10, 419, 71, 28);
        panel_4.add(spinner_1);

        final JButton btnAdd_2 = new JButton("add");
        btnAdd_2.setToolTipText("<html><body>Nimmt die gew\u00E4hlte Einheit und nimmt soviele von ihnen in die Liste wie ihr gew\u00E4hlt habt.<br>\nDie Daten im Anzeigefeld werden sofort aktualisiert.</body></html>");
        btnAdd_2.setBounds(20, 469, 105, 29);
        panel_4.add(btnAdd_2);

        final JScrollPane scrollPane_7 = new JScrollPane();
        scrollPane_7.setBounds(210, 324, 213, 232);
        panel_4.add(scrollPane_7);

        model_5 = new DefaultListModel<>();
        list_5 = new JList<>();
        list_5.setModel(model_5);
        scrollPane_7.setViewportView(list_5);

        final JButton btnKomponentenEntfernen_1 = new JButton("Komponente/n entfernen");
        btnKomponentenEntfernen_1.setToolTipText("<html><body>Entfernt die Selektierten komponenten aus der Liste.<br>\nMehrfachSelektion ist m\u00F6glich.<br>\nDie Angaben im Anzeigefeld werden sofort aktualisiert.</body></html>");
        btnKomponentenEntfernen_1.setBounds(230, 568, 180, 29);
        panel_4.add(btnKomponentenEntfernen_1);

        final JButton btnListeLeeren_2 = new JButton("Liste leeren");
        btnListeLeeren_2.setToolTipText("<html><body>Leert die gesamte Liste und<br>\nsetzt die Angaben im Anzeigefeld auf 0.</body></html>");
        btnListeLeeren_2.setBounds(265, 597, 105, 29);
        panel_4.add(btnListeLeeren_2);

        final JLabel lblTruppeBauen = new JLabel("Truppe bauen");
        lblTruppeBauen.setToolTipText("<html><body>Der \"add\" Knopf holt sich die zwei Informationen: welche Einheit und deren Anzahl.<br>\nAus diesen zwei Informationen bastelt er eine Information und setzt diese in die Liste in der Mitte.<br>\nDie Angaben im rechten Feld beziehen sich immer auf alle Komponenten in der Liste.<br>\nWird eine Komponente hinzugef\u00FCgt/entfernt, oder auch mehrere entfernt, aktualisert sich die Angabe sofort.<br>\nSo kann man sich aus seinen Einheitenvorlagen eine Truppe basteln.</body></html>");
        lblTruppeBauen.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblTruppeBauen.setBounds(403, 291, 115, 16);
        panel_4.add(lblTruppeBauen);

        final JLabel lblTruppenwerte = new JLabel("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Truppenwerte</b>" +
                "<br><br>&nbsp;&nbsp;Ap: " + trpWerte[0] + "<br><br>&nbsp;&nbsp;Vp: " + trpWerte[1] + "<br><br>&nbsp;&nbsp;Hp: " + trpWerte[2] + "<br><br>&nbsp;&nbsp;Mp: " + trpWerte[3] + "</body></html>");
        lblTruppenwerte.setBounds(496, 324, 262, 233);
        panel_4.add(lblTruppenwerte);

        /* tab 4 */
        final JPanel panel_8 = new JPanel();
        tabbedPane.addTab("Dummy", null, panel_8, null);
        panel_8.setLayout(null);

        final JLabel lblHierKnnenDie = new JLabel("Hier k\u00F6nnen die Werte des Dummys beliebig ver\u00E4ndert werden.");
        lblHierKnnenDie.setHorizontalAlignment(SwingConstants.CENTER);
        lblHierKnnenDie.setBounds(190, 6, 489, 29);
        panel_8.add(lblHierKnnenDie);

        final JLabel lblAp_1 = new JLabel("AP: ");
        lblAp_1.setBounds(35, 50, 40, 16);
        panel_8.add(lblAp_1);

        final JLabel lblVp_1 = new JLabel("VP: ");
        lblVp_1.setBounds(35, 90, 40, 16);
        panel_8.add(lblVp_1);

        final JLabel lblHp_1 = new JLabel("HP: ");
        lblHp_1.setBounds(35, 130, 40, 16);
        panel_8.add(lblHp_1);

        final JLabel lblMp_1 = new JLabel("MP: ");
        lblMp_1.setBounds(35, 170, 40, 16);
        panel_8.add(lblMp_1);

        final JSpinner dummy_ap = new JSpinner();
        dummy_ap.setBounds(87, 38, 80, 28);
        panel_8.add(dummy_ap);

        final JSpinner dummy_vp = new JSpinner();
        dummy_vp.setBounds(87, 78, 80, 28);
        panel_8.add(dummy_vp);

        final JSpinner dummy_hp = new JSpinner();
        dummy_hp.setBounds(87, 118, 80, 28);
        panel_8.add(dummy_hp);

        final JSpinner dummy_mp = new JSpinner();
        dummy_mp.setBounds(87, 158, 80, 28);
        panel_8.add(dummy_mp);

        final JComboBox<String> dummy_eles = new JComboBox<>();
        dummy_eles.setModel(new DefaultComboBoxModel<>(new String[]{"Keins", "Wind", "Feuer", "Eis", "Erde", "Wind/Feuer", "Eis/Erde"}));
        dummy_eles.setSelectedIndex(0);
        dummy_eles.setBounds(352, 86, 120, 27);
        panel_8.add(dummy_eles);

        final JLabel lblKraft = new JLabel("Kraft: ");
        lblKraft.setBounds(250, 50, 80, 16);
        panel_8.add(lblKraft);

        final JLabel lblElemente = new JLabel("Element/e: ");
        lblElemente.setBounds(250, 90, 80, 16);
        panel_8.add(lblElemente);

        final JSpinner dummy_kraft = new JSpinner();
        dummy_kraft.setBounds(352, 38, 70, 28);
        panel_8.add(dummy_kraft);

        final JCheckBox dummy_fk = new JCheckBox("Darf Fernkampfwaffen tragen");
        dummy_fk.setSelected(true);
        dummy_fk.setBounds(520, 86, 221, 23);
        panel_8.add(dummy_fk);

        final JButton dummy_saveChanges = new JButton("Änderungen übernehmen");
        dummy_saveChanges.setBounds(429, 165, 202, 29);
        panel_8.add(dummy_saveChanges);

        final JLabel lblKommandopunkte = new JLabel("Kommandopunkte: ");
        lblKommandopunkte.setBounds(520, 50, 140, 16);
        panel_8.add(lblKommandopunkte);

        final JSpinner dummy_kp = new JSpinner();
        dummy_kp.setBounds(672, 38, 80, 28);
        panel_8.add(dummy_kp);

        /* tab 5*/
        final JPanel panel_6 = new JPanel();
        tabbedPane.addTab("Extras", null, panel_6, null);
        panel_6.setLayout(null);

        chckbxOpferpunkte = new JCheckBox("Opferpunkte");
        chckbxOpferpunkte.setSelected(true);
        chckbxOpferpunkte.setBounds(6, 48, 128, 23);
        panel_6.add(chckbxOpferpunkte);

        chckbxSkLvl = new JCheckBox("sk - lvl");
        chckbxSkLvl.setSelected(true);
        chckbxSkLvl.setBounds(6, 83, 128, 23);
        panel_6.add(chckbxSkLvl);

        chckbxDunklesOmen = new JCheckBox("Dunkles Omen");
        chckbxDunklesOmen.setSelected(true);
        chckbxDunklesOmen.setBounds(210, 48, 128, 23);
        panel_6.add(chckbxDunklesOmen);

        chckbxGeisterrstung = new JCheckBox("Geisterrüstung");
        chckbxGeisterrstung.setSelected(true);
        chckbxGeisterrstung.setBounds(350, 48, 128, 23);
        panel_6.add(chckbxGeisterrstung);

        chckbxHllenaura = new JCheckBox("Höllenaura");
        chckbxHllenaura.setSelected(true);
        chckbxHllenaura.setBounds(490, 48, 128, 23);
        panel_6.add(chckbxHllenaura);

        chckbxVerrotten = new JCheckBox("Verrotten");
        chckbxVerrotten.setSelected(true);
        chckbxVerrotten.setBounds(630, 48, 128, 23);
        panel_6.add(chckbxVerrotten);

        chckbxEnergiefokuss = new JCheckBox("Energiefokuss");
        chckbxEnergiefokuss.setSelected(true);
        chckbxEnergiefokuss.setBounds(210, 83, 128, 23);
        panel_6.add(chckbxEnergiefokuss);

        chckbxGtterschild = new JCheckBox("Götterschild");
        chckbxGtterschild.setSelected(true);
        chckbxGtterschild.setBounds(350, 83, 128, 23);
        panel_6.add(chckbxGtterschild);

        chckbxHeiligerRitus = new JCheckBox("Heiliger Ritus");
        chckbxHeiligerRitus.setSelected(true);
        chckbxHeiligerRitus.setBounds(490, 83, 128, 23);
        panel_6.add(chckbxHeiligerRitus);

        chckbxMeditation = new JCheckBox("Meditation");
        chckbxMeditation.setSelected(true);
        chckbxMeditation.setBounds(630, 83, 128, 23);
        panel_6.add(chckbxMeditation);

        chckbxHospital = new JCheckBox("Hospital");
        chckbxHospital.setSelected(true);
        chckbxHospital.setBounds(350, 118, 128, 23);
        panel_6.add(chckbxHospital);

        chckbxTaktikzentrum = new JCheckBox("Taktikzentrum");
        chckbxTaktikzentrum.setSelected(true);
        chckbxTaktikzentrum.setBounds(210, 118, 128, 23);
        panel_6.add(chckbxTaktikzentrum);

        chckbxBrennendesBlut = new JCheckBox("Brennendes Blut");
        chckbxBrennendesBlut.setSelected(true);
        chckbxBrennendesBlut.setBounds(490, 118, 147, 23);
        panel_6.add(chckbxBrennendesBlut);

        chckbxSteinhaut = new JCheckBox("Steinhaut");
        chckbxSteinhaut.setSelected(true);
        chckbxSteinhaut.setBounds(630, 118, 128, 23);
        panel_6.add(chckbxSteinhaut);

        chckbxEquipvorlagen = new JCheckBox("Equipvorlagen");
        chckbxEquipvorlagen.setSelected(true);
        chckbxEquipvorlagen.setBounds(6, 118, 128, 23);
        panel_6.add(chckbxEquipvorlagen);

        chckbxEinheitenvorlagen = new JCheckBox("Einheitenvorlagen");
        chckbxEinheitenvorlagen.setSelected(true);
        chckbxEinheitenvorlagen.setBounds(6, 153, 147, 23);
        panel_6.add(chckbxEinheitenvorlagen);

        final JLabel lblWasSollGesichert = new JLabel("Was soll gesichert werden:");
        lblWasSollGesichert.setToolTipText("<html><body>Die Parameter welche gesichert werden sollen k\u00F6nnen hier ausgew\u00E4hlt werden.<br>\nBeim Laden des Speicherstandes werden auch nur diese Daten wieder gesetzt.</body></html>");
        lblWasSollGesichert.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblWasSollGesichert.setBounds(143, 6, 195, 16);
        panel_6.add(lblWasSollGesichert);

        final JButton btnAllesAuswhlen = new JButton("Alles ausw\u00E4hlen");
        btnAllesAuswhlen.setToolTipText("<html><body>Alle Parameter werden zum speichern aktiviert.<br></body></html>");
        btnAllesAuswhlen.setBounds(220, 153, 147, 29);
        panel_6.add(btnAllesAuswhlen);

        final JButton btnAllesAbwhlen = new JButton("Alles abw\u00E4hlen");
        btnAllesAbwhlen.setToolTipText("<html><body>Alle Parameter werden deaktiviert.<br>\nWerden keine neuen H\u00E4kchen gesetzt wird auch nichts gesoeichert.</body></html>");
        btnAllesAbwhlen.setBounds(416, 153, 147, 29);
        panel_6.add(btnAllesAbwhlen);

        final JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        panel_9.setBounds(196, 229, 562, 89);
        panel_6.add(panel_9);
        panel_9.setLayout(null);

        final JButton btnSpeichern_1 = new JButton("Speichern");
        btnSpeichern_1.setToolTipText("Speicherort ausw\u00E4hlen und speichern der gew\u00FCnschten Dateien.");
        btnSpeichern_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        btnSpeichern_1.setBounds(84, 31, 117, 29);
        panel_9.add(btnSpeichern_1);

        final JButton btnLaden = new JButton("Laden");
        btnLaden.setToolTipText("<html><body>Laden eines gew\u00FCnschten Speicherstandes.<br>\nDIe gespeicherten Parameter werden in alle n\u00F6tigen Felder \u00FCbertragen, <br>\nEinheiten- & Ausr\u00FCstungsvorlagen in ihre Listen gef\u00FCllt und<br>\ndie H\u00E4ckchen f\u00FCr den Speicherstand gleich den Parametern des geladenen<br>\nSpeicherstandes gesetzt.</body></html>");
        btnLaden.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        btnLaden.setBounds(357, 31, 117, 29);
        panel_9.add(btnLaden);

        final JLabel lblNewLabel_5 = new JLabel("<html><body><div align=\"center\">Done<br>by<br>sushi_p</div></body></html>");
        lblNewLabel_5.setToolTipText("<html><body>Vielen dank nochmal meinerseits an Sushi_p f\u00FCr die sch\u00F6ne Funktion!<br>\nWer sich ebenso dar\u00FCber freut kann ihm ja mal eine igm mit \"Danke!\" als Inhalt schicken. :D</body></html>");
        lblNewLabel_5.setBounds(243, 18, 57, 54);
        panel_9.add(lblNewLabel_5);

        final JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(6, 343, 873, 12);
        panel_6.add(separator_3);

        final JLabel lblEinhieten = new JLabel("Einheiten - & Equipvorlagen l\u00F6schen");
        lblEinhieten.setToolTipText("<html><body>Die gel\u00F6schten Vorlagen werden aus s\u00E4mtlichen Listen entfernt.<br>\nZugeh\u00F6rige Textfelder werden sofort aktualisiert.</body></html>");
        lblEinhieten.setBounds(296, 367, 240, 16);
        panel_6.add(lblEinhieten);

        final JLabel lblVorhandeneEquipvorlagen = new JLabel("vorhandene Equipvorlagen:");
        lblVorhandeneEquipvorlagen.setToolTipText("<html><body>Hier sind die bereits erstellten/geladenen Equipvorlagen aufgelistet.<br>\nWenn in der Bastelecke sich noch Equipvorlagen in der berechnungsliste befinden und <br>\nIhr diese hier l\u00F6scht, dann werden sie nicht aus der Bastelecken-Liste entfernt bis ihr sie dort<br>\nmanuell aus der liste l\u00F6scht.<br>\nAllerdings werden sie bei erneuten Berechnungen einfach \u00FCbergangen.</body></html>");
        lblVorhandeneEquipvorlagen.setBounds(28, 395, 187, 16);
        panel_6.add(lblVorhandeneEquipvorlagen);

        final JScrollPane scrollPane_8 = new JScrollPane();
        scrollPane_8.setBounds(28, 423, 310, 250);
        panel_6.add(scrollPane_8);

        model_6 = new DefaultListModel<>();
        list_6 = new JList<>();
        list_6.setModel(model_6);
        scrollPane_8.setViewportView(list_6);

        final JButton btnKomponentenEntfernen_2 = new JButton("Komponenten entfernen");
        btnKomponentenEntfernen_2.setToolTipText("<html><body>Die gew\u00E4hlten Vorlagen werden entfernt.<br>\nMehrfachselektion m\u00F6glich.<br>\nDie Vorlagen werden unmittelbar aus dem ganzen Tool gel\u00F6scht und die Anzeigefenster aktualisiert.</body></html>");
        btnKomponentenEntfernen_2.setBounds(28, 695, 187, 29);
        panel_6.add(btnKomponentenEntfernen_2);

        final JButton btnListeLeeren_3 = new JButton("Liste leeren");
        btnListeLeeren_3.setToolTipText("<html><body>L\u00F6scht alle Vorlagen aus dem gesamten Tool.\n<br>\nSetzt alle entsprechenden Anzeigefelder und Listen auf ihren Ursprung zur\u00FCck.</body></html>");
        btnListeLeeren_3.setBounds(221, 695, 117, 29);
        panel_6.add(btnListeLeeren_3);

        final JLabel lblVorhandeneEinheitenvorlagen = new JLabel("vorhandene Einheitenvorlagen:");
        lblVorhandeneEinheitenvorlagen.setToolTipText("<html><body>Hier sind die bereits erstellten/geladenen Einheitenvorlagen aufgelistet.<br>\nWenn Ihr hier eine Vorlage entfernt die sich ebenso <br>\nnoch in der Liste euerer aktuellen Truppe befinden, wird diese dort nicht entfernt.<br>\nSolange sie dort noch in der Liste steht k\u00F6nnt ihr also eure Truppe weiterhin mit dier Vorlage berechnen,<br>\nbis Ihr sie l\u00F6scht.</body></html>");
        lblVorhandeneEinheitenvorlagen.setBounds(502, 395, 218, 16);
        panel_6.add(lblVorhandeneEinheitenvorlagen);

        final JScrollPane scrollPane_9 = new JScrollPane();
        scrollPane_9.setBounds(502, 423, 310, 250);
        panel_6.add(scrollPane_9);

        model_7 = new DefaultListModel<>();
        list_7 = new JList<>();
        list_7.setModel(model_7);
        scrollPane_9.setViewportView(list_7);

        final JButton btnKomponentenEntfernen_3 = new JButton("Komponenten entfernen");
        btnKomponentenEntfernen_3.setToolTipText("<html><body>L\u00F6scht die gew\u00E4hlten Vorlagen aus dem gesamtem Tool.<br>\nMehrfachselektion m\u00F6glich.<br>\nDie entsprechenden Listen und Anzeigefenster werden unmittelbat aktualisiert.</body></html>");
        btnKomponentenEntfernen_3.setBounds(502, 695, 187, 29);
        panel_6.add(btnKomponentenEntfernen_3);

        final JButton btnListeLeeren_4 = new JButton("Liste leeren");
        btnListeLeeren_4.setToolTipText("<html><body>L\u00F6scht alle Vorlagen aus dem gesamtem Tool.<br>\nSetzt die entsprechenden Anzeigefenster und Listen auf ihren Ursprung zur\u00FCck.</body></html>");
        btnListeLeeren_4.setBounds(695, 695, 117, 29);
        panel_6.add(btnListeLeeren_4);



        /*add Listeners */
        /* tab 1 */
        // OP setzen
        //textField.addFocusListener(new FocusListener () {@Override public void focusLost (FocusEvent event){Main.maxOp = Zahl(textField.getText());} @Override public void focusGained(FocusEvent event) {};});
        waffenschmiedespinner.addChangeListener(e -> Main.maxOp = (int) waffenschmiede_spinn_model.getValue());
        //sk-lvl setzen
        textField_1.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent event) {
                Main.lvlSk = Zahl(textField_1.getText());
            }

            @Override
            public void focusGained(final FocusEvent event) {
            }
        });
        // selektion einheitenliste
        list.addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                for (final Einheiten eh : Main.einheiten) {
                    if (eh.name.equals(list.getSelectedValue())) index = eh;
                }
                auswaehlenEh(index);
                list_1.setSelectedIndex(1);
                list_2.setSelectedIndex(1);
            }
        });
        // selektion at eles
        list_1.addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                auswaehlenAt(list_1.getSelectedIndex());
            }
        });
        //selektion def eles
        list_2.addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                auswaehlenDef(list_2.getSelectedIndex());
            }
        });
        // ap prozente
        slider.addChangeListener(e -> Main.app = ((JSlider) e.getSource()).getValue());
        // vp prozente
        slider_1.addChangeListener(e -> Main.vpp = ((JSlider) e.getSource()).getValue());
        //hp prozente
        slider_2.addChangeListener(e -> Main.hpp = ((JSlider) e.getSource()).getValue());
        // mp prozente
        slider_3.addChangeListener(e -> Main.mpp = ((JSlider) e.getSource()).getValue());
        // muss fk waffe tragen
        chckbxMussFkWaffe.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.DESELECTED) {
                Main.boxi.mussFkNutzen = false;
            } else {
                Main.boxi.mussFkNutzen = true;
                chckbxDarfKeineFk.setSelected(false);
            }
        });
        // darf keine fk waffe tragen
        chckbxDarfKeineFk.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.DESELECTED) {
                Main.boxi.darfNichtFkNutzen = false;
            } else {
                Main.boxi.darfNichtFkNutzen = true;
                chckbxMussFkWaffe.setSelected(false);
            }
        });
        // krafterlauben ?
        chckbxnderungDerKraft.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                textField_2.setEnabled(true);
            } else {
                Main.maxKraft = index.kraft;
                textField_2.setText("0");
                textField_2.setEnabled(false);
            }
        });
        // krafterh
        textField_2.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent event) {
                Main.maxKraft = index.kraft + Zahl(textField_2.getText());
            }

            @Override
            public void focusGained(final FocusEvent event) {
            }
        });
        //eles zur
        chckbxGrundelementeDerGewhlten.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Main.boxi.aendernErlaubt = false;
                Main.boxi.ehHatAir = false;
                Main.boxi.ehHatEarth = false;
                Main.boxi.ehHatFire = false;
                Main.boxi.ehHatIce = false;
                model_1.clear();
                model_2.clear();
                listenFuellen(1, 0);
                listenFuellen(2, 0);
            } else {
                Main.boxi.aendernErlaubt = true;
                auswaehlenEh(index);
            }
        });
        // aktuelles equip speichern
        btnEquipSpeichern.addActionListener(e -> {

            titel = name(textField_4.getText(), 1);
            boolean flag = false;

            for (int i = 0; i < indexEquipSave; i++) {
                if (Main.titels[i].equals(titel)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                final JFrame f = new JFrame("ERROR");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(550, 100);
                final JLabel message = new JLabel("<html><body>Den Namen gibt es schon, <br>die Vorlage kann nicht gespeichert werden.<br>Wählen sie einen neuen Namen.<body><html>");
                f.getContentPane().add(message);
                f.setLocation(550, 550);
                f.setVisible(true);
            } else {
                if (Main.ergebnis != null) {
                    final JFrame f = new JFrame(titel);
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setSize(550, 100);
                    final JLabel message = new JLabel("<html><body>Die aktuelle Ausrüstung wurde gespeichert unter dem Namen " + "<big>" + titel + "<big>" + ".<body><html>");
                    f.getContentPane().add(message);
                    f.setLocation(550, 550);
                    f.setVisible(true);

                    final SetEquip skEquip;
                    final Waffe waffe = new Waffe(
                            umrechnen(Main.ergebnis.weapon.AP),
                            umrechnen(Main.ergebnis.weapon.VP),
                            umrechnen(Main.ergebnis.weapon.HP),
                            umrechnen(Main.ergebnis.weapon.MP),
                            Main.ergebnis.weapon.Kraft,
                            Main.ergebnis.weapon.FK,
                            Main.ergebnis.weapon.Feuer,
                            Main.ergebnis.weapon.Erde,
                            Main.ergebnis.weapon.Eis,
                            Main.ergebnis.weapon.Wind,
                            Main.ergebnis.weapon.OP,
                            Main.ergebnis.weapon.name);
                    final Schild schild = new Schild(
                            umrechnen(Main.ergebnis.shield.AP),
                            umrechnen(Main.ergebnis.shield.VP),
                            umrechnen(Main.ergebnis.shield.HP),
                            umrechnen(Main.ergebnis.shield.MP),
                            Main.ergebnis.shield.Kraft,
                            Main.ergebnis.shield.FK,
                            Main.ergebnis.shield.Feuer,
                            Main.ergebnis.shield.Erde,
                            Main.ergebnis.shield.Eis,
                            Main.ergebnis.shield.Wind,
                            Main.ergebnis.shield.OP,
                            Main.ergebnis.shield.name);
                    final Ruestung ruestung = new Ruestung(
                            umrechnen(Main.ergebnis.armor.AP),
                            umrechnen(Main.ergebnis.armor.VP),
                            umrechnen(Main.ergebnis.armor.HP),
                            umrechnen(Main.ergebnis.armor.MP),
                            Main.ergebnis.armor.Kraft,
                            Main.ergebnis.armor.FK,
                            Main.ergebnis.armor.Feuer,
                            Main.ergebnis.armor.Erde,
                            Main.ergebnis.armor.Eis,
                            Main.ergebnis.armor.Wind,
                            Main.ergebnis.armor.OP,
                            Main.ergebnis.armor.name);
                    final Helm helm = new Helm(
                            umrechnen(Main.ergebnis.head.AP),
                            umrechnen(Main.ergebnis.head.VP),
                            umrechnen(Main.ergebnis.head.HP),
                            umrechnen(Main.ergebnis.head.MP),
                            Main.ergebnis.head.Kraft,
                            Main.ergebnis.head.FK,
                            Main.ergebnis.head.Feuer,
                            Main.ergebnis.head.Erde,
                            Main.ergebnis.head.Eis,
                            Main.ergebnis.head.Wind,
                            Main.ergebnis.head.OP,
                            Main.ergebnis.head.name);
                    final Spezial sonstiges = new Spezial(
                            umrechnen(Main.ergebnis.special.AP),
                            umrechnen(Main.ergebnis.special.VP),
                            umrechnen(Main.ergebnis.special.HP),
                            umrechnen(Main.ergebnis.special.MP),
                            Main.ergebnis.special.Kraft,
                            Main.ergebnis.special.FK,
                            Main.ergebnis.special.Feuer,
                            Main.ergebnis.special.Erde,
                            Main.ergebnis.special.Eis,
                            Main.ergebnis.special.Wind,
                            Main.ergebnis.special.OP,
                            Main.ergebnis.special.name);
                    skEquip = new SetEquip(waffe, schild, ruestung, helm, sonstiges, titel);

                    Main.titels[indexEquipSave] = titel;
                    Main.skEquipSaves[indexEquipSave] = skEquip;
                    Main.equipSaves[indexEquipSave] = Main.ergebnis.Werte();
                    indexEquipSave++;
                    if (indexEquipSave > 29) indexEquipSave = 0;

                    box1.removeAllElements();
                    box2.removeAllElements();
                    box4.removeAllElements();
                    box5.removeAllElements();
                    box_6.removeAllElements();
                    model_6.removeAllElements();

                    for (final String gla : Main.titels) {
                        if (gla != null) {
                            box1.addElement(gla);
                            box2.addElement(gla);
                            box4.addElement(gla);
                            box5.addElement(gla);
                            box_6.addElement(gla);
                            model_6.addElement(gla);
                        }
                    }

                }
            }
        });
        // erste rüstung zum vergleich wählen
        comboBox_1.addActionListener(e -> {
            if (comboBox_1.getSelectedIndex() >= 0) {
                lblAktuelleRssi.setText(Main.skEquipSaves[comboBox_1.getSelectedIndex()].EquipInfos());
                lblNewLabel_3.setText(Main.equipSaves[comboBox_1.getSelectedIndex()]);
            }
        });
        // zweite rüstung zum vergleich auswählen
        comboBox_2.addActionListener(e -> {
            if (comboBox_2.getSelectedIndex() >= 0) {
                lblVergleichsrssi.setText(Main.skEquipSaves[comboBox_2.getSelectedIndex()].EquipInfos());
                lblNewLabel_4.setText(Main.equipSaves[comboBox_2.getSelectedIndex()]);
            }

        });
        // button sperren
        rdbtnSperren.addActionListener(e -> {
            if (rdbtnSperren.isSelected()) {
                if (rdbtnVorgeben.isSelected()) {
                    rdbtnVorgeben.doClick();
                }
                Main.sperren = true;
                Main.vorgeben = false;
            } else {
                if (!rdbtnVorgeben.isSelected()) {
                    rdbtnVorgeben.doClick();
                }
                Main.sperren = false;
                Main.vorgeben = true;
            }
        });
        // button vorgeben
        rdbtnVorgeben.addActionListener(e -> {
            if (rdbtnVorgeben.isSelected()) {
                if (rdbtnSperren.isSelected()) {
                    rdbtnSperren.doClick();
                }
                Main.sperren = false;
                Main.vorgeben = true;
            } else {
                if (!rdbtnSperren.isSelected()) {
                    rdbtnSperren.doClick();
                }
                Main.sperren = true;
                Main.vorgeben = false;
            }
        });
        // sperren komponenten entfernen
        btnKomponentenEntfernen.addActionListener(e -> {
            final int wo = list_3.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperrfolge.get(wo).y == 1) {
                    Main.gesperrtwaf[Main.sperrfolge.get(wo).x] = false;
                }
                if (Main.sperrfolge.get(wo).y == 2) {
                    Main.gesperrtsch[Main.sperrfolge.get(wo).x] = false;
                }
                if (Main.sperrfolge.get(wo).y == 3) {
                    Main.gesperrtrue[Main.sperrfolge.get(wo).x] = false;
                }
                if (Main.sperrfolge.get(wo).y == 4) {
                    Main.gesperrthel[Main.sperrfolge.get(wo).x] = false;
                }
                if (Main.sperrfolge.get(wo).y == 5) {
                    Main.gesperrtson[Main.sperrfolge.get(wo).x] = false;
                }
                Main.sperrfolge.remove(wo);
                model_3.remove(wo);
            }
        });
        // sperren liste leeren
        btnListeLeeren_1.addActionListener(e -> {
            model_3.removeAllElements();
            Arrays.fill(Main.gesperrtwaf, false);
            Arrays.fill(Main.gesperrtsch, false);
            Arrays.fill(Main.gesperrtrue, false);
            Arrays.fill(Main.gesperrthel, false);
            Arrays.fill(Main.gesperrtson, false);
        });
        // vorgegeben zur
        btnZurcksetzen.addActionListener(e -> {
            lblNewLabel_8.setText(vorg);
            Main.w = -1;
            Main.s = -1;
            Main.r = -1;
            Main.h = -1;
            Main.so = -1;
        });
        // waffe vorgeben/sperren
        comboBox_9.addActionListener(arg0 -> {
            final int wo = comboBox_9.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperren) {
                    model_3.addElement(comboBox_9.getItemAt(wo));
                    Main.gesperrtwaf[wo] = true;
                    Main.sperrfolge.add(new Point(wo, 1));
                } else {
                    lblNewLabel_8.setText(textVorgeben(1, wo));
                }
            }
        });
        // schild vorgeben/sperren
        comboBox_10.addActionListener(e -> {
            final int wo = comboBox_10.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperren) {
                    model_3.addElement(comboBox_10.getItemAt(wo));
                    Main.gesperrtsch[wo] = true;
                    Main.sperrfolge.add(new Point(wo, 2));
                } else {
                    lblNewLabel_8.setText(textVorgeben(2, wo));
                }
            }
        });
        // ruestung vorgeben/sperren
        comboBox_11.addActionListener(e -> {
            final int wo = comboBox_11.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperren) {
                    model_3.addElement(comboBox_11.getItemAt(wo));
                    Main.gesperrtrue[wo] = true;
                    Main.sperrfolge.add(new Point(wo, 3));
                } else {
                    lblNewLabel_8.setText(textVorgeben(3, wo));
                }
            }
        });
        // helm vorgeben/sperren
        comboBox_12.addActionListener(e -> {
            final int wo = comboBox_12.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperren) {
                    model_3.addElement(comboBox_12.getItemAt(wo));
                    Main.gesperrthel[wo] = true;
                    Main.sperrfolge.add(new Point(wo, 4));
                } else {
                    lblNewLabel_8.setText(textVorgeben(4, wo));
                }
            }
        });
        // sonstiges vorgeben/sperren
        comboBox_13.addActionListener(e -> {
            final int wo = comboBox_13.getSelectedIndex();
            if (wo >= 0) {
                if (Main.sperren) {
                    model_3.addElement(comboBox_13.getItemAt(wo));
                    Main.gesperrtson[wo] = true;
                    Main.sperrfolge.add(new Point(wo, 5));
                } else {
                    lblNewLabel_8.setText(textVorgeben(5, wo));
                }
            }
        });
        // Start Button
        btnStart.addActionListener(event -> {
            btnStart.setEnabled(false);
            Main.los();
            lblNewLabel_1.setText(russi);
            lblZhl.setText(werti);
            lblNewLabel_2.setText(prozente);
            btnStart.setEnabled(true);
        });

        /* tab 2 */
        // einheit waehlen
        comboBox.addActionListener(e -> {
            Bausystem.einheit = Visibels((String) comboBox.getSelectedItem());
            Rechnen();
        });
        // gott waehlen
        comboBox_3.addActionListener(e -> {
            Bausystem.gott = comboBox_3.getSelectedIndex();
            Rechnen();
        });
        // trank waehlen
        comboBox_8.addActionListener(e -> {
            final int a1 = comboBox_8.getSelectedIndex();
            char tr = '0';
            if (a1 < 10) {
                tr = Character.forDigit(a1, 9);
            }
            if (a1 == 9) {
                tr = '9';
            }
            if (a1 == 10) {
                tr = 'a';
            }
            if (a1 == 11) {
                tr = 'b';
            }
            if (a1 == 12) {
                tr = 'c';
            }
            if (a1 == 13) {
                tr = 'd';
            }
            if (a1 == 14) {
                tr = 'e';
            }
            if (a1 == 15) {
                tr = 'f';
            }
            if (a1 == 16) {
                tr = 'g';
            }
            Bausystem.trank = tr;
            Rechnen();
        });
        // equip1 waehlen
        comboBox_4.addActionListener(e -> {
            if (comboBox_4.getSelectedIndex() >= 0) {
                Bausystem.equip1 = Main.skEquipSaves[comboBox_4.getSelectedIndex()];
                Rechnen();
            }
        });
        // equip2 waehlen
        comboBox_5.addActionListener(e -> {
            if (comboBox_5.getSelectedIndex() >= 0) {
                Bausystem.equip2 = Main.skEquipSaves[comboBox_5.getSelectedIndex()];
                Rechnen();
            }
        });
        //lvl brennendes blut
        BrennendesBlut.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.brennendesBlut = Zahl(BrennendesBlut.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl steinhaut
        Steinhaut.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.steinhaut = Zahl(Steinhaut.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl energiefokuss
        Energiefokuss.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.energiefokuss = Zahl(Energiefokuss.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl goetterschild
        Goetterschild.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent arg0) {
                Bausystem.goetterschild = Zahl(Goetterschild.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent arg0) {
            }
        });
        //lvl heiligerRitus
        HeiligerRitus.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.heiligerRitus = Zahl(HeiligerRitus.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl meditation
        Meditation.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.meditation = Zahl(Meditation.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl dunklesOmen
        DunklesOmen.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.dunklesOmen = Zahl(DunklesOmen.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl geisterruestung
        Geisterruestung.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.geisterruestung = Zahl(Geisterruestung.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl hoellenaura
        Hoellenaura.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.hoellenaura = Zahl(Hoellenaura.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl verrotten
        Verrotten.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.verrotten = Zahl(Verrotten.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl drachenhaut
        Drachenhaut.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.drachenhaut = Zahl(Drachenhaut.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        // lvl drachenwut
        Drachenwut.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.drachenwut = Zahl(Drachenwut.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        // dh stufe
        DhStufe.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.dhstufe = Zahl(DhStufe.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        // ausbildungsdauer dh
        dhausbildungsdauerauswahl.addActionListener(e -> {
            Bausystem.dhausbildungsdauer = dhausbildungsdauerauswahl.getSelectedIndex() + 1;
            Rechnen();
        });
        //lvl takti
        textField_3.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.takti = Zahl(textField_3.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        //lvl hospi
        textField_5.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(final FocusEvent e) {
                Bausystem.hospi = Zahl(textField_5.getText());
                Rechnen();
            }

            @Override
            public void focusGained(final FocusEvent e) {
            }
        });
        // equip add bastl
        btnAdd.addActionListener(arg0 -> {
            if (comboBox_6.getSelectedIndex() >= 0) {
                model_4.addElement("e: " + Main.titels[comboBox_6.getSelectedIndex()]);
            }
        });
        // lvl add bastl
        btnAdd_1.addActionListener(e -> {
            final int a12 = comboBox_7.getSelectedIndex();
            String erg = "kein lvl";
            if (a12 == 0) {
                erg = "l: " + spinner.getValue() + " x Ap lvln";
            }
            if (a12 == 1) {
                erg = "l: " + spinner.getValue() + " x Vp lvln";
            }
            if (a12 == 2) {
                erg = "l: " + spinner.getValue() + " x Hp lvln";
            }
            if (a12 == 3) {
                erg = "l: " + spinner.getValue() + " x Mp lvln";
            }
            if ((Bausystem.lvlcount - (10 - (Integer) spinner.getValue())) == 0) {
                btnAdd_1.setEnabled(false);
            }
            Bausystem.lvlcount = Bausystem.lvlcount + (Integer) spinner.getValue();
            spinn_model.setMaximum((10 - Bausystem.lvlcount));
            spinn_model.setValue(1);
            model_4.addElement(erg);
        });
        //Komponenten aus der liste rauswerfen
        btnKomponenteDelete.addActionListener(arg0 -> {
            if (list_4.getSelectedIndex() >= 0) {
                final int[] wo = list_4.getSelectedIndices();
                int summelvl = 0;
                for (final int target : wo) {
                    final String element = model_4.getElementAt(target);
                    if (element.charAt(0) == 'l') {
                        if (element.contains("10")) {
                            summelvl = 10;
                        } else {
                            final int lvl = Integer.parseInt("" + element.charAt((element.indexOf(" x") - 1)));
                            summelvl = summelvl + lvl;
                        }
                    }
                }

                int count = 0;
                for (final int da : wo) {
                    model_4.remove(da - count);
                    count++;
                }

                Bausystem.lvlcount = Bausystem.lvlcount - summelvl;
                if (summelvl > 0) {
                    btnAdd_1.setEnabled(true);
                }
                spinn_model.setMaximum(10 - Bausystem.lvlcount);
            }
        });
        // liste leeren
        btnListeLeeren.addActionListener(e -> {
            model_4.removeAllElements();
            Bausystem.lvlcount = 0;
            btnAdd_1.setEnabled(true);
            spinn_model.setMaximum(10);
        });
        // liste auswerten
        btnGo.addActionListener(arg0 -> {
            final String[] size = new String[model_4.getSize()];
            for (int i = 0; i < size.length; i++) {
                size[i] = model_4.getElementAt(i);
            }
            final String ende = Bausystem.basteln(size, comboBox_6.getItemCount());
            lblNewLabel_6.setText(ende);
        });
        //Einheiten speichern
        btnSpeichern.addActionListener(e -> {

            boolean flag = false;
            final String gla = name(textField_6.getText(), 2);
            for (int i = 0; i < 30; i++) {
                if (gla.equals(Main.ehgesichert[i].titel) || gla.equals("nix")) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                final JFrame f = new JFrame("ERROR");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(550, 100);
                final JLabel message = new JLabel("<html><body>Den Namen gibt es schon, <br>die Vorlage kann nicht gespeichert werden.<br>Wählen sie einen neuen Namen.<body><html>");
                f.getContentPane().add(message);
                f.setLocation(550, 550);
                f.setVisible(true);
            } else {
                final JFrame f = new JFrame(gla);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(550, 100);
                final JLabel message = new JLabel("<html><body>Die aktuelle Ausrüstung wurde gespeichert unter dem Namen " + "<big>" + gla + "<big>" + ".<body><html>");
                f.getContentPane().add(message);
                f.setLocation(550, 550);
                f.setVisible(true);
                final EinheitenSave bla = new EinheitenSave(Main.aktuelleserg);
                Main.ehgesichert[Main.ehindex] = bla;
                Main.ehgesichert[Main.ehindex].titel = gla;

                box_14.removeAllElements();
                box_15.removeAllElements();
                box_16.removeAllElements();
                model_7.removeAllElements();

                for (final EinheitenSave eh : Main.ehgesichert) {
                    if (!eh.titel.equals("nix")) {
                        box_14.addElement(eh.titel);
                        box_15.addElement(eh.titel);
                        box_16.addElement(eh.titel);
                        model_7.addElement(eh.titel);
                    }
                }

                Main.ehindex = Main.ehindex + 1;
                if (Main.ehindex >= 30) {
                    Main.ehindex = 0;
                }


            }
        });
        // tutorial BastelEcke
        lblBastelecke.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(final MouseEvent e) {
            }

            @Override
            public void mousePressed(final MouseEvent e) {
            }

            @Override
            public void mouseExited(final MouseEvent e) {
            }

            @Override
            public void mouseEntered(final MouseEvent e) {
            }

            @Override
            public void mouseClicked(final MouseEvent e) {
                final JFrame f = new JFrame("Erklärung/Anleitung");
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(750, 400);
                final JLabel errormessage = new JLabel("<html><div align=\"center\"><body>So, das Abteil braucht glaub eine kurze Erkl\u00E4rung/Anleitung.<br><br>\nLinks k\u00F6nnt ihr eine gespeicherte Ausr\u00FCstung ausw\u00E4hlen " +
                        "und \u00FCber den beiligenden \"add\" Knopf in die Liste in der Mitte \u00FCbertragen.<br>\nEbenso links k\u00F6nnt ihr \u00FCber den zweiten \"add\" Knopf leveling hinzuf\u00FCgen. " +
                        "<br>\nDieser Knopf nimmt die Art (AP, Vp, ...) und die darunter angegebene Zahl und baut sich daraus die Information, <br>\nwie oft eine Kategorie gelevelt werden soll. " +
                        "diese Info wird dann ebenfalls in die mittlere Liste \u00FCbertragen.<br><br>\nHabt ihr ein paar Komponenten gesammelt, k\u00F6nnt ihr mal auf \"go\" klicken.<br>\n" +
                        "Jetzt arbeitet das Tool die Komponenten in der mittleren Liste von oben nach unten ab.<br>\nSo kann man also ausrechnen lassen welche Werte eine Einheit hat wenn man sie<br>\nbeliebig " +
                        "oft auf verschiedene R\u00FCstungen umr\u00FCstet und zwischendurch irgendwas leveld.<br>\nMehrmals umr\u00FCsten/lvln (auch gleiche Kategorien) sind kein Problem.<br><br>\n" +
                        "Die auf dieser Seite ganz oben ausgew\u00E4hlte Einheit wird hierf\u00FCr als Grundlage genommen.<br>\nTr\u00E4nke, G\u00F6tterbonus und Forschungen werden den Angaben entsprechend " +
                        "ebenfalls ber\u00FCcksichtigt.<br><br>\n\"Liste leeren\" lehrt die Liste, sodass Ihr auch andere Varianten ausprobieren k\u00F6nnt.<br>\nMit \"Komponenten entfernen\" entfernt " +
                        "ihr ALLE selektierten Komponenten auf einmal.<br><br>\nDas wars schon. :)\n</body></div></html>");
                f.getContentPane().add(errormessage);
                f.setLocation(400, 300);
                f.setVisible(true);
            }
        });

        /* tab 3 */
        // einheit 1 zum vergleich w
        comboBox_14.addActionListener(e -> {
            if (comboBox_14.getSelectedIndex() >= 0) {
                final EinheitenSave gew = Main.ehgesichert[comboBox_14.getSelectedIndex()];

                lblEinheit_2.setText(ehVergleichText(gew));
            }
        });
        //eiheit 2 zum vergleich w
        comboBox_15.addActionListener(e -> {
            if (comboBox_15.getSelectedIndex() >= 0) {
                final EinheitenSave gew = Main.ehgesichert[comboBox_15.getSelectedIndex()];

                lblEinheit_3.setText(ehVergleichText(gew));
            }
        });
        // einheit ftruppenbau in liste setzen , lbl f
        btnAdd_2.addActionListener(e -> {
            if (comboBox_16.getSelectedIndex() >= 0) {
                if (!Main.ehgesichert[comboBox_16.getSelectedIndex()].titel.equals("nix")) {
                    final EinheitenSave gew = Main.ehgesichert[comboBox_16.getSelectedIndex()];
                    final int anz = (Integer) spinner_1.getValue();

                    trpWerte[0] += (gew.ap * anz);
                    trpWerte[1] += (gew.vp * anz);
                    trpWerte[2] += (gew.hp * anz);
                    trpWerte[3] += (gew.mp * anz);

                    model_5.addElement("  " + anz + " x " + gew.titel);
                    lblTruppenwerte.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Truppenwerte</b>" +
                            "<br><br>&nbsp;&nbsp;Ap: " + trpWerte[0] + "<br><br>&nbsp;&nbsp;Vp: " + trpWerte[1] + "<br><br>&nbsp;&nbsp;Hp: " + trpWerte[2] + "<br><br>&nbsp;&nbsp;Mp: " + trpWerte[3] + "</body></html>");

                }
            }
        });
        // truppenbau komponenten entfernen
        btnKomponentenEntfernen_1.addActionListener(e -> {
            if (list_5.getSelectedIndex() >= 0) {
                final int[] indices = list_5.getSelectedIndices();
                int steps = 0;
                boolean flag = false;

                for (final int index : indices) {
                    final String sea = model_5.getElementAt(index - steps);
                    final int stelle = sea.indexOf(" x ");
                    final String search = sea.substring(stelle + 3);
                    final int anz = Integer.parseInt(sea.substring(2, stelle));

                    int welche = 0;

                    for (final EinheitenSave das : Main.ehgesichert) {
                        if (das.titel.equals(search)) {
                            flag = true;
                            break;
                        } else {
                            welche++;
                        }
                    }

                    if (flag) {
                        trpWerte[0] = trpWerte[0] - (Main.ehgesichert[welche].ap * anz);
                        trpWerte[1] = trpWerte[1] - (Main.ehgesichert[welche].vp * anz);
                        trpWerte[2] = trpWerte[2] - (Main.ehgesichert[welche].hp * anz);
                        trpWerte[3] = trpWerte[3] - (Main.ehgesichert[welche].mp * anz);
                    }

                    model_5.removeElementAt(index - steps);
                    steps++;

                }

                if (!flag) {

                    trpWerte[0] = 0;
                    trpWerte[1] = 0;
                    trpWerte[2] = 0;
                    trpWerte[3] = 0;

                    for (int i = 0; i < model_5.size(); i++) {
                        final String sea = model_5.getElementAt(i);
                        final int stelle = sea.indexOf(" x ");
                        final String search = sea.substring(stelle + 3);
                        final int anz = Integer.parseInt(sea.substring(2, stelle));

                        int welche = 0;

                        for (final EinheitenSave das : Main.ehgesichert) {
                            if (das.titel.equals(search)) {
                                break;
                            } else {
                                welche++;
                            }
                        }

                        trpWerte[0] = trpWerte[0] + (Main.ehgesichert[welche].ap * anz);
                        trpWerte[1] = trpWerte[1] + (Main.ehgesichert[welche].vp * anz);
                        trpWerte[2] = trpWerte[2] + (Main.ehgesichert[welche].hp * anz);
                        trpWerte[3] = trpWerte[3] + (Main.ehgesichert[welche].mp * anz);

                    }

                }

                lblTruppenwerte.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Truppenwerte</b>" +
                        "<br><br>&nbsp;&nbsp;Ap: " + trpWerte[0] + "<br><br>&nbsp;&nbsp;Vp: " + trpWerte[1] + "<br><br>&nbsp;&nbsp;Hp: " + trpWerte[2] + "<br><br>&nbsp;&nbsp;Mp: " + trpWerte[3] + "</body></html>");
            }
        });
        // truppenbau liste leeren
        btnListeLeeren_2.addActionListener(e -> {

            trpWerte[0] = 0;
            trpWerte[1] = 0;
            trpWerte[2] = 0;
            trpWerte[3] = 0;

            model_5.removeAllElements();

            lblTruppenwerte.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Truppenwerte</b>" +
                    "<br><br>&nbsp;&nbsp;Ap: " + trpWerte[0] + "<br><br>&nbsp;&nbsp;Vp: " + trpWerte[1] + "<br><br>&nbsp;&nbsp;Hp: " + trpWerte[2] + "<br><br>&nbsp;&nbsp;Mp: " + trpWerte[3] + "</body></html>");
        });

        /* tab4 */

        dummy_saveChanges.addActionListener(arg0 -> {

            boolean eis = false;
            boolean wind = false;
            boolean feuer = false;
            boolean erde = false;

            if (dummy_eles.getSelectedIndex() == 1) {
                wind = true;
            }
            if (dummy_eles.getSelectedIndex() == 2) {
                feuer = true;
            }
            if (dummy_eles.getSelectedIndex() == 3) {
                eis = true;
            }
            if (dummy_eles.getSelectedIndex() == 4) {
                erde = true;
            }
            if (dummy_eles.getSelectedIndex() == 5) {
                feuer = true;
                wind = true;
            }
            if (dummy_eles.getSelectedIndex() == 6) {
                eis = true;
                erde = true;
            }

            Main.setDummy
                    (new Einheiten("Dummy", Tags.NIX, (Integer) dummy_kraft.getValue(), dummy_fk.isSelected(), (Integer) dummy_kp.getValue(), (Integer) dummy_ap.getValue(), (Integer) dummy_vp.getValue(), (Integer) dummy_hp.getValue(), (Integer) dummy_mp.getValue(), feuer, wind, erde, eis)
                    );
        });


        /* tab 5*/
        // opferpunkte sichern ?
        chckbxOpferpunkte.addActionListener(e -> SaveLoad.op = chckbxOpferpunkte.isSelected());
        // sklvl sichern ?
        chckbxSkLvl.addActionListener(e -> SaveLoad.sk = chckbxSkLvl.isSelected());
        // dunkles omen sichern ?
        chckbxDunklesOmen.addActionListener(e -> SaveLoad.dunklesOmen = chckbxDunklesOmen.isSelected());
        // geisterruestung sichern ?
        chckbxGeisterrstung.addActionListener(e -> SaveLoad.geisterruestung = chckbxGeisterrstung.isSelected());
        // hoellenaura sichern ?
        chckbxHllenaura.addActionListener(e -> SaveLoad.hoellaenaura = chckbxHllenaura.isSelected());
        // verroten sichern ?
        chckbxVerrotten.addActionListener(e -> SaveLoad.verrotten = chckbxVerrotten.isSelected());
        // energiefokuss sichern ?
        chckbxEnergiefokuss.addActionListener(e -> SaveLoad.energiefokuss = chckbxEnergiefokuss.isSelected());
        // goetterschild sichern ?
        chckbxGtterschild.addActionListener(e -> SaveLoad.goetterschild = chckbxGtterschild.isSelected());
        // heiliger ritus sichern ?
        chckbxHeiligerRitus.addActionListener(e -> SaveLoad.heiligerRitus = chckbxHeiligerRitus.isSelected());
        // meditation sichern ?
        chckbxMeditation.addActionListener(e -> SaveLoad.meditation = chckbxMeditation.isSelected());
        // hospital sichern ?
        chckbxHospital.addActionListener(e -> SaveLoad.hospital = chckbxHospital.isSelected());
        // taktikzentrum sichern ?
        chckbxTaktikzentrum.addActionListener(e -> SaveLoad.taktikzentrum = chckbxTaktikzentrum.isSelected());
        // brennendes blut sichern ?
        chckbxBrennendesBlut.addActionListener(e -> SaveLoad.brennendesBlut = chckbxBrennendesBlut.isSelected());
        // steinhaut sichern ?
        chckbxSteinhaut.addActionListener(e -> SaveLoad.steinhaut = chckbxSteinhaut.isSelected());
        // equips sichern ?
        chckbxEquipvorlagen.addActionListener(e -> SaveLoad.equips = chckbxEquipvorlagen.isSelected());
        // einheiten sichern ?
        chckbxEinheitenvorlagen.addActionListener(e -> SaveLoad.ehs = chckbxEinheitenvorlagen.isSelected());
        // alle elemente sollen gespeichert werden
        btnAllesAuswhlen.addActionListener(e -> {

            if (!chckbxOpferpunkte.isSelected()) {
                chckbxOpferpunkte.doClick();
            }
            if (!chckbxSkLvl.isSelected()) {
                chckbxSkLvl.doClick();
            }
            if (!chckbxDunklesOmen.isSelected()) {
                chckbxDunklesOmen.doClick();
            }
            if (!chckbxGeisterrstung.isSelected()) {
                chckbxGeisterrstung.doClick();
            }
            if (!chckbxHllenaura.isSelected()) {
                chckbxHllenaura.doClick();
            }
            if (!chckbxVerrotten.isSelected()) {
                chckbxVerrotten.doClick();
            }
            if (!chckbxEnergiefokuss.isSelected()) {
                chckbxEnergiefokuss.doClick();
            }
            if (!chckbxGtterschild.isSelected()) {
                chckbxGtterschild.doClick();
            }
            if (!chckbxHeiligerRitus.isSelected()) {
                chckbxHeiligerRitus.doClick();
            }
            if (!chckbxMeditation.isSelected()) {
                chckbxMeditation.doClick();
            }
            if (!chckbxHospital.isSelected()) {
                chckbxHospital.doClick();
            }
            if (!chckbxTaktikzentrum.isSelected()) {
                chckbxTaktikzentrum.doClick();
            }
            if (!chckbxBrennendesBlut.isSelected()) {
                chckbxBrennendesBlut.doClick();
            }
            if (!chckbxSteinhaut.isSelected()) {
                chckbxSteinhaut.doClick();
            }
            if (!chckbxEquipvorlagen.isSelected()) {
                chckbxEquipvorlagen.doClick();
            }
            if (!chckbxEinheitenvorlagen.isSelected()) {
                chckbxEinheitenvorlagen.doClick();
            }

        });
        // alle elemente sollen NICHT gespeichert werden
        btnAllesAbwhlen.addActionListener(e -> {
            if (chckbxOpferpunkte.isSelected()) {
                chckbxOpferpunkte.doClick();
            }
            if (chckbxSkLvl.isSelected()) {
                chckbxSkLvl.doClick();
            }
            if (chckbxDunklesOmen.isSelected()) {
                chckbxDunklesOmen.doClick();
            }
            if (chckbxGeisterrstung.isSelected()) {
                chckbxGeisterrstung.doClick();
            }
            if (chckbxHllenaura.isSelected()) {
                chckbxHllenaura.doClick();
            }
            if (chckbxVerrotten.isSelected()) {
                chckbxVerrotten.doClick();
            }
            if (chckbxEnergiefokuss.isSelected()) {
                chckbxEnergiefokuss.doClick();
            }
            if (chckbxGtterschild.isSelected()) {
                chckbxGtterschild.doClick();
            }
            if (chckbxHeiligerRitus.isSelected()) {
                chckbxHeiligerRitus.doClick();
            }
            if (chckbxMeditation.isSelected()) {
                chckbxMeditation.doClick();
            }
            if (chckbxHospital.isSelected()) {
                chckbxHospital.doClick();
            }
            if (chckbxTaktikzentrum.isSelected()) {
                chckbxTaktikzentrum.doClick();
            }
            if (chckbxBrennendesBlut.isSelected()) {
                chckbxBrennendesBlut.doClick();
            }
            if (chckbxSteinhaut.isSelected()) {
                chckbxSteinhaut.doClick();
            }
            if (chckbxEquipvorlagen.isSelected()) {
                chckbxEquipvorlagen.doClick();
            }
            if (chckbxEinheitenvorlagen.isSelected()) {
                chckbxEinheitenvorlagen.doClick();
            }
        });
        // hier wird gespeichert
        btnSpeichern_1.addActionListener(e -> SaveLoad.save());
        // hier wird geladen
        btnLaden.addActionListener(e -> {
            SaveLoad.load();

            box_14.removeAllElements();
            box_15.removeAllElements();
            box_16.removeAllElements();
            model_7.removeAllElements();

            for (final EinheitenSave eh : Main.ehgesichert) {
                if (!eh.titel.equals("nix")) {
                    box_14.addElement(eh.titel);
                    box_15.addElement(eh.titel);
                    box_16.addElement(eh.titel);
                    model_7.addElement(eh.titel);
                }
            }

            box1.removeAllElements();
            box2.removeAllElements();
            box4.removeAllElements();
            box5.removeAllElements();
            box_6.removeAllElements();
            model_6.removeAllElements();

            final StringBuilder read = new StringBuilder("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Datei erfolgreich geladen!<br><br>");

            for (final String gla : Main.titels) {
                if (gla != null) {
                    box1.addElement(gla);
                    box2.addElement(gla);
                    box4.addElement(gla);
                    box5.addElement(gla);
                    box_6.addElement(gla);
                    model_6.addElement(gla);
                }
            }

            if (SaveLoad.op) {
                chckbxOpferpunkte.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Opferpunkte: ")
                        .append(Main.maxOp)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxOpferpunkte.setSelected(false);
            }
            if (SaveLoad.sk) {
                chckbxSkLvl.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Schmiedekunst-lvl: ")
                        .append(Main.lvlSk)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxSkLvl.setSelected(false);
            }
            if (SaveLoad.dunklesOmen) {
                chckbxDunklesOmen.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Dunkles Omen lvl: ")
                        .append(Bausystem.dunklesOmen)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxDunklesOmen.setSelected(false);
            }
            if (SaveLoad.geisterruestung) {
                chckbxGeisterrstung.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Geistterrlvl: ")
                        .append(Bausystem.geisterruestung)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxGeisterrstung.setSelected(false);
            }
            if (SaveLoad.hoellaenaura) {
                chckbxHllenaura.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Hlvl: ")
                        .append(Bausystem.hoellenaura)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxHllenaura.setSelected(false);
            }
            if (SaveLoad.verrotten) {
                chckbxVerrotten.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Verrotten lvl: ")
                        .append(Bausystem.verrotten)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxVerrotten.setSelected(false);
            }
            if (SaveLoad.energiefokuss) {
                chckbxEnergiefokuss.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Energiefokuss lvl: ")
                        .append(Bausystem.energiefokuss)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxEnergiefokuss.setSelected(false);
            }
            if (SaveLoad.goetterschild) {
                chckbxGtterschild.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Glvl: ")
                        .append(Bausystem.goetterschild)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxGtterschild.setSelected(false);
            }
            if (SaveLoad.heiligerRitus) {
                chckbxHeiligerRitus.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Heiliger Ritus lvl: ")
                        .append(Bausystem.heiligerRitus)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxHeiligerRitus.setSelected(false);
            }
            if (SaveLoad.meditation) {
                chckbxMeditation.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Meditation lvl: ")
                        .append(Bausystem.meditation)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxMeditation.setSelected(false);
            }
            if (SaveLoad.hospital) {
                chckbxHospital.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Hospital stufe: ")
                        .append(Bausystem.hospi)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxHospital.setSelected(false);
            }
            if (SaveLoad.taktikzentrum) {
                chckbxTaktikzentrum.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Taktikzentrum stufe: ")
                        .append(Bausystem.takti)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxTaktikzentrum.setSelected(false);
            }
            if (SaveLoad.brennendesBlut) {
                chckbxBrennendesBlut.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Brennendes Blut lvl: ")
                        .append(Bausystem.brennendesBlut)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxBrennendesBlut.setSelected(false);
            }
            if (SaveLoad.steinhaut) {
                chckbxSteinhaut.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Steinhaut lvl: ")
                        .append(Bausystem.steinhaut)
                        .append(" wurde geladen.<br>");
            } else {
                chckbxSteinhaut.setSelected(false);
            }
            if (SaveLoad.equips) {
                chckbxEquipvorlagen.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Equipvorlagen wurden geladen.<br>");
            } else {
                chckbxEquipvorlagen.setSelected(false);
            }
            if (SaveLoad.ehs) {
                chckbxEinheitenvorlagen.setSelected(true);
                read.append("&nbsp;&nbsp;&nbsp;Einheitenvorlagen wurden geladen.<br>");
            } else {
                chckbxEinheitenvorlagen.setSelected(false);
            }

            read.append("<br></body></html>");

            waffenschmiede_spinn_model.setValue(Main.maxOp);
            textField_1.setText("" + Main.lvlSk);
            Steinhaut.setText("" + Bausystem.steinhaut);
            BrennendesBlut.setText("" + Bausystem.brennendesBlut);
            textField_3.setText("" + Bausystem.takti);
            textField_5.setText("" + Bausystem.hospi);
            Verrotten.setText("" + Bausystem.verrotten);
            Hoellenaura.setText("" + Bausystem.hoellenaura);
            DunklesOmen.setText("" + Bausystem.dunklesOmen);
            Geisterruestung.setText("" + Bausystem.geisterruestung);
            Energiefokuss.setText("" + Bausystem.energiefokuss);
            Meditation.setText("" + Bausystem.meditation);
            HeiligerRitus.setText("" + Bausystem.heiligerRitus);
            Goetterschild.setText("" + Bausystem.goetterschild);

            final JFrame f = new JFrame("Laden");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.getContentPane().setLayout(new BorderLayout());
            final JLabel text = new JLabel(new String(read));
            f.getContentPane().add(text, BorderLayout.CENTER);
            f.setLocation(400, 400);
            f.pack();
            f.setVisible(true);


        });
        // equipvorlagen entfernen
        btnKomponentenEntfernen_2.addActionListener(e -> {
            if (list_6.getSelectedIndices().length > 0) {
                final int[] indices = list_6.getSelectedIndices();
                int count = 0;

                for (final int index : indices) {
                    if (Bausystem.equip1.name.equals(Main.skEquipSaves[index - count].name)) {
                        if ((index - count) == 0) {
                            if (model_6.getSize() > 1) {
                                Bausystem.equip1 = Main.skEquipSaves[1];
                            } else {
                                Bausystem.equip1 = null;
                            }
                        } else {
                            Bausystem.equip1 = Main.skEquipSaves[0];
                        }
                    }


                    if (Bausystem.equip2.name.equals(Main.skEquipSaves[index - count].name)) {
                        if ((index - count) == 0) {
                            if (model_6.getSize() > 1) {
                                Bausystem.equip2 = Main.skEquipSaves[1];
                            } else {
                                Bausystem.equip2 = null;
                            }
                        } else {
                            Bausystem.equip2 = Main.skEquipSaves[0];
                        }
                    }

                    Rechnen();

                    if (Objects.equals(comboBox_1.getSelectedItem(), Main.skEquipSaves[index - count].name)) {
                        if ((index - count) == 0) {
                            if (box1.getSize() > 1) {
                                lblAktuelleRssi.setText(Main.skEquipSaves[1].EquipInfos());
                                lblNewLabel_3.setText(Main.equipSaves[1]);
                            } else {
                                lblAktuelleRssi.setText("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
                                lblNewLabel_3.setText("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
                            }
                        } else {
                            lblAktuelleRssi.setText(Main.skEquipSaves[0].EquipInfos());
                            lblNewLabel_3.setText(Main.equipSaves[0]);
                        }
                    }

                    if (Objects.equals(comboBox_2.getSelectedItem(), Main.skEquipSaves[index - count].name)) {
                        if ((index - count) == 0) {
                            if (box2.getSize() > 1) {
                                lblVergleichsrssi.setText(Main.skEquipSaves[1].EquipInfos());
                                lblNewLabel_4.setText(Main.equipSaves[1]);
                            } else {
                                lblVergleichsrssi.setText("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
                                lblNewLabel_4.setText("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
                            }
                        } else {
                            lblVergleichsrssi.setText(Main.skEquipSaves[0].EquipInfos());
                            lblNewLabel_4.setText(Main.equipSaves[0]);
                        }
                    }

                    box1.removeElementAt(index - count);
                    box2.removeElementAt(index - count);
                    box4.removeElementAt(index - count);
                    box5.removeElementAt(index - count);
                    box_6.removeElementAt(index - count);
                    model_6.removeElementAt(index - count);

                    final ArrayList<SetEquip> eins = new ArrayList<>(Arrays.asList(Main.skEquipSaves));
                    eins.remove(index - count);
                    Main.skEquipSaves = eins.toArray(new SetEquip[0]);

                    final ArrayList<String> zwei = new ArrayList<>(Arrays.asList(Main.equipSaves));
                    zwei.remove(index - count);
                    Main.equipSaves = zwei.toArray(new String[0]);

                    final ArrayList<String> drei = new ArrayList<>(Arrays.asList(Main.titels));
                    drei.remove(index - count);
                    Main.titels = drei.toArray(new String[0]);

                    indexEquipSave = indexEquipSave - 1;

                    count++;
                }

            }
        });
        // equipvorlagen alle l
        btnListeLeeren_3.addActionListener(e -> {

            box1.removeAllElements();
            box2.removeAllElements();
            box4.removeAllElements();
            box5.removeAllElements();
            box_6.removeAllElements();
            model_6.removeAllElements();

            Main.skEquipSaves = new SetEquip[30];
            Main.equipSaves = new String[30];
            Main.titels = new String[30];

            indexEquipSave = 0;

            Bausystem.equip1 = null;
            Bausystem.equip2 = null;
            Rechnen();
            lblAktuelleRssi.setText("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
            lblVergleichsrssi.setText("<html><body>nix<br><br>nix<br><br>nix<br><br>nix<br><br>nix<body><html>");
            lblNewLabel_3.setText("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
            lblNewLabel_4.setText("<html><body>AP: 0<br><br>VP: 0<br><br>HP: 0<br><br>MP: 0<br><br>Kraft: 0<body><html>");
        });
        // einheitenvorlagen entfernen
        btnKomponentenEntfernen_3.addActionListener(e -> {
            if (list_7.getSelectedIndices().length > 0) {
                final int[] indices = list_7.getSelectedIndices();
                int count = 0;

                for (final int index : indices) {
                    if (Main.ehgesichert[index - count].titel.equals(box_14.getSelectedItem())) {
                        if (index - count == 0) {
                            if (box_14.getSize() > 1) {
                                lblEinheit_2.setText(ehVergleichText(Main.ehgesichert[1]));
                            } else {
                                lblEinheit_2.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                                        "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                                        + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");
                            }
                        } else {
                            lblEinheit_2.setText(ehVergleichText(Main.ehgesichert[0]));
                        }
                    }

                    if (Main.ehgesichert[index - count].titel.equals(box_15.getSelectedItem())) {
                        if (index - count == 0) {
                            if (box_15.getSize() > 1) {
                                lblEinheit_3.setText(ehVergleichText(Main.ehgesichert[1]));
                            } else {
                                lblEinheit_3.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                                        "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                                        + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");
                            }
                        } else {
                            lblEinheit_3.setText(ehVergleichText(Main.ehgesichert[0]));
                        }
                    }

                    final ArrayList<EinheitenSave> eins = new ArrayList<>(Arrays.asList(Main.ehgesichert));
                    eins.remove(index - count);
                    Main.ehgesichert = eins.toArray(new EinheitenSave[0]);
                    Main.ehindex = Main.ehindex - 1;

                    model_7.removeElementAt(index - count);
                    box_14.removeElementAt(index - count);
                    box_15.removeElementAt(index - count);
                    box_16.removeElementAt(index - count);

                    count++;
                }

            }
        });
        // einheitenvorlagen alle l
        btnListeLeeren_4.addActionListener(e -> {
            Arrays.fill(Main.ehgesichert, new EinheitenSave("nix", Tags.NIX, 0, false, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, 0, "nix", 0));
            Main.ehindex = 0;

            lblEinheit_2.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                    "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                    + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");
            lblEinheit_3.setText("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: " + "..." + "<br><br>&nbsp;&nbsp;lvl: " + "..." +
                    "<br><br>&nbsp;&nbsp;Ap: " + "..." + "<br>&nbsp;&nbsp;Vp: " + "..." + "<br>&nbsp;&nbsp;Hp: " + "..." + "<br>&nbsp;&nbsp;Mp: " + "..." + "<br><br>" + "&nbsp;&nbsp;AtElement: ...<br>"
                    + "&nbsp;&nbsp;DefElement: ...<br>" + "</body></html>");

            model_7.removeAllElements();
            box_14.removeAllElements();
            box_15.removeAllElements();
            box_16.removeAllElements();
        });
    }

    /**
     * Launch the application.
     */
    public static void Interface() {
        EventQueue.invokeLater(() -> {
            try {
                final Oberflaeche frame = new Oberflaeche();
                frame.setTitle("Rechner");
                frame.setVisible(true);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        });
    }

    /*
     *  eingabe darufhin bzw. umwandeln ob es eine zahl ist
     */
    public static int Zahl(final String d) {
        if (d.isEmpty()) {
            return 0;
        } else {
            final String c = d.trim();
            final String x;
            final StringBuilder b = new StringBuilder();
            if (c.startsWith("-")) {
                b.append('-');
                x = c.substring(2);
            } else {
                x = c;
            }
            final String a = x.trim();
            boolean flag = true;

            for (int i = 0; i < a.length(); i++) {
                final char test = a.charAt(i);
                if (Character.isDigit(test)) {
                    b.append(test);
                } else {
                    if (!(test == '.' || test == ',' || test == '+')) {
                        if (test == 'k' || test == 'K') {
                            b.append("000");
                        } else {
                            flag = false;
                            final JFrame f = new JFrame("ERROR");
                            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            f.setSize(400, 100);
                            final JLabel errormessage = new JLabel("   " + d + " ist keine gEingabe !");
                            f.getContentPane().add(errormessage);
                            f.setLocation(400, 300);
                            f.setVisible(true);
                            break;
                        }
                    }
                }
            }

            if (flag) {
                return Integer.parseInt(new String(b));
            } else {
                return 0;
            }
        }
    }

    /* werte auf werte inkl. sk umrechnen */
    public static int umrechnen(final int a) {
        if (a <= 0) {
            return a;
        } else {
            final float sk = Main.lvlSk * 0.025f;
            final float zwischen = Math.round((a * sk));
            final int erg = (int) zwischen;
            return (erg + a);
        }
    }

    // wertet den eingegebenen namen zum speichern des Equips aus
    public String name(final String text, final int kategorie)    // 1 = equips , 2 = ehs
    {
        final String auszuwerten = text.trim();
        if (kategorie == 1) {
            if (auszuwerten.isEmpty()) return "#" + (indexEquipSave);
            else return auszuwerten;
        } else {
            if (auszuwerten.isEmpty()) return "#" + (Main.ehindex);
            else return auszuwerten;
        }
    }

    /*
     * schreibt die liste fgesperrte gegenst
     */
    public String textVorgeben(final int kategorie, final int index) {
        if (kategorie == 1) {
            Main.w = index;
        }
        if (kategorie == 2) {
            Main.s = index;
        }
        if (kategorie == 3) {
            Main.r = index;
        }
        if (kategorie == 4) {
            Main.h = index;
        }
        if (kategorie == 5) {
            Main.so = index;
        }

        final StringBuilder text = new StringBuilder("<html><body><br><b>Waffe:</b> &nbsp;&nbsp;");
        if (Main.w == -1) {
            text.append("alles erlaubt");
        } else {
            text.append(comboBox_9.getItemAt(Main.w));
        }
        text.append("<br> <b>Schild:</b> &nbsp;&nbsp;");
        if (Main.s == -1) {
            text.append("alles erlaubt");
        } else {
            text.append(comboBox_10.getItemAt(Main.s));
        }
        text.append("<br> <b>R\u00FCstung:</b> &nbsp;&nbsp;");
        if (Main.r == -1) {
            text.append("alles erlaubt");
        } else {
            text.append(comboBox_11.getItemAt(Main.r));
        }
        text.append("<br> <b>Helm:</b> &nbsp;&nbsp;");
        if (Main.h == -1) {
            text.append("alles erlaubt");
        } else {
            text.append(comboBox_12.getItemAt(Main.h));
        }
        text.append("<br> <b>Schmuck:</b> &nbsp;&nbsp;");
        if (Main.so == -1) {
            text.append("alles erlaubt");
        } else {
            text.append(comboBox_13.getItemAt(Main.so));
        }
        text.append("<br><body><html>");


        return new String(text);
    }

    /* text fden vergleich von einheitenvorlagen */
    public String ehVergleichText(final EinheitenSave gew) {
        final StringBuilder str = new StringBuilder();
        str.append("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit: ")
                .append(gew.name)
                .append("<br><br>&nbsp;&nbsp;lvl: ")
                .append(gew.lvl)
                .append("<br>&nbsp;&nbsp;Ap: ")
                .append(gew.ap)
                .append(" (")
                .append(gew.ap / gew.kp)
                .append(")")
                .append("<br>&nbsp;&nbsp;Vp: ")
                .append(gew.vp)
                .append(" (")
                .append(gew.vp / gew.kp)
                .append(")")
                .append("<br>&nbsp;&nbsp;Hp: ")
                .append(gew.hp)
                .append(" (")
                .append(gew.hp / gew.kp)
                .append(")")
                .append("<br>&nbsp;&nbsp;Mp: ")
                .append(gew.mp)
                .append(" (")
                .append(gew.mp / gew.kp)
                .append(")")
                .append("<br>&nbsp;&nbsp;Opferpunkte: ")
                .append(gew.opwert)
                .append("<br><br>");
        if (!gew.atfire && !gew.atair && !gew.atearth && !gew.atice && gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Keines - FK<br>");
        }
        if (gew.atfire && !gew.atair && gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Feuer - FK<br>");
        }
        if (!gew.atfire && gew.atair && gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Luft - FK<br>");
        }
        if (gew.atfire && gew.atair && gew.fk) {
            str.append("&nbsp;&nbsp;AtElemente: Feuer/Luft - FK<br>");
        }
        if (gew.atearth && !gew.atice && gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Erde - FK<br>");
        }
        if (!gew.atearth && gew.atice && gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Eis - FK<br>");
        }
        if (gew.atearth && gew.atice && gew.fk) {
            str.append("&nbsp;&nbsp;AtElemente: Erde/Eis - FK<br>");
        }
        if (!gew.atfire && !gew.atair && !gew.atearth && !gew.atice && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Keines<br>");
        }
        if (gew.atfire && !gew.atair && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Feuer<br>");
        }
        if (!gew.atfire && gew.atair && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Luft<br>");
        }
        if (gew.atfire && gew.atair && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElemente: Feuer/Luft<br>");
        }
        if (gew.atearth && !gew.atice && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Erde<br>");
        }
        if (!gew.atearth && gew.atice && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElement: Eis<br>");
        }
        if (gew.atearth && gew.atice && !gew.fk) {
            str.append("&nbsp;&nbsp;AtElemente: Erde/Eis<br>");
        }

        if (!gew.fire && !gew.air && !gew.earth && !gew.ice) {
            str.append("&nbsp;&nbsp;DefElement: Keines<br>");
        }
        if (gew.fire && !gew.air) {
            str.append("&nbsp;&nbsp;DefElement: Feuer<br>");
        }
        if (!gew.fire && gew.air) {
            str.append("&nbsp;&nbsp;DefElement: Luft<br>");
        }
        if (gew.fire && gew.air) {
            str.append("&nbsp;&nbsp;DefElemente: Feuer/Luft<br>");
        }
        if (gew.earth && !gew.ice) {
            str.append("&nbsp;&nbsp;DefElement: Erde<br>");
        }
        if (!gew.earth && gew.ice) {
            str.append("&nbsp;&nbsp;DefElement: Eis<br>");
        }
        if (gew.earth && gew.ice) {
            str.append("&nbsp;&nbsp;DefElemente: Erde/Eis<br>");
        }

        str.append("</body></html>");

        return new String(str);
    }

    /* 	felder entsprechend der einheit sichtbar/unsichtbar machen	*/
    public Einheiten Visibels(final String b) {
        Einheiten selected = null;

        for (final Einheiten e : Main.einheiten) {
            if (e.name.equals(b)) selected = e;
        }
        for (final Einheiten e : Main.zusatzUnits) {
            if (e.name.equals(b)) selected = e;
        }

        if (selected != null) {
            if (selected.kraft > 0) {
                btnAdd.setEnabled(true);
                comboBox_4.setSelectedIndex(-1);
                comboBox_5.setSelectedIndex(-1);
            } else {
                btnAdd.setEnabled(false);
            }

            switch (selected.rasse) {
                case MENSCH: {
                    lblBla.setVisible(false);
                    lblSteinhaut.setVisible(false);
                    lblDunklesOmen.setVisible(false);
                    lblGeisterrstung.setVisible(false);
                    lblHllenaura.setVisible(false);
                    lblVerrotten.setVisible(false);
                    lblEnergiefocus.setVisible(true);
                    lblGtterschil.setVisible(true);
                    lblHeiligerRitus.setVisible(true);
                    lblMeditation.setVisible(true);
                    lblDrachenhaut.setVisible(false);
                    lblDrachenwut.setVisible(false);
                    lblDhStufe.setVisible(false);
                    lblDhDauer.setVisible(false);

                    Energiefokuss.setVisible(true);
                    DunklesOmen.setVisible(false);
                    Goetterschild.setVisible(true);
                    Geisterruestung.setVisible(false);
                    HeiligerRitus.setVisible(true);
                    Hoellenaura.setVisible(false);
                    Meditation.setVisible(true);
                    Verrotten.setVisible(false);
                    BrennendesBlut.setVisible(false);
                    Steinhaut.setVisible(false);
                    Drachenhaut.setVisible(false);
                    Drachenwut.setVisible(false);
                    dhausbildungsdauerauswahl.setVisible(false);
                    DhStufe.setVisible(false);
                    break;
                }

                case UNTOT: {
                    lblBla.setVisible(false);
                    lblSteinhaut.setVisible(false);
                    lblDunklesOmen.setVisible(true);
                    lblGeisterrstung.setVisible(true);
                    lblHllenaura.setVisible(true);
                    lblVerrotten.setVisible(true);
                    lblEnergiefocus.setVisible(false);
                    lblGtterschil.setVisible(false);
                    lblHeiligerRitus.setVisible(false);
                    lblMeditation.setVisible(false);
                    lblDrachenhaut.setVisible(false);
                    lblDrachenwut.setVisible(false);
                    lblDhStufe.setVisible(false);
                    lblDhDauer.setVisible(false);

                    Energiefokuss.setVisible(false);
                    DunklesOmen.setVisible(true);
                    Goetterschild.setVisible(false);
                    Geisterruestung.setVisible(true);
                    HeiligerRitus.setVisible(false);
                    Hoellenaura.setVisible(true);
                    Meditation.setVisible(false);
                    Verrotten.setVisible(true);
                    BrennendesBlut.setVisible(false);
                    Steinhaut.setVisible(false);
                    Drachenhaut.setVisible(false);
                    Drachenwut.setVisible(false);
                    dhausbildungsdauerauswahl.setVisible(false);
                    DhStufe.setVisible(false);
                    break;
                }

                case DAEMON: {
                    lblBla.setVisible(true);
                    lblSteinhaut.setVisible(true);
                    lblDunklesOmen.setVisible(false);
                    lblGeisterrstung.setVisible(false);
                    lblHllenaura.setVisible(false);
                    lblVerrotten.setVisible(false);
                    lblEnergiefocus.setVisible(false);
                    lblGtterschil.setVisible(false);
                    lblHeiligerRitus.setVisible(false);
                    lblMeditation.setVisible(false);
                    lblDrachenhaut.setVisible(false);
                    lblDrachenwut.setVisible(false);
                    lblDhStufe.setVisible(false);
                    lblDhDauer.setVisible(false);

                    Energiefokuss.setVisible(false);
                    DunklesOmen.setVisible(false);
                    Goetterschild.setVisible(false);
                    Geisterruestung.setVisible(false);
                    HeiligerRitus.setVisible(false);
                    Hoellenaura.setVisible(false);
                    Meditation.setVisible(false);
                    Verrotten.setVisible(false);
                    BrennendesBlut.setVisible(true);
                    Steinhaut.setVisible(true);
                    Drachenhaut.setVisible(false);
                    Drachenwut.setVisible(false);
                    dhausbildungsdauerauswahl.setVisible(false);
                    DhStufe.setVisible(false);
                    break;
                }

                case DRACHE: {
                    lblBla.setVisible(false);
                    lblSteinhaut.setVisible(false);
                    lblDunklesOmen.setVisible(false);
                    lblGeisterrstung.setVisible(false);
                    lblHllenaura.setVisible(false);
                    lblVerrotten.setVisible(false);
                    lblEnergiefocus.setVisible(false);
                    lblGtterschil.setVisible(false);
                    lblHeiligerRitus.setVisible(false);
                    lblMeditation.setVisible(false);
                    lblDrachenhaut.setVisible(true);
                    lblDrachenwut.setVisible(true);
                    lblDhStufe.setVisible(true);
                    lblDhDauer.setVisible(true);

                    Energiefokuss.setVisible(false);
                    DunklesOmen.setVisible(false);
                    Goetterschild.setVisible(false);
                    Geisterruestung.setVisible(false);
                    HeiligerRitus.setVisible(false);
                    Hoellenaura.setVisible(false);
                    Meditation.setVisible(false);
                    Verrotten.setVisible(false);
                    BrennendesBlut.setVisible(false);
                    Steinhaut.setVisible(false);
                    Drachenhaut.setVisible(true);
                    Drachenwut.setVisible(true);
                    dhausbildungsdauerauswahl.setVisible(true);
                    DhStufe.setVisible(true);
                    break;
                }

                default: {
                    lblBla.setVisible(false);
                    lblSteinhaut.setVisible(false);
                    lblDunklesOmen.setVisible(false);
                    lblGeisterrstung.setVisible(false);
                    lblHllenaura.setVisible(false);
                    lblVerrotten.setVisible(false);
                    lblEnergiefocus.setVisible(false);
                    lblGtterschil.setVisible(false);
                    lblHeiligerRitus.setVisible(false);
                    lblMeditation.setVisible(false);
                    lblDrachenhaut.setVisible(false);
                    lblDrachenwut.setVisible(false);
                    lblDhStufe.setVisible(false);
                    lblDhDauer.setVisible(false);

                    Energiefokuss.setVisible(false);
                    DunklesOmen.setVisible(false);
                    Goetterschild.setVisible(false);
                    Geisterruestung.setVisible(false);
                    HeiligerRitus.setVisible(false);
                    Hoellenaura.setVisible(false);
                    Meditation.setVisible(false);
                    Verrotten.setVisible(false);
                    BrennendesBlut.setVisible(false);
                    Steinhaut.setVisible(false);
                    Drachenhaut.setVisible(false);
                    Drachenwut.setVisible(false);
                    dhausbildungsdauerauswahl.setVisible(false);
                    DhStufe.setVisible(false);
                    break;
                }
            }
            return selected;
        } else {
            return Main.einheiten[0];
        }
    }

    /* at und def listen mit den passenden komponenten f*/
    public void listenFuellen(final int model, final int ele)        //1=model_1 , 2=model_2   	-	0=alle, 1= feuer/wind , 2=eis/erde
    {
        if (model == 1) {
            if (ele == 0) {
                fuellung[0] = 0;
                model_1.addElement("Keins");
                model_1.addElement("Egal");
                model_1.addElement("Feuer");
                model_1.addElement("Wind");
                model_1.addElement("Eis");
                model_1.addElement("Erde");
                list_1.setSelectedIndex(1);
            }
            if (ele == 1) {
                fuellung[0] = 1;
                model_1.addElement("Keins");
                model_1.addElement("Egal");
                model_1.addElement("Feuer");
                model_1.addElement("Wind");
                list_1.setSelectedIndex(1);
            }
            if (ele == 2) {
                fuellung[0] = 2;
                model_1.addElement("Keins");
                model_1.addElement("Egal");
                model_1.addElement("Eis");
                model_1.addElement("Erde");
                list_1.setSelectedIndex(1);
            }
        } else {
            if (ele == 0) {
                fuellung[1] = 0;
                model_2.addElement("Keins");
                model_2.addElement("Egal");
                model_2.addElement("Feuer");
                model_2.addElement("Wind");
                model_2.addElement("Feuer/Wind");
                model_2.addElement("Eis");
                model_2.addElement("Erde");
                model_2.addElement("Eis/Erde");
                list_2.setSelectedIndex(1);
            }
            if (ele == 1) {
                fuellung[1] = 1;
                model_2.addElement("Keins");
                model_2.addElement("Egal");
                model_2.addElement("Feuer");
                model_2.addElement("Wind");
                model_2.addElement("Feuer/Wind");
                list_2.setSelectedIndex(1);
            }
            if (ele == 2) {
                fuellung[1] = 2;
                model_2.addElement("Keins");
                model_2.addElement("Egal");
                model_2.addElement("Eis");
                model_2.addElement("Erde");
                model_2.addElement("Eis/Erde");
                list_2.setSelectedIndex(1);
            }
        }
    }

    /* das muss alles passieren wenn eine einheit gewwird */
    public void auswaehlenEh(final Einheiten i) {
        /* einheitenstats */
        Main.boxi.ehHatFk = i.fk;
        if (Main.boxi.aendernErlaubt) {
            Main.boxi.ehHatFire = i.fire;
            Main.boxi.ehHatAir = i.air;
            Main.boxi.ehHatEarth = i.earth;
            Main.boxi.ehHatIce = i.ice;
        }
        Main.maxKraft = i.kraft + Zahl(textField_2.getText());


        /* FK schalter freischalten */
        if (i.fk) {
            Main.boxi.ehHatFk = true;
            Main.boxi.darfFkNutzen = true;
            Main.boxi.mussFkNutzen = false;
            Main.boxi.darfNichtFkNutzen = false;
            chckbxMussFkWaffe.setEnabled(true);
            chckbxDarfKeineFk.setEnabled(true);
        } else {
            Main.boxi.ehHatFk = false;
            Main.boxi.darfFkNutzen = false;
            Main.boxi.mussFkNutzen = false;
            Main.boxi.darfNichtFkNutzen = false;
            chckbxMussFkWaffe.setEnabled(false);
            chckbxDarfKeineFk.setEnabled(false);
        }

        /* listen f*/
        model_1.clear();
        model_2.clear();
        if (Main.boxi.ehHatAir || Main.boxi.ehHatFire) {
            listenFuellen(1, 1);
            listenFuellen(2, 1);
        } else {
            if (Main.boxi.ehHatEarth || Main.boxi.ehHatIce) {
                listenFuellen(1, 2);
                listenFuellen(2, 2);
            } else {
                listenFuellen(1, 0);
                listenFuellen(2, 0);
            }
        }
    }

    /* das muss alles passieren wenn ein at-ele gewwird */
    public void auswaehlenAt(final int k) {
        final char i;
        if (k < 0) {
            i = '0';
        } else {
            i = Character.forDigit(k, 6);
        }

        if (list_2.getSelectedIndex() > 1) {
            if (fuellung[0] == 0) {
                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 0);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 0);
                            break;
                        }
                    }
                    case '2': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = true;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = true;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            model_2.clear();
                            listenFuellen(2, 1);
                            vorrang = 1;
                            break;
                        }
                    }
                    case '3': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = true;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = true;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            model_2.clear();
                            listenFuellen(2, 1);
                            vorrang = 1;
                            break;
                        }
                    }
                    case '4': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = true;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = true;
                            model_2.clear();
                            listenFuellen(2, 2);
                            vorrang = 1;
                            break;
                        }
                    }
                    case '5': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = true;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = true;
                            Main.boxi.atMussEis = false;
                            model_2.clear();
                            listenFuellen(2, 2);
                            vorrang = 1;
                            break;
                        }
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[0] == 1) {
                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 1);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 1);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = true;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        break;
                    }
                    case '3': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = true;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[0] == 2) {
                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 2);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 2);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = true;
                        break;
                    }
                    case '3': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = true;
                        Main.boxi.atMussEis = false;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        } else {
            if (fuellung[0] == 0) {
                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 0);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 0);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = true;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 1);
                        vorrang = 1;
                        break;
                    }
                    case '3': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = true;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 1);
                        vorrang = 1;
                        break;
                    }
                    case '4': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = true;
                        model_2.clear();
                        listenFuellen(2, 2);
                        vorrang = 1;
                        break;
                    }
                    case '5': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = true;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 2);
                        vorrang = 1;
                        break;
                    }
                    default: {
                        System.out.println(3);
                        break;
                    }
                }
            }
            if (fuellung[0] == 1) {

                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 1);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 1);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = true;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 1);
                        vorrang = 1;
                        break;
                    }
                    case '3': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = true;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 1);
                        vorrang = 1;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[0] == 2) {

                switch (i) {
                    case '0': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = false;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 2);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 1) {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            break;
                        } else {
                            Main.boxi.atDarfEleNutzen = true;
                            Main.boxi.atMussFeuer = false;
                            Main.boxi.atMussWind = false;
                            Main.boxi.atMussErde = false;
                            Main.boxi.atMussEis = false;
                            vorrang = 0;
                            model_2.clear();
                            listenFuellen(2, 2);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = false;
                        Main.boxi.atMussEis = true;
                        model_2.clear();
                        listenFuellen(2, 2);
                        vorrang = 1;
                        break;
                    }
                    case '3': {
                        Main.boxi.atDarfEleNutzen = true;
                        Main.boxi.atMussFeuer = false;
                        Main.boxi.atMussWind = false;
                        Main.boxi.atMussErde = true;
                        Main.boxi.atMussEis = false;
                        model_2.clear();
                        listenFuellen(2, 2);
                        vorrang = 1;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        }
    }

    //"Keins", "Egal", "Feuer", "Wind", "Feuer/Wind", "Eis", "Erde", "Eis/Erde"
    /* das muss alles passieren wenn ein def-ele gewwird */
    public void auswaehlenDef(final int k) {
        final char i;
        if (k < 0) {
            i = '0';
        } else {
            i = Character.forDigit(k, 8);
        }

        if (list_1.getSelectedIndex() > 1) {
            if (fuellung[1] == 0) {
                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 0);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 0);
                            break;
                        }
                    }
                    case '2': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = true;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = true;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            model_1.clear();
                            listenFuellen(1, 1);
                            vorrang = 2;
                            break;
                        }
                    }
                    case '3': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = true;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = true;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            model_1.clear();
                            listenFuellen(1, 1);
                            vorrang = 2;
                            break;
                        }
                    }
                    case '4': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = true;
                            Main.boxi.defMussWind = true;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = true;
                            Main.boxi.defMussWind = true;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            model_1.clear();
                            listenFuellen(1, 1);
                            vorrang = 2;
                            break;
                        }
                    }
                    case '5': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = true;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = true;
                            model_1.clear();
                            listenFuellen(1, 2);
                            vorrang = 2;
                            break;
                        }
                    }
                    case '6': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = true;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = true;
                            Main.boxi.defMussEis = false;
                            model_1.clear();
                            listenFuellen(1, 2);
                            vorrang = 2;
                            break;
                        }
                    }
                    case '7': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = true;
                            Main.boxi.defMussEis = true;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = true;
                            Main.boxi.defMussEis = true;
                            model_1.clear();
                            listenFuellen(1, 2);
                            vorrang = 2;
                            break;
                        }
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[1] == 1) {
                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 1);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 1);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        break;
                    }
                    case '3': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        break;
                    }
                    case '4': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[1] == 2) {
                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 2);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 2);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = true;
                        break;
                    }
                    case '3': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = false;
                        break;
                    }
                    case '4': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = true;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        } else {
            if (fuellung[1] == 0) {
                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 0);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 0);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    case '3': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    case '4': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    case '5': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = true;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    case '6': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    case '7': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = true;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[1] == 1) {

                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 1);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 1);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    case '3': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    case '4': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = true;
                        Main.boxi.defMussWind = true;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 1);
                        vorrang = 2;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            if (fuellung[1] == 2) {

                switch (i) {
                    case '0': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = false;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 2);
                            break;
                        }
                    }
                    case '1': {
                        if (vorrang != 2) {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            break;
                        } else {
                            Main.boxi.defDarfEleNutzen = true;
                            Main.boxi.defMussFeuer = false;
                            Main.boxi.defMussWind = false;
                            Main.boxi.defMussErde = false;
                            Main.boxi.defMussEis = false;
                            vorrang = 0;
                            model_1.clear();
                            listenFuellen(1, 2);
                            break;
                        }
                    }
                    case '2': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = false;
                        Main.boxi.defMussEis = true;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    case '3': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = false;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    case '4': {
                        Main.boxi.defDarfEleNutzen = true;
                        Main.boxi.defMussFeuer = false;
                        Main.boxi.defMussWind = false;
                        Main.boxi.defMussErde = true;
                        Main.boxi.defMussEis = true;
                        model_1.clear();
                        listenFuellen(1, 2);
                        vorrang = 2;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        }
    }

    // lvl-tabellen fuellen
    public void Rechnen() {
        final Integer[][] werte = Bausystem.Rechnen(1);
        final Integer[][] werte1 = Bausystem.Rechnen(2);
        for (int i = 0; i < 11; i++) {
            for (int j = 1; j < 5; j++) {
                table.setValueAt(werte[i][j], i, j);
                table_1.setValueAt(werte1[i][j], i, j);
            }
        }
    }
}
