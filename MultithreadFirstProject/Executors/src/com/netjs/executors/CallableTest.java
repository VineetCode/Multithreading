package com.netjs.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		/*
		 * ExecutorService executorService=Executors.newFixedThreadPool(2);
		 * Future<String> future=executorService.submit(new Callable<String>() {
		 * public String call(){ return "Callable Example"; } });
		 * 
		 * System.out.println("Value ::"+future.get());
		 * executorService.shutdown();
		 */

		// ExecutorService with pool of 4 threads
		/*ExecutorService es = Executors.newFixedThreadPool(4);
		
		// Submitting 6 tasks
		Future<String> f1 = es.submit(new MyCallable("callable"));
		Future<String> f2 = es.submit(new MyCallable("future"));
		Future<String> f3 = es.submit(new MyCallable("executor"));
		Future<String> f4 = es.submit(new MyCallable("executor service"));
		Future<String> f5 = es.submit(new MyCallable("executors"));
		Future<String> f6 = es.submit(new MyCallable("scheduled executor"));
		// calling some other methods
		tempMethod();

		try {
			// Calling get() method to get the future value
			System.out.println("1. " + f1.get());
			System.out.println("2. " + f2.get());
			System.out.println("3. " + f3.get());
			while (!f4.isDone()) {
				System.out.println("waiting for task to finish");
				Thread.sleep(10);
			}

			System.out.println("4. " + f4.get());
			System.out.println("5. " + f5.get());
			System.out.println("6. " + f6.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		// shutting down the executor service
		es.shutdown();
	}

	//
	public static void tempMethod() {
		System.out.println("I am in temp method");
	}
*/
		
		 ExecutorService es = Executors.newFixedThreadPool(4);
	        getLength(es, "executor");
	        getLength(es, "executor service");
	        getLength(es, "Scheduled executor service");
	        getLength(es, "executors");
	        getLength(es, "fork join");
	        getLength(es, "callable");
	        
	        
}
	
	 public static void getLength(ExecutorService es, String str){
	        Future<String> f = es.submit(() -> { return str + str.length();});
	        try {
	            System.out.println("" + f.get());
	        } catch (InterruptedException | ExecutionException e) {
	            e.printStackTrace();
	        }
	    }

/*class MyCallable implements Callable<String> {
	String str;

	MyCallable(String str) {
		this.str = str;
	}

	@Override
	public String call() throws Exception {
		// System.out.println("In call method of Callable " + str);
		StringBuffer sb = new StringBuffer();
		return (sb.append("Length of string ").append(str).append(" is ")
				.append(str.length())).toString();

	}*/
	
	
	
	
}
