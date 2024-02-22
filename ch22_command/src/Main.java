import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import command.Command;
import command.MacroCommand;
import drawer.DrawCanvas;
import drawer.DrawCommand;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	
	private JButton clearButton = new JButton("clear");
	
	public Main(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(e -> {
			history.clear();
			canvas.repaint();
		});
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		setVisible(true);
	}
	
	public void mouseMoved(MouseEvent e) {
		
	}
	
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas,e.getPoint());
		history.append(cmd);
		cmd.execute();
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main("Command pattern sample");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
