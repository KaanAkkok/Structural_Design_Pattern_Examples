package Flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoldierProvider.provideSoldier(3,2);
        System.out.println("==========================================");

        System.out.println("Toplam Süvari nesnesi sayısı : "+Cavalry.objectCounter);
        System.out.println("Toplam Okçu nesnesi sayısı : "+Archer.objectCounter);
	}

}
