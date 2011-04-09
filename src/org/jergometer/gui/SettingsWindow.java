package org.jergometer.gui;

import org.jergometer.translation.I18n;
import org.jergometer.communication.BikeConnectorSerial;
import org.jergometer.communication.BikeConnectionTester;
import org.jergometer.JergometerSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ResourceBundle;

/**
 * Settings window.
 */
public class SettingsWindow extends JDialog {
	{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer
	 * >>> IMPORTANT!! <<<
	 * DO NOT edit this method OR call it in your code!
	 *
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		final JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(10, 10, 10, 10);
		mainPanel.add(panel1, gbc);
		panel1.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("label.global_settings")));
		final JLabel label1 = new JLabel();
		this.$$$loadLabelText$$$(label1, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.com_port"));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 3, 0, 5);
		panel1.add(label1, gbc);
		final JPanel spacer1 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		panel1.add(spacer1, gbc);
		comPortComboBox = new JComboBox();
		comPortComboBox.setEditable(false);
		final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
		comPortComboBox.setModel(defaultComboBoxModel1);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 5, 0, 5);
		panel1.add(comPortComboBox, gbc);
		updatePortsButton = new JButton();
		this.$$$loadButtonText$$$(updatePortsButton, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.update_ports"));
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 0, 3);
		panel1.add(updatePortsButton, gbc);
		enterPortNameCheckBox = new JCheckBox();
		this.$$$loadButtonText$$$(enterPortNameCheckBox, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.enter_port_name"));
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(5, 0, 1, 0);
		panel1.add(enterPortNameCheckBox, gbc);
		testPortButton = new JButton();
		this.$$$loadButtonText$$$(testPortButton, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.test_port"));
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 1, 3);
		panel1.add(testPortButton, gbc);
		final JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout(0, 0));
		panel2.setBackground(new Color(-16777216));
		panel2.setFocusable(false);
		panel2.setMaximumSize(new Dimension(2147483647, 1));
		panel2.setMinimumSize(new Dimension(1, 1));
		panel2.setOpaque(false);
		panel2.setPreferredSize(new Dimension(1, 1));
		panel2.setRequestFocusEnabled(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 0, 5, 0);
		panel1.add(panel2, gbc);
		panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(UIManager.getColor("Button.shadow")), null));
		final JLabel label2 = new JLabel();
		this.$$$loadLabelText$$$(label2, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("label.xml_editor"));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 3, 0, 5);
		panel1.add(label2, gbc);
		xmlEditorTextField = new JTextField();
		xmlEditorTextField.setPreferredSize(new Dimension(6, 22));
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 5, 1, 5);
		panel1.add(xmlEditorTextField, gbc);
		xmlEditorChooseButton = new JButton();
		xmlEditorChooseButton.setPreferredSize(new Dimension(67, 21));
		this.$$$loadButtonText$$$(xmlEditorChooseButton, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("label.file_choosing"));
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 1, 3);
		panel1.add(xmlEditorChooseButton, gbc);
		final JPanel panel3 = new JPanel();
		panel3.setLayout(new GridBagLayout());
		panel3.setBackground(new Color(-16777216));
		panel3.setMaximumSize(new Dimension(2147483647, 1));
		panel3.setMinimumSize(new Dimension(1, 1));
		panel3.setPreferredSize(new Dimension(1, 1));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 0, 5, 0);
		panel1.add(panel3, gbc);
		panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(UIManager.getColor("Button.shadow")), null));
		final JLabel label3 = new JLabel();
		this.$$$loadLabelText$$$(label3, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.update"));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 3, 0, 5);
		panel1.add(label3, gbc);
		checkForUpdatesOnStartCheckBox = new JCheckBox();
		checkForUpdatesOnStartCheckBox.setSelected(true);
		this.$$$loadButtonText$$$(checkForUpdatesOnStartCheckBox, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("settings.check_for_updates_on_start"));
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		panel1.add(checkForUpdatesOnStartCheckBox, gbc);
		final JPanel panel4 = new JPanel();
		panel4.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		mainPanel.add(panel4, gbc);
		saveButton = new JButton();
		this.$$$loadButtonText$$$(saveButton, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("label.save"));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 0, 2);
		panel4.add(saveButton, gbc);
		final JPanel spacer2 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		panel4.add(spacer2, gbc);
		abortButton = new JButton();
		this.$$$loadButtonText$$$(abortButton, ResourceBundle.getBundle("org/jergometer/translation/jergometer").getString("label.abort"));
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 2, 0, 0);
		panel4.add(abortButton, gbc);
	}

	/**
	 * @noinspection ALL
	 */
	private void $$$loadLabelText$$$(JLabel component, String text) {
		StringBuffer result = new StringBuffer();
		boolean haveMnemonic = false;
		char mnemonic = '\0';
		int mnemonicIndex = -1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '&') {
				i++;
				if (i == text.length()) break;
				if (!haveMnemonic && text.charAt(i) != '&') {
					haveMnemonic = true;
					mnemonic = text.charAt(i);
					mnemonicIndex = result.length();
				}
			}
			result.append(text.charAt(i));
		}
		component.setText(result.toString());
		if (haveMnemonic) {
			component.setDisplayedMnemonic(mnemonic);
			component.setDisplayedMnemonicIndex(mnemonicIndex);
		}
	}

	/**
	 * @noinspection ALL
	 */
	private void $$$loadButtonText$$$(AbstractButton component, String text) {
		StringBuffer result = new StringBuffer();
		boolean haveMnemonic = false;
		char mnemonic = '\0';
		int mnemonicIndex = -1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '&') {
				i++;
				if (i == text.length()) break;
				if (!haveMnemonic && text.charAt(i) != '&') {
					haveMnemonic = true;
					mnemonic = text.charAt(i);
					mnemonicIndex = result.length();
				}
			}
			result.append(text.charAt(i));
		}
		component.setText(result.toString());
		if (haveMnemonic) {
			component.setMnemonic(mnemonic);
			component.setDisplayedMnemonicIndex(mnemonicIndex);
		}
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return mainPanel;
	}


	public enum ReturnCode {
		abort, save
	}

	private ReturnCode returnCode;

	private JPanel mainPanel;
	private JComboBox comPortComboBox;
	private JCheckBox enterPortNameCheckBox;
	private JButton updatePortsButton;
	private JButton testPortButton;
	private JButton saveButton;
	private JButton abortButton;
	private JTextField xmlEditorTextField;
	private JButton xmlEditorChooseButton;
	private JCheckBox checkForUpdatesOnStartCheckBox;

	public SettingsWindow(Frame owner) {
		super(owner, I18n.getString("settings_dialog.title"), true);
		setContentPane(mainPanel);
		pack();

		// place window in the center of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = getSize();
		setLocation(screenSize.width / 2 - (windowSize.width / 2), screenSize.height / 2 - (windowSize.height / 2));

		// add listeners
		final SettingsWindow settingsWindow = this;
		enterPortNameCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comPortComboBox.setEditable(enterPortNameCheckBox.isSelected());
			}
		});
		updatePortsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateComPorts(null);
			}
		});
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnCode = ReturnCode.save;
				setVisible(false);
			}
		});
		abortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnCode = ReturnCode.abort;
				setVisible(false);
			}
		});
		testPortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					@Override
					public void run() {
						testComPort(settingsWindow);
					}
				}.start();
			}
		});
		xmlEditorChooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: open file chooser dialog
				JOptionPane.showMessageDialog(settingsWindow, I18n.getString("msg.not_implemented_yet"));
			}
		});

		// allow closing the dialog with escape
		final KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);
		final ActionListener listener = new ActionListener() {
			public final void actionPerformed(final ActionEvent e) {
				returnCode = ReturnCode.abort;
				setVisible(false);
			}
		};
		getRootPane().registerKeyboardAction(listener, keyStroke, JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	}

	private void testComPort(final SettingsWindow settingsWindow) {
		BikeConnectionTester bikeConnectionTester = new BikeConnectionTester(settingsWindow, comPortComboBox.getSelectedItem().toString());
		String id = bikeConnectionTester.test();
		if (id == null || id.equals("ID")) {
			JOptionPane.showMessageDialog(this, I18n.getString("msg.connection_failed"));
		} else {
			JOptionPane.showMessageDialog(this, I18n.getString("connection_tester.connection_successful", id));
		}
	}

	/**
	 * Shows the settings dialog and returns a return code.
	 *
	 * @param settings JErgometer settings
	 * @return return code
	 */
	public ReturnCode showDialog(JergometerSettings settings) {
		updateComPorts(settings);

		if (settings != null) {
			if (settings.getXmlEditor() != null) {
				xmlEditorTextField.setText(settings.getXmlEditor());
			}
			checkForUpdatesOnStartCheckBox.setSelected(settings.isCheckForUpdatesOnStart());
		}

		returnCode = ReturnCode.abort;

		setVisible(true);

		return returnCode;
	}

	private void updateComPorts(JergometerSettings settings) {
		String comPort = null;
		if (settings != null) {
			comPort = settings.getComPort();
		}
		int comPortIndex = -1;

		DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
		int i = 0;
		for (String s : BikeConnectorSerial.getPortNames()) {
			comboBoxModel.addElement(s);
			// check if this comport this the current comport
			if (comPort != null && s.equals(comPort)) {
				comPortIndex = i;
			}
			i++;
		}
		// if comport is not in the list -> add it
		if (comPort != null && comPortIndex == -1) {
			comboBoxModel.addElement(comPort);
			comPortIndex = i;
		}

		comPortComboBox.setModel(comboBoxModel);
		comPortComboBox.setSelectedIndex(comPortIndex);
	}

	public void saveSettings(JergometerSettings settings) {
		settings.setCheckForUpdatesOnStart(checkForUpdatesOnStartCheckBox.isSelected());
		settings.setComPort((String) comPortComboBox.getSelectedItem());
		settings.setXmlEditor(xmlEditorTextField.getText());
	}
}
