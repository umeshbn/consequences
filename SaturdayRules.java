class SaturdayRules{
			static void respectAll(String anji[]){
				
				for(int app=0;app<anji.length;app=app+1){
					System.out.println(anji[app]);
				}
			}
			  public static void main(String[] args){
			    String[] anji={"jai hanuman","be single","respect womens","be single","say no nonveg","be sakth londa"};
				respectAll(anji);
			  System.out.println();
				anji[1]="jai shriram";
				respectAll(anji);
				

			  
			  }
	}