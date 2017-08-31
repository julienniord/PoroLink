package poroLink.views.customrenders;

import poroLink.entities.*;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ListCellUserRender extends DefaultListCellRenderer {
	public Component getListCellRendererComponent(JList<?> list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected,
				cellHasFocus);
		if (value instanceof Post) {
			Post item = (Post) value;

				//setText(item.getAppuser_id() + " " + item.getCompany_name()+item.getPosts().get(0).getPost_name());
				setText(item.getPost_name());
			
			
			//setToolTipText(item.getRole().toString());
			
		}
		return this;
	}
}
