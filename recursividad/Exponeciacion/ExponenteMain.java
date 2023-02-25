public class ExponenteMain{
	public static void main(String[] args){
        Exponente ex = new Exponente();
        System.out.println(ex.exponente(-2,6));
	    
	}
}
class Exponente{
    //primer numero es el base y el segundo es el exponente
    public int exponente(int a,int b){
        if (a==1){
            return 1;
        }if(b==1){
            return a;
        }
        return a * exponente(a,b-1);
    }
}
