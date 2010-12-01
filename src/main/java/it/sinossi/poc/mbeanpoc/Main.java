package it.sinossi.poc.mbeanpoc;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class Main {

	public static void main(String[] args) throws Exception {

		Printer p = new Printer("Ciao");

		registerMBean(p);

		int counter = 0;

		while (!p.shouldStop()) {
			if (p.isPrintEnabled()) {
				System.out.print(Integer.toString(counter) + "  ");
				p.print();
			}
			counter++;
			Thread.sleep(p.getSleepTime());
		}
		System.out.println("Exiting");
	}

	private static void registerMBean(Printer p) throws Exception {
		PrinterControl mbean = new PrinterControl(p);
		ObjectName objectName = new ObjectName("it.sinossi:type=printer");
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		server.registerMBean(mbean, objectName);
	}

}
