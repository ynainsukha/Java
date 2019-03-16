class Solution {
    public int[][] kClosest(int[][] points, int K) {
        ArrayList<Point> pointObj = new ArrayList<>();
        double length;
        for(int i = 0; i < points.length; i++){
            length = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            pointObj.add(new Point(points[i][0],points[i][1],length));
        }
        Collections.sort(pointObj,new ComparePoints());
        int[][] output = new int[K][2];
        for(int temp = 0; temp < K; temp++){
            output[temp][0] = pointObj.get(temp).i;
            output[temp][1] = pointObj.get(temp).j;
        }
        return output;
    }
}


class ComparePoints implements Comparator<Point>{
    @Override
        public int compare(Point p1, Point p2) {
            if(p1.length > p2.length){
                return 1;
            }else if(p1.length == p2.length){
                return 0;
            }else{
                return -1;
            }
        } 
}
class Point{
    int i,j;
    double length;
    public Point(int i, int j, double length){
        this.i = i;
        this.j = j;
        this.length = length;
    }
}
