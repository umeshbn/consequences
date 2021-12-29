class HotelMenu{
		
	static void hotelAll(String menu[]){
	
		for(int index=0; index<menu.length;index++){
				System.out.println(menu[index]);
				}
			}
			public static void main(String []args){
				String menu[] = {"idly","puri","dosa","rice bath","vada"};
				hotelAll(menu);
				menu[1] = "idly vada";
				System.out.println();
				hotelAll(menu);
			}
		}
				