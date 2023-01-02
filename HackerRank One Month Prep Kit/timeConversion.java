    public static String timeConversion(String s) {
    // Write your code here
    int hour = Integer.parseInt(s.substring(0, 2));
        String timeOfDay = s.substring(8, 10);
        
        if(timeOfDay.equals("AM"))
        {
            if(hour == 12)
                hour = 0;
        }
        else if(timeOfDay.equals("PM"))
        {
            if(hour != 12)
                hour += 12;
        }
        
        return String.format("%02d%s", hour, s.substring(2, 8));

}