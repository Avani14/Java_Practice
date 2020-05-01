class Mythread extend Thread{
	pulic void run(){
		System.out.print("Hello")
	}
}
class thread{
	public static void main(String arg[]){
		Mythread mt = new Mythread();
		mt.start();
	}
}