package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
        String testLine = System.lineSeparator() + "T";
        String firstChar = String.valueOf(testLine.charAt(1));
        System.out.println((int) testLine.charAt(1));
        System.out.println(testLine);
        System.out.println(testLine.length());
        System.out.println(firstChar.equals(System.lineSeparator()));

        String testLine1 = System.lineSeparator();
        String testLine2 = System.lineSeparator();
        String testLine3 = "\r\n";

        System.out.println(testLine1.equals(testLine2));
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
    }

}
