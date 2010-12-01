package it.sinossi.poc.mbeanpoc;

public class Printer {

	private String text;

	private boolean printEnabled = true;

	private int sleepTime = 1000;

	private boolean stop = false;

	public Printer(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null && !text.isEmpty()) {
			this.text = text;
		} else {
			throw new IllegalArgumentException("text cannot be null or empty");
		}
	}

	public boolean isPrintEnabled() {
		return printEnabled;
	}

	public void setPrintEnabled(boolean printEnabled) {
		this.printEnabled = printEnabled;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		if (sleepTime >= 100 && sleepTime <= 1000) {
			this.sleepTime = sleepTime;
		} else {
			throw new IllegalArgumentException(Integer.toString(sleepTime) + " is not in range [100, 1000]");
		}
	}

	public void stop() {
		stop = true;
	}

	public boolean shouldStop() {
		return stop;
	}

	public void print() {
		System.out.println(text);
	}

}
