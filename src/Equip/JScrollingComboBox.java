package Equip;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.metal.MetalComboBoxUI;
import java.awt.Rectangle;

/*
 * die spezielle combobox mit scrollbalken
 */
public class JScrollingComboBox<E> extends JComboBox<E> {
    public JScrollingComboBox() {
        super();
        setUI(new ScrollingComboBoxUI());
    }

    public static class ScrollingComboBoxUI extends MetalComboBoxUI {
        protected ComboPopup createPopup() {
            return new BasicComboPopup(comboBox) {

                protected Rectangle computePopupBounds(final int x, final int y, final int width, int height) {
                    // Check whether scrollbar must be displayed
                    if (list.getPreferredSize().getWidth() > width)
                        height += (int) new JScrollBar().getPreferredSize().getWidth();

                    return super.computePopupBounds(x, y, width, height);
                }

                protected JScrollPane createScroller() {
                    return new JScrollPane(
                            list,
                            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                }
            };
        }
    }
}


