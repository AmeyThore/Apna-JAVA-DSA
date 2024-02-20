package DSA.Strings;

public class ShortestPath {
    public static float  shortestDistance(String str) {
        int x = 0; int y = 0;

        for(int i = 0; i< str.length(); i++){
            char dir = str.charAt(i);
            // west
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x; //x square
        int y2 = y*y; //y square

        //Displacement
        return (float)Math.sqrt(X2+y2);//Suare root (x2-x1)sqr + (y2-y1)sqr
        //Got displacement 
    
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("The shortest distance is : "+shortestDistance(str));
    }
}
//Time complexity in O(n) because i only use for loop one time