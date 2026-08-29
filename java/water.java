//0 ->
//1-> 0 -> 2 
//ans=
//2>1
//ans =2-1

//2 ->1 ->0->1->3

//ans =2-1  = 2-0 =3-2 ,4
//ans=5

//3 ->2->1->2-1




public class TrappingRainWater {

    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int totalWater = 0;
        for (int currentIndex = 1; currentIndex < heights.length - 1; currentIndex++) {
            int tallestOnLeft = heights[currentIndex];
            for (int leftIndex = 0; leftIndex < currentIndex; leftIndex++) {
                if (heights[leftIndex] > tallestOnLeft) {
                    tallestOnLeft = heights[leftIndex];
                }
            }
            int tallestOnRight = heights[currentIndex];
            for (int rightIndex = currentIndex + 1; rightIndex < heights.length; rightIndex++) {
                if (heights[rightIndex] > tallestOnRight) {
                    tallestOnRight = heights[rightIndex];
                }
            }
            int smallerHeight;
            if (tallestOnLeft < tallestOnRight) {
                smallerHeight = tallestOnLeft;
            } else {
                smallerHeight = tallestOnRight;
            }
            int waterAtCurrentPosition = smallerHeight - heights[currentIndex];
            if (waterAtCurrentPosition > 0) {
                totalWater = totalWater + waterAtCurrentPosition;
            }
        }
        System.out.println("Total Water = " + totalWater);
    }
}




int n = 6;
int [] arr={3,2,1,5,6,4};
k=2;
index={};
max=0;
for(int i =1 ;i<arr.length;i++){

if(arr[i]>arr[max]){
  
}
  max = i;
}

}

index.add(max);





	


