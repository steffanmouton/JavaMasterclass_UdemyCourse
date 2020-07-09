package net.blacksheepworks;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinInt);
        System.out.println("Integer max value = " + myMaxInt);

        System.out.println("Busted MAX value = " + (myMaxInt + 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        int myTotal = (myMinInt / 2);

        // Casting example
        byte myNewByteValue = (byte)(myMinByte / 2);


        // Primitive Types Challenge
        byte myChallengeByte = 8;
        short myChallengeShort = 12065;
        int myChallengeInt = 794030;

        long myChallengeLong = 50000 + 10 * (myChallengeByte + myChallengeInt + myChallengeShort);

        System.out.println(myChallengeLong);

        // Have to use a cast because the value of the sum below is seen as integer, which doesn't necessarily fit
        // nicely inside of a short. With long this isn't a concern.
        short shortTotal = (short)(10 + 10 * (myChallengeByte + myChallengeInt + myChallengeShort));
    }
}
