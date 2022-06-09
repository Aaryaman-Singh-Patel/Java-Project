package strong;

public class Armstrong {
	public int armstrong(int a)
	{
		public int sum=0,r,t;
		t=n;
		while(n>0)
		{
			r=n%10;
			sum+=r*r*r;
			n=n/10;
		}
		if(t==sum) {
			System.out.println("Armstrong NUMBER");
		}
		else
		{
			System.out.println("NOT A ARMSTRONG NUMBER");
		}
	}

	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		System.out.println(obj.armstrong(153));

	}

}
