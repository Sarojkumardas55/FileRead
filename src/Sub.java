public class Sub {
    public static boolean hasTeen(int num1,int num2,int num3)
    {
        if((num1>=13 && num1<=19)||(num2>=13&&num2<=19)||(num3>=13&&num3<=19))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isTeen(int num1)
    {
        if(num1>=13 && num1<=19){
            return true;
        }
        else {
            return false;
        }




        public static boolean hasEqualSum(int num1,int num2,int sum)
        {

            if(sum==(num1+num2))
            {
    }
            return true;
        }
        else
        {
            return false;
        }

    }



    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        number1 = number1 * 1000;
        number2 = number2 * 1000;

        int num1 = (int) number1;
        int num2 = (int) number2;
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }

    }



    public static boolean isLeapYear (int year)
    {
        if (year<0 && year>9999) {
            return false;
        }
            else if ((year % 4==0 && year%100!=0) || (year % 400==0))
            {
                return true;
            }
            else {
                return false;
        }
        }



    public static boolean shouldWakeup (boolean dogisCurrentlyBarking , int hoursOfDay)
    {
        if (dogisCurrentlyBarking == false || hoursOfDay < 0 || hoursOfDay > 23)
        {
            return false;

        }
        else if (hoursOfDay>8&&hoursOfDay!=23)
        {
            return false;
        }
        else
        {
            return true;
        }
}

}
