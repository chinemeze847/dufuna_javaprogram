package com.dufuna.berlin.eze.lekki.model;

import java.util.Date;

public class LekkiProperty
{
    private int PropertyId;
    private String PropertyAddress;
    private String PropertyType;
    private int numOfBedrooms;
    private int numOfSittingRooms;
    private int numOfKitchens;
    private int numOfBathrooms;
    private int numberOfToilets;
    private String PropertyOwner;
    private String Description;
    private Date ValidFrom;
    private Date ValidTo;

    public int getPropertyId() {
        return PropertyId;
    }

    public void setPropertyId(int propertyId) {
        PropertyId = propertyId;
    }

    public String getPropertyAddress() {
        return PropertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        PropertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String propertyType) {
        PropertyType = propertyType;
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
        return getPropertyId();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(getPropertyId());
    }

    @Override
    public String toString() {
        return getPropertyId() + ", " + getPropertyAddress() + ", " + getPropertyType();
    }
}
