public class trycode {
    
    public static void TrappeDWater(int[] barlevel){
        int n = barlevel.length;
        //leftmax
        int leftMax[] = new int[n];
        leftMax[0]= barlevel[0];
        for(int i =1;i<n;i++){
            leftMax[i]= Math.max(barlevel[i],leftMax[i-1]);
        }
        //rightmax
        int[] rightMax= new int[n];
        rightMax[n-1]= barlevel[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i]= Math.max(barlevel[i], rightMax[i+1]);
        }
        int TrappedWater= 0;
        for(int i =0;i<n;i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]); 
            TrappedWater+= waterlevel-barlevel[i];
        }
        System.out.println(TrappedWater);
        
    }
    public static void main(String[] args) {
        int[] barlevel ={4,2,0,6,3,2,5};
        TrappeDWater(barlevel);
        // System.out.println("hello");
    }
    
}

