
public enum MonthEnum{
	jan("january"),feb("february"),mar("march"),apr("april");
	
	private String month;
	
	MonthEnum(String month){
		this.month=month;
	}
	
	
	public String getMonth(){
		return this.month;
	}
}


