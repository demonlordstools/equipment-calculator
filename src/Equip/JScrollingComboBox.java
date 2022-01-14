package Equip;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.basic.*;


/*
 * die spezielle combobox mit scrollbalken
 */
public class JScrollingComboBox extends JComboBox{
    public JScrollingComboBox(){
        super();
        setUI(new scrollingComboBoxUI());
    }

    public class scrollingComboBoxUI extends MetalComboBoxUI{
        protected ComboPopup createPopup(){
            BasicComboPopup popup = new BasicComboPopup(comboBox){

                protected Rectangle computePopupBounds(int x, int y, int width, int height){
                    // Check whether scrollbar must be displayed
                    if(list.getPreferredSize().getWidth() > width)
                        height += (int)new JScrollBar().getPreferredSize().getWidth();

                    return super.computePopupBounds(x, y, width, height);
                }

                protected JScrollPane createScroller() {
                    JScrollPane pane =  new JScrollPane( list, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );

                    return pane;
                }
            };

            return popup;
        }
    }
}
	

