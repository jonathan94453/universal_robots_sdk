package BWT.FastFeature.impl;

import com.ur.urcap.api.contribution.driver.general.script.ScriptCodeGenerator;
import com.ur.urcap.api.contribution.toolbar.ToolbarContext;
import com.ur.urcap.api.contribution.toolbar.swing.SwingToolbarContribution;
import com.ur.urcap.api.domain.script.ScriptWriter;
import com.ur.urcap.api.domain.tcp.TCP;
import com.ur.urcap.api.domain.variable.Variable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;


class MyToolbarContribution implements SwingToolbarContribution {
	private static final int HEADER_FONT_SIZE = 24;
	private static final int FREEDRIVE_FONT_SIZE = 18;  

	private final ToolbarContext context;
 

	MyToolbarContribution(ToolbarContext context) {
		this.context = context;
	} 

	@Override
	public void openView() {
		//
	}

	@Override
	public void closeView() {
	
	}

	public void buildUI(JPanel jPanel) {
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		jPanel.add(addTitle()); 
		jPanel.add(addFreeDrive()); 



	} 


//Adds Header/Title
	private Box addTitle() {
		Box LabelBox = Box.createHorizontalBox(); 
		LabelBox.setAlignmentX(Component.CENTER_ALIGNMENT); 

		JLabel label = new JLabel("BWT Fast Feature"); 
		label.setFont(label.getFont().deriveFont(Font.BOLD, HEADER_FONT_SIZE)); 
		LabelBox.add(label); 


		return LabelBox; 

	}
//Adds Freedrive CheckBox and Text
	private Box addFreeDrive() {
		Box groupBox = Box.createHorizontalBox(); 
		groupBox.setAlignmentX(Component.CENTER_ALIGNMENT); 
		JCheckBox freedrive = new JCheckBox("FreeDrive"); 

		freedrive.setFont(freedrive.getFont().deriveFont(Font.BOLD, FREEDRIVE_FONT_SIZE)); 
		groupBox.add(freedrive); 

		return groupBox; 
	}


	
	}


	