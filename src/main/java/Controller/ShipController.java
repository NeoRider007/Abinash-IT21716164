
package Controller;

import Model.Ship;

public class ShipController {

    Ship ShipObj;

    public Ship addShip(String SHID, String CoustomerName, String CustomerID, String CustomerMail) {
        ShipObj = new Ship(SHID, CoustomerName, CustomerID,CustomerMail);
        return ShipObj;
    }
}
