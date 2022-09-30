package week1.day1;

public class Firefox {
	public void launchBrowser() {
		System.out.println("Browser launched");
	}
	public void maximize() {
		System.out.println("Browser maximized successfully");

	}

	public static void main(String[] args) {
		Firefox fox=new Firefox();
		fox.launchBrowser();
		fox.maximize();
	}
}
