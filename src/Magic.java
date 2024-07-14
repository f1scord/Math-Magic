public class Magic {
    public static void main(String[] args) {
        // myNumber is an original number
        int myNumber = 17;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

        // Second option implementation
        int newMyNumber = 15; // Can be any number
        int magicNumber = newMyNumber * newMyNumber;
        magicNumber += newMyNumber;
        magicNumber /= newMyNumber;
        magicNumber += 17;
        magicNumber -= newMyNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);
    }
}
