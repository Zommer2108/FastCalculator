import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Time fastBegin;
        Time fastEnd;
        int customFastLength;
        FastPresets fastPresetTwelveTwelve = new FastPresets(12, 12);
        FastPresets fastPresetSixteenEight = new FastPresets(16, 8);
        FastPresets fastPresetTwenyoneThree = new FastPresets(21, 3);
        final FastPresets[] fastPresets = {fastPresetTwelveTwelve, fastPresetSixteenEight, fastPresetTwenyoneThree};

        System.out.println("Welches Preset hast du? (12/16/21)");
        int preset = userInput.nextInt();

        System.out.println("Wann hast du angefangen zu fasten? (hh:mm:ss)");
        fastBegin = new Time(userInput.nextInt(), userInput.nextInt(), userInput.nextInt());
        fastEnd = new Main().calculateFastTime(fastBegin, fastPresets[preset - 1]);
        System.out.println("Dein Fasten endet um: " + fastEnd.toString());

    }

    public Time castSecondsIntoTime(int seconds) {
        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        return new Time(hour, minute, second);
    }

    public Time calculateFastTime(Time fastBegin, FastPresets fastPresets) {
        int fastEnd = fastBegin.getTotalSeconds() + fastPresets.getFastLengthInSecond();
        return castSecondsIntoTime(fastEnd);
    }

}
