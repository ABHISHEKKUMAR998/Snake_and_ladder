
public class Snake_and_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=6,min=1;
		int pos=0;
		int c=0,temp=0;
		int board[]= new int[100];
		   // ladders
		    board[2] = 21;
		    board[4] = 7;
		    board[10] = 25;
		    board[19] = 28;
		    board[26] = 41;
		    board[40] = 67;
		    board[75] = 85;
		    board[90] = 98;
		    //snake
		    board[22] = 1;
		    board[43] = 7;
		    board[99] = 3;
		    board[29] = 5;
		    board[56] = 24;
		    board[49] = 17;
		 
	  while(pos<=100) {
		       int dice= min +(int)(Math.random()*((max-min)+1));
		                      if(pos+dice>100) {
		    	                  c++;
		    	                  continue;
                                     }		       
		                          pos+=dice;
		                  
		                          if(pos==2||pos==4||pos==10||pos==19||pos==26||pos==40||pos==75||pos==90) {
			                          pos= board[pos];
			                        
		                            }
		                         else if (pos==22||pos==43||pos==99||pos==29||pos==56||pos==49) {
			                          pos= board[pos];
		                            }
		                        if(pos==100) {
		                        	System.out.println(pos);
			                   System.out.println("Player1 win the game"+" and he have to rolled the dice  "+c);
			                   break;
		
	                           }
		                        c++;
		                        System.out.println(pos);
		                
	  
	  						}

}
}
