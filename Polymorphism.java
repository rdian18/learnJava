class Hewan{
	public void jenisHewan(){
		System.out.println("Mamalia");
	}
	
  }
  class Sapi extends Hewan{
  	public void jenisHewan(){
  		System.out.println("Sapi Mamalia:Menyusui");
  	}
  }
class Buaya extends(){
	public  void jenisHewan(){
		System.out.println("Buaya Reptile:melata");
	}
}

class Main{
	public static void main(String[] args) {
		Hewan hewanSaya = new Hewan();
		Hewan sapiSaya = new Sapi();
		Hewan buayaSaya = new Buaya();

		hewanSaya.jenisHewan();
		sapiSaya.jenisHewan();
		buayaSaya.jenisHewan();
		
	}
}