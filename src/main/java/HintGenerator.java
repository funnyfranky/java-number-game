package src.main.java;

public class HintGenerator {
    public String getHint(int guess, int target) {
        int diff = Math.abs(target - guess);
        // double percent = (double) diff / target * 100;
        String direction = (guess > target) ? "high" : "low";

        
        
        
        // Percent based hints - within a percent gives a different message
        // if (percent > 75)
        //     return "Way off!";
        // else if (percent > 40)
        //     return "Pretty far off!";
        // else if (percent > 15)
        //     return "Getting warm!";
        // else if (percent > 5)
        //     return "Basically there!! :O";
        // else
        //     return "Very close!";


        // Direction and percentage based
        if (diff > 50)
            return "Excessively " + direction + "!";
        if (diff > 30)
            return "Way too " + direction + "!";
        else if (diff > 25)
            return "Pretty " + direction + "!";
        else if (diff > 8)
            return "Only a bit too " + direction + "!";
        else
            return "Just slightly too " + direction + "!";

            
        // Original Idea - 3x and difference of 30. Didn't work great.
        // if (guess > target) {
        //     if (guess > target * 3)
        //         return "Your guess is more than 3× higher than the right number!";
        //     else if (diff > 30)
        //         return "Too high!";
        //     else
        //         return "A bit high!";
        // } else {
        //     if (target > guess * 3)
        //         return "Your guess is more than 3× lower than the right number!";
        //     else if (diff > 30)
        //         return "Too low!";
        //     else
        //         return "A bit low!";
        // }
    }
}
