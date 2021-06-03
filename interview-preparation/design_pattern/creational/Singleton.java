package design_pattern.creational;

import java.io.Serializable;

public class Singleton implements Serializable{
	private static final long serialVersionUID = -8900462860284445408L;
		
	private Singleton() {	
	}
	
	private static class ApiConfigSingleton{
		public static final Singleton Instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return ApiConfigSingleton.Instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}