//class WeightOnTheMoon {
//	public static void main(String[] args) {
//		double my_weight = 98;      
//		double moon_gravity = 17;   
//		double earth_gravity = 100; 
//		double moon_weight;         
//
		
//		moon_weight = (moon_gravity / earth_gravity) * my_weight;

		
//		System.out.print("Мой вес на Луне равен: " + moon_weight + " кг.");
//	}
//}




// таблица истинности
class Main  {
 
    public static void main(String[] args) {
        System.out.println("Таблица истинности");        
        System.out.println("X Y Z  R");
    out(false,false,false);
    out(false,false,true);
    out(false,true,false);
    out(false,true,true);
    out(true,false,false);
    out(true,false,true);
    out(true,true,false);
        out(true,true,true);
    }
    public static void out(boolean x, boolean y, boolean z){
        System.out.println((x ? "1 " : "0 ") + (y ? "1 " : "0 ") + (z ? "1 " : "0 ") + (!(!x && y) || (x && !z) ? " 1" : " 0"));
    }
}