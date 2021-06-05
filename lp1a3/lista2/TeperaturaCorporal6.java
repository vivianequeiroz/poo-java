public class TemperaturaCorporal6 {
	
	public static void main(String[] args) {
		
		double matrixTemperatureAndDays[][] = {
				{ 35.6, 36.4, 38.6, 38,   36},
				{ 36.1, 37,   37.2, 40.5, 40.4},
				{ 35.5, 35.7, 36.1, 37,   39.2},
		};
		
		int totalLines = 3;
		int totalColumms = 5;
		double biggestValue = 0;
		int day = 0;
	
		
		for(int i = 0; i < totalLines; i++) {
			for(int j = 0; j < totalColumms; j++)
			if(matrixTemperatureAndDays[i][j] > biggestValue) {
				biggestValue = matrixTemperatureAndDays[i][j];
				day = j;
			}
		}
		
		System.out.println("A) A maior temperatura registrada foi: " + biggestValue + "° Celsius.");
		System.out.println("B) E ela foi registrada no " + day + "° dia.");
			
	}
}
