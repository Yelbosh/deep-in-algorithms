package com.yelbosh.gof.composite;

public class Test {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Department root = new ConcreteDepartment();  
        root.setName("�����ܹ�˾");  
        root.add(new HRDepartment("�ܹ�˾������Դ��"));  
        root.add(new FinanceDepartment("�ܹ�˾����"));  
        Department shandongCom = new ConcreteDepartment("ɽ���ֹ�˾");  
        shandongCom.add(new HRDepartment("ɽ���ֹ�˾������Դ��"));  
        shandongCom.add(new FinanceDepartment("ɽ���ֹ�˾����"));  
        Department zaozhuangCom = new ConcreteDepartment("��ׯ���´�");  
        zaozhuangCom.add(new FinanceDepartment("��ׯ���´�����"));  
        zaozhuangCom.add(new HRDepartment("��ׯ���´�������Դ��"));  
        Department jinanCom = new ConcreteDepartment("���ϰ��´�");  
        jinanCom.add(new FinanceDepartment("���ϰ��´�����"));  
        jinanCom.add(new HRDepartment("���ϰ��´�������Դ��"));   
        shandongCom.add(jinanCom);  
        shandongCom.add(zaozhuangCom);  
        Department huadongCom = new ConcreteDepartment("�Ϻ������ֹ�˾");  
        huadongCom.add(new HRDepartment("�Ϻ������ֹ�˾������Դ��"));  
        huadongCom.add(new FinanceDepartment("�Ϻ������ֹ�˾����"));  
        Department hangzhouCom = new ConcreteDepartment("���ݰ��´�");  
        hangzhouCom.add(new FinanceDepartment("���ݰ��´�����"));  
        hangzhouCom.add(new HRDepartment("���ݰ��´�������Դ��"));  
        Department nanjingCom = new ConcreteDepartment("�Ͼ����´�");  
        nanjingCom.add(new FinanceDepartment("�Ͼ����´�����"));  
        nanjingCom.add(new HRDepartment("�Ͼ����´�������Դ��"));  
        huadongCom.add(hangzhouCom);  
        huadongCom.add(nanjingCom);   
        root.add(shandongCom);  
        root.add(huadongCom);  
        root.display(0);  
    }  
}
