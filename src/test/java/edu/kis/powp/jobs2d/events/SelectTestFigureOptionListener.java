package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.CircleFactory;
import edu.kis.powp.jobs2d.command.RectangleFactory;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Figure Joe 1": {
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			}
			case "Figure Joe 2": {
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			}
			case "Circle": {
				Job2dDriver driver = driverManager.getCurrentDriver();
				DriverCommand command = CircleFactory.create(driver, 0, 0, 50);
				command.execute();
				break;
			}
			case "Rectangle": {
				Job2dDriver driver = driverManager.getCurrentDriver();
				DriverCommand command = RectangleFactory.create(driver, 0, 0, 50, 50);
				command.execute();
				break;
			}
		}
	}
}
