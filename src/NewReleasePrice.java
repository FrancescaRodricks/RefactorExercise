
public class NewReleasePrice extends Price{
	
	int getPriceCode() {
	return Movie.CHILDRENS;
}
	double getCharge(int daysRented){
		return daysRented * 3;
		}
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
		}
}
