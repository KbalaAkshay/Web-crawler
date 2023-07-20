package WebCrawler;

import java.util.*;

public class Repository {
	
	private Queue<String> bfsQueue = new LinkedList<>();
	private Set<String> urlVisitedSet = new HashSet<>();
	private int urlNo;
	
	public Repository() {
		Queue<String> bfsQueue = new LinkedList<>();
		Set<String> urlVisitedSet = new HashSet<>();
		this.urlNo = 0;
	}
	
	public void addURLtoQueue(String url) {
		bfsQueue.add(url);//adding to queue
	}
	
	public String removeURLfromQueue() {
		return bfsQueue.poll();//removing from queue
	}
	
	public void addURLtoSet(String url) {
		urlVisitedSet.add(url);//adding url to set
		this.urlNo++;
	}
	
	public int urlNo() {
		return this.urlNo;//return for number
	}
	
	public boolean isQueueEmpty() {
		return bfsQueue.isEmpty();//returns if empty
	}
	
	public boolean setHasURL(String url) {
		return urlVisitedSet.contains(url);//returns bool value if it is there
	}

	public Set<String> getUrlVisited() {
		return urlVisitedSet;//returning set
	}

}
