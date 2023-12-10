package com.example.testndkeclipse;

import android.R.integer;

public class JniClient {
	//����ͷ�ļ����� 
	//1.���л�����ĿĿ¼
	//2.������ javah -classpath bin/classes -d jni com.example.testndkeclipse.JniClient 
	
	
	//1.�ײ㷵���ַ���ƴ�Ӻ�Ľ��
	public static  native String AddStr(String strA, String strB);
	//2.java�е��������ͺ�Jni������ݶ�Ӧ��ϵ
	public static  native void TestDataTypeJ2C(short s, int i, long l, float f,
			double d, char c, boolean z, byte b, String str,int[] array, Object obj,
			MyJavaClass mMyJavaClass);
	//3.�ײ������������ ���ݲ���������
	public static   native int[] sumArray(int[] javaArray);
	//4.�ײ����������� �ײ㷵��һ��size��С�Ķ�ά����
	public static  native int[][] getArrayObjectFromC(int size); 
	
	//5.java�еľ�̬������C���� Ҳ��c��java�Ļص�
	public static native void callJavaStaticMethod();   
	//6.java�еĶ��󷽷���C���� Ҳ��c��java�Ļص�
    public static native void callJavaInstaceMethod();  
    //7.C/C++ ���� Javaʵ������
    public native static void accessInstanceField(ClassField obj);  
    //8.C/C++ ���� Java��̬����
    public native static void accessStaticField();  
    //JNI ���ù��췽���͸���ʵ������
    public native static void callSuperInstanceMethod(); 

}