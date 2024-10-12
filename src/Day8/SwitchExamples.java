package Day8;

public class SwitchExamples {

    public static void main(String[] args) {
        String extension = "txt";

        switch (extension){

            case "docx":
                System.out.println("This is a word document");
                break;
            case "pptx":
                System.out.println("this is a powerpoint");
                break;
            case "pdf":
                System.out.println("This is a pdf file");
                break;
            case "txt":
                System.out.println("This is a text document");
                break;
            default:
                System.out.println("we do not support this file");

        }

        int month = 3;

        switch (month){
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("This is not a month");
        }


        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");
                break;
        }
    }
}
