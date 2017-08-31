package poroLink.views.customrenders;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import poroLink.entities.Post;

public class ListCellPostRender extends DefaultListCellRenderer {
	public Component getListCellRendererComponent(JList<?> list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected,
				cellHasFocus);
		if (value instanceof Post) {
			Post item = (Post) value;
				setText(item.getPost_name());		
		}
		return this;
	}
}
