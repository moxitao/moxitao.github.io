package model;
public class GuitarSpec {
 
  private String builder; 
  private String model;
  private String type;
  private String backWood;
  private String topWood;
public String getBuilder() {
	return builder;
}
public void setBuilder(String builder) {
	this.builder = builder;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBackWood() {
	return backWood;
}
public void setBackWood(String backWood) {
	this.backWood = backWood;
}
public String getTopWood() {
	return topWood;
}
public void setTopWood(String topWood) {
	this.topWood = topWood;
}

public GuitarSpec() {
    // TODO Auto-generated constructor stub
}
public boolean matches(GuitarSpec otherSpec) {
    if(otherSpec.builder!=null){
        if(!builder.toLowerCase().equals(otherSpec.builder.toLowerCase()))
            return false;
    }
        
    if(otherSpec.model!=null){
        if(!model.toLowerCase().equals(otherSpec.model.toLowerCase()))
        return false;
    }
    
    if(otherSpec.type!=null){
        if(!type.toLowerCase().equals(otherSpec.type.toLowerCase()))
        return false;
    }
        
    if(otherSpec.backWood!=null){
        if(!backWood.toLowerCase().equals(otherSpec.backWood.toLowerCase()))
        return false;
    }
        
    if(otherSpec.topWood!=null){
        if(!topWood.toLowerCase().equals(otherSpec.topWood.toLowerCase()))
            return false;
    }
        
    return true;
}
}