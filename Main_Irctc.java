import java.util.*;

class TrainBooking {
    String fromPoint = "";
    String toPoint = "";
    String dateToTravel = "";
    String select = "";
    String ticketPrice = "";
    String train1[] = new String[8];
    String train2[] = new String[8];
    String train3[] = new String[8];
    String train4[] = new String[8];
    int trainOrBus = 0;
    String details[] = new String[8];

    public void booking() {

        System.out.println("welcome to train Booking");

    }

    TrainBooking(String fromPoint, String toPoint, String dateToTravel) {
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.dateToTravel = dateToTravel;
        /*
         * System.out.println(fromPoint + "  " + toPoint + "  " + dateToTravel);
         * for (String s : train1) {
         * System.out.println(s);
         * }
         */
    }

    TrainBooking() {

    }

    public void passingTrainOrBus(int trainOrBus) {
        this.trainOrBus = trainOrBus;
    }

    /*
     * public void updateDetailsTB() {
     * if (trainOrBus == 1) {
     * String train1[] = { fromPoint, toPoint, dateToTravel, "Prashanthi Express",
     * "18464", "13:40", "18:13",
     * "175 Rupees" };
     * 
     * for (int j = 0; j < train1.length; j++) {
     * this.details[j] = details[j];
     * }
     * } else {
     * String details[] = { "Stating point", "Destination point",
     * "Date of Traveling", "Bus type", "Bus Number",
     * "Bus starting time", "Destination reaching time", "Cost" };
     * for (int j = 0; j < train1.length; j++) {
     * this.details[j] = details[j];
     * }
     * 
     * }
     * 
     * }
     */

    /*
     * ===================TRAINS DETAILS========================
     * kkkkkkkkkkkkkkkkkkkk
     */
    public void trainM() {

        String train1[] = { fromPoint, toPoint, dateToTravel, "Prashanthi Express", "18464", "13:40", "18:13",
                "175 Rupees" };
        String details[] = { "Stating point", "Destination point", "Date of Traveling", "Train name",
                "Train Number",
                "Train starting time", "Destination reaching time", "Cost" };

        for (int i = 0; i < train1.length; i++) {
            System.out.println(details[i] + " : " + train1[i]);

        }
        for (int j = 0; j < train1.length; j++) {
            this.train1[j] = train1[j];
        }
    }

    public void trainM(int a) {
        String train2[] = { fromPoint, toPoint, dateToTravel, "Basava Express", "17307", "16:40", "21:29",
                "205 Rupees" };
        String details[] = { "Stating point", "Destination point", "Date of Traveling", "Train name", "Train Number",
                "Train starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < train2.length; i++) {
            System.out.println(details[i] + " : " + train2[i]);

        }
        for (int j = 0; j < train2.length; j++) {
            this.train2[j] = train2[j];
        }
    }

    public void trainM(int a, int b) {
        String train3[] = { fromPoint, toPoint, dateToTravel, "Kachiguda Express", "12786", "18:20", "22:19",
                "200 Rupees" };
        String details[] = { "Stating point", "Destination point", "Date of Traveling", "Train name", "Train Number",
                "Train starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < train3.length; i++) {
            System.out.println(details[i] + " : " + train3[i]);

        }
        for (int j = 0; j < train3.length; j++) {
            this.train3[j] = train3[j];
        }
    }

    public void trainM(int a, int b, int c) {
        String train4[] = { fromPoint, toPoint, dateToTravel, "karnataka Express", "12627", "19:20", "23:28",
                "208 Rupees" };
        String details[] = { "Stating point", "Destination point", "Date of Traveling", "Train name", "Train Number",
                "Train starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < train4.length; i++) {
            System.out.println(details[i] + " : " + train4[i]);

        }
        for (int j = 0; j < train4.length; j++) {
            this.train4[j] = train4[j];
        }
    }

    public void trainsList() {
        System.out.println("Enetr the '1' for arrange trains list assending order by timing");
        System.out.println("Enetr the '2' for arrange trains list dessending order by timing");
        Scanner sc = new Scanner(System.in);
        String sort = sc.next();
        if (sort.equals("1")) {
            System.out.println("=====================================================");
            trainM();
            System.out.println("=====================================================");
            trainM(10);
            System.out.println("=====================================================");
            trainM(10, 10);
            System.out.println("=====================================================");
            trainM(10, 10, 10);
            System.out.println("=====================================================");

        } else if (sort.equals("2")) {
            System.out.println("=====================================================");
            trainM(10, 10, 10);
            System.out.println("=====================================================");
            trainM(10, 10);
            System.out.println("=====================================================");
            trainM(10);
            System.out.println("=====================================================");
            trainM();
            System.out.println("=====================================================");
        } else {
            System.out.println("Enetr the valid data which is '1' or '2'");
            trainsList();

        }

    }

    public void selectTrain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter'1' for Prashanthi Express \n\nenter'2' for Basava Express\n ");
        System.out.println("enter'3' for Kachiguda Express \n\nenter'4' for Karnataka Express\n ");
        select = sc.next();
        if (select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4")) {
            if (select.equals("1")) {
                trainM();
            } else if (select.equals("2")) {
                trainM(10);
            } else if (select.equals("3")) {
                trainM(10, 10);

            } else if (select.equals("4")) {
                trainM(10, 10, 10);
            } else {
                System.out.println("Enter only '1' ,'2' ,'3' ,'4' ");
                selectTrain();

            }
        } else {
            System.out.println("Enter only '1' ,'2' ,'3' ,'4' ");
            selectTrain();
        }

    }

    public void allTrainDetails()//
                                 // ACCESSIGGGGGGGGGGGGTRIANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
    {
        System.out.println("all the train details");
        System.out.println("======================");
        if (select.equals("1")) {
            ticketPrice = train1[7];
            trainM();
        } else if (select.equals("2")) {
            trainM(10);
            ticketPrice = train2[7];
        } else if (select.equals("3")) {
            trainM(10, 10);
            ticketPrice = train3[7];
        } else {
            trainM(10, 10, 10);
            ticketPrice = train4[7];
        }
        // System.out.println("ticketPrice price is" + ticketPrice);

    }

}

// System.out.println("enter'1' for Prashanthi Express ");
// =========================ADDING DETAILS====================================

class AddingDetails extends TrainBooking {
    String passengerDetails[] = new String[5];
    String feilds[] = { "Name", "Age", "Gender", "Nationality", "Berth Preference" };

    Scanner sc = new Scanner(System.in);

    public void chckingName() {
        System.out.println("\nEnter the name of the passenger");
        passengerDetails[0] = sc.next();
        String name = passengerDetails[0];
        int flag = 1;
        for (int i = 0; i < name.length(); i++) {

            char chName = name.charAt(i);
            if (!((chName >= 'a' && chName <= 'z') || (chName >= 'A' && chName <= 'Z') || (chName == ' '))) {
                flag = 0;
                break;
            }

        }
        if (flag == 0) {
            chckingName();
        }

    }

    // =================CHECKING AGE====================
    public void checkinAge() {
        System.out.println("\nenter the age of the passenger");
        passengerDetails[1] = sc.next();
        String age = passengerDetails[1];
        int flagAge = 1;
        if (age.length() == 1 || age.length() == 2) {
            char ch[] = age.toCharArray();
            for (char c : ch) {
                if (!(c >= 48 && c <= 57)) {

                    flagAge = 0;
                    break;

                }
            }
            if (flagAge == 0) {

                System.out.println("\nenter the proper data");
                checkinAge();

            }

        } else {
            System.out.println("\nenter the proper data");
            checkinAge();
        }
    }

    // ==========CHECKING GENDER===========================================
    public void checkingGender() {
        System.out.println("enter '1' for male\n\nenter '2' for female");
        String gender = sc.next();

        if (gender.equals("1")) {
            passengerDetails[2] = "MALE";
        } else if (gender.equals("2")) {
            passengerDetails[2] = "FEMALE";
        } else {
            System.out.println("\nenter '1' OR '2'");
            checkingGender();

        }

    }

    // ==========================checking nationality======================

    public void checkingNationality() {
        System.out.println("\nEnter the name of the Country");
        passengerDetails[3] = sc.next();
        String name = passengerDetails[3];
        int flag = 1;
        for (int i = 0; i < name.length(); i++) {

            char chName = name.charAt(i);
            if (!((chName >= 'a' && chName <= 'z') || (chName >= 'A' && chName <= 'Z') || (chName == ' '))) {
                flag = 0;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("\nEnter the proper data");
            checkingNationality();
        }
    }

    // ==========================checking BERTH======================
    public void checkingBerth() {
        System.out.println(
                "\nChoose the prefered berth\n\nEnter '1' for 'LOWER berth'\n\nEnter '2' for 'UPPER berth'\n\nEnter '3' for 'MIDDLE berth'\n\nEnter '4' for 'SIDE LOWER berth'\n\nEnter '5' for 'SIDE UPPER berth'\n");
        passengerDetails[4] = sc.next();
        String berth = passengerDetails[4];
        if (berth.equals("1")) {
            passengerDetails[4] = "LOWER";
        } else if (berth.equals("2")) {
            passengerDetails[4] = "UPPER";
        } else if (berth.equals("3")) {
            passengerDetails[4] = "MIDDLE";
        } else if (berth.equals("4")) {
            passengerDetails[4] = "SIDE LOWER";
        } else if (berth.equals("5")) {
            passengerDetails[4] = "SIDE UPPER";
        } else {
            System.out.println("Choose the proper berth ");
            checkingBerth();
        }

    }

    public void allDetailsOfPassenger()//
                                       // ACEESINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
    {

        System.out.println("\npassenger details");
        System.out.println("====================");
        for (int i = 0; i < 5; i++) {
            System.out.println(feilds[i] + " : " + passengerDetails[i]);
        }
    }

}

// ==================================PAYMENT==============================
class PaymentForAll {
    String costOfTiccket = "";
    String captchaPay = "W=tys";
    String temp = "";
    private String pin;

    PaymentForAll(String costOfTiccket) {
        this.costOfTiccket = costOfTiccket;

    }

    public void upiOrCard() {

        System.out.println("now you have to pay  :" + costOfTiccket);
        System.out.println("select the payments methods");
        System.out.println("enter '1' to pay by  'UPI' method\n\nenter '2' to pay by  using 'CREDIT CARD' \n\n");
        Scanner sc = new Scanner(System.in);
        String payOption = sc.next();
        if (payOption.equals("1") || payOption.equals("2")) {

            checkingCaptcha();

        } else {
            System.out.println("enter the valid input");
            upiOrCard();
        }

    }

    public void checkingCaptcha() {
        System.out.println("enter the displaying captcha 'W=tys' ");
        Scanner sc = new Scanner(System.in);
        String captcha = sc.next();
        if (captcha.equals(captchaPay)) {
            System.out.println("captcha entered succesfully\n");
            chooseUpi();

        } else {
            System.out.println("enter the valid input ");
            checkingCaptcha();
        }

    }

    public void chooseUpi() {
        // String
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the upi option to pay " + costOfTiccket);
        System.out.println("choose '1' for payment make by paytm linked mobile number");
        System.out.println("choose '2' for payment make by multiple upi apps");
        String chooseUpiOption = sc.next();
        if (chooseUpiOption.equals("1")) {
            paytmLinkedNumber();

        } else if (chooseUpiOption.equals("2")) {
            upiApps();

        } else {
            System.out.println("enter the valid input '1' OR '2' ");
            chooseUpi();

        }
    }

    public void paytmLinkedNumber() {
        int flag = 1;
        System.out.println("your selected to make a payment by entering paytm linked mobile number");
        System.out.println("enter thr 10 digit mobule number");
        Scanner sc = new Scanner(System.in);
        String mobileNumber = sc.next();
        if (mobileNumber.length() == 10) {

            for (int i = 0; i < 10; i++) {
                char ch = mobileNumber.charAt(i);
                if (!(ch >= 48 && ch <= 57)) {
                    flag = 0;
                    break;
                }

            }
            if (flag == 0) {
                paytmLinkedNumber();
            } else {

                finalPaymentMethod("Paytm");
            }

        } else {
            System.out.println("enter the valid 10 digit mobile number");
            paytmLinkedNumber();
        }

    }

    public void upiApps() {
        System.out.println(
                "enter '1' for make a payment by 'Phonepe'\n\nenter '2' for make a payment by 'Google pay'\n");
        System.out.println("enter '3' for make a payment by 'Amazon Pay'\n");
        Scanner sc = new Scanner(System.in);
        String upiOption = sc.next();
        if (upiOption.equals("1")) {
            System.out.println("you have selected to 'PhonePe'to pay ");
            finalPaymentMethod("PhonePe");

        } else if (upiOption.equals("2")) {
            System.out.println("you have selected to 'Google Pay' to pay ");
            finalPaymentMethod("Google Pay");

        } else if (upiOption.equals("3")) {
            System.out.println("you have selected to 'Amazon Pay' to pay ");
            finalPaymentMethod("Amazon Pay");

        } else {
            System.out.println("enter the valid data");
            upiApps();

        }

    }

    public void finalPaymentMethod(String upiAppName) {
        temp = upiAppName;
        int flag = 1;
        System.out.println("enter the " + upiAppName + " pin nuber");
        Scanner sc = new Scanner(System.in);
        pin = sc.next();
        if (pin.length() == 6 || pin.length() == 4) {

            for (int i = 0; i < pin.length(); i++) {
                char ch = pin.charAt(i);
                if (!(ch >= 48 && ch <= 57)) {
                    flag = 0;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println("enter the valid UPI pin");
                finalPaymentMethod(temp);
            } else {

                System.out.println(costOfTiccket + " payment successful");
            }

        } else {
            System.out.println("enter the  valid UPI pin");
            finalPaymentMethod(temp);
        }

    }

    public void success() {

    }

}

// =========================BUSBOOKING====================================

class BusBooking extends TrainBooking {
    int trainOrBus = 0;
    String fromPoint = "";
    String toPoint = "";
    String dateToTravel = "";
    String select = "";
    String ticketPrice = "";
    String bus1[] = new String[9];
    String bus2[] = new String[9];
    String bus3[] = new String[9];
    String bus4[] = new String[9];

    @Override
    public void booking() {

        System.out.println("welcome to bus Booking");
    }

    BusBooking(String fromPoint, String toPoint, String dateToTravel) {
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.dateToTravel = dateToTravel;
    }

    BusBooking() {

    }
    /* ===================BUS DETAILS======================== */

    public void bus1M() {
        String bus1[] = { fromPoint, toPoint, dateToTravel, "Meghana Travels", "ULTRA DELUXE", "18464", "13:40",
                "18:13", "1075 Rupees" };
        String details[] = { "Stating point", "Destination point", "Date of Traveling", "Travel Agency", "Bus type",
                "Bus Number", "Bus starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < bus1.length; i++) {
            System.out.println(details[i] + " : " + bus1[i]);

        }
        for (int j = 0; j < bus1.length; j++) {
            this.bus1[j] = bus1[j];
        }
    }

    public void bus2M() {
        String bus2[] = { fromPoint, toPoint, dateToTravel, "Jabber Tavels", "Express(Non-AC)",
                "17307", "16:40", "21:29",
                "950 Rupees" };
        String details[] = { "Stating point", "Destination point",
                "Date of Traveling", "Travel Agency", "Bus type", "Bus Number",
                "Bus starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < bus2.length; i++) {
            System.out.println(details[i] + " : " + bus2[i]);

        }
        for (int j = 0; j < bus2.length; j++) {
            this.bus2[j] = bus2[j];
        }
    }

    public void bus3M() {
        String bus3[] = { fromPoint, toPoint, dateToTravel, "Ashoka Tavels", "Express(Non-AC)",
                "19307", "19:40", "23:29",
                "705 Rupees" };
        String details[] = { "Stating point", "Destination point",
                "Date of Traveling", "Travel Agency", "Bus type", "Bus Number",
                "Bus starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < bus3.length; i++) {
            System.out.println(details[i] + " : " + bus3[i]);

        }
        for (int j = 0; j < bus3.length; j++) {
            this.bus3[j] = bus3[j];
        }
    }

    public void bus4M() {
        String bus4[] = { fromPoint, toPoint, dateToTravel, "Adithya logistics", "ULTRA DELUX",
                "17322", "20:40", "1:29",
                "805 Rupees" };
        String details[] = { "Stating point", "Destination point",
                "Date of Traveling", "Travel Agency", "Bus type", "Bus Number",
                "Bus starting time", "Destination reaching time", "Cost" };
        for (int i = 0; i < bus4.length; i++) {
            System.out.println(details[i] + " : " + bus4[i]);

        }
        for (int j = 0; j < bus4.length; j++) {
            this.bus4[j] = bus4[j];
        }
    }

    public void busList() {
        System.out.println("Enetr the '1' for arrange Buses assending order by timing");
        System.out.println("Enetr the '2' for arrange Buses list dessending order by timing");
        Scanner sc = new Scanner(System.in);
        String sort = sc.next();
        if (sort.equals("1")) {
            System.out.println("=====================================================");
            bus1M();
            System.out.println("=====================================================");
            bus2M();
            System.out.println("=====================================================");
            bus3M();
            System.out.println("=====================================================");
            bus4M();
            System.out.println("=====================================================");

        } else if (sort.equals("2")) {
            System.out.println("=====================================================");
            bus4M();
            System.out.println("=====================================================");
            bus3M();
            System.out.println("=====================================================");
            bus2M();
            System.out.println("=====================================================");
            bus1M();
            System.out.println("=====================================================");
        } else {
            System.out.println("Enetr the valid data which is '1' or '2'");
            busList();

        }

    }

    public void selectBus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter'1' for Meghana Travels \n\nenter'2' for Jabber Travels \n ");
        System.out.println("enter'3' for Ashoka Travels \n\nenter'4' for Adithya Logistics\n ");
        select = sc.next();
        if (select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4")) {
            if (select.equals("1")) {
                bus1M();
            } else if (select.equals("2")) {
                bus2M();
            } else if (select.equals("3")) {
                bus3M();

            } else if (select.equals("4")) {
                bus4M();
            } else {
                System.out.println("Enter only '1' ,'2' ,'3' ,'4' ");
                selectBus();

            }
        } else {
            System.out.println("Enter only '1' ,'2' ,'3' ,'4' ");
            selectBus();
        }

    }

    public void allBusDetails()//
                               // ACCESSIGGGGGGGGGGGGTRIANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
    {
        System.out.println("all the Bus details");
        System.out.println("======================");
        if (select.equals("1")) {
            ticketPrice = bus1[8];
            bus1M();
        } else if (select.equals("2")) {
            bus2M();
            ticketPrice = bus2[8];
        } else if (select.equals("3")) {
            bus3M();
            ticketPrice = bus3[8];
        } else {
            bus4M();
            ticketPrice = bus4[8];
        }
        // System.out.println("ticketPrice price is" + ticketPrice);

    }

}

// System.out.println("enter'1' for Prashanthi Express ");
// =========================ADDING DETAILS====================================

class AddingDetailss extends BusBooking {
    String passengerDetails[] = new String[5];
    String feilds[] = { "Name", "Age", "Gender", "Nationality", "Seat Number" };

    Scanner sc = new Scanner(System.in);

    public void chckingName() {

        System.out.println("\n--------------ADD A NAME----------------");
        System.out.println("\nEnter the name of the passenger");
        passengerDetails[0] = sc.next();
        String name = passengerDetails[0];
        int flag = 1;
        for (int i = 0; i < name.length(); i++) {

            char chName = name.charAt(i);
            if (!((chName >= 'a' && chName <= 'z') || (chName >= 'A' && chName <= 'Z') || (chName == ' '))) {
                flag = 0;
                break;
            }

        }
        if (flag == 0) {
            chckingName();
        }

    }

    // =================CHECKING AGE====================
    public void checkinAge() {

        System.out.println("\n--------------ENTER THE AGE----------------");
        System.out.println("\nenter the age of the passenger");
        passengerDetails[1] = sc.next();
        String age = passengerDetails[1];
        int flagAge = 1;
        if (age.length() == 1 || age.length() == 2) {
            char ch[] = age.toCharArray();
            for (char c : ch) {
                if (!(c >= 48 && c <= 57)) {

                    flagAge = 0;
                    break;

                }
            }
            if (flagAge == 0) {

                System.out.println("\nenter the proper data");
                checkinAge();

            }

        } else {
            System.out.println("\nenter the proper data");
            checkinAge();
        }
    }

    // ==========CHECKING GENDER===========================================
    public void checkingGender() {
        System.out.println("\n--------------SELECT A GENDER----------------");
        System.out.println("enter '1' for male\n\nenter '2' for female");
        String gender = sc.next();

        if (gender.equals("1")) {
            passengerDetails[2] = "MALE";
        } else if (gender.equals("2")) {
            passengerDetails[2] = "FEMALE";
        } else {
            System.out.println("\nenter '1' OR '2'");
            checkingGender();

        }

    }

    // ==========================checking nationality======================

    public void checkingNationality() {

        System.out.println("\n--------------WRITE THE COUNTRY NAME----------------");
        System.out.println("\nEnter the name of the Country");
        passengerDetails[3] = sc.next();
        String name = passengerDetails[3];
        int flag = 1;
        for (int i = 0; i < name.length(); i++) {

            char chName = name.charAt(i);
            if (!((chName >= 'a' && chName <= 'z') || (chName >= 'A' && chName <= 'Z') || (chName == ' '))) {
                flag = 0;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("\nEnter the proper data");
            checkingNationality();
        }
    }

    public void checkingSeat() {

        System.out.println("\n--------------SELECT A BUS SEAT----------------");
        System.out.println("\nselect the bus seat which is vacant");

        System.out.println("\nHere 'R' means Reserved and 'V' means vacant");

        // passengerDetails[4] = sc.next();

        // ========================PATTREN==============================================

        int count = 0;

        for (int k = 1; k <= 31; k++) {
            System.out.print("-");
        }
        System.out.println();// =================

        for (int i = 1; i <= 13; i++) {
            System.out.print("|   ");
            for (int j = 1; j <= 5; j++) {

                if ((i == 10 && j == 2) || (i == 8 && j == 4) || (i == 6 && j == 2) || (i == 6 && j == 4)
                        || (i == 8 && j == 1) || (i == 10 && j == 4) || (i == 12 && j == 1) || (i == 12 && j == 2)
                        || (i == 12 && j == 4) || (i == 12 && j == 5)) {
                    count++;
                    System.out.print(count + "V  ");

                }

                else if (i % 2 == 0 && j != 3) {
                    count++;
                    String temp = "" + count;
                    if (temp.length() == 1) {
                        System.out.print("0" + count + "R  ");
                    } else {
                        System.out.print(count + "R  ");

                    }
                } else if (j == 3) {
                    System.out.print("     ");
                } else {
                    System.out.print("     ");
                }

            }
            System.out.print(" |");
            System.out.println();

        }

        for (int k = 1; k <= 31; k++) {
            System.out.print("-");
        }

        // ========================PATTREN==============================================
        System.out.println("\nBy seeing above one enter a vacant seat number");
        passengerDetails[4] = sc.next();
        String SeatN = passengerDetails[4];

        if ((SeatN.equals("10")) || (SeatN.equals("11")) || (SeatN.equals("13")) || (SeatN.equals("15"))
                || (SeatN.equals("18")) || (SeatN.equals("19")) || (SeatN.equals("21")) || (SeatN.equals("22"))
                || (SeatN.equals("23")) || (SeatN.equals("24"))) {
            System.out.println("\nyou have successfully selected seat number is :  " + SeatN);

        } else {
            System.out.println("\nyou have enterd a INVALID data re-enter a proper data");
            checkingSeat();
        }

    }

    public void allDetailsOfPassenger()//
                                       // ACEESINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
    {

        System.out.println("\npassenger details");
        System.out.println("====================");
        for (int i = 0; i < 5; i++) {
            System.out.println(feilds[i] + " : " + passengerDetails[i]);
        }
    }
}

// =======================================================================================
class HotelBooking extends TrainBooking {
    @Override
    public void booking() {
        System.out.println("welcome to hotel Booking");

    }
}

class BookingCatagories {
    public TrainBooking selectOptions(String name) {
        if (name.equals("TrainBooking")) {
            return new TrainBooking();
        } else if (name.equals("BusBooking")) {
            return new BusBooking();
        } else if (name.equals("HotelBooking")) {
            return new HotelBooking();
        } else {
            return null;
        }

    }
}

/* =======================main method===================================== */
/* =======================main method===================================== */
public class Main_Irctc {
    private static String pin = "";
    static String captcha = "RE=hU";
    static String userCaptcha = "";
    static String fromPoint = "";
    static String toPoint = "";
    static String dateToTravel = "";
    static int option = 0;
    /* ==================pin& captua======================== */

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 4 digits pin");
        pin = sc.next();
    }

    /*---========-============-FROM --TO DATE--=================------------
    */
    public static int fromToCheck(String place) {
        // boolean b;
        int flag = 1;

        for (int i = 0; i < place.length(); i++) {

            char chPlace = place.charAt(i);
            if (!((chPlace >= 'a' && chPlace <= 'z') || (chPlace >= 'A' && chPlace <= 'Z') || (chPlace == ' '))) {
                flag = 0;
                break;
            }

        }
        // b = (flag == 1);
        return flag;
    }

    public static void from(String area) {
        System.out.println("enter the " + area + " point");
        String place;
        Scanner sc = new Scanner(System.in);
        if (area.equals("from starting")) {

            fromPoint = sc.next();
            place = fromPoint;
        } else {

            toPoint = sc.next();
            place = toPoint;
        }

        int result = fromToCheck(place);
        System.out.println(result);
        if (result == 0) {
            while (result == 0) {
                System.out.println(" enter correct data only characters and space allowed");
                System.out.println("enter the " + area + " point");
                fromPoint = sc.next();
                place = fromPoint;

                result = fromToCheck(place);

            }
        }

    }

    public static void to() {
        from("to destination");

    }

    public static void date() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date in the form of 'dd-mm-yyyy' or 'dd/mm/yyyy'");
        dateToTravel = sc.next();
        /*
         * int flag = 1;
         * for (int i = 0; i < dateToTravel.length(); i++) {
         * char ch = dateToTravel.charAt(i);
         * if (!(ch >= 48 && ch <= 57) || (ch == '-') || (ch == '/')) {
         * flag = 0;
         * break;
         * }
         * }
         * if (flag == 0) {
         * System.out.println("enter the valid date format");
         * date();
         * }
         */
    }

    /*
     * ==================EXICUTION
     * START====================================================
     */

    public static void main(String[] args) {
        String captcha = "RE6hU";

        BookingCatagories BC = new BookingCatagories();
        System.out.println("Welcome to IRCTC monish");
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Press the '1' for train Booking\n Press the '2' for Bus booking\n Press the '3' for Hotel Booking  ");
        option = sc.nextInt();
        String name = "";
        if (option == 1) {
            name = "TrainBooking";
        } else if (option == 2) {
            name = "BusBooking";
        } else if (option == 3) {
            name = "HotelBooking";
        } else {
            System.out.println("give  the proper input");
        }

        TrainBooking t = BC.selectOptions(name);
        t.booking();
        // System.out.println("OPERATION ON " + option);

        /* ==================pin& captua======================== */

        System.out.println("login is mandatory to procede");
        main();

        while (pin.length() != 4) {
            main();
        }
        int flag = 0;

        for (int i = 0; i < 4; i++) {
            char ch = pin.charAt(i);
            if (ch >= 48 && ch <= 57) {
                flag = 1;
            } else {
                System.out.println("only 4 digit number allow other characters not allowed");
                main();
            }

        }

        System.out.println("enter the diaplaying captcha 'RE6hU'");
        userCaptcha = sc.next();
        while (!captcha.equals(userCaptcha)) {
            System.out.println("enter correct captcha");
            System.out.println("enter the diaplaying captcha 'RE6hU'");
            userCaptcha = sc.next();

        }
        System.out.println("login successfully");
        // ===================================================================

        // ======================================================================
        from("from starting");
        System.out.println("\nstarting point is " + fromPoint);
        to();
        System.out.println("\ndestination point is " + toPoint);
        date();
        System.out.println("\nthe date which you travel is " + dateToTravel);

        if (option == 1) {
            TrainBooking tb = new TrainBooking(fromPoint, toPoint, dateToTravel);
            tb.passingTrainOrBus(option);

            tb.trainsList();
            tb.selectTrain();
            System.out.println("\nNow you to add passenger details");
            AddingDetails Ad = new AddingDetails();
            Ad.chckingName();
            System.out.println("\nName successfully added");
            Ad.checkinAge();
            System.out.println("\nAge successfully added");
            Ad.checkingGender();
            System.out.println("\nGender successfully added");
            Ad.checkingNationality();
            System.out.println("\nCountry name successfully added");
            Ad.checkingBerth();
            System.out.println("\nBerth selected  successfully \n");
            Ad.allDetailsOfPassenger();
            System.out.println("\nAll train details");
            tb.allTrainDetails();
            // System.out.println("ticketPrice price is" + tb.ticketPrice);

            // ========================PAYMENT=========================
            String ticketAmount = tb.ticketPrice;
            PaymentForAll PA = new PaymentForAll(ticketAmount);
            PA.upiOrCard();

            Ad.allDetailsOfPassenger();
            System.out.println("\n\n");
            tb.allTrainDetails();
            System.out.println("\n\nTrain ticket Successufully booked");
            System.out.println("\nThanks for using IRCTC");
        }

        else if (option == 2) {

            BusBooking bb = new BusBooking(fromPoint, toPoint, dateToTravel);
            bb.passingTrainOrBus(option);
            bb.busList();
            bb.selectBus();
            System.out.println("\nNow you to add passenger details");
            AddingDetailss Ad = new AddingDetailss();
            Ad.chckingName();
            System.out.println("\nName successfully added");
            Ad.checkinAge();
            System.out.println("\nAge successfully added");
            Ad.checkingGender();
            System.out.println("\nGender successfully added");
            Ad.checkingNationality();
            System.out.println("\nCountry name successfully added");
            Ad.checkingSeat();
            System.out.println("\nSeat selected  successfully \n");
            Ad.allDetailsOfPassenger();
            System.out.println("\nAll bus details");
            bb.allBusDetails();

            // ========================PAYMENT=========================
            String ticketAmount = bb.ticketPrice;
            PaymentForAll PA = new PaymentForAll(ticketAmount);
            PA.upiOrCard();

            Ad.allDetailsOfPassenger();
            System.out.println("\n\n");
            bb.allBusDetails();
            System.out.println("\n\nBus ticket Successufully booked");
            System.out.println("\nThanks for using IRCTC");
        }

    }

}
