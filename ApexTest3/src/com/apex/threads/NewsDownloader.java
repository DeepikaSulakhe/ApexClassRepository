package com.apex.threads;

public class NewsDownloader implements Runnable{
	
	String sourceName;
	int delaySeconds;
	
	public NewsDownloader(String sourceName, int delaySeconds) {
		super();
		this.sourceName = sourceName;
		this.delaySeconds = delaySeconds;
	}

	@Override
	public void run() {
		System.out.println( "Downloading from: "+sourceName+"...");
		try {
			Thread.sleep(delaySeconds);
			System.out.println(""+sourceName+" download complete! (after ~"+delaySeconds+" sec)");
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt(); 
		}
		
	}

}
