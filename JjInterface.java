
interface Moveable1 {
	int Average_Speed = 40;
	void move();
}
class JjInterface implements Moveable1
{
	public void move()
	{
		System.out.println("Average speed is: "+Average_Speed);
	}

	public static void main(String[] args) {
		JjInterface j = new JjInterface();
		j.move();

	}

}
