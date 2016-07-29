package com.yelbosh.gof.composite;

public class HRDepartment extends Department {  
    
    
    public HRDepartment(){  
          
    }  
      
    public HRDepartment(String name){  
        super(name);  
    }  
  
    @Override  
    protected void display(int depth) {  
        StringBuilder sb = new StringBuilder("");  
        for (int i = 0; i < depth; i++) {  
            sb.append("-");  
        }  
        System.out.println(new String(sb) + this.getName() ) ;   
    }  
  
	@Override
	protected void add(Department department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void romove(Department department) {
		// TODO Auto-generated method stub
		
	}  
      
}  