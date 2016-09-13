package javaLearn.JavaUtil;

import java.util.Calendar;

/**
 * Created by h_kang on 2016/9/8.
 */
public class ServerTime {
    private static long localTime;
    private static long serviceTime;
    private static boolean fetchTime = false;
    private static boolean timeFlag = true;

    public ServerTime() {
    }

    public static void initServerTime(long inputTime) {
        serviceTime = inputTime;
        fetchTime = true;
        localTime = System.currentTimeMillis();
        if(Math.abs(localTime - serviceTime) > 60000L) {
            timeFlag = false;
        }

    }

    public static boolean isFetchTime() {
        return fetchTime;
    }

    public static Calendar getCurrentCalendar() {
        Calendar currentCalendar = DateUtil.getLocalCalendar();
        if(!timeFlag) {
            currentCalendar.setTimeInMillis(serviceTime + System.currentTimeMillis() - localTime);
        }

        return currentCalendar;
    }
}
