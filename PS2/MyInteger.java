package MainPackage;

public class MyInteger {

	private int value;

	private MyInteger ( int value){
		this.value = value;
	}
	
	public int GetValue(){
		return this.value;
	}
	public boolean IsEven(){
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd(){
		return (this.value % 2 != 0);
	}
	
	public boolean IsPrime1(){
		for (int i = 2; 2*i < value; i++){
			if(value%i!=0)
				return true;
		}
		
		return false;
		
	}
	
	public boolean IsPrime(int value){
		for (int i = 2; 2*i < value; i++){
			if(value%i!=0)
				return true;
		}
		
		return false;
		
	}
public static boolean IsEven(int value){
		return (value % 2 ==0);
	}
public static boolean IsOdd(int value){
	return (value % 2 != 0);
	
}

public static boolean IsEven(MyInteger a){
	return (a.value % 2 == 0);
}

public static boolean IsOdd(MyInteger a){
	return (a.value % 2 != 0);
}

public static boolean IsPrime(MyInteger a){
	for (int i = 2; 2*i < a.value; i++){
		if(a.value%i!=0)
			return true;
	}
	
	return false;
	
}


//•	Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
public boolean equals(int exact){
	return(exact == this.value);
}

public boolean equals(MyInteger exact){
	return(exact == MyInteger.this);
}


//•	A static method parseInt(char[]) that converts an array of numeric characters to an int value.
public static int paresintInt(char[] a){
	int b = 0;
	for(int i = 0; a.length >= i; i++){
	 b = +1;
	}
	return b;
	
}
	
//•	A static method parseInt(String) that converts a string into an int value. 

public static int parseInt(String a){
	int b = Integer.parseInt( a );
	return b;
}

}
