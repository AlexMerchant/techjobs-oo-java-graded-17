package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

//import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertNotEquals("When comparing two distinct Jobs objects for equality, they should return false",testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue("The 'name' field of a Job object must be of the String class",testJob.getName().getClass() == String.class);
        assertTrue("The 'employer' field of a Job object must be of the Employer class",testJob.getEmployer().getClass() == Employer.class);
        assertTrue("The 'location' field of a Job object must be of the Location class",testJob.getLocation().getClass() == Location.class);
        assertTrue("The 'positionType' field of a Job object must be of the PositionType class",testJob.getPositionType().getClass() == PositionType.class);
        assertTrue("The 'coreCompetency' field of a Job object must be of the CoreCompetency class",testJob.getCoreCompetency().getClass() == CoreCompetency.class);

        assertTrue("The 'name' field of a Job object must be of the String class",testJob.getName() instanceof String);
        assertTrue("The 'employer' field of a Job object must be of the Employer class",testJob.getEmployer() instanceof Employer);
        assertTrue("The 'location' field of a Job object must be of the Location class",testJob.getLocation() instanceof Location);
        assertTrue("The 'positionType' field of a Job object must be of the PositionType class",testJob.getPositionType() instanceof PositionType);
        assertTrue("The 'coreCompetency' field of a Job object must be of the CoreCompetency class",testJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("The value in the 'name' field should be equal to 'Product tester'",true, testJob.getName().equals("Product tester"));
        assertEquals("The value of the 'employer' field should be equal to 'ACME'",true, testJob.getEmployer().getValue().equals("ACME"));
        assertEquals("The value of the 'location' field should be equal to 'Desert'",true, testJob.getLocation().getValue().equals("Desert"));
        assertEquals("The value of the 'positionType' field should be equal to 'Quality control'",true, testJob.getPositionType().getValue().equals("Quality control"));
        assertEquals("The value of the 'coreCompetency' field should be equal to 'Persistence'",true, testJob.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals("When comparing two distinct Jobs objects for equality using the Job class's .equals() method, they should return false",true, testJob1.equals(testJob2));
    }
}
