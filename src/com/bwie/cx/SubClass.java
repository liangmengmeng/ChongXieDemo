package com.bwie.cx;

public class SubClass extends BaseClass{
	public String book= "liuyifei";  
    public void test()  
    {  
        System.out.println("���า�Ǹ���ķ���");  
    }  
    public void sub()  
    {  
        System.out.println("�������ͨ����");  
    }  
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();  
        System.out.println(bc.book);  
        bc.base();  
        bc.test();  
  
        SubClass sc = new SubClass();  
        System.out.println(sc.book);  
        sc.base();  
        sc.test();  
          
        BaseClass b = new SubClass();  
        System.out.println(b.book);  
        b.base();  
        b.test(); 
	}

}
class BaseClass{
	public int book=6;
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("���౻���Ƿ���");
	}
	
}
