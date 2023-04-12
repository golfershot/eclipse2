package jenkins;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	public void t1() {
		System.out.println("test1 >> testmethod >> thread-counr: "+Thread.currentThread().getId());
	}
	@Test
	public void t2() {
		System.out.println("test2 >> testmethod >> thread-counr: "+Thread.currentThread().getId());
	}
	
	@Test
	public void t3() {
		System.out.println("test3 >> testmethod >> thread-counr: "+Thread.currentThread().getId());
	}
}
