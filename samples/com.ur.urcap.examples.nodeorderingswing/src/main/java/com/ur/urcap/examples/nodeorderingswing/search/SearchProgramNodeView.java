package com.ur.urcap.examples.nodeorderingswing.search;

import com.ur.urcap.api.contribution.ContributionProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeView;
import com.ur.urcap.examples.nodeorderingswing.style.Style;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;

public class SearchProgramNodeView implements SwingProgramNodeView<SearchProgramNodeContribution> {

	private static final String SORT_ORDER_ID = "Display Order Id";
	private JLabel orderIdTitle;
	private JLabel orderIdValue;

	private final Style style;

	SearchProgramNodeView(Style style) {
		this.style = style;
	}

	@Override
	public void buildUI(JPanel jPanel, final ContributionProvider<SearchProgramNodeContribution> provider) {
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		jPanel.add(createPreview());
	}

	private Box createPreview() {
		Box previewBox = Box.createHorizontalBox();
		previewBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		orderIdTitle = new JLabel(SORT_ORDER_ID);
		previewBox.add(orderIdTitle);

		previewBox.add(createHorizontalSpacing());

		orderIdValue = new JLabel();
		previewBox.add(orderIdValue);

		return previewBox;
	}

	private Component createHorizontalSpacing() {
		return Box.createRigidArea(new Dimension(style.getHorizontalSpacing(), 0));
	}

	public void setNodeOrderId(double orderId) {
		orderIdValue.setText(Double.toString(orderId));
	}
}
