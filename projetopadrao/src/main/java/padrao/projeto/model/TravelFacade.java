package padrao.projeto.model;

public class TravelFacade {
    private FlightBookingSystem flightBookingSystem;
    private HotelBookingSystem hotelBookingSystem;

    public TravelFacade() {
        this.flightBookingSystem = new FlightBookingSystem();
        this.hotelBookingSystem = new HotelBookingSystem();
    }

    public void planTravel(String origin, String destination, String date, int duration) {
        System.out.println("Iniciando o planejamento de viagem...");

        // Utilizando os subsistemas para reservar voo e hotel
        flightBookingSystem.bookFlight(origin, destination, date);
        hotelBookingSystem.bookHotel(destination, date, duration);

        System.out.println("Viagem planejada com sucesso!");
    }
}
