package it.sinossi.poc.mbeanpoc;

public class PrinterControl implements PrinterControlMBean {

	private Printer printer;

	public PrinterControl(Printer printer) {
		this.printer = printer;
	}

	public String getText() {
		return printer.getText();
	}

	public void pause() {
		printer.setPrintEnabled(false);
	}

	public void resume() {
		printer.setPrintEnabled(true);
	}

	public void stop() {
		printer.stop();
	}

	public void setText(String text) {
		printer.setText(text);
	}

	public int getSleepTime() {
		return printer.getSleepTime();
	}

	public void setSleepTime(int millis) {
		printer.setSleepTime(millis);
	}

}
