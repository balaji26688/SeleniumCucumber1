
public class StringClass  extends guru {
	
	
		public void md1()
		{
			System.out.println("tihs is child class");
		}
		
		/*
		public void md1()
		{
			System.out.println("tihs is parent");
		} */
		
		

		public void m2()
		{
		}

		public void m3()
		{
		}
		
		public static void main(String[] args) {
			guru str=new StringClass();
			str.md1();
			
			guru g=new guru();
			g.md1();
			
			StringClass sc=new StringClass();
			sc.md1();
			
			String s="gurubalaji";
			String s1="gurubalaji1";
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
			
		}
	
		
	}


