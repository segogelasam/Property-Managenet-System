/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author 223092274
 */
public abstract class Property implements Calculable{
    private String propertyCode;
    private String estateAgent;
    private String propertyType;

    public Property(){}
    public Property(String propertyCode, String estateAgent) {
        setPropertyCode(propertyCode);
        setEstateAgent(estateAgent);
//        setPropertyType(propertyType);
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        if (!propertyCode.matches("\\d{10}")) {
            if (!propertyCode.matches("[0-9]+")) {
                throw new IllegalArgumentException("Code"+propertyCode+" "+"OutOme:Invalid All characters must be digit");
            } else {
                throw new IllegalArgumentException("Code"+propertyCode+" "+"OutOme:Invalid check number of digits");
            }
        }
        if (propertyCode.charAt(0) != '1' && propertyCode.charAt(0) != '2') {
            throw new IllegalArgumentException("OutOme:Invalid All characters must be digit");
        }
        this.propertyCode = propertyCode;
    }

    public String getEstateAgent() {
        return estateAgent;
    }

    public void setEstateAgent(String estateAgent) {
        this.estateAgent = estateAgent;
    }
//    
//    public String getPropertyType(){
//        return propertyType;
//    }
//    
//   public void setPropertyType(PropertyType propertyType){
//       this.propertyType=propertyType;
//   }
    

    @Override
    public abstract double calculateAmountPayable();

    @Override
    public abstract double calculateCommission(double percentage);

    @Override
    public String toString() {
        return String.format("%s %s", propertyCode, estateAgent);
    }
    
}
