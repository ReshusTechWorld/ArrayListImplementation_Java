package com.java.core.arraylist;

public class MainClass {

	public static void main(String[] args) {
		ArrayLIstImpl arrObj = new ArrayLIstImpl();
		arrObj.add(1);
		arrObj.add(1.5);
		arrObj.add(true);
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
		arrObj.add("Hai");
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
		arrObj.add("Aathi");
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
		arrObj.add(false);
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
		arrObj.updateElement(5, "Athiradh R Manoj");
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
		arrObj.deleteElement(4);
		System.out.println(arrObj.toString());
		System.out.println("size of the array: "+arrObj.getArraySize());
	}
	

}
