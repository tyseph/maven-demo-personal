package feb22.maven.demo.mt;

// Multi-threading with Thread class

public class App extends Thread {

	void printNums() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		this.printNums();
	}

	public static void main(String[] args) {

		App app = new App();
		app.start();
		App app2 = new App();
		app2.start();
		App app3 = new App();
		app3.start();
	}
}
