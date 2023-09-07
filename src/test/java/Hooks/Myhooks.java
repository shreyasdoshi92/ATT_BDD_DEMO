package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Myhooks {
	
	@Before("@sanity or @functional")
	public void preCondition()
	{
		System.out.println("Hook for @sanity");
	}
	
	@After("@regression")
	public void postCondition()
	{
		System.out.println("Hook for @regression");
	}
	
	
	
	
//	@Before(order = 1)
//	public void beforeHook1()
//	{
//		System.out.println("Before hook1");
//	}
//	
//	@BeforeStep(order = 1)
//	public void beforeStep1()
//	{
//		System.out.println("Before step1");
//	}
//	
//
//	@AfterStep(order = 1)
//	public void afterStep1()
//	{
//		System.out.println("After step1");
//	}
//	
//	@BeforeStep(order = 2)
//	public void beforeStep2()
//	{
//		System.out.println("Before step2");
//	}
//	
//
//	@AfterStep(order = 2)
//	public void afterStep2()	
//	{
//		System.out.println("After step2");
//	}
//	
//	@Before(order = 2)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2");
//	}
//	
//	
//	@After(order = 1)
//	public void afterHook1()
//	{
//		System.out.println("After hook1");
//	}
//	
//	@After(order = 2)
//	public void afterHook2()
//	{
//		System.out.println("After hook2");
//	}

}
