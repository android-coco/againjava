package com.yh.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	public static void main(String[] args) {
		// 1、newCachedThreadPool
		// 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
		// 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程
//		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//		for (int i = 0; i < 10; i++) {
//			final int index = i;
//			try {
//				Thread.sleep(index * 1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(index);
//				}
//			});
//		}
//		cachedThreadPool.shutdown();
		
		//2、newFixedThreadPool
		// 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
		//因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
		//定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()。可参考PreloadDataCache。
//		System.out.println(Runtime.getRuntime().availableProcessors());
//		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//		for (int i = 0; i < 10; i++) {
//			final int index = i;
//			fixedThreadPool.execute(new Runnable() {
//				@Override
//				public void run() {
//					try {
//						System.out.println(index);
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//
//		}
//		fixedThreadPool.shutdown();
		
		
		
		//3、newScheduledThreadPool
		//创建一个定长线程池，支持定时及周期性任务执行。延迟执行
		ScheduledExecutorService scheduledThreadPool  = Executors.newScheduledThreadPool(5);
		
		scheduledThreadPool.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("delay 3 seconds");  
			}
		}, 3, TimeUnit.SECONDS);//表示延迟3秒执行。
		
		//scheduledThreadPool.shutdown();
		
		
		//定期执行
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				 System.out.println("delay 1 seconds, and excute every 3 seconds");  
			}
		}, 1, 3, TimeUnit.SECONDS);
		//表示延迟1秒后每3秒执行一次。
		// ScheduledExecutorService比Timer更安全，功能更强大，后面会有一篇单独进行对比。
		
		//4、newSingleThreadExecutor
		//创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
		//结果依次输出，相当于顺序执行各个任务。
		//现行大多数GUI程序都是单线程的。Android中单线程可用于数据库操作，文件操作，应用批量安装，应用批量删除等
		//不适合并发但可能IO阻塞性及影响UI线程响应的操作。
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();  
		for (int i = 0; i < 10; i++) {  
		    final int index = i;  
		    singleThreadExecutor.execute(new Runnable() {  
		        @Override  
		        public void run() {  
		            try {  
		                System.out.println(index);  
		                Thread.sleep(2000);  
		            } catch (InterruptedException e) {  
		                e.printStackTrace();  
		            }  
		        }  
		    });  
		}  
	}
}