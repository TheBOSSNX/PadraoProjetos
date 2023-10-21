package padrao.projeto.controller;

import padrao.projeto.model.TravelFacade;

public class MainControllerFacade {
    public void runFacadeExample() {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.planTravel("CityA", "CityB", "2023-01-01", 5);
    }
}
