public class Hotels{
    String hotelName;
    int hotelRating;
    String hotelType;

    Hotels(String hotelType, String hotelName, int hotelRating) {
        this.hotelType=hotelType;
        this.hotelName=hotelName;
        this.hotelRating=hotelRating;
    }

    @Override
    public String toString() {
        return "\n" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRating=" + hotelRating +
                ", hotelType='" + hotelType + '\'';
    }
}
