public class TravelPlan {
    StringBuilder plan = new StringBuilder();
    private TransportationStrategy transportationStrategy;
    private AccomodationStrategy accomodationStrategy;
    private ActivityStrategy activityStrategy;

    public void setTransportationStrategy(TransportationStrategy transportationStrategy) {
        this.transportationStrategy = transportationStrategy;
    }

    public void setAccomodationStrategy(AccomodationStrategy accomodationStrategy) {
        this.accomodationStrategy = accomodationStrategy;
    }

    public void setActivityStrategy(ActivityStrategy activityStrategy) {
        this.activityStrategy = activityStrategy;
    }

    public void executePlan() {
        if (transportationStrategy != null) {
            plan.append("Transportation: ");
            transportationStrategy.travel();    
        }
        if (accomodationStrategy != null) {
            plan.append("Accommodation: ");
            accomodationStrategy.book();
        }
        if (activityStrategy != null) {
            plan.append("Activity: ");
            activityStrategy.perform();
        }
    }
}
