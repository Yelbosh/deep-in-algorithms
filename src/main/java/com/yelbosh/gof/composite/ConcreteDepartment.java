package com.yelbosh.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDepartment extends Department {
    private List<Department> cList;
    
    public ConcreteDepartment() {  
        cList = new ArrayList<Department>();
    }  
  
    public ConcreteDepartment(String name) {  
        super(name);   
        cList = new ArrayList<Department>() ;   
    }  
  
    @Override  
    protected void add(Department department) {  
        cList.add(department);  
    }  
  
    @Override  
    protected void display(int depth) {  
        // TODO Auto-generated method stub  
        StringBuilder sb = new StringBuilder("");  
        for (int i = 0; i < depth; i++) {  
            sb.append("-");   
        }  
        System.out.println(new String(sb) + this.getName());  
        for (Department c : cList) {  
            c.display(depth + 2);  
        }  
    }  
  
    @Override  
    protected void romove(Department department) {  
        cList.remove(department);
    } 
}
