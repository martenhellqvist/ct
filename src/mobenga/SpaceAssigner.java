package com.mobenga;

import com.sun.deploy.util.OrderedHashSet;
import com.sun.javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * The SpaceAssigner is responsible for assigning a space for an incoming
 * car to park in. This is done by calling the assignSpace() API.
 *
 * The SpaceAssigner responds to changes in space availability by
 * implementing the GarageStatusListener interface.
 */
public class SpaceAssigner implements GarageStatusListener
{
    /**
     * Initiates the SpaceAssigner. This method is called only once per
     * app start-up.
     * @param garage The parking garage for which you are vending spaces.
     */
    public void initialize(ParkingGarage garage)
    {
    
    }

    /**
     * Assigns a space to an incoming car and returns that space.
     *
     * @param car The incoming car that needs a space.
     * @returns The space reserved for the incoming car.
     */
    public Space assignSpace(Car car)
    {
    	return null;
    }

    /**
     * {@inheritDoc}
     */
    public void onSpaceTaken(Car car, Space space)
    {

    }

    /**
     * {@inheritDoc}
     */
    public void onSpaceFreed(Car car, Space space)
    {

    }

    /**
     * {@inheritDoc}
     */
    public void onGarageExit(Car car)
    {

    }
}

class SpaceImpl implements Space {
    private int id;
    private int desirability;
    private Car car;

    public SpaceImpl(int id, int desirability, Car car) {
        this.id = id;
        this.desirability = desirability;
        this.car = car;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public int getDesirability() {
        return desirability;
    }

    @Override
    public boolean isOccupied() {
        return (car != null);
    }

    @Override
    public Car getOccupyingCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

