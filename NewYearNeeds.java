class NewYearNeeds{
		
	static void needsAll(String Acessories[]){
	
		for(int index=0; index<Acessories.length;index++){
				System.out.println(Acessories[index]);
				}
			}
			public static void main(String []args){
				String Acessories[] = {"BEER","SHOTS","CHICKEN","7UP","VODKA","CAKE"};
				needsAll(Acessories);
				Acessories[3] = "BRANDY";
				System.out.println();
				needsAll(Acessories);
			}
		}
				