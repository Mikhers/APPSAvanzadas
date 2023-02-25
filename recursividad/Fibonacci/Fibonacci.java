public class Fibonacci{
	int valorACalcular;
	Fibonacci(int a){
		valorACalcular=a;
	}
	public int getFibonacci(){
		return fibo(valorACalcular);	
	}
	public int fibo(int a){
		if(a==1)
			return 0;
		if(a==2)
			return 1;
		return fibo(a-1)+fibo(a-2);
	}
}
