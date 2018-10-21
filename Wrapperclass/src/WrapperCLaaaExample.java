public class WrapperCLaaaExample {

	public static void main(String[] args) {
		byte b = 10;
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1.toString());

		System.out.println(i2.toString());

		Integer i3 = new Integer((int)20.0);
		System.out.println(i3);

		Float float1 = new Float(10.4);

		System.out.println(float1);

		Float float2 = new Float(10.4f);

		System.out.println(float2);
		
		Float float3 = new Float("10.4");

		System.out.println(float3);
		
		Float float4 = new Float(i3);
		System.out.println(float4);
		
		Boolean boolean1=new Boolean(true);
		Boolean boolean2=new Boolean(false);
		Boolean boolean3=new Boolean("TrUe");
		Boolean boolean4=new Boolean("false");
		
		System.out.println(boolean1);
		System.out.println(boolean2);
		System.out.println(boolean3);
		System.out.println(boolean4);
		
		Character character=new Character('1');
		System.out.println(character);
		
		
		//   valueOf()
		
		int i=90;
		String s="80";
        Integer integer= Integer.valueOf(i);
        Integer integer2= Integer.valueOf(s);
        System.out.println(integer+"===="+integer2);
        
        //parse()
        int i4=Integer.parseInt(s);
        System.out.println(i4);
        
        String n="true";
        
        boolean c=Boolean.parseBoolean(n);
        System.out.println(c);
        
        //value()
        
        int i6=i1.intValue();
        System.out.println(i6);
        
        long l=i1.longValue() ;
        System.out.println(l);
        
        //toString
        String s5=Integer.toString(i6);
        System.out.println(s5);
        
        String s6=i1.toString();
        System.out.println(s6);
	}
}
