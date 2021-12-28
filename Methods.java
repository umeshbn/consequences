class Methods {
				static void Factorial(){
					int fact=1;
					for(int index=1;index<=5;index=index+1){
					fact=fact*index;
					}
					System.out.println(fact);
				}
				static void FactorialSeries(){
					int fact=1;
					for(int index=1;index<=5;index=index+1){
					fact=fact*index;
					System.out.println(fact);
					}
					
				}
			  static void Fibonocci(){
					int u=0;
					int m=1;
					int i=2;
					for(int sure=1;sure<=10;sure=sure+1){
						u=m;
						m=i;
						i=u+m;
							System.out.println(u);
                    }
			  }
			  static void LeapYear(){
					int year=1600;
					boolean leap=false;
						if(year%4==0){

							leap=true;
						}
							if(year%100==0){

								leap=false;
							}
								if(year%400==0){

									leap=true;


								}
									if(leap){
		
								System.out.println("year is leap year");



									}else{
			
									System.out.println("year is not leap year");


									}
		        }
			public static void main(String []args){
			 Factorial();
			 System.out.println("-----------------------------");
			 System.out.println("factorial series");
			 FactorialSeries();
			 System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
			 System.out.println("Fibonocci Series");
			 Fibonocci();
			 System.out.println("((((((((((((((())))))))))))))))))))");
			 System.out.println("Leap Year");
			  LeapYear();
			}
			
}
