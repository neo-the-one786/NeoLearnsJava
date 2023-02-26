
	}

	public static void findLargest(int mat[][]){
		//Your code goes here
        int maxc= Integer.MIN_VALUE;
        int ci = 0;
		
		int r = mat.length;
		int c = mat[0].length;
		
		for(int j=0;j<c;j++)
		{	int sum = 0;
			for(int i = 0;i<r;i++)
			{	
				sum+=mat[i][j];	
			}
			if(sum>maxc)
			{
				maxc = sum;
                ci = j;
				
			}
			
		}
		
        int maxr = Integer.MIN_VALUE;
        int ri = 0;
        for(int i = 0;i<r;i++)
        {	int sum = 0;
            for(int j = 0;j<c;j++)
            {
                sum+=mat[i][j];
            }
         	if(sum>maxr)
         	{
             maxr=sum;
             ri=i;
         	}
        }
        
        if(maxr>=maxc)
        {
            System.out.println("row "+ri+" "+maxr);
        }
        else
        {
            System.out.println("column "+ci+" "+maxc);
        }
	}

}
