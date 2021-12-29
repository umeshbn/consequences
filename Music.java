class Music{
			static void listenAll(String singers[]){
				
				for(int app=0;app<singers.length;app=app+1){
					System.out.println(singers[app]);
				}
			}
			  public static void main(String[] args){
			    String[] singers={"Rajesh krishanan","arjith sing","jubin","s p balasubramanyam","katty perry","50 cent"};
				listenAll(singers);
			  System.out.println();
				singers[2]="umesh";
				listenAll(singers);
				

			  
			  }
	}