class Wisky{
		
	static void wiskyAll(String brand[]){
	
		for(int index=0; index<brand.length;index++){
				System.out.println(brand[index]);
				}
			}
			public static void main(String []args){
				String brand[] = {"Banglore","Hywards","Oldmonk","OT","BP"};
				wiskyAll(brand);
				brand[1] = "TEACHERS";
				System.out.println();
				wiskyAll(brand);
			}
		}
				