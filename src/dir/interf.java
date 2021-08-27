package dir;
interface  writer
{

 void write();
	
}
class pen implements writer
{
	public void write()
	{
		System.out.println("iam in pen");
	}
}
class pencil implements writer
{
	public void write()
	{
		System.out.println("iam in pencil");
	}
}
class kit
{
	public void dosomething(writer p)
	{
		p.write();
	}
	}
public class interf {
	public static void main(String[] args)
	{
		kit k=new kit();
		writer p=new pen();
		writer pc=new pencil();
		k.dosomething(pc);
		k.dosomething(p);
	}

}
