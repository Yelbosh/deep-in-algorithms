package com.yelbosh.gof.composite;

public class Test {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Department root = new ConcreteDepartment();  
        root.setName("北京总公司");  
        root.add(new HRDepartment("总公司人力资源部"));  
        root.add(new FinanceDepartment("总公司财务部"));  
        Department shandongCom = new ConcreteDepartment("山东分公司");  
        shandongCom.add(new HRDepartment("山东分公司人力资源部"));  
        shandongCom.add(new FinanceDepartment("山东分公司账务部"));  
        Department zaozhuangCom = new ConcreteDepartment("枣庄办事处");  
        zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));  
        zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部"));  
        Department jinanCom = new ConcreteDepartment("济南办事处");  
        jinanCom.add(new FinanceDepartment("济南办事处财务部"));  
        jinanCom.add(new HRDepartment("济南办事处人力资源部"));   
        shandongCom.add(jinanCom);  
        shandongCom.add(zaozhuangCom);  
        Department huadongCom = new ConcreteDepartment("上海华东分公司");  
        huadongCom.add(new HRDepartment("上海华东分公司人力资源部"));  
        huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));  
        Department hangzhouCom = new ConcreteDepartment("杭州办事处");  
        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));  
        hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));  
        Department nanjingCom = new ConcreteDepartment("南京办事处");  
        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));  
        nanjingCom.add(new HRDepartment("南京办事处人力资源部"));  
        huadongCom.add(hangzhouCom);  
        huadongCom.add(nanjingCom);   
        root.add(shandongCom);  
        root.add(huadongCom);  
        root.display(0);  
    }  
}
