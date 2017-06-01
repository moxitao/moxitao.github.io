package model;
public class Guitar {

  private String serialNumber;
  private double price;
  GuitarSpec spec;

  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }

  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String newserialNumber){
	  this.serialNumber = newserialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public GuitarSpec getSpec() {
    return spec;
  }
  public void setSpec(GuitarSpec spec) {
      this.spec = spec;
  }
}
