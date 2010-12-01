package it.sinossi.poc.mbeanpoc;

public interface PrinterControlMBean {

	String getText();

	void setText(String text);

	int getSleepTime();

	void setSleepTime(int millis);

	void pause();

	void resume();

	public void stop();

}
