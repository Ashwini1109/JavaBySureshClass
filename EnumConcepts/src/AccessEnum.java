public class AccessEnum {

	public static void main(String[] args) {
		MonthEnum jan = MonthEnum.apr;
		
		MonthEnum[] array=MonthEnum.values();
		
		for(MonthEnum menum: array){
		    System.out.println(menum.getMonth()+"=="+menum.ordinal());
		}
		System.out.println(jan.getMonth()+"===="+array.length);
	}
}
