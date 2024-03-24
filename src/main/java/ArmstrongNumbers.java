class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        var digits = String.valueOf(numberToCheck).length();
        double sum = 0.0;
        for (int n = numberToCheck; n != 0; n /= 10)
            sum += Math.pow(n % 10, digits);

        return sum == numberToCheck;
    }

}
