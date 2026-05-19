public class App {
    public static void main(String[] args) throws Exception {
       
        // Create strategies
        TransportationStrategy transportation = new AirTravel();
        AccomodationStrategy accomodation = new HotelStay();
        ActivityStrategy activity = new SportsActiity();

        // Create travel plan and set strategies
        TravelPlan travelPlan = new TravelPlan();
        travelPlan.setTransportationStrategy(transportation);
        travelPlan.setAccomodationStrategy(accomodation);
        travelPlan.setActivityStrategy(activity);

        // Execute the travel plan
        travelPlan.executePlan();
    }
}
