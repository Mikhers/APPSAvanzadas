public class Exponente{


    public int potencia(int a,int b){
        if(b==0)
            return 1;
	  else
	  return suma(a, potencia(a, b - 1));
    }
    public int suma(int a,int b){
        if(b==1)
            return a;
	  else
 	  return a + suma(a, b - 1);
    }
}
