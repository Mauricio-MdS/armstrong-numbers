import java.util.ArrayList;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck == 0) return true;

        double sum = 0.0;
        var numberList = new ArrayList<Integer>();

        for (int n = numberToCheck; n != 0; n /= 10)
            numberList.add(n % 10);

        for (int number : numberList)
            sum += Math.pow(number, numberList.size());

        return sum == numberToCheck;
    }

}
