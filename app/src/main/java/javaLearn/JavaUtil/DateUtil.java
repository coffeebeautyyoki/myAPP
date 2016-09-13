package javaLearn.JavaUtil;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by h_kang on 2016/9/7.
 */
public class DateUtil {
    public static final String TIMEZONE_CN = "Asia/Shanghai";
    public static final int YEAR = 1;
    public static final int MONTH = 2;
    public static final int DAY = 5;
    public static final int HOUR = 11;
    public static final int MINUTE = 12;
    public static final int SECOND = 13;
    public static final int DATE = 5;
    public static final int COMPARELEVEL_YEAR = 0;
    public static final int COMPARELEVEL_MONTH = 1;
    public static final int COMPARELEVEL_DAY = 2;
    public static final int COMPARELEVEL_HOUR = 3;
    public static final int COMPARELEVEL_MINUTE = 4;
    public static final int COMPARELEVEL_SECOND = 5;
    private static final String[] WEEKNAME_CHINESE = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    private static final String[] WEEKNAME_CHINESE2 = new String[]{"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
    public static final int SIMPLEFORMATTYPE1 = 1;
    public static final int SIMPLEFORMATTYPE2 = 2;
    public static final int SIMPLEFORMATTYPE3 = 3;
    public static final int SIMPLEFORMATTYPE4 = 4;
    public static final int SIMPLEFORMATTYPE5 = 5;
    public static final int SIMPLEFORMATTYPE6 = 6;
    public static final int SIMPLEFORMATTYPE7 = 7;
    public static final int SIMPLEFORMATTYPE8 = 8;
    public static final int SIMPLEFORMATTYPE9 = 9;
    public static final int SIMPLEFORMATTYPE10 = 10;
    public static final int SIMPLEFORMATTYPE11 = 11;
    public static final int SIMPLEFORMATTYPE12 = 12;
    public static final int SIMPLEFORMATTYPE13 = 13;
    public static final int SIMPLEFORMATTYPE14 = 14;
    public static final int SIMPLEFORMATTYPE15 = 15;
    public static final int SIMPLEFORMATTYPE16 = 16;
    public static final int SIMPLEFORMATTYPE17 = 17;
    public static final String SIMPLEFORMATTYPESTRING1 = "yyyyMMddHHmmss";
    public static final String SIMPLEFORMATTYPESTRING2 = "yyyy-MM-dd HH:mm:ss";
    public static final String SIMPLEFORMATTYPESTRING3 = "yyyy-M-d HH:mm:ss";
    public static final String SIMPLEFORMATTYPESTRING4 = "yyyy-MM-dd HH:mm";
    public static final String SIMPLEFORMATTYPESTRING5 = "yyyy-M-d HH:mm";
    public static final String SIMPLEFORMATTYPESTRING6 = "yyyyMMdd";
    public static final String SIMPLEFORMATTYPESTRING7 = "yyyy-MM-dd";
    public static final String SIMPLEFORMATTYPESTRING8 = "yyyy-M-d";
    public static final String SIMPLEFORMATTYPESTRING9 = "yyyy年MM月dd日";
    public static final String SIMPLEFORMATTYPESTRING10 = "yyyy年M月d日";
    public static final String SIMPLEFORMATTYPESTRING11 = "M月d日";
    public static final String SIMPLEFORMATTYPESTRING12 = "HH:mm:ss";
    public static final String SIMPLEFORMATTYPESTRING13 = "HH:mm";
    public static final String SIMPLEFORMATTYPESTRING14 = "yyyy/MM/dd";
    public static final String SIMPLEFORMATTYPESTRING15 = "MM月dd日";
    public static final String SIMPLEFORMATTYPESTRING16 = "yyyy/MM/dd HH:mm:ss";
    public static final String SIMPLEFORMATTYPESTRING17 = "MM-dd";
    static final long[] lunarInfo = new long[]{19416L, 19168L, 42352L, 21717L, 53856L, 55632L, 91476L, 22176L, 39632L, 21970L, 19168L, 42422L, 42192L, 53840L, 119381L, 46400L, 54944L, 44450L, 38320L, 84343L, 18800L, 42160L, 46261L, 27216L, 27968L, 109396L, 11104L, 38256L, 21234L, 18800L, 25958L, 54432L, 59984L, 28309L, 23248L, 11104L, 100067L, 37600L, 116951L, 51536L, 54432L, 120998L, 46416L, 22176L, 107956L, 9680L, 37584L, 53938L, 43344L, 46423L, 27808L, 46416L, 86869L, 19872L, 42448L, 83315L, 21200L, 43432L, 59728L, 27296L, 44710L, 43856L, 19296L, 43748L, 42352L, 21088L, 62051L, 55632L, 23383L, 22176L, 38608L, 19925L, 19152L, 42192L, 54484L, 53840L, 54616L, 46400L, 46496L, 103846L, 38320L, 18864L, 43380L, 42160L, 45690L, 27216L, 27968L, 44870L, 43872L, 38256L, 19189L, 18800L, 25776L, 29859L, 59984L, 27480L, 21952L, 43872L, 38613L, 37600L, 51552L, 55636L, 54432L, 55888L, 30034L, 22176L, 43959L, 9680L, 37584L, 51893L, 43344L, 46240L, 47780L, 44368L, 21977L, 19360L, 42416L, 86390L, 21168L, 43312L, 31060L, 27296L, 44368L, 23378L, 19296L, 42726L, 42208L, 53856L, 60005L, 54576L, 23200L, 30371L, 38608L, 19415L, 19152L, 42192L, 118966L, 53840L, 54560L, 56645L, 46496L, 22224L, 21938L, 18864L, 42359L, 42160L, 43600L, 111189L, 27936L, 44448L};
    private static final String[] THREEDAYARR = new String[]{"今天", "明天", "后天"};
    private static final String[] FIVEDAYARR = new String[]{"前天", "昨天", "今天", "明天", "后天"};
    public static final int TYPE_WORK_DAY = 1;
    public static final int TYPE_REST_DAY = 2;

    public DateUtil() {
    }

    public static Calendar getCurrentCalendar() {
        Calendar currentCalendar = ServerTime.getCurrentCalendar();
        return currentCalendar;
    }

    public static Calendar getLocalCalendar() {
        Calendar localCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        return localCalendar;
    }

    public static Calendar getMonthEndCalendar(Calendar startCalendar, int n) {
        if(startCalendar == null) {
            startCalendar = getCurrentCalendar();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startCalendar.getTimeInMillis());
        calendar.add(2, n + 1);
        calendar.set(5, 1);
        calendar.add(6, -1);
        return calendar;
    }

    public static Calendar getCalendarByDateStr(String dateStr) {
        if(!StringUtil.emptyOrNull(dateStr) && dateStr.length() >= 8) {
            Calendar calendar = getLocalCalendar();

            try {
                int e = Integer.valueOf(dateStr.substring(0, 4)).intValue();
                int month = Integer.valueOf(dateStr.substring(4, 6)).intValue();
                int day = Integer.valueOf(dateStr.substring(6, 8)).intValue();
                calendar.set(e, month - 1, day, 0, 0, 0);
                calendar.set(14, 0);
            } catch (Exception var5) {
                ;
            }

            return calendar;
        } else {
            return null;
        }
    }

    public static Calendar getCalendarByDateTimeStr(String dateStr) {
        if(!StringUtil.emptyOrNull(dateStr) && dateStr.length() >= 8) {
            while(dateStr.length() < 14) {
                dateStr = dateStr + "0";
            }

            Calendar calendar = getLocalCalendar();
            int year = StringUtil.toInt(dateStr.substring(0, 4));
            int month = StringUtil.toInt(dateStr.substring(4, 6));
            int day = StringUtil.toInt(dateStr.substring(6, 8));
            int hour = StringUtil.toInt(dateStr.substring(8, 10));
            int min = StringUtil.toInt(dateStr.substring(10, 12));
            int second = 0;
            if(dateStr.length() >= 14) {
                second = StringUtil.toInt(dateStr.substring(12, 14));
            }

            calendar.set(year, month - 1, day, hour, min, second);
            calendar.set(14, 0);
            return calendar;
        } else {
            return null;
        }
    }

    public static String getLastDate() {
        Calendar calendar = ServerTime.getCurrentCalendar();
        calendar.add(5, -1);
        return getCalendarStrBySimpleDateFormat(calendar, 6);
    }

    public static String getNextDate() {
        Calendar calendar = ServerTime.getCurrentCalendar();
        calendar.add(5, 1);
        return getCalendarStrBySimpleDateFormat(calendar, 6);
    }

    public static String getNextMonth() {
        Calendar calendar = ServerTime.getCurrentCalendar();
        calendar.add(2, 1);
        return getCalendarStrBySimpleDateFormat(calendar, 6);
    }

    public static String getNextDate(Calendar calendar) {
        calendar.add(5, 1);
        return getCalendarStrBySimpleDateFormat(calendar, 6);
    }

    public static String getShowWeekByCalendar(Calendar calendar) {
        String weekString = "";
        if(calendar == null) {
            return weekString;
        } else {
            if(getWeek(calendar) != -1) {
                weekString = WEEKNAME_CHINESE[getWeek(calendar)];
            }

            return weekString;
        }
    }

    public static String getShowWeekByCalendar2(Calendar calendar) {
        String weekString = "";
        if(calendar == null) {
            return weekString;
        } else {
            if(getWeek(calendar) != -1) {
                weekString = WEEKNAME_CHINESE2[getWeek(calendar)];
            }

            return weekString;
        }
    }

    public static int getWeek(Calendar calendar) {
        int theResult = -1;
        if(calendar != null) {
            theResult = calendar.get(7) - 1;
        }

        return theResult;
    }

    public static String getThreeDayDes(int count) {
        return count >= 0 && count <= 2?THREEDAYARR[count]:"";
    }

    public static String getFiveDayDes(int count) {
        return count >= 0 && count <= 4?FIVEDAYARR[count]:"";
    }

    public static int getYear(Calendar calendar) {
        return calendar.get(1);
    }

    public static int getMonth(Calendar calendar) {
        return calendar.get(2) + 1;
    }

    public static int getDay(Calendar calendar) {
        return calendar.get(5);
    }

    public static int getHourOfDay(Calendar calendar) {
        return calendar.get(11);
    }

    public static int getMinute(Calendar calendar) {
        return calendar.get(12);
    }

    public static int getSecond(Calendar calendar) {
        return calendar.get(13);
    }

    public static String getDateByStep(String date, int step) {
        return !StringUtil.emptyOrNull(date) && date.length() >= 8?(step == 0?date:getCalendarStrBySimpleDateFormat(calculateCalendar(getCalendarByDateStr(date), 5, step), 6)):"";
    }

    public static String getTimeByStep(String date, int field, int step) {
        return !StringUtil.emptyOrNull(date) && date.length() >= 14?(step == 0?date:getCalendarStrBySimpleDateFormat(calculateCalendar(getCalendarByDateTimeStr(date), field, step), 1)):"";
    }

    public static Calendar calculateCalendar(Calendar newcalendar, int field, int amount) {
        if(newcalendar == null) {
            return null;
        } else {
            Calendar calendar = (Calendar)newcalendar.clone();
            if(calendar == null) {
                return null;
            } else {
                switch(field) {
                    case 1:
                        calendar.add(1, amount);
                        break;
                    case 2:
                        calendar.add(2, amount);
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    default:
                        break;
                    case 5:
                        calendar.add(5, amount);
                        break;
                    case 11:
                        calendar.add(11, amount);
                        break;
                    case 12:
                        calendar.add(12, amount);
                        break;
                    case 13:
                        calendar.add(13, amount);
                }

                return calendar;
            }
        }
    }

    public static String CalendarStrBySimpleDateFormat(String dateStr, int SimpleDateFormatType) {
        return getCalendarStrBySimpleDateFormat(getCalendarByDateTimeStr(dateStr), SimpleDateFormatType);
    }

    public static String getCalendarStrBySimpleDateFormat(Calendar calendar, int SimpleDateFormatType) {
        String str = "";
        String type = "";
        switch(SimpleDateFormatType) {
            case 1:
                type = "yyyyMMddHHmmss";
                break;
            case 2:
                type = "yyyy-MM-dd HH:mm:ss";
                break;
            case 3:
                type = "yyyy-M-d HH:mm:ss";
                break;
            case 4:
                type = "yyyy-MM-dd HH:mm";
                break;
            case 5:
                type = "yyyy-M-d HH:mm";
                break;
            case 6:
                type = "yyyyMMdd";
                break;
            case 7:
                type = "yyyy-MM-dd";
                break;
            case 8:
                type = "yyyy-M-d";
                break;
            case 9:
                type = "yyyy年MM月dd日";
                break;
            case 10:
                type = "yyyy年M月d日";
                break;
            case 11:
                type = "M月d日";
                break;
            case 12:
                type = "HH:mm:ss";
                break;
            case 13:
                type = "HH:mm";
                break;
            case 14:
                type = "yyyy/MM/dd";
                break;
            case 15:
                type = "MM月dd日";
                break;
            case 16:
                type = "yyyy/MM/dd HH:mm:ss";
                break;
            case 17:
                type = "MM-dd";
                break;
            default:
                type = "yyyyMMddHHmmss";
        }

        if(!StringUtil.emptyOrNull(type) && calendar != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(type);
            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            str = dateFormat.format(calendar.getTime());
        }

        return str;
    }

    public static String getShowWeekByDate(String dateStr) {
        if(StringUtil.emptyOrNull(dateStr)) {
            return "";
        } else {
            Calendar currentDate = getCalendarByDateStr(dateStr);
            String date = getCalendarStrBySimpleDateFormat(currentDate, 10);
            StringBuffer showStringBuffer = new StringBuffer(18);
            showStringBuffer.append(date);
            String weekString = getShowWeekByCalendar(currentDate);
            showStringBuffer.append("  " + weekString);
            return showStringBuffer.toString().trim();
        }
    }

    public static String getShowWeek(String dateStr) {
        String weekday = getShowWeekByCalendar(getCalendarByDateStr(dateStr));
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            today = today + getThreeDayDes(dDay);
        }

        return !StringUtil.emptyOrNull(today)?today:weekday;
    }

    public static String getShowWeek2(String dateStr) {
        String weekday = getShowWeekByCalendar2(getCalendarByDateStr(dateStr));
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            today = today + getThreeDayDes(dDay);
        }

        return !StringUtil.emptyOrNull(today)?today:weekday;
    }

    public static String getShowWeekOrHoliday(String dateStr) {
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            today = today + getThreeDayDes(dDay);
        }

        if(!StringUtil.emptyOrNull(today)) {
            return today;
        } else {
            String holiday = getHolidayString(dateStr);
            if(!StringUtil.emptyOrNull(holiday)) {
                return holiday;
            } else {
                String weekday = getShowWeekByCalendar(getCalendarByDateStr(dateStr));
                return weekday;
            }
        }
    }

    public static String getShowWeekOrHoliday2(String dateStr) {
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            today = today + getThreeDayDes(dDay);
        }

        if(!StringUtil.emptyOrNull(today)) {
            return today;
        } else {
            String holiday = getHolidayString(dateStr);
            if(!StringUtil.emptyOrNull(holiday)) {
                return holiday;
            } else {
                Calendar calendar = getCalendarByDateStr(dateStr);
                String weekString = "";
                if(calendar == null) {
                    return weekString;
                } else {
                    if(getWeek(calendar) != -1) {
                        weekString = WEEKNAME_CHINESE2[getWeek(calendar)];
                    }

                    return weekString;
                }
            }
        }
    }

    public static String getShowWeekOrHoliday(Calendar calendar) {
        String dateStr = getCalendarStrBySimpleDateFormat(calendar, 6);
        return getShowWeekOrHoliday(dateStr);
    }

    public static String getShowWeekOrHoliday2(Calendar calendar) {
        String dateStr = getCalendarStrBySimpleDateFormat(calendar, 6);
        return getShowWeekOrHoliday2(dateStr);
    }

    public static String getDateStrCompareToDay(String dateStr) {
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        Calendar dateMCalendar = getCalendarByDateStr(dateStr);
        if(dateMCalendar == null) {
            return "";
        } else {
            long dateM = dateMCalendar.getTimeInMillis();
            long dValue = dateM - ctripDateM;
            int dDay = (int)(dValue / 86400000L);
            if(dDay >= 0 && dDay <= 2) {
                today = today + getThreeDayDes(dDay);
            }

            return today;
        }
    }

    public static String getFiveDateStrCompareToDay(String dateStr) {
        String today = "";
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        Calendar dateMCalendar = getCalendarByDateStr(dateStr);
        if(dateMCalendar == null) {
            return "";
        } else {
            long dateM = dateMCalendar.getTimeInMillis();
            long dValue = dateM - ctripDateM;
            int dDay = (int)(dValue / 86400000L);
            dDay += 2;
            if(dDay >= 0 && dDay <= 4) {
                today = today + getFiveDayDes(dDay);
            }

            return today;
        }
    }

    public static String getShowWeekByDate2(String dateStr) {
        String str = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(dateStr), 7) + getShowWeek(dateStr);
        return str.toString().trim();
    }

    public static String getShowWeekByDate2WithBlank(String dateStr) {
        String str = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(dateStr), 7) + " " + getShowWeek(dateStr);
        return str.toString().trim();
    }

    public static String getShowWeekByDate5(String dateStr) {
        String str = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(dateStr), 7);
        return str.toString().trim();
    }

    public static String getShowWeekByDate3(String dateStr) {
        String str4Retrun = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(dateStr), 7);
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            str4Retrun = str4Retrun + " 　" + getThreeDayDes(dDay);
            return str4Retrun;
        } else {
            return getShowWeekByDate2(dateStr);
        }
    }

    public static String getShowWeekByDate6(String dateStr) {
        String str4Retrun = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(dateStr), 7);
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        dDay += 2;
        if(dDay >= 0 && dDay <= 4) {
            str4Retrun = str4Retrun + " " + getFiveDayDes(dDay);
            return str4Retrun;
        } else {
            return getShowWeekByDate2WithBlank(dateStr);
        }
    }

    public static String getShowWeekByDate4(String dateStr) {
        String holiday = getHolidayString(dateStr);
        String weekday = getShowWeekByCalendar(getCalendarByDateStr(dateStr));
        String today = CalendarStrBySimpleDateFormat(dateStr, 7);
        String ctripDateStr = getCurrentTime();
        long ctripDateM = getCalendarByDateStr(ctripDateStr).getTimeInMillis();
        long dateM = getCalendarByDateStr(dateStr).getTimeInMillis();
        long dValue = dateM - ctripDateM;
        int dDay = (int)(dValue / 86400000L);
        if(dDay >= 0 && dDay <= 2) {
            today = today + getThreeDayDes(dDay);
        }

        return !StringUtil.emptyOrNull(holiday) && !StringUtil.emptyOrNull(weekday) && !StringUtil.emptyOrNull(today)?today + "-" + "" + "-" + holiday:today + "-" + weekday + "-" + holiday;
    }

    public static long compareCalendarByLevel(Calendar firstCalendar, Calendar secondCalendar, int level) {
        if(firstCalendar != null && secondCalendar != null) {
            int firstYear = getYear(firstCalendar);
            int secondYear = getYear(secondCalendar);
            int firstMonth = getMonth(firstCalendar);
            int secondMonth = getMonth(secondCalendar);
            int firstDay = getDay(firstCalendar);
            int secondDay = getDay(secondCalendar);
            int firstHour = getHourOfDay(firstCalendar);
            int secondHour = getHourOfDay(secondCalendar);
            int firstMinute = getMinute(firstCalendar);
            int secondMinute = getMinute(secondCalendar);
            int firstSec = getSecond(firstCalendar);
            int secondSec = getSecond(secondCalendar);
            switch(level) {
                case 0:
                    firstMonth = 0;
                    secondMonth = 0;
                    firstDay = 0;
                    secondDay = 0;
                    firstHour = 0;
                    secondHour = 0;
                    firstMinute = 0;
                    secondMinute = 0;
                    firstSec = 0;
                    secondSec = 0;
                    break;
                case 1:
                    firstDay = 0;
                    secondDay = 0;
                    firstHour = 0;
                    secondHour = 0;
                    firstMinute = 0;
                    secondMinute = 0;
                    firstSec = 0;
                    secondSec = 0;
                    break;
                case 2:
                    firstHour = 0;
                    secondHour = 0;
                    firstMinute = 0;
                    secondMinute = 0;
                    firstSec = 0;
                    secondSec = 0;
                    break;
                case 3:
                    firstMinute = 0;
                    secondMinute = 0;
                    firstSec = 0;
                    secondSec = 0;
                    break;
                case 4:
                    firstSec = 0;
                    secondSec = 0;
                case 5:
                    break;
                default:
                    firstMonth = 0;
                    secondMonth = 0;
                    firstDay = 0;
                    secondDay = 0;
                    firstHour = 0;
                    secondHour = 0;
                    firstMinute = 0;
                    secondMinute = 0;
                    firstSec = 0;
                    secondSec = 0;
            }

            firstCalendar.set(firstYear, firstMonth - 1, firstDay, firstHour, firstMinute, firstSec);
            secondCalendar.set(secondYear, secondMonth - 1, secondDay, secondHour, secondMinute, secondSec);
            firstCalendar.set(14, 0);
            secondCalendar.set(14, 0);
            long firstM = firstCalendar.getTimeInMillis();
            long secondM = secondCalendar.getTimeInMillis();
            return firstM - secondM;
        } else {
            return -1L;
        }
    }

    public static long compareDateStringByLevel(String firstDate, String secondDate, int level) {
        return !StringUtil.emptyOrNull(firstDate) && !StringUtil.emptyOrNull(secondDate)?compareCalendarByLevel(getCalendarByDateTimeStr(firstDate), getCalendarByDateTimeStr(secondDate), level):-1L;
    }

    public static boolean dateStringEquls(String firstDate, String secondDate, int level) {
        return compareDateStringByLevel(firstDate, secondDate, level) == 0L;
    }

    public static boolean firstDateStrAfterSecondDateStr(String firstDate, String secondDate, int level) {
        return compareDateStringByLevel(firstDate, secondDate, level) > 0L;
    }

    public static boolean firstDateStrBeforeSecondDateStr(String firstDate, String secondDate, int level) {
        return compareDateStringByLevel(firstDate, secondDate, level) < 0L;
    }

    public static boolean firstDateStrEquleSecondDateStr(Calendar firstCalendar, Calendar seCalendar, int level) {
        return compareCalendarByLevel(firstCalendar, seCalendar, level) == 0L;
    }

    public static boolean firstDateStrEquleSecondDateStr(String firstDate, String secondDate, int level) {
        return compareDateStringByLevel(firstDate, secondDate, level) == 0L;
    }

    public static boolean firstCalendarAfterSecondCalendar(Calendar firstCalendar, Calendar seCalendar, int level) {
        return compareCalendarByLevel(firstCalendar, seCalendar, level) > 0L;
    }

    public static boolean firstCalendarBeforeSecondCalendar(Calendar firstCalendar, Calendar seCalendar, int level) {
        return compareCalendarByLevel(firstCalendar, seCalendar, level) < 0L;
    }

    public static boolean firstCalendarEquleSecondCalendar(Calendar firstCalendar, Calendar seCalendar, int level) {
        return compareCalendarByLevel(firstCalendar, seCalendar, level) == 0L;
    }

    public static boolean dateCalendarAfterToday(Calendar firstCalendar, int level) {
        Calendar secondCalendar = getCurrentCalendar();
        return firstCalendarAfterSecondCalendar(firstCalendar, secondCalendar, level);
    }

    public static boolean dateCalendarEqulsToday(Calendar firstCalendar, int level) {
        Calendar secondCalendar = getCurrentCalendar();
        return firstDateStrEquleSecondDateStr(firstCalendar, secondCalendar, level);
    }

    public static boolean dateCalendarBeforeToday(Calendar firstCalendar, int level) {
        Calendar secondCalendar = getCurrentCalendar();
        return firstCalendarBeforeSecondCalendar(firstCalendar, secondCalendar, level);
    }

    public static boolean dateStringAfterToday(String firstDate, int level) {
        String secondDate = getCurrentTime();
        return firstDateStrAfterSecondDateStr(firstDate, secondDate, level);
    }

    public static boolean dateStringBeforeToday(String firstDate, int level) {
        String secondDate = getCurrentTime();
        return firstDateStrBeforeSecondDateStr(firstDate, secondDate, level);
    }

    public static boolean dateStringEqulsToday(String firstDate, int level) {
        String secondDate = getCurrentTime();
        return dateStringEquls(firstDate, secondDate, level);
    }

    public static int yearDays(int year) {
        int sum = 348;

        for(int i = '耀'; i > 8; i >>= 1) {
            if((lunarInfo[year - 1900] & (long)i) != 0L) {
                ++sum;
            }
        }

        return sum + leapDays(year);
    }

    public static int leapDays(int year) {
        return leapMonth(year) != 0?((lunarInfo[year - 1900] & 65536L) != 0L?30:29):0;
    }

    public static int leapMonth(int year) {
        return (int)(lunarInfo[year - 1900] & 15L);
    }

    public static int monthDays(int year, int month) {
        return (lunarInfo[year - 1900] & (long)(65536 >> month)) == 0L?29:30;
    }

    public static String parseTude(String d) {
        String r = "";
        if(d != null && !"".equals(d)) {
            int i = d.indexOf(":");
            r = r + d.substring(0, i);
            if(r.length() == 1) {
                r = "0" + r;
            }

            String ss = d.substring(i + 1, d.length());
            if(ss.length() == 1) {
                ss = "0" + ss;
            }

            r = r + ss + "00";
        }

        return r;
    }

    public static boolean isInTimeHorizon(String departDate, String fCTimeHorizon) {
        if(departDate.length() >= 14 && fCTimeHorizon.length() >= 11) {
            int departTime = Integer.parseInt(departDate.substring(8, 12));
            int startTime = Integer.parseInt(fCTimeHorizon.substring(0, 2) + fCTimeHorizon.substring(3, 5));
            int endTime = Integer.parseInt(fCTimeHorizon.substring(6, 8) + fCTimeHorizon.substring(9, 11));
            return departTime >= startTime && departTime <= endTime;
        } else {
            return false;
        }
    }

    public static String getHolidayString(String dateStr) {
        if(dateStr != null && dateStr.length() >= 8) {
            int inYear = StringUtil.toInt(dateStr.substring(0, 4));
            int inMonth = StringUtil.toInt(dateStr.substring(4, 6));
            int inDate = StringUtil.toInt(dateStr.substring(6, 8));
            switch(inYear) {
                case 2012:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                case 23:
                                    return "春节";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 14:
                                    return "情人节";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 23:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 30:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2013:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 10:
                                    return "春节";
                                case 14:
                                    return "情人节";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 12:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 19:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2014:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                case 30:
                                    return "除夕";
                                case 31:
                                    return "初一";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 14:
                                    return "情人节";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 5:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 2:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 8:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2015:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 14:
                                    return "情人节";
                                case 19:
                                    return "春节";
                                default:
                                    return "";
                            }
                        case 3:
                            switch(inDate) {
                                case 5:
                                    return "元宵";
                                default:
                                    return "";
                            }
                        case 4:
                            switch(inDate) {
                                case 5:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 20:
                                    return "端午";
                            }
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                case 27:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2016:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 7:
                                    return "除夕";
                                case 8:
                                    return "春节";
                                case 14:
                                    return "情人节";
                                case 22:
                                    return "元宵";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 9:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                case 15:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2017:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                case 28:
                                    return "春节";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 11:
                                    return "元宵";
                                case 14:
                                    return "情人节";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                case 30:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                case 4:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2018:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 14:
                                    return "情人节";
                                case 16:
                                    return "春节";
                                default:
                                    return "";
                            }
                        case 3:
                            switch(inDate) {
                                case 2:
                                    return "元宵";
                                default:
                                    return "";
                            }
                        case 4:
                            switch(inDate) {
                                case 5:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 18:
                                    return "端午";
                            }
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                case 24:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2019:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 5:
                                    return "春节";
                                case 14:
                                    return "情人节";
                                case 19:
                                    return "元宵";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 5:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 7:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                case 13:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2020:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                case 25:
                                    return "春节";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 8:
                                    return "元宵";
                                case 14:
                                    return "情人节";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 25:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2021:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 12:
                                    return "春节";
                                case 14:
                                    return "情人节";
                                case 26:
                                    return "元宵";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            return "";
                        case 4:
                            switch(inDate) {
                                case 4:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 14:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "教师节";
                                case 21:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                                default:
                                    return "";
                            }
                    }
                case 2022:
                    switch(inMonth) {
                        case 1:
                            switch(inDate) {
                                case 1:
                                    return "元旦";
                                default:
                                    return "";
                            }
                        case 2:
                            switch(inDate) {
                                case 1:
                                    return "春节";
                                case 14:
                                    return "情人节";
                                case 15:
                                    return "元宵";
                            }
                        case 3:
                        case 7:
                        case 8:
                        case 11:
                        default:
                            break;
                        case 4:
                            switch(inDate) {
                                case 5:
                                    return "清明";
                                default:
                                    return "";
                            }
                        case 5:
                            switch(inDate) {
                                case 1:
                                    return "劳动节";
                                default:
                                    return "";
                            }
                        case 6:
                            switch(inDate) {
                                case 1:
                                    return "儿童节";
                                case 3:
                                    return "端午";
                                default:
                                    return "";
                            }
                        case 9:
                            switch(inDate) {
                                case 10:
                                    return "中秋";
                                default:
                                    return "";
                            }
                        case 10:
                            switch(inDate) {
                                case 1:
                                    return "国庆";
                                default:
                                    return "";
                            }
                        case 12:
                            switch(inDate) {
                                case 25:
                                    return "圣诞";
                            }
                    }
            }

            return "";
        } else {
            return "";
        }
    }

    public static int checkVacation(Calendar calendar) {
        byte type = -1;
        if(calendar == null) {
            return type;
        } else {
            int year = calendar.get(1);
            int month = calendar.get(2);
            int day = calendar.get(5);
            switch(year) {
                case 2015:
                    switch(month) {
                        case 1:
                            switch(day) {
                                case 1:
                                case 2:
                                case 3:
                                    type = 2;
                                    return type;
                                case 4:
                                    type = 1;
                                    return type;
                                default:
                                    return type;
                            }
                        case 2:
                            switch(day) {
                                case 15:
                                case 28:
                                    type = 1;
                                    return type;
                                case 16:
                                case 17:
                                case 25:
                                case 26:
                                case 27:
                                default:
                                    return type;
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                    type = 2;
                                    return type;
                            }
                        case 3:
                        case 7:
                        case 8:
                        default:
                            return type;
                        case 4:
                            switch(day) {
                                case 4:
                                case 5:
                                case 6:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 5:
                            switch(day) {
                                case 1:
                                case 2:
                                case 3:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 6:
                            switch(day) {
                                case 20:
                                case 21:
                                case 22:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 9:
                            switch(day) {
                                case 26:
                                case 27:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 10:
                            switch(day) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    type = 2;
                                    return type;
                                case 8:
                                case 9:
                                default:
                                    return type;
                                case 10:
                                    type = 1;
                                    return type;
                            }
                    }
                case 2016:
                    switch(month) {
                        case 1:
                            switch(day) {
                                case 1:
                                case 2:
                                case 3:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 2:
                            switch(day) {
                                case 6:
                                case 14:
                                    type = 1;
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    type = 2;
                            }
                        case 3:
                        case 7:
                        case 8:
                        default:
                            break;
                        case 4:
                            switch(day) {
                                case 2:
                                case 3:
                                case 4:
                                case 30:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 5:
                            switch(day) {
                                case 1:
                                case 2:
                                    type = 2;
                                    return type;
                                default:
                                    return type;
                            }
                        case 6:
                            switch(day) {
                                case 9:
                                case 10:
                                case 11:
                                    type = 2;
                                    return type;
                                case 12:
                                    type = 1;
                                    return type;
                                default:
                                    return type;
                            }
                        case 9:
                            switch(day) {
                                case 15:
                                case 16:
                                case 17:
                                    type = 2;
                                    return type;
                                case 18:
                                    type = 1;
                                    return type;
                                default:
                                    return type;
                            }
                        case 10:
                            switch(day) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    type = 2;
                                    break;
                                case 8:
                                case 9:
                                    type = 1;
                            }
                    }
            }

            return type;
        }
    }

    public static SpannableStringBuilder colorDate(String dateStr) {
        if(dateStr.indexOf("今天") <= 0 && dateStr.indexOf("明天") <= 0 && dateStr.indexOf("后天") <= 0) {
            return null;
        } else {
            SpannableStringBuilder styleStr = new SpannableStringBuilder(dateStr);
            styleStr.setSpan(new ForegroundColorSpan(Color.rgb(209, 0, 8)), 12, 14, 33);
            return styleStr;
        }
    }

    public static boolean isCurrentDateMidnight(Calendar calendar) {
        Calendar currentDay = getCurrentCalendar();
        if(currentDay != null && calendar != null && currentDay.get(1) == calendar.get(1) && currentDay.get(2) == calendar.get(2) && currentDay.get(5) == calendar.get(5)) {
            Calendar time1 = ServerTime.getCurrentCalendar();
            time1.set(time1.get(1), time1.get(2), time1.get(5), 6, 0);
            long result = compareCalendarByLevel(currentDay, time1, 4);
            return result <= 0L;
        } else {
            return false;
        }
    }

    public static String getShowStrByDateStr(String dateStr) {
        Calendar currentDate = getCalendarByDateStr(dateStr);
        if(currentDate == null) {
            return "";
        } else {
            int year = currentDate.get(1);
            int month = currentDate.get(2) + 1;
            int day = currentDate.get(5);
            StringBuffer showStringBuffer = new StringBuffer(18);
            showStringBuffer.append(year);
            showStringBuffer.append("年");
            showStringBuffer.append(month);
            showStringBuffer.append("月");
            showStringBuffer.append(day);
            showStringBuffer.append("日");
            return showStringBuffer.toString().trim();
        }
    }

    public static int getInRefreshTimeRangeType(Calendar calendar) {
        byte type = -1;
        if(calendar != null) {
            Calendar temp = calculateCalendar(getCurrentCalendar(), 11, -4);
            if(firstCalendarAfterSecondCalendar(temp, calendar, 2)) {
                type = 1;
            } else if(firstCalendarBeforeSecondCalendar(calendar, temp, 2)) {
                type = -1;
            } else {
                type = 0;
            }
        }

        return type;
    }

    public static String getTimeStrFromDateString(String date) {
        Calendar temp = getCalendarByDateTimeStr(date);
        return temp == null?"":getCalendarStrBySimpleDateFormat(temp, 13);
    }

    public static String getSimpleDateStrFromDateString(String date) {
        Calendar temp = getCalendarByDateStr(date);
        return temp == null?"":getCalendarStrBySimpleDateFormat(temp, 11);
    }

    public static String getShowWeekByDate8(String dateStr) {
        Calendar calendar = getCalendarByDateStr(dateStr);
        return getCalendarStrBySimpleDateFormat(calendar, 7);
    }

    public static int getCalenderMonthDuration(Calendar minCalendar, Calendar maxCalendar) {
        if(minCalendar != null && maxCalendar != null) {
            int yearDuration = maxCalendar.get(1) - minCalendar.get(1);
            return maxCalendar.get(2) - minCalendar.get(2) + 12 * yearDuration;
        } else {
            return 0;
        }
    }

    public static String getDateAndWeekFormat(String requestDate, String dateStr) {
        String str = "";
        String week = "";
        str = str + CalendarStrBySimpleDateFormat(dateStr, 17);
        Calendar calendar = getCalendarByDateTimeStr(dateStr);
        week = getShowWeekByCalendar2(calendar);
        if(requestDate.substring(0, 8).equals(dateStr.substring(0, 8))) {
            week = "出发";
        }

        str = str + "（";
        str = str + week;
        str = str + "）";
        return str;
    }

    public static String getDateIntervalStringFromSecond(int second) {
        String dateString = "";
        String dayString = "";
        String hourString = "";
        String minuteString = "";
        int dayCount = second / 86400;
        int hourCount = second % 86400 / 3600;
        int minuteCount = second % 3600 / 60;
        if(dayCount != 0) {
            dayString = dayCount + "天";
        }

        if(hourCount != 0) {
            hourString = hourCount + "小时";
        }

        if(minuteCount != 0) {
            minuteString = minuteCount + "分钟";
        }

        dateString = dayString + hourString + minuteString;
        return dateString;
    }

    public static String getCurrentTimeMillisecond() {
        Calendar currentCalendar = ServerTime.getCurrentCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return dateFormat.format(currentCalendar.getTime());
    }

    public static String getCurrentTime() {
        Calendar currentCalendar = ServerTime.getCurrentCalendar();
        return getCalendarStrBySimpleDateFormat(currentCalendar, 1);
    }

    public static String getCurrentDate() {
        Calendar currentCalendar = ServerTime.getCurrentCalendar();
        return getCalendarStrBySimpleDateFormat(currentCalendar, 6);
    }

    public static int calcTwoDate(String dateStr1, String dateStr2) {
        long nd = 86400000L;

        try {
            long diff = compareDateStringByLevel(dateStr2, dateStr1, 5);
            long e = diff / nd;
            return (int)e;
        } catch (Exception var8) {
            var8.printStackTrace();
            return 0;
        }
    }

    public static int calcTwoDateTime(String dateStr1, String dateStr2) {
        long nd = 86400000L;
        long nh = 3600000L;
        long nm = 60000L;

        try {
            long diff = compareDateStringByLevel(dateStr1, dateStr2, 5);
            long e = diff / nd;
            long hour = diff % nd / nh;
            long min = diff % nd % nh / nm;
            return Math.abs((int)(min + hour * 60L + e * 1440L));
        } catch (Exception var16) {
            var16.printStackTrace();
            return -1;
        }
    }

    public static String formatDateTimeString(String timeStr) {
        if(timeStr == null) {
            return null;
        } else if(timeStr.length() < 14) {
            return timeStr;
        } else {
            String str = "";
            str = getCalendarStrBySimpleDateFormat(getCalendarByDateTimeStr(timeStr), 4);
            return str;
        }
    }

    public static String getDateString(Calendar c) {
        String s = "";
        if(c != null) {
            s = getCalendarStrBySimpleDateFormat(c, 6);
        }

        return s;
    }

    public static String getTime(String date) {
        return !StringUtil.emptyOrNull(date) && date.length() >= 12?getCalendarStrBySimpleDateFormat(getCalendarByDateTimeStr(date), 13):"";
    }

    public static String parseDate(String date) {
        String str = "";
        if(date != null && date.length() >= 8) {
            str = getCalendarStrBySimpleDateFormat(getCalendarByDateStr(date), 8);
        }

        return str;
    }

    public static String formatDateString(String timeStr) {
        if(timeStr == null) {
            return null;
        } else if(timeStr.length() < 14) {
            return timeStr;
        } else {
            String dateStr = formatDateTimeString(timeStr).substring(0, 10);
            return dateStr;
        }
    }

    public static String formatDateTimeString(String dateStr, String timeStr) {
        if(dateStr != null && timeStr != null) {
            if(dateStr.length() == 8 && timeStr.length() == 4) {
                String preStr = dateStr + timeStr + "00";
                return formatDateTimeString(preStr);
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public static Calendar resetCalendarTo19700101(Calendar orginCalendar) {
        if(orginCalendar == null) {
            orginCalendar = Calendar.getInstance();
        }

        orginCalendar.set(1970, 1, 1);
        return orginCalendar;
    }
}
