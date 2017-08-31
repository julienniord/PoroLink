package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import poroLink.utils.views.ViewUtils;

public abstract class BaseView implements IBaseView {

	protected JPanel contentPane;
	protected String pageName;

	/**
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	@Override
	public void loadView(JFrame frame) {
		frame.setTitle(getPageName());
		ViewUtils.configureJFrame(frame, getContentPane());
	}
}
