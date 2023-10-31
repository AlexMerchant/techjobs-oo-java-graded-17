package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();

        if (aName.isEmpty()) {
            this.name = "Data not available";
        } else {
            this.name = aName;
        }

        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add a customer toString() method
    @Override
    public String toString() {
        /*
        String renderName = (this.name != null || this.name.isEmpty()) ? this.name : "Data not available";
        String renderEmployer = (this.employer != null || this.employer.getValue().isEmpty()) ? this.employer.getValue() : "Data not available";
        String renderLocation = (this.location != null || this.location.getValue().isEmpty()) ? this.location.getValue() : "Data not available";
        String renderPositionType = (this.positionType != null || this.positionType.getValue().isEmpty()) ? this.positionType.getValue() : "Data not available";
        String renderCoreCompetency = (this.coreCompetency != null || this.coreCompetency.getValue().isEmpty()) ? this.coreCompetency.getValue() : "Data not available";
         */

        /*
        String renderName = !(this.name.isEmpty()) ? this.name : "Data not available";
        String renderEmployer = !(this.employer.getValue().isEmpty()) ? this.employer.getValue() : "Data not available";
        String renderLocation = !(this.location.getValue().isEmpty()) ? this.location.getValue() : "Data not available";
        String renderPositionType = !(this.positionType.getValue().isEmpty()) ? this.positionType.getValue() : "Data not available";
        String renderCoreCompetency = !(this.coreCompetency.getValue().isEmpty()) ? this.coreCompetency.getValue() : "Data not available";

        String renderedString = "";
        renderedString += lineSeparator(); // Add empty line to start
        renderedString += "ID: " + this.id + lineSeparator() +
                          "Name: " + renderName + lineSeparator() +
                          "Employer: " + renderEmployer + lineSeparator() +
                          "Location: " + renderLocation + lineSeparator() +
                          "Position Type: " + renderPositionType + lineSeparator() +
                          "Core Competency: " + renderCoreCompetency;
        renderedString += lineSeparator(); // Add empty line to end
         */

        String renderedString = "";
        renderedString += lineSeparator(); // Add empty line to start
        renderedString += "ID: " + this.id + lineSeparator() +
                "Name: " + this.name + lineSeparator() +
                "Employer: " + this.employer + lineSeparator() +
                "Location: " + this.location + lineSeparator() +
                "Position Type: " + this.positionType + lineSeparator() +
                "Core Competency: " + this.coreCompetency;
        renderedString += lineSeparator(); // Add empty line to end

        return renderedString;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
