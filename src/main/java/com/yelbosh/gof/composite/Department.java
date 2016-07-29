package com.yelbosh.gof.composite;

public abstract class Department {
	private String name;  
	  
    public Department(String name) {  
        this.name = name;  
    }  
  
    public Department() {  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    protected abstract void add(Department department);  
  
    protected abstract void romove(Department department);  
  
    protected abstract void display(int depth);
}
