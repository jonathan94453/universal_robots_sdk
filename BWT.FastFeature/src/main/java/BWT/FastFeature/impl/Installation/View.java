package BWT.FastFeature.impl.Installation;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;

import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.installation.swing.SwingInstallationNodeView;


public class View implements SwingInstallationNodeView<Contribution> {
    private JCheckBox freedrive; 
    private ViewAPIProvider apiProvider; 
    private static final int HEADER_FONT_SIZE = 24;
	private static final int FREEDRIVE_FONT_SIZE = 18;   
    public View(ViewAPIProvider apiProvider) {
        this.apiProvider = apiProvider; 
    }
   
//Adds Header/Title
	private Box addTitle() {
		Box LabelBox = Box.createHorizontalBox(); 
		LabelBox.setAlignmentX(Component.CENTER_ALIGNMENT); 

		JLabel label = new JLabel("BWT Fast Feature"); 
		label.setFont(label.getFont().deriveFont(HEADER_FONT_SIZE)); 
		LabelBox.add(label); 


		return LabelBox; 

	}
//Adds Freedrive CheckBox and Text
	private Box addFreeDrive(Contribution contribution) {
		Box groupBox = Box.createHorizontalBox(); 
		groupBox.setAlignmentX(Component.CENTER_ALIGNMENT); 
		freedrive = new JCheckBox("FreeDrive"); 

		freedrive.setFont(freedrive.getFont().deriveFont(FREEDRIVE_FONT_SIZE)); 
		groupBox.add(freedrive); 
        
        freedrive.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Boolean selected = (e.getStateChange() == ItemEvent.SELECTED); 
                contribution.SetFreeDriveEnabled(selected);
                System.out.println(selected);
            }
        }); 


		return groupBox; 
	}

    @Override
    public void buildUI(JPanel jpanel, Contribution contribution) {
        jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		jpanel.add(addTitle()); 
		jpanel.add(addFreeDrive(contribution)); 

    }
	
	}



