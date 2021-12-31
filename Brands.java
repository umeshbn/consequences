class Brands{
			static void printAll(String drinks[]){
				
				for(int app=0;app<drinks.length;app=app+1){
					System.out.println(drinks[app]);
				}
			}
			  public static void main(String[] args){
			    String[] drinks={"water","cold water","local water"};
				printAll(drinks);
			  System.out.println();
				drinks[2]="the barnd OM";
				printAll(drinks);
				

			  
			  }
	}
