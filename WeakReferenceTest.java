package com.yh.demo;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

//弱引用
public class WeakReferenceTest {
	public static void main(String[] args) throws InterruptedException {
		// 弱引用可以与一个引用队列(ReferenceQueue)联合使用，如果弱引用所引用的对象被垃圾回收，jvm就会把弱引用加入到与之关联的引用队列中。
		ReferenceQueue<String> queue = new ReferenceQueue<>();
		WeakReference<String> weakRef = new WeakReference<String>(new String("123"), queue);
		System.out.println(weakRef.get());
		System.gc();
		Thread.sleep(2000);
		System.out.println(weakRef.get() + " " + queue.poll().get());
	}
}
