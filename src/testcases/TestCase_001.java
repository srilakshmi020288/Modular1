package testcases;

import genlib.General;

public class TestCase_001 {
	public static void main(String[] args) {
		General g = new General();
		g.openBrowser();
		g.openApplication();
		g.login();
		g.close();
	}

}
