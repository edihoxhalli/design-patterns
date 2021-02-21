package structural.facade;

public class DriveFacade {
    Car car = new Car();
    Driver driver = new Driver();

    public void drive(){
        driver.enterCar();
        driver.putSeatbelt();
        driver.pressButton();
        car.start();
        car.runEngine();
        driver.pressGasPedal();
        car.motorWorking();
        driver.pressBreak();
        car.slowDown();
    }
}
