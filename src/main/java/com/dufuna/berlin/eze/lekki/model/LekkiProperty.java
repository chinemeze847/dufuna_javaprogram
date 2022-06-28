package com.dufuna.berlin.eze.lekki.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class LekkiProperty
{
    private int propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numOfBedrooms;
    private int numOfSittingRooms;
    private int numOfKitchens;
    private int numOfBathrooms;
    private int numberOfToilets;
    private String PropertyOwner;
    private String Description;
    private Date ValidFrom;
    private Date ValidTo;

    //for testing in the MockLekkiPropertyApp
    public LekkiProperty(int id, String address, String type) {
        propertyId = id;
        propertyAddress = address;
        propertyType = type;
    }

    //No args constructor
    public LekkiProperty() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfSittingRooms() {
        return numOfSittingRooms;
    }

    public void setNumOfSittingRooms(int numOfSittingRooms) {
        this.numOfSittingRooms = numOfSittingRooms;
    }

    public int getNumOfKitchens() {
        return numOfKitchens;
    }

    public void setNumOfKitchens(int numOfKitchens) {
        this.numOfKitchens = numOfKitchens;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return PropertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        PropertyOwner = propertyOwner;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getValidFrom() {
        return ValidFrom;
    }

    public void setValidFrom(Date validFrom) {
        ValidFrom = validFrom;
    }

    public Date getValidTo() {
        return ValidTo;
    }

    public void setValidTo(Date validTo) {
        ValidTo = validTo;
    }

    @Override
    public int hashCode() {

        return new HashCodeBuilder(17, 37)
                .append(getPropertyId()).hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if ( obj == null)
            return false;

        if (this == null )
            return false;

        if ((obj instanceof LekkiProperty) && (((LekkiProperty) obj).getPropertyId() == this.getPropertyId())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "LekkiProperty { " +
                "propertyAddress = '" + getPropertyAddress() + '\'' +
                ", propertyType = '" + getPropertyType() + '\'' +
                ", propertyId = " + getPropertyId() +
                '}';
    }
}
