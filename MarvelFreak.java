class MarvelFreak{
			static void seenAll(String movies[]){
				
				for(int app=0;app<movies.length;app=app+1){
					System.out.println(movies[app]);
				}
			}
			  public static void main(String[] args){
			    String[] movies={"iron man","captain america","thor","hulk","black panther","spider man"};
				seenAll(movies);
			  System.out.println();
				movies[1]="captain america winter soldiers";
				seenAll(movies);
				

			  
			  }
	}