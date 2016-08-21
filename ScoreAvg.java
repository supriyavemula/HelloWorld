package practice;

public class ScoreAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int marks[]={82,82,82,82,82,82};
   double avgMarks=FindAvg(marks);
   System.out.println(avgMarks);
	}
public static double FindAvg(int scores[]){
	int sum=0;
	double avg=0.0;
	int l=scores.length;
	for(int i=0;i<l;i++){
		sum= sum+scores[i];
			}
	return avg=sum/l;

}
}
